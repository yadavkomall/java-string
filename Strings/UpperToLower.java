import java.util.Scanner;
class UpperToLower{
public static void main(String args[]){
System.out.print("Enter string in uppercase : ");
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
char c[] = s.toCharArray();
int i =0;
while(i != c.length){
if(c[i] != ' '){
c[i] =(char) (c[i]+32);
}
i++;
}
System.out.print("String in lowercase      : ");
for(char z :c){
System.out.print(z);
}System.out.println();

}
}