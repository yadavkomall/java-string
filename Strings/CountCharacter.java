class CountCharacter{
public static void main(String args[]){
String s = "abcdefghijkl$m&nop@qrstuvwxyz";
System.out.println("Given String : "+s);
char c[] = s.toCharArray();
int cons=0;
int vow=0;
int spe=0;
int i=0;

while(i != c.length){
    if(c[i]>='a' && c[i]<='z'){
if(c[i]=='a' ||c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
vow++;
}
else{
cons++;
}}
    else{
    spe++;
    }
i++;
}
System.out.println("Total count of consonants                : "+cons);
System.out.println("Total count of vowels                    : "+vow);
System.out.println("Total count of special character         : "+spe);
}
}
