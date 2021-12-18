import java.util.Scanner;

public class Q1 {
	public static void main(String[] args)
	 {
	        int A = 0;
	        int B = 0;
	        int C = 0;
	        int D = 0;
	        int F = 0;
	        int totalnumofgrades=0;
	        Scanner kb = new Scanner(System.in);
	        System.out.println("Enter exam score as integer percentage in range 0 to 100 :");
	        int score = kb.nextInt();
	 while(score>0) // if the score less than 0  then the program will terminate and shutdown
	 {
	       totalnumofgrades++;
	 if(score>=90 && score<=100)
	        A++;
	    else if(score>=80 && score<=89)
	        B++;
	    else if(score>=70 && score<=79)
	        C++;
	    else if(score>=60 && score<=69)
	        D++;
	    else if(score>=0 && score<=59)
	        F++;
	    System.out.println("Enter exam score as integer percentage in range 0 to 100 :");
	 score = kb.nextInt();
	 }
	 System.out.println("Total number of grades :"+ totalnumofgrades);
	 System.out.println("Total number of A grades :"+ A);
	 System.out.println("Total number of B grades :"+ B);
	 System.out.println("Total number of C grades :"+ C);
	 System.out.println("Total number of D grades :"+ D);
	 System.out.println("Total number of F grades :"+ F);
	 } 
	

}
