class RemoveSpace{
public static void main(String args[]){
String x ="Spaces due to backspace";

x=x.replace(" ","");

System.out.println(x);

String y ="Spaces   due to  tab";

y=y.replaceAll("\n","");

System.out.println(y);

String z="Spaces due to both	tab	&	backspace";

z=z.replaceAll("\\s+","");

System.out.println(z);

}
}