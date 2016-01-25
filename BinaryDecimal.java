import java.util.Scanner;
public class BinaryDecimal 
{

private static Scanner input;

public static void main(String [] args) // Sollte klar sein
{
int wert; //Die Zahl
String str; //Temporärer String
input = new Scanner (System.in); //Eingabescanner vorbereiten

System.out.println("Binär-Dezimal Rechner");
System.out.println("Ursprungsformat: (B)inär, (D)ezimal oder (E)nde?");
str = input.next();  // Antwort einlesen
if(str.equalsIgnoreCase("b")) { // Vergleichen, dabei Groß/Kleinschreibung ignorieren
System.out.print ("Geben Sie den Ursprungswert ein: ");
	str = input.next();  // Wert einlesen
	if(isNumeric(str)){ // Wenn wert nummer
		wert = Integer.parseInt(str, 2);  // Hoch 2 macht Binär zu dezimal
		System.out.print (str); //Ursprungswert ausgeben
		System.out.print (" entspricht "); // ist klar
		System.out.print (wert); // Ergebnis ausgeben
	} else { //Wenn eingabe keine nummer
		System.out.println("Eingabe war keine Zahl!"); //fehler
	}

} else if (str.equalsIgnoreCase("d")){ // Vergleichen, dabei Groß/Kleinschreibung ignorieren
	System.out.print ("Geben Sie den Ursprungswert ein: ");
	str = input.next();  // Wert einlesen
	if(isNumeric(str)){// Wenn wert nummer
		wert = Integer.parseInt(str); //eingabe in int umwandeln
		System.out.print (str);//Ursprungswert ausgeben
		System.out.print (" entspricht ");	// ist klar
		System.out.print (Integer.toBinaryString(wert)); // Ergebnis umrechnen und ausgeben
	} else {//Wenn eingabe keine nummer
		System.out.println("Eingabe war keine Zahl!");//fehler
	}
}
}

public static boolean isNumeric(String s) {  
    return s.matches("[-+]?\\d*\\.?\\d+");  
}  

}
