import java.util.Scanner;
class Pattern2
{
public static void printPattern(char c,int n)
{
for(int i=n;i>=1;i--)
{
printLine(c,i);
}//for
}//printPattern
public static void printLine(char c,int col)
{
System.out.println("\n"); 
for(int i=1;j<=col;j++)
System.out.print(c);
}//printline
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int r=sc.nextInt();
printPattern(ch,r);
}
}
//smallest task into a function