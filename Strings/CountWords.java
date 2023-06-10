import java.util.Scanner;
class CountWords{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter sentance : ");
String s  = sc.nextLine();
String y[]=s.split(" ");
System.out.println("No of words in a given sentance are : "+y.length);
}
}