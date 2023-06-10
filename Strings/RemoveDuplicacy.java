import java.util.*;
class RemoveDuplicacy{}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter String : ");

String s = sc.nextLine();

char c[] = s.toCharArray();


Map<Character,Integer> map =new LinkedHashMap<>();

int i=0;

while(i != c.length){

if(map.containsKey(c[i])==false){

map.put(c[i],1);
}

else{

int oldval = map.get(c[i]);

int newval = oldval+ 1;

map.put(c[i],newval);

}
i++;

}

String newS = "";

Set<Map.Entry<Character,Integer>> Lmap = map.entrySet();

for(Map.Entry<Character,Integer> data : Lmap){

if(data.getValue()==1){

newS += data.getKey();
}

}
System.out.println("New String after removing duplicate characters : "+newS);

}
}