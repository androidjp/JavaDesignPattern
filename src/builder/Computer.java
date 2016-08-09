package builder;

public abstract class Computer {

	private String brand;
	private String cpu;
	private String os;
	
	public Computer(){
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getOs() {
		return os;
	}

	public abstract String setOs();

	
	
}
