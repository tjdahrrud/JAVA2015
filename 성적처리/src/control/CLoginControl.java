package control;

import entity.CMember;

public class CLoginControl {	//�α��κ�� ���̴� ��Ʈ���� �޷��ִ� ��
	
	private CMember member;

	public CMember login(CMember member) {
		this.member = member;
		return this.member;
	}
}