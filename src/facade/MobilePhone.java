package facade;

/**
 * 手机
 * Created by androidjp on 16/8/20.
 */
public class MobilePhone {
    private Phone mPhone = new NormalPhone();//拨号模块
    private Camera mCamera = new SonyCamera();//拍照模块


    public void dail(){
        this.mPhone.dail();
    }

    public void takePhoto(int type){
        this.mCamera.openCamera();
        this.mCamera.takePhoto(type);
    }
}
