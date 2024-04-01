class PatternProg
{
public static void main(String[]args)
{
int n=5;
for(int i=1;i>=n;i--)
{
for(int j=n;j<=1;j++)
{
if(i<=j)
{
if(i%2==0)
{
System.out.println("* ");
}
else
{
System.out.println("# ");
}
}
else
{
System.out.println(" ");
}
}
System.out.println();
}
}
}