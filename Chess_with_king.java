package corejava;
import java.util.Scanner;
public class Chess_with_king {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the coordinates of First King");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter the coordinates of Second King");
		c=sc.nextInt();
		d=sc.nextInt();
		
		if((a==c+1 && b==d+1) || (a==c && b==d+1) || (a==c+1 && b==d) || (a==c+1 && b==d-1) || 
			(a==c && b==d-1) || (a==c-1 && b==d-1) || (a==c-1 && b==d) || (a==c-1 && b==d+1))
		{
			System.out.println("FIRST");
		}   
		else if(a==c && b==d)
		{
			System.out.println("SECOND");
		}
		else
		{
			System.out.println("DRAW");
		}
	}

	}


