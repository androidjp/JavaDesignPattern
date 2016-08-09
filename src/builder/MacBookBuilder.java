package builder;

public class MacBookBuilder extends Builder{

	private Computer mComputer = new MacBookPro();
	
	@Override
	public Builder buildBrand(String brand) {
		// TODO Auto-generated method stub
		mComputer.setBrand(brand);
		return this;
	}

	@Override
	public Builder buildCpu(String cpu) {
		// TODO Auto-generated method stub
		mComputer.setCpu(cpu);
		return this;
	}


	@Override
	public Builder buildOs() {
		// TODO Auto-generated method stub
		mComputer.setOs();
		return this;
	}

	@Override
	public Computer create() {
		// TODO Auto-generated method stub
		return mComputer;
	}
	
	
	
}
