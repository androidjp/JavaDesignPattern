package builder;

/**
 * 此类用于构造computer
 * 可要可不要（为了统一一个生产过程，然后，赋值不同的Builder即可）
 * @author JP
 *
 */
public class Director {

	///这里，可以关联（使用到）不同的Builder对象
	Builder mBuilder = null;
	
	///使用构造方法，对Builder依赖于其接口即可
	public Director(Builder mBuilder){
		this.mBuilder = mBuilder;
	}
	
	
	/**
	 * 统一到一个方法中
	 * @param brand
	 * @param cpu
	 */
	public void construct(String brand, String cpu){
		mBuilder.buildBrand(brand);
		mBuilder.buildCpu(cpu);
	}
	
	
}
