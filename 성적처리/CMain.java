package ����ó��;

import java.util.ArrayList;

public class CMain {

	public static void main(String[] args)
	// MVC Pattern; 3-Tiers
	{
		CMember member;
		CLoginView loginView = new CLoginView();
		//value object
		ArrayList<CMember> memberlist = loginView.login();						//����
		
		for(int i=0;i<memberlist.size();i++){
			CLoginControl loginControl = new CLoginControl();		//�Է��� ���� ���� �������ش� (��ȣȭ���Ѽ� ������)
			member = loginControl.login(memberlist.get(i));
		
			CMemberDAO memberDAO = new CMemberDAO();				//Model
			memberDAO.write(member);
		}//����Ϳ� ��
	}
}