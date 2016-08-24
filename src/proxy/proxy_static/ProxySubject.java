package proxy.proxy_static;

/**
 * Created by androidjp on 16/8/19.
 */
public class ProxySubject extends Subject {

    private RealSubject mSubject;

    public ProxySubject(RealSubject mSubject) {
        this.mSubject = mSubject;
    }

    @Override
    public void visit() {
        mSubject.visit();
    }
}
