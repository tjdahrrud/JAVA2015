package entity;

import java.util.ArrayList;

//Entity class or Value class
public class CMember {
	//데이터를 저장하기 위한 클래스, 함수가 없다
	private String userID, password;	//attributes, 속성으로만 구성되어있음, 자바에서는 속성을 절대 public으로 놓지 않는다.
	private ArrayList<CMember> memberlist = new ArrayList<>();

	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public ArrayList<CMember> getMemberlist() {return memberlist;}
	public void setMemberlist(ArrayList<CMember> memberlist) {this.memberlist = memberlist;}

}
