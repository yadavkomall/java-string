import java.util.Scanner;
class Panagram{
public static void main(String args[]){
System.out.print("Enter String : ");
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
s=s.replace(" ","");
s=s.toUpperCase();
char c1[] =s.toCharArray();
char c2[] = new char[26];
int i=0; 
while(i != c1.length){
int index = c1[i]-65;
c2[index]=1;
i++;
}
int z=0;
while(z != 26){
if(c2[z]!=0){
z++;
}
else{
System.out.println("Given string is not a panagram");
System.exit(0);
}
} 
System.out.println("Given string is a panagram");
}
}
