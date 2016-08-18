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
		return name+","+ age+ ","+ address.toString() + "," + friends.size()+"个朋友";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		User user = null;
		try{
			user = (User) super.clone();
			user.friends = (ArrayList<String>) this.friends.clone();
            user.address = (Address) this.address.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return user;
	}
	
	
	
}
