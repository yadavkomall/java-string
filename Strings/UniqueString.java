import java.util.Scanner;
class UniqueString{
public static void main(String arg[]){
System.out.println("Enter string : ");

Scanner sc = new Scanner(System.in);
       
String x = sc.nextLine();
        
char y[] = x.toCharArray();
        
boolean unique = true;

        
Map<Character, Integer> map = new HashMap<>();

        
int i = 0;
        
while (i != y.length) {

            
if (map.containsKey(y[i]) == false) {
                
map.put(y[i], 1);
            
} else {
                
int oldval = map.get(y[i]);
                
int newval = oldval + 1;
                
map.put(y[i], newval);
            
}
            
i++;
        
}

        
Set<Map.Entry<Character, Integer>> hmap = map.entrySet();

        
for (Map.Entry<Character, Integer> data : hmap) {


            
if (data.getValue() > 1) {
                
unique = false;
                
break;
            
}


}


        
if (unique) {
            
System.out.println("Entered String has all unique character");
        
} else {
            
System.out.println("Entered String does not have unique character");
        
}
}
}