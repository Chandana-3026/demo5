import java.util.Scanner;
class Pattern
{
public static void printPattern(char c,int n)
{
for(int i=0;i<n;i++)
{
System.out.println("\n");
for(int j=0;j<=i;j++)
System.out.print(c);
}//for
}//for pattern
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int r=sc.nextInt();
printPattern(ch,r);
}
}
