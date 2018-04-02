package builder;

public abstract class ComputerBuilder {

	//设置屏幕等
	public abstract ComputerBuilder buildScreen();
	
	//设置cpu型号等
	public abstract ComputerBuilder buildCpu();

	///重要！！！最终返回一个目的类对象实例
	public abstract Computer build();
}
