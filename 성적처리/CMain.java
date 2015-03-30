package 성적처리;

import java.util.ArrayList;

public class CMain {

	public static void main(String[] args)
	// MVC Pattern; 3-Tiers
	{
		CMember member;
		CLoginView loginView = new CLoginView();
		//value object
		ArrayList<CMember> memberlist = loginView.login();						//리턴
		
		for(int i=0;i<memberlist.size();i++){
			CLoginControl loginControl = new CLoginControl();		//입력을 받은 값을 전달해준다 (암호화시켜서 전달함)
			member = loginControl.login(memberlist.get(i));
		
			CMemberDAO memberDAO = new CMemberDAO();				//Model
			memberDAO.write(member);
		}//모니터에 써
	}
}