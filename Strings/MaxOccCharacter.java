import java.util.Scanner;
class MaxOccCharacter{
public static void main(String args[]){
System.out.print("Enter string : ");
        
Scanner sc = new Scanner(System.in);
        
String x = sc.nextLine();
        
char y[] = x.toCharArray();
       

        
Map<Character, Integer> map = new LinkedHashMap<>();

        
int i = 0;
        
while (i != y.length) {

            
if (map.containsKey(y[i]) == false) {
                
map.put(y[i], 1);
            
} else 
{
                
int oldval = map.get(y[i]);
                
int newval = oldval + 1;
                
map.put(y[i], newval);

            
}
            
i++;
        
}

        
Set< Map.Entry<Character, Integer>> hmap = map.entrySet();

        
char maxkey = ' ';
        
int maxval = 0;

        
for (Map.Entry<Character, Integer> data : hmap) {

            
if (data.getValue() > maxval) {
                
maxval = data.getValue();
                
maxkey = data.getKey();
            
}

        
}

        
System.out.println("Maximum occuring character in the given string : "+maxkey);
        
System.out.println("Frequency of Maximum occuring character : "+maxval);


}
}