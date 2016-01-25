import java.util.ArrayList;

public class ArrayArrayListExample {
    
    public static void main(String[] args) { 
 
        // ArrayList Example   
  
        ArrayList<String> arrlistobj = new ArrayList<String>();
        arrlistobj.add("Ich bin toll");
        arrlistobj.add("Liebe");
        System.out.println("ArrayList Ausgabe :");  
        for(int index = 0; index < arrlistobj.size(); index++) {         
          System.out.println(arrlistobj.get(index));
        }
        System.out.println();
          
         
        // Array Example
 
        String[] arrayobj = new String[3];
        arrayobj[0]= "Liebe";  
        arrayobj[1]= "Ich bin toll";
        arrayobj[2]= "Du auch!"; 
        System.out.println("Array Ausgabe :");
        for(int index=0; index < arrayobj.length ;index++) {
        	System.out.println(arrayobj[index] + " ");   
        }
 
 }
}
