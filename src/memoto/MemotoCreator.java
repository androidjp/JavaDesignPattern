package memoto;

/**
 * 备忘录创建类
 * 用于创建一个数据备份,并让备忘录管理类进行备份数据的存储和移动操作。
 * Created by androidjp on 16/8/18.
 */
public abstract class MemotoCreator {

    /**
     * 数据备份
     * @return 数据备忘录
     */
    protected abstract Memoto createMemoto();

}
