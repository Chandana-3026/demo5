import java.util.Scanner;
class While
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int  i=n;
while(i>=0)
{
System.out.print(i+" " );
i=i-5;
}
}
}//printing the numbers with some difference ex: 150 145 140....