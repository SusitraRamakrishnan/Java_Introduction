package Java_Introduction;

import java.util.Scanner;

public class Java_Datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");}
                    else if (x>=-32768 && x<=32767){
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                    }
                    else if (x>=-2147483648 && x<=2147483647){
                      System.out.println("* int");
                    System.out.println("* long");  
                    }
                    else {
                       System.out.println("* long");  
                    }
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
	}

}
