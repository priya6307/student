package basic;

import java.util.Scanner;

public class student {
 static String studentName="priya";
 static int studentId;
 static int age;
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter student id");
	studentId=scan.nextInt();
	System.out.println("enter age");
	age=scan.nextInt();
	System.out.println("student details");
System.out.println(studentName);
System.out.println(studentId);
System.out.println(age);
	}

}
