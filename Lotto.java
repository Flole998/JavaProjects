import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = ""; //Temporärer String
		Byte User[] = new Byte[6];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i <6; i++) {
			boolean exit = false;
			while(!exit){ // Wenn wert nummer
				System.out.print ("Geben Sie ihre " + (i + 1) + ". Zahl ein: ");
				str = input.next();  // Wert einlesen
				if(str.matches("[-+]?\\d*\\.?\\d+")) { //Wenn Eingabe eine Zahl
					if(Integer.parseInt(str) > 0 && Integer.parseInt(str) < 50) { //Wenn zahl im richtigen Bereich
						if(Arrays.asList(User).contains((byte) Integer.parseInt(str))) { //Wenn zahl schon vorhanden
							System.out.println("Zahl bereits vorhanden!"); //Fehler
						} else {
							exit = true; //while beenden
							break; //breaken
						}
					} else { //Wenn zahl außerhalb des bereichs
						System.out.println("Eingabe war keine gültige Zahl!"); //Fehler
					}
				} else { //Wenn eingabe keine zahl
					System.out.println("Eingabe war keine Zahl!"); //Fehler
				}
					
			}
			User[i] = (byte) Integer.parseInt(str); //Eingabe in Array speichern
		}
		System.out.println("Es folgt die Ziehung der heutigen Lottozahlen:"); //Viel Glück!!
		byte richtige = 0; //Erstmal 0 richtige
		byte[] ziehung = new byte[6];
		 for(int index=0; index < User.length ;index++) { //für jede zahl
			 byte tmp = (byte) ThreadLocalRandom.current().nextInt(1, 49); //Zahl ziehen
			 while(arraycontains(ziehung, tmp)) { //Wenn es bereits gezogen wurde
				 System.out.println("Nochmal");
				 tmp = (byte) ThreadLocalRandom.current().nextInt(1, 49); //Noch mal ziehen
			 }
			 ziehung[index] = tmp; //Zahl zur Ziehung hinzufügen
			 if(Arrays.asList(User).contains(ziehung[index])) { // Wenn ein Treffer
					richtige++; //Treffer hochzählen
				}
			 System.out.println(ziehung[index]); //Ziehung
	        }
		 System.out.println("Sie haben " + richtige + " richtige!!");
		input.close();
	}

	public static boolean arraycontains(byte[] arr, byte targetValue) {
		for(byte s: arr){
			if(s == targetValue)
				return true;
		}
		return false;
	}
	
}
