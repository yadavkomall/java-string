class CopyString{
public static void main(String args[]){
String s = "abcdefgh";
System.out.println("Given String : "+s);
char c[] = s.toCharArray();
char copy[] = new char[c.length];
int i=0;
while(i != c.length){
copy[i]=c[i];
i++;
}
System.out.print("copied String : ");
for(char x: c){
System.out.print(x);
}System.out.println();
}
}