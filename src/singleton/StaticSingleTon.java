package singleton;

/**
 * 设计模式之：单例模式
 * 静态内部类单例模式
 * 解决问题：（DCL：一定程度上解决了资源消耗、多余的同步、线程安全等问题，但是，还存在DCL问题）
 * 特点：只有在第一次调用getInstance()方法时，才会导致sInstance被初始化
 * 
 * @author JP
 *
 */
public class StaticSingleTon {

	private static StaticSingleTon sInstance;
	
	private StaticSingleTon(){
		
	}
	
	/**
	 * 方式一（最好的方式：静态内部类）
	 * @return 单例
	 */
	public static StaticSingleTon getInstance(){
		return StaticSingleTon.sInstance;
	}
	
	/**
	 * 
	 * 方式一：
	 * 利用静态内部类，实现更好的单例模式，避免DLL问题
	 * @author JP
	 *
	 */
	private static class SingleTonHolder{
		private static final StaticSingleTon sInstance = new StaticSingleTon();
	}
	
	
	
}

