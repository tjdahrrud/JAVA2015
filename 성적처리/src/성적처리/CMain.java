package 성적처리;

import DAO.CGangjwaDAO;
import DAO.CGwamokDAO;
import DAO.CMemberDAO;
import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;
import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import entity.CGangjwa;
import entity.CGwamok;

import entity.CMember;


public class CMain {

	public static void main(String[] args) {
		//login
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();
		CLoginControl loginControl = new CLoginControl();
		member = loginControl.login(member);
		CMemberDAO memberDAO = new CMemberDAO();
		memberDAO.write(member);
		
		//과목개설
		CGwamokView gwamokView = new CGwamokView();
		CGwamok gwamok = gwamokView.getGwamok();
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);		//process 변형시키는거
		CGwamokDAO gwamokDAO = new CGwamokDAO();
		gwamokDAO.write(gwamok);
		
		//강좌개설
		CGangjwaView gangjwaView = new CGangjwaView();
		CGangjwa gangjwa = gangjwaView.getGangjwa();
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);		//process 변형시키는거
		CGangjwaDAO gangjwaDAO = new CGangjwaDAO();
		gangjwaDAO.write(gangjwa);
		
	}
}