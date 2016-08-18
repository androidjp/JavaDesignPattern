package prototype;

public class Address implements Cloneable{

	public String city;
	public String distruct;
	public String street;
	
	public Address(String city, String distruct, String street) {
		super();
		this.city = city;
		this.distruct = distruct;
		this.street = street;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return city+":"+distruct+":"+ street;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
