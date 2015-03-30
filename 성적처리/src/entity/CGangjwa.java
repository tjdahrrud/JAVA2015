package entity;

import java.io.Serializable;
import java.util.Vector;

public class CGangjwa implements Serializable {
	private static final long serialVersionUID = 1L;
	//attributes
	private int ID;
	private String name;
	private int suganginwon;
	private Vector<String> times;
	private int gyosuID;		//� ������ ����ߴ���
	private int gwamokID;
	//getters & setters
	public int getID() {return ID;}
	public void setID(int id) {this.ID = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getSuganginwon() {return suganginwon;}
	public void setSuganginwon(int suganginwon) {this.suganginwon = suganginwon;}
	public Vector<String> getTimes() {return times;}
	public void setTimes(Vector<String> times) {this.times = times;}
	public int getGyosuID() {return gyosuID;}
	public void setGyosuID(int gyosuID) {this.gyosuID = gyosuID;}
	public int getGwamokID() {return gwamokID;}
	public void setGwamokID(int gwamokID) {this.gwamokID = gwamokID;}
	
}
