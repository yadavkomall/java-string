import java.util.Scanner;
class ReverseString{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Given String  : ");
String s = sc.nextLine();
char c[] = s.toCharArray();
char reverse[] = new char[c.length];
int i=0;
while(i != c.length){
reverse[i]=c[c.length-1-i];
i++;
}
System.out.print("Reverse String :");
for(char x:reverse){
System.out.print(x);
}
System.out.println();
}
}