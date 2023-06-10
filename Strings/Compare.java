import java.util.Scanner;
class Compare{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter String1 : ");
String s1 = sc.nextLine();
System.out.print("Enter String2 : ");
String s2 = sc.nextLine();
char c1[] = s1.toCharArray();
char c2[] = s2.toCharArray();

if(c1.length !=c2.length){
System.out.println("Given Strings are not equal");
System.exit(0);
}

int i=0;
boolean isEq = true;
while(i != c1.length){
if(c1[i] != c2[i]){
isEq = false;
break;
}
i++;
}

 if(isEq){
System.out.println("Given Strings are equal");
}
else
System.out.println("Given Strings are not equal");
}
}