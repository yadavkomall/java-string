import java.util.Scanner;
class firstUpper{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter String      : ");
String s = sc.nextLine();
char c[] = s.toCharArray();
c[0]= (char) (c[0]-32);
int i=0;
while( i != c.length){
int temp =i;
if(c[i]==' '){
c[temp+1]= (char) (c[temp+1]-32);
}
i++;
}
System.out.print("Resultant String : ");
for(char z : c){
System.out.print(z);
}System.out.println();
}
}