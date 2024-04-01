import java.util.*;
class SwitchS
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter any Number:");
int a=s.nextInt();
switch (a)
{
   case 1:System.out.println("one");
       break;
   case 2:System.out.println("Two");
       break;
   case 3:System.out.println("Three");
       break;
default:System.out.println("Invalid Number");
}
}
}