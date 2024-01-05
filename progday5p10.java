import java.util.Scanner;
class Countvowel
{
static boolean checkVowel(char c)
{
boolean b;
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
b=true;
}
else
{
b=false;
}
return b;
}
public static void main(String args[])
{
String str;
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("");
System.out.print("Enter a String");
str=sc.nextLine();
System.out.println("");
for(int i=0;i<str.length();i++)
{
if(checkVowel(str.charAt(i)))
{
count++;
}//if
}//for
System.out.println("\n Number of vowels="+count);
}//main
}//class