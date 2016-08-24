package facade;

/**
 * Created by androidjp on 16/8/20.
 */
public interface Camera {

    /**
     * 开启相机
     */
    public void openCamera();

    /**
     * 选择模式,开始拍照
     * @param type 拍照模式
     */
    public void takePhoto(int type);
}
