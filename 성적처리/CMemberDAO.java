package 성적처리;

public class CMemberDAO {		//data access object; data read or write persistent storage 
	public CMember read() {return null;}
	public void write(CMember member) {
		System.out.println("아이디 :"+member.getUserID());
		System.out.println("비밀번호 :"+member.getPassword());
	};
	
	//printout 하라고...
}
//data access object