package builder;

public abstract class Builder {

	//设置品牌型号等
	public abstract Builder buildBrand(String brand);
	
	//设置cpu型号等
	public abstract Builder buildCpu(String cpu);
	
	//设置操作系统(由于电脑子类自己内定了操作系统，而且这个容易得到操作系统的类别)
	public abstract Builder buildOs();
	
	///重要！！！最终返回一个目的类对象实例
	public abstract Computer create();
	
}
