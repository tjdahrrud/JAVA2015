package ����ó��;

public class CMemberDAO {		//data access object; data read or write persistent storage 
	public CMember read() {return null;}
	public void write(CMember member) {
		System.out.println("���̵� :"+member.getUserID());
		System.out.println("��й�ȣ :"+member.getPassword());
	};
	
	//printout �϶��...
}
//data access object