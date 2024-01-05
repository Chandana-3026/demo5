import java.util.Scanner;
class While
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int  i=0;
while(i<=n)
{
System.out.print(i+" " );
i=i+5;
}
}
}//printing the numbers with some difference ex:5 10 15..