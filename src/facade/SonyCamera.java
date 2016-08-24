package facade;

/**
 * Created by androidjp on 16/8/20.
 */
public class SonyCamera implements Camera {


    @Override
    public void openCamera() {
        System.out.println("开启sony相机");
    }

    @Override
    public void takePhoto(int type) {
        System.out.println("模式"+type +": 开始拍照");
    }
}
