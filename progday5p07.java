//TO SWAP TO TWO NUMBERS without temp or third variable
import java.util.Scanner;
class InputSwap1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1,num2;
num1=sc.nextInt();//5
num2=sc.nextInt();//7
num1=num1+num2;//num1=12
num2=num1-num2;//num2=5
num1=num1-num2;//num1=7
System.out.println(num1 +"\n" +num2);
}//main
}//Input