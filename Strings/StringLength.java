import java.util.Scanner;
class StringLength{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter String : ");
String s = sc.nextLine();
char c[] =s.toCharArray();
int count=0;
for(int i=0;i<c.length;i++){
count++;
}
System.out.println("length of string "+s+" is : "+count);
}
}