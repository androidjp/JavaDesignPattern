package singleton;

/**
 * 懒汉模式：第一次调用getInstance()方法时，才进行初始化单例
 * @author JP
 *
 */
public class LazySingleTon {

	private static LazySingleTon sInstance;
	
	private LazySingleTon(){
		
	}
	
	public static synchronized LazySingleTon getInstance(){
		
		if(sInstance==null){
			sInstance = new LazySingleTon();
		}
		return sInstance;
	}
	
	
}
