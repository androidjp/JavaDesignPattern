package status;

/**
 * 睡眠中的我
 * Created by androidjp on 16/8/16.
 */
public class SleepingMe implements MyStatus{

    @Override
    public int codingSpeed() {
        return 0;
    }

    @Override
    public int runningSpeed() {
        return 10;
    }

    @Override
    public int androidSkill() {
        return 0;
    }

    @Override
    public int iosSkill() {
        return 0;
    }
}
