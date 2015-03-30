package DAO;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import entity.CMember;

public class CMemberDAO {
	//Data Access Object: read or write data from persistent storage
	public CMember read() {return null;}
	public void write(CMember member){
		int size = member.getMemberlist().size();
		try {
			FileWriter fw = new FileWriter("login2.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0; i<size; i++){
				bw.write(member.getMemberlist().get(i).getUserID()+" ");
				bw.write(member.getMemberlist().get(i).getPassword());
				bw.newLine();
			}			
			bw.close();
		} catch (FileNotFoundException fe) {
			System.out.println(fe);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}