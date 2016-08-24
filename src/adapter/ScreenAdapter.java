package adapter;

/**
 * Created by androidjp on 16/8/20.
 */
public class ScreenAdapter implements MacBookPro {

    NormalScreen normalScreen;

    public ScreenAdapter(NormalScreen normalScreen) {
        this.normalScreen = normalScreen;
    }

    public int getNormalScreenDPI(){
        return this.normalScreen.getNormalScreenDPI();
    }

    @Override
    public int getRetinaScreenDPI() {
        return 480;
    }
}
