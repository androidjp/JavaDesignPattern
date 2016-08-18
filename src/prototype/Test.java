package prototype;

/**
 * Created by androidjp on 16/8/18.
 */
public class Test {

    public static void main(String[] args){
        User loginedUser = null;
        loginedUser = new User();
        loginedUser.age = 22;
        loginedUser.name = "小明";
        loginedUser.address = new Address("广东省", "东莞市", "小花街");
        loginedUser.friends.add("小花");


        System.out.println("开启系统");
        SCAUSystem system = new SCAUSystem();
        System.out.println("开始登录");
        system.login(loginedUser);
        System.out.println("修改用户信息");
        system.modifyUserMsg();
    }
}
