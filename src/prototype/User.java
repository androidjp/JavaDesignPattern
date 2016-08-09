package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式的应用
 * @author JP
 *
 */
public class User implements Cloneable{

	public int age;
	public String name;
	public ArrayList<String> friends;
	public Address address;
	
	public User(){
		friends = new ArrayList<String>();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+","+ age+ ","+ address.toString();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		User user = null;
		try{
			user = (User) super.clone();
			friends = (ArrayList<String>) this.friends.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return user;
	}
	
	
	
}
