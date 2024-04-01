import java.util.*;
class Table
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int num=s.nextInt();
System.out.println("table of "+num+":");
for(int n=1;n<=10;n++)
{
System.out.println(num + "*"+n+"="+(num*n));
}
}
}