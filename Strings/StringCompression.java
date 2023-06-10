import java.util.Scanner;
class stringCompression{
public static String Compress(String sr){
StringBuilder sb = new StringBuilder("");
for(int i=0;i<sr.length();i++){
Integer count=1;
while( i<sr.length()-1 && sr.charAt(i)==sr.charAt(i+1) ){
count++;
i++;
}
sb.append(sr.charAt(i));
if(count>1){
sb.append(count);
}
}
return sb.toString();
}
   
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter String : ");
String sr = sc.next();
String s = Compress(sr);
System.out.println("Compressed String : "+s);
}
}