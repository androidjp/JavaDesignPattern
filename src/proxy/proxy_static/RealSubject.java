package proxy.proxy_static;

/**
 * Created by androidjp on 16/8/19.
 */
public class RealSubject extends Subject {

    @Override
    public void visit() {
        System.out.println("具体逻辑");
    }
}
