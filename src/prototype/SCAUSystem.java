package prototype;

import sun.rmi.runtime.Log;

import java.util.ArrayList;

/**
 * 后台系统
 * Created by androidjp on 16/8/18.
 */
public class SCAUSystem implements Login{
    @Override
    public void login(User user) {
        LoginSession.getInstance().setLoginedUser(user);
    }

    public void modifyUserMsg(){
       User user =  LoginSession.getInstance().getLoginedUser();
        user.address.city = "北京市";
        user.friends.add("妈妈");
        user.friends.add("爸爸");
        user.age = 40;
        user.name = "老九门";

        System.out.println("修改完毕,点击'保存'之前的用户信息:"+user.toString());

        System.out.println("缓存区中原来未被修改的登录用户信息:"+LoginSession.getInstance().getLoginedUser().toString());

        commit(user);
    }

    public void commit(User user){
        synchronized (LoginSession.class){
            LoginSession.getInstance().setLoginedUser(user);
            System.out.println("修改并保存用户信息后,同步到缓存区中,真正更新用户信息:"+LoginSession.getInstance().getLoginedUser().toString());
        }
    }
}
