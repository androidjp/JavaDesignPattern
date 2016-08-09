package prototype;

public class LoginImpl implements Login{

	@Override
	public void login() {
		// TODO Auto-generated method stub
		User loginedUser = null;
		loginedUser = new User();
		loginedUser.age = 22;
		loginedUser.name = "小明";
		loginedUser.address = new Address("广东省", "东莞市", "小花街");
	}

	
}
