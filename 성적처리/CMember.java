package 성적처리;
	//Entity class or value class
public class CMember {
	//attributes 속성으로만 구성  public x
	private String userID, password;
	//data를 저장하기 위한 클래스 함수가 거의 없다

	public String getUserID() {return userID;}

	public void setUserID(String userID) {this.userID = userID;}

	public String getPassword() {return password;}

	public void setPassword(String password) {this.password = password;}

	public static void set(String nextToken) {
		// TODO Auto-generated method stub
		
	}

}
