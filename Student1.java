package basic;

import java.util.Scanner;

public class Student1 {
	String studName;
	int studId;
	String className;
	//constructor
	Student1(String studName,int studId,String className){
	this.studName=studName;
	this.studId=studId;
	this.className=className;
	}
	//method creation
	//student details adding
	
	 public  void display(int studId) {
		 for(int j=0;j<3;j++) {
		 if(j==studId) {
			 System.out.printf("%s%d%s",studName,studId,className);
		 }
		 else {
			 System.out.println("not found");
		 }
		 } 
	 }
	 
	public static void main(String[] args) {
		Student1[] studArray=new Student1[3];
		Scanner scan =new Scanner(System.in);
		System.out.println("enter student name");
		String studName=scan.next();
		System.out.println("enter student id");
		int studId=scan.nextInt();
		System.out.println("enter class name");
		String group=scan.next();
		for (int i = 0; i < studArray.length; i++) {
			System.out.println(studArray[i]);
		}
		Student1 stu=new Student1(studName,studId,group);
		int id=scan.nextInt();
		stu.display(id);
	}

}
