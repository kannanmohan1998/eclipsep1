package firstpackage;

import java.util.Scanner;

public class Aamstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int temp=n;
		int a=0,r;
		while(n>0)
		{
			r=n%10;
			a=a+r*r*r;
			n=n/10;
		}
		if (temp==a)
		{
		System.out.println("Armstrong");
	}
	else
	{
		System.out.println("not armstrong");
	}

}
