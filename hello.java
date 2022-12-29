import java.util.Scanner;
public class hello
{
public static void main(String args[])
{
System.out.println("Hello World");
int a=5,b=3,c;
c=a+b;
System.out.println(c);
int x,y,z;
Scanner s=new Scanner(System.in);
System.out.println("Enter two numbers:");
x=s.nextInt();
y=s.nextInt();
s.close();
z=x+y;
System.out.println(z);
}
}