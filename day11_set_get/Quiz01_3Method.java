package day11_set_get;

public class Quiz01_3Method {//���� �ٽ� Ǭ ������
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
	
	public void cal(String id, String pw) {//�α��� Ȯ��
		if(getSaveId().equals(id)==true && getSavePw().equals(pw) ==true ) {
		System.out.println("�α��ο� �����ϼ̽��ϴ�.");
	}else{
		System.out.println("�� �� �� ���̵��Դϴ�.");
	}
	
}
}