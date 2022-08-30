
import java.util.*;
class Main
{
public static String findChar(String s)
{
int n=s.length();
for(int i=0;i<n-1;i++)
{
if(s.charAt(i)==s.charAt(i+1))
{
return String.valueOf(s.charAt(i));
break;
}
}
return "No repeating char available";
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(findChar(s));
}
}
