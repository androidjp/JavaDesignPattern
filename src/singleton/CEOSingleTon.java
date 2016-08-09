package singleton;

/**
 * 饿汉模式：声明静态变量时就已经初始化了
 * @author JP
 *
 */
public class CEOSingleTon {

	private static final  CEOSingleTon sInstance = new CEOSingleTon();
	
	private CEOSingleTon(){
		
	}
	
}
