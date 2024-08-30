package Java_Introduction;

import java.util.Scanner;

public class Java_EOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        for (int i=1;scan.hasNext();i++){
            String s=scan.nextLine();
            System.out.println(i +" "+s);
        }
        scan.close();
    }

	}

