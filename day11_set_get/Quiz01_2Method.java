package day11_set_get;

public class Quiz01_2Method {//¼±»ý´Ô Á¤´ä
	public boolean out() { 
		return false;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	private String userId=null,userPw=null;
	
	public int compare(String userId, String userPw) {
		if(getUserId() != null && getUserPw() != null) {
			if(getUserId().equals(userId) && getUserPw().equals(userPw)) {
				return 0;
			}else {
				return 1;
			}
		}
		return 1;
	}
	
	
	
	
}
