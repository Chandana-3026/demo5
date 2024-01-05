//TO CHECK WHETHER THE GIVEN NUMBER IS EVEN OR ODD
import java.util.*;
public class Program1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter a Number");
n=sc.nextInt();
if(n%2==0)
{
System.out.println("Even\n");
System.out.println(n+"is Even\n");
}//Even
else
{
System.out.println("Odd\n");
System.out.println(n+"is Odd\n");
}//Odd
}//main
}//class