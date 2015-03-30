package 성적처리;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CLoginView {
	private String filename= "userdata.txt";
	private String thisLine= "";
	private StringTokenizer token;
	private ArrayList<CMember> memberlist = new ArrayList<>();
	
	
	public ArrayList<CMember> login() {			//value object
	//	CMember member = new CMember();
	//	System.out.print("사용자 아이디를 입력하세요; ");
	//	Scanner scanner = new Scanner(System.in);
	//	String userId = scanner.next();
	//	member.setUserID("userID");

	//	System.out.println("비밀번호를  입력하세요; ");
	//	String password = scanner.next();
	//	member.setPassword("password");
//close scanner
	//	scanner.close();
	//	return member;
		
		
		try{
			FileInputStream fin = new FileInputStream(filename);
			BufferedReader myInput = new BufferedReader(new InputStreamReader(fin));
			while((thisLine = myInput.readLine()) != null){
				token = new StringTokenizer(thisLine, " ");
				CMember member = new CMember();
				for(int i = 0; token.hasMoreTokens(); i++){
					if(i == 0){
						member.setUserID(token.nextToken());
					}else if(i == 1){
						member.setPassword(token.nextToken());
					}
				}
				//list에 멤버들을 추가.
				memberlist.add(member);
			}
						
		}catch(Exception e){
			e.printStackTrace();
		}
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("sample.txt"));
			for(int i=0;i<memberlist.size();i++){
				bufferedWriter.write(memberlist.get(i).getUserID()+" ");
				bufferedWriter.write(memberlist.get(i).getPassword());
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 열수가 없습니다.");
			e.printStackTrace();
		} 
		
		return memberlist;
		
	}

}
