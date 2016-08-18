package prototype;

/**
 * 后台系统的缓存区
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

	/**
	 * 外界需要获取User信息时,给的必须是原数据的克隆,为了防止源数据被修改的情况(让源数据不被外界所持有)
	 * @return  深克隆体
	 */
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
