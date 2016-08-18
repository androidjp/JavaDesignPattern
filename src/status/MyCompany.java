package status;

/**
 * Created by androidjp on 16/8/16.
 */
public class MyCompany {

    private MyStatus me;

    /**
     * 新一天办公开始
     */
    public void startNewDay(){
        //我变成:正在敲代码的我
        me = new CodingMe();
    }

    /**
     * 一天的下班时间到
     */
    public void workDone(){
        //我就变成:睡觉的我
        me = new SleepingMe();
    }

    /*
    ....................
     */


}
