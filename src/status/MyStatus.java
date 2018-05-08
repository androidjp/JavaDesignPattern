package status;

/**
 * 我的状态
 * Created by androidjp on 16/8/16.
 */
public abstract class MyStatus {

    public abstract int codingSpeed();

    public abstract int runningSpeed();

    public abstract int androidSkill();

    public abstract int iosSkill();

    public String run() {
        int score = codingSpeed()+runningSpeed()+androidSkill()+iosSkill();
        if(score<20) {
            return "已经下班了，员工要睡觉了";
        }

        if(score>200) {
            return "员工精力充沛，认真干活！";
        }
        return null;
    }
}
