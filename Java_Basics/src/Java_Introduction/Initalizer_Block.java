package Java_Introduction;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Initalizer_Block {
	 public static boolean flag=true;
	 public static int B;
	 public static int H;
	 static{
	 Scanner scan=new Scanner (System.in);
	 B=scan.nextInt();
	 H=scan.nextInt();
	 scan.close();
	 if ((B<=0)||(H<=0)){
	     System.out.println("java.lang.Exception: Breadth and height must be positive");
	     flag=false;
	 }
	 else{
	     flag=true;
	 }
	}

	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}
