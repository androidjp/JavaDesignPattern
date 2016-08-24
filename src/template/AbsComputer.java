package template;

/**
 * Computer 模板类
 * Created by androidjp on 16/8/19.
 */
public abstract class AbsComputer {

    protected void powerOn(){

    }

    protected void powerOff(){

    }

    protected void checkHardware(){

    }

    protected void login(){

    }

    protected void loadOS(){

    }

    //-----------------------------
    public final void startUp(){
        powerOn();
        checkHardware();
        loadOS();
        login();
    }

}
