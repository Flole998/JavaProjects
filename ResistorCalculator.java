import java.util.*;
public class WiderstandR 
{

private static Scanner input;

public static void main(String [] args) // Sollte klar sein
{
int MaxR = 10; // Maximale Anzahl der Widerstände
String str; // das sind Hilfsvariablen
String p = "P"; 
String r = "R";
int i = 0;
int numr = 0; //Anzahl Widerstände
double rg = 0; //R gesamt
double[] rin = new double[MaxR]; //Eingaben
input = new Scanner (System.in);

System.out.println("Widerstands-Schaltung");
System.out.println("(P)arallel-, (R)eihenschaltung oder (E)nde?");
str = input.next();  // Antwort einlesen
if(str.equalsIgnoreCase(p)) { // Vergleichen, dabei Groß/Kleinschreibung ignorieren
System.out.println ("Sie haben Parallelschaltung gewählt!");
while(i < MaxR){ // Während wir die maximale Zahl nicht überschritten haben
	System.out.print ("Bitte geben Sie den Wert für R");
	System.out.print(i);
	System.out.print (" ein oder 'ende' um die Eingabe zu beenden:");
	str = input.next();  // Wert einlesen
	if(str.equalsIgnoreCase("ende")) {
		break;  //Schleife beenden
	}
	if(isNumeric(str)) {
		if(Double.parseDouble(str) < 0){
			System.out.println("Es gibt keine negativen Widerstände!!"); // Widerstand kann nicht negativ sein!
		} else {
			rin[i] = Double.parseDouble(str); //In Double umwandeln
			i++; // i hochzählen
		}
	} else {
		System.out.println("Keine Nummer eingegeben!!"); // Eingabe war keine Zahl
	}
}
numr = i; // Zahl der Widerstände ist i
for(i = 0; i < numr; i++) { // Für jeden Wert der eingegeben wurde
	  rg = rg + Math.pow(rin[i],-1);  // Widerstand berechnen, R Gesamt = 1/Rx
	}
rg = Math.pow(rg,-1); // Hoch -1
System.out.print("Der Widerstand beträgt "); // Widerstandswert ausgeben
System.out.print(rg);
System.out.println(" Ohm");
} else if (str.equalsIgnoreCase(r)){ // Vergleichen, dabei Groß/Kleinschreibung ignorieren
System.out.println ("Sie haben Reihenschaltung gewählt!");
while(i < MaxR){
	System.out.print ("Bitte geben Sie den Wert für R"); // Frage nach Rx
	System.out.print(i);
	System.out.print (" ein oder 'ende' um die Eingabe zu beenden:");
	str = input.next(); // Einlesen
	if(str.equalsIgnoreCase("ende")) {
		break; //Alle Werte eingelesen, Schleife beenden
	}
	if(isNumeric(str)) {
		if(Double.parseDouble(str) < 0){
			System.out.println("Es gibt keine negativen Widerstände!!"); // Widerstand kann nicht negativ sein!
		} else {
			rin[i] = Double.parseDouble(str); //In Double umwandeln
			i++; // i hochzählen
		}
	} else {
		System.out.println("Keine Nummer eingegeben!!"); // Eingabe war keine Zahl
	}
}
for(i = 0; i < rin.length; i++) {  // Für jeden Wert
	  rg += rin[i];		//Simple addition
	}
System.out.print("Der Widerstand beträgt "); // Widerstandswert ausgeben
System.out.print(rg);
System.out.println(" Ohm");
} else if (str.equalsIgnoreCase("e")){ // Vergleichen, dabei Groß/Kleinschreibung ignorieren
	System.out.println("Tschüss!"); // User verabschieden
} else { // Ungültig
System.out.println ("Geben sie entweder P, R oder E ein"); // Ungültige Eingabe
} 
}

public static boolean isNumeric(String s) {  
    return s.matches("[-+]?\\d*\\.?\\d+");  
}  

}
