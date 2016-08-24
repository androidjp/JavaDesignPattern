package memoto;

/**
 * 备忘录类:用于存储 界面等的 数据和内部状态, 并且只受到一个创建类的作用, 可以防止外界其他类对它的干扰。
 * Created by androidjp on 16/8/18.
 */
public abstract class Memoto {
    private  int intData;
    private String sData;

    public Memoto(int intData, String sData) {
        this.intData = intData;
        this.sData = sData;
    }

    public int getIntData() {
        return intData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public String getsData() {
        return sData;
    }

    public void setsData(String sData) {
        this.sData = sData;
    }
}
