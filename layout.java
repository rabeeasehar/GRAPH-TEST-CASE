import java.io.*;
import java.util.*;
class Test {
    public static void main(String[] args)  
    {  
        ArrayList<String> list = new ArrayList<String>();  
        list.add("A");  
        list.add("B");  
        list.add("C");  
        list.add("D");  
        list.add("E"); 
// Iterator to traverse the list 
Iterator it = list.iterator();
System.out.println("List elements : ");
        while (it.hasNext())  
            System.out.print(it.next() + " ");  
        System.out.println();  
    }  
} 