import java.util.Scanner;
class Loop
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=0;
do
{
System.out.print(i+" " );
i=i+5;
}while(i<=n);
}
}//printing the numbers