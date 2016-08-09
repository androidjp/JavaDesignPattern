package singleton;

/**
 * Double Check Lock
 * 双重锁模式：
 * 优点：既能够在需要时才初始化单例，又能够保证线程安全，而且，单例对象初始化后的getInstance调用是不会进行同步锁的。
 * 
 * (注意：sInstance = new DCLSingleTon() ,
 * 做了三件事：给DCLSingleTon的实例分配内存 --> 调用SingleTon()的构造函数，初始化成员字段 -->将sInstance对象指向分配的内存空间)
 * 
 * 缺点：
 * 
 * 
 * @author JP
 *
 */
public class DCLSingleTon {

	private static DCLSingleTon sInstance;
	
	///考虑到 DCL失效问题：JDK1.5之前的JMM（Java内存模型）中的Cache、寄存器到主内存回写顺序的规定，上面三件事中的后面两件事的顺序无法保证。
	///这样，如果是执行1->3->2的执行顺序，那么，在内部成员都没有被初始化的情况下，sInstance就已经被赋值为非null了，那就后面会产生错误了。
	///于是，>=JDK1.5时，可以这样：
//	private volatile static DCLSingleTon sInstance = null;
	///虽然这样，加载时会影响性能，但是，还是值得的。
	///这样一来，就可以每次在主内存中读取对象了。
	
	private DCLSingleTon(){
		
	}
	
	public static DCLSingleTon getInstance(){
		
		if(sInstance== null){
			synchronized (DCLSingleTon.class) {
				if(sInstance == null){
					sInstance = new DCLSingleTon();
				}
			}
		}
		return sInstance;
	}
}
