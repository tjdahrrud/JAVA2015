package entity;

import java.util.ArrayList;

//Entity class or Value class
public class CMember {
	//�����͸� �����ϱ� ���� Ŭ����, �Լ��� ����
	private String userID, password;	//attributes, �Ӽ����θ� �����Ǿ�����, �ڹٿ����� �Ӽ��� ���� public���� ���� �ʴ´�.
	private ArrayList<CMember> memberlist = new ArrayList<>();

	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public ArrayList<CMember> getMemberlist() {return memberlist;}
	public void setMemberlist(ArrayList<CMember> memberlist) {this.memberlist = memberlist;}

}
