package composite;

import composite.abs.Dir;
import iterator.Iterator;

import java.util.List;

/**
 * 文件夹
 * Created by androidjp on 16/8/19.
 */
public class Folder extends Dir {

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        dirList.add(dir);
    }

    @Override
    public void rmDir(Dir dir) {
        dirList.remove(dir);
    }

    @Override
    public void clear() {
        dirList.clear();
    }

    @Override
    public void print() {
        Iterator<Dir> it = (Iterator<Dir>) dirList.iterator();
        while(it.hasNext()){
            Dir dir = it.next();
            dir.print();
            if (it.hasNext()){
                System.out.print(" , ");
            }
        }

    }

    @Override
    public List<Dir> getFiles() {
        return dirList;
    }
}
