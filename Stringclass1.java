package Stringclass;

public class Stringclass1 {
public static void main(String[] args) {
	String S1="OK";
	String S2="OK";
	System.out.println(S1==S2);
	
	String S3=new String("hi");
	String S4=new String("hi");
	System.out.println(S2==S4);
	
	System.out.println("*****************************");
	
	System.out.println(S2.equals(S1));
	System.out.println(S3.equals(S4));
	
}
}
