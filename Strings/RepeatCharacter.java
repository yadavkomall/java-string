import java.util.Scanner;
class RepeatCharacter{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter String : ");

String s = sc.nextLine();

char y[] = s.toCharArray();

Map<Character,Integer> map = new LinkedHashMap<>();


int i=0;

while(i != y.length){

if(map.containsKey(y[i])== false){

map.put(y[i],1);

}

else{

int oldval = map.get(y[i]);

int newVal = oldval+1;

map.put(y[i],newVal);
}

i++;
}

Set<Map.Entry<Character,Integer>> lmap = map.entrySet();

System.out.print("Duplicate Character in the given string : ");

for(Map.Entry<Character,Integer> data : lmap){

if(data.getValue()>1){

System.out.print("Number of duplicate character in the given String "+data.getKey()+" ");
}
}


}
}