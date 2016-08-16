package status;

/**
 * 正在编码的我
 * Created by androidjp on 16/8/16.
 */
public class CodingMe implements MyStatus {
    @Override
    public int codingSpeed() {
        return 50;
    }

    @Override
    public int runningSpeed() {
        return 30;
    }

    @Override
    public int androidSkill() {
        return 100;
    }

    @Override
    public int iosSkill() {
        return 100;
    }
}
