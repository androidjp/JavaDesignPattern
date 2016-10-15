package composite;

import composite.abs.Dir;

import java.io.BufferedOutputStream;
import java.util.List;

/**
 * 文件
 * Created by androidjp on 16/8/19.
 */
public class File extends Dir{

    public String name;

    public File(String name) {
        super(name);
    }


    @Override
    public void addDir(Dir dir) {
    }

    @Override
    public void rmDir(Dir dir) {

    }

    @Override
    public void clear() {

    }

    @Override
    public void print() {
        System.out.print(getName());
    }

    @Override
    public List<Dir> getFiles() {
        return null;
    }
}
