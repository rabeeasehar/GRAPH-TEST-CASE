import java.util.ArrayList;
import java.util.Iterator;
public class Demo {
public static void main(String[] args) {
ArrayList<String> aList = new ArrayList<String>();
aList.add("A");
aList.add("B");
aList.add("C");
aList.add("D");
aList.add("E");
    System.out.println("The ArrayList elements are: ");
      for (String s: aList) {
         System.out.println(s);
      }
Iterator it = aList.iterator();
String str = "";
str = (String) it.next();
if (str.equals("D")) {
it.remove();
break;}}
System.out.println("\nThe ArrayList elements are: ");
for (String s: aList) {
System.out.println(s); 
}}
