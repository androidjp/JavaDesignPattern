package prototype;

/**
 * 单例模式的 Session缓存区
 * （存放登录的用户信息）
 * @author JP
 *
 */
public class LoginSession {
	static LoginSession sInstance = null;
	private User loginedUser;
	private LoginSession(){
		
	}
	
	public static LoginSession getInstance(){
		if(sInstance == null){
			sInstance = new LoginSession();
		}
		return sInstance;
	}

	public User getLoginedUser() {
		try {
			return (User) loginedUser.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	void setLoginedUser(User loginedUser) {
		this.loginedUser = loginedUser;
	}
	
	//-----------------------------------------------
	
	
	
}
