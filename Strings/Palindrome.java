import java.util.Arrays;
import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
System.out.print("Given String : ");
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
s=s.replace(" ","");
s=s.toLowerCase();
char c[] = s.toCharArray();
char rev[] = new char[c.length];
int i=0;
while(i != c.length){
rev[i]=c[c.length-1-i];
i++;
}
if(Arrays.equals(c,rev)){
System.out.println("Given string is a palindrome");
}
else{
System.out.println("Given string is not a palindrome");
}
}}