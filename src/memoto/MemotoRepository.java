package memoto;

import java.util.HashMap;
import java.util.List;

/**
 * 备忘录存储类:不对备忘录内容进行修改和访问, 仅仅只能 将备忘录传递给其他对象【只是一个仓库而已,自己没有手脚】
 * Created by androidjp on 16/8/18.
 */
public class MemotoRepository {

    private HashMap<String, Memoto> memotoList;

    private MemotoRepository(){
        this.memotoList = new HashMap<String, Memoto>();
    }

    private static class SingletonHolder{
        private static final MemotoRepository sInstance = new MemotoRepository();
    }

    public static MemotoRepository getInstance(){
        return SingletonHolder.sInstance;
    }

//    ---------------------------------------

    /**
     * 存档
     * @param memoto 存档
     */
    public void backup(String key, Memoto memoto){
        this.memotoList.put(key, memoto);
    }

    /**
     * 获取备忘录
     * @param key 通过键
     * @return 返回备忘录对象
     */
    public Memoto getMemoto(String key){
        return this.memotoList.get(key);
    }
}
