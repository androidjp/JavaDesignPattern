package builder;

public class Computer {
	private String brand;
	private String screen;
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

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public void setOs(String os) {
		this.os = os;
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

	@Override
	public String toString() {
		return "Computer{" +
				"brand='" + brand + '\'' +
				", screen='" + screen + '\'' +
				", cpu='" + cpu + '\'' +
				", os='" + os + '\'' +
				'}';
	}
}
