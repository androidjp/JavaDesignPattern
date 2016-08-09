package singleton;

/**
 * 枚举
 * （枚举本身就是一个单例模式）
 * 优点：解决了对象反序列化的问题（任何时候，都是单例模式）
 * 
 * 关于反序列化问题：即使你的构造函数是private的，反序列化依然会通过特殊途径来调用该方法来创建这个类新的实例
 * 
 * 序列化：通过序列化，可以将一个单例的实例对象写到磁盘，然后再读回来，从而有效地获取一个实例。
 * @author JP
 *
 */
public enum EnumSingleTon {
	
	DOG,CAT;
	
	public void bark(){
	  System.out.println(toString()+"吠了一声！");	
	}
}
