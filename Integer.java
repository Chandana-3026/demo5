import java.util.Scanner;
class Integer1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<=n;i++)//printing values from 1 to 100
//for(int i=n;i>=0;i--)//printing values from 100 to 1(reverse)
//for(int i=n;i>=0;i=i-5)//printing values from 100,95,90..0(with some difference)
//for(int i=0;i<=n;i=i+5)//printing values from 0,5,10..100(with some difference)
{
System.out.print(i+" " );
}
}
}