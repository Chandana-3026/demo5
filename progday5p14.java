import java.util.*;
class findmax1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int max;
int min;
if(a>b)
{
if(a>c)max=a;
else max=c;
}
else
{
if(b>c)max=b;
else max=c;
}
if(a<b)
{
if(a<c)min=a;
else min=c;
}
else
{
if(b<c)min=b;
else min=c;
}
System.out.println("minimum no is"+min);
System.out.println("maximum no is"+max);
}
}

