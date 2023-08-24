package firstpackage;

public class operators {

	public static void main(String[] args) {
		
		//Arithmetic operators
		
		int a=20,b=40;
		System.out.println("value of a+b="+(a+b));
		System.out.println("value of a-b="+(a-b));
		System.out.println("value of a*b="+(a*b));
		System.out.println("values of a//="+(a/b));
		System.out.println("values of a%b="+(a%b));
		
		
	//assignment operators
		
System.out.println(a+=b);
System.out.println(a-=b);
System.out.println(a=b);
System.out.println(a/=b);
System.out.println(a*=b);

//relational operators

int a1=20,b1=50;
System.out.println(a1>b1);
System.out.println(a1<b1);
System.out.println(a1<=b1);
System.out.println(a1>=b1);
System.out.println(a1==b1);
System.out.println(a1!=b1);

//logical operators

String username = "abcd123";
String pswd = "1236";

System.out.println(username=="abcd123" && pswd== "1236");
System.out.println(username=="abcd123" || pswd== "1236");
System.out.println(!(username=="abcd123"));
System.out.println(!(pswd=="1236"));

//uninary operators

int m1= 4, m2=7;

System.out.println(m1++);
System.out.println(m1);
System.out.println(++m2); 
}

}
