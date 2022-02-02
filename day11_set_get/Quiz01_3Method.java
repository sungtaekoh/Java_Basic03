package day11_set_get;

public class Quiz01_3Method {//내가 다시 푼 정답지
	private String saveId;
	private String savePw;
	public String getSaveId() {
		return saveId;
	}
	public void setSaveId(String saveId) {
		this.saveId = saveId;
	}
	public String getSavePw() {
		return savePw;
	}
	public void setSavePw(String savePw) {
		this.savePw = savePw;
	}
	
	public void cal(String id, String pw) {//로그인 확인
		if(getSaveId().equals(id)==true && getSavePw().equals(pw) ==true ) {
		System.out.println("로그인에 성공하셨습니다.");
	}else{
		System.out.println("잘 못 된 아이디입니다.");
	}
	
}
}