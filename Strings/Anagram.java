import java.util.Arrays;
import java.util.Scanner;
class Anagram{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
System.out.print("Enter Stirng1 : ");
String s1 = sc.nextLine();
s1=s1.replace(" ","");
s1=s1.toLowerCase();
char c1[] = s1.toCharArray();
System.out.print("Enter Stirng2 : ");
String s2 = sc.nextLine();
s2=s2.replace(" ","");
s2=s2.toLowerCase();
char c2[] = s2.toCharArray();
if(c1.length != c2.length){
System.out.println("Given strings are not anagram");
System.exit(0);
}
Arrays.sort(c1);
Arrays.sort(c2);
boolean isEq = Arrays.equals(c1, c2);

if(isEq){
System.out.println("Given Strings are anagram");
}
else
    System.out.println("Given strings are not anagram");
}
}
