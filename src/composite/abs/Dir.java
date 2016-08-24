package composite.abs;

import java.util.ArrayList;
import java.util.List;

/**
 * 目录
 * Created by androidjp on 16/8/19.
 */
public abstract class Dir {

    protected List<Dir> dirList = new ArrayList<Dir>();
    private String name;

    public Dir(String name) {
        this.name = name;
    }

    /**
     * 添加一个文件或文件夹
     * @param dir
     */
    public abstract void addDir(Dir dir);

    /**
     * 删除一个文件或文件夹
     * @param dir
     */
    public abstract void rmDir(Dir dir);

    /**
     * 清空所有子结构
     */
    public abstract void clear();

    /**
     * 输出所有目录结构
     */
    public abstract void print();

    /**
     * 获取文件夹下所有文件或子文件夹
     * @return
     */
    public abstract List<Dir> getFiles();


    public String getName() {
        return name;
    }
}
