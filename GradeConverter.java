import java.util.Scanner;

public class Main {

	private static Scanner input;

	public static void main(String[] args) // Sollte klar sein
	{
		String wert = null; // Der Wert
		String str; // Temporärer String
		input = new Scanner(System.in); // Eingabescanner vorbereiten

		while (true) {
			System.out.println("Notenrechner");
			System.out.println("Ursprungsformat: (P)rozent, (N)ote oder (E)nde?");
			str = input.next(); // Antwort einlesen
			if (str.equalsIgnoreCase("n")) { // Vergleichen, dabei
												// Groß/Kleinschreibung
												// ignorieren
				System.out.print("Geben Sie den Ursprungswert ein: ");
				str = input.next(); // Wert einlesen
				if (isNumeric(str)) { // Wenn wert nummer
					switch (Integer.parseInt(str)) { // In Integer umwandeln und
														// switchen
					case 1: // Eins
						wert = "Sehr gut";
						break;// Switch Verlassen
					case 2: // Zwei
						wert = "Gut";
						break;// Switch Verlassen
					case 3: // Drei
						wert = "Befriedigend";
						break;// Switch Verlassen
					case 4: // Vier
						wert = "Ausreichend";
						break;// Switch Verlassen
					case 5: // Fünf
						wert = "Mangelhaft";
						break;// Switch Verlassen
					case 6: // Sechs
						wert = "Ungenügend";
						break;// Switch Verlassen
					default: // Irgendwas anderes
						wert = "keiner Prozentzahl";
					}
					System.out.print(str); // Ursprungswert ausgeben
					System.out.print(" entspricht "); // ist klar
					System.out.print(wert); // Ergebnis ausgeben
				} else { // Wenn eingabe keine nummer
					System.out.println("Eingabe war keine Zahl!"); // fehler
				}

			} else if (str.equalsIgnoreCase("p")) { // Vergleichen, dabei
													// Groß/Kleinschreibung
													// ignorieren
				System.out.print("Geben Sie den Ursprungswert ein: ");
				str = input.next(); // Wert einlesen
				if (isNumeric(str)) {// Wenn wert nummer
					if (Integer.parseInt(str) < 29) { // Weniger als 29
						wert = "6";
					} else if (Integer.parseInt(str) < 49) { // Weniger als 49
						wert = "5";
					} else if (Integer.parseInt(str) < 66) { // Weniger als 66
						wert = "4";
					} else if (Integer.parseInt(str) < 80) { // Weniger als 80
						wert = "3";
					} else if (Integer.parseInt(str) < 91) { // Weniger als 91
						wert = "2";
					} else if (Integer.parseInt(str) < 100) { // Weniger als 100
						wert = "1";
					} else { // Fehler
						wert = "Fehler";
					}

					System.out.print(str);// Ursprungswert ausgeben
					System.out.print("% entspricht Note "); // ist klar
					System.out.print(wert); // Ergebnis ausgeben
					if (isNumeric(wert)) { // Wenn wert nummer
						System.out.print(" ("); // ist auch klar
						str = wert; // Zum weiterrechnen in str schieben
						int tmp = Integer.parseInt(str);
						switch (tmp) { // In Integer umwandeln und switchen
						case 1: // Eins
							wert = "Sehr gut";
							break; // Switch Verlassen
						case 2: // Zwei
							wert = "Gut";
							break;// Switch Verlassen
						case 3: // Drei
							wert = "Befriedigend";
							break;// Switch Verlassen
						case 4: // Vier
							wert = "Ausreichend";
							break;// Switch Verlassen
						case 5: // Fünf
							wert = "Mangelhaft";
							break;// Switch Verlassen
						case 6: // Sechs
							wert = "Ungenügend";
							break;// Switch Verlassen
						default:
							wert = "Bereichsfehler";
						}
						System.out.print(wert); // Ergebnis ausgeben
						System.out.print(")"); // ist auch klar
					}
				} else {// Wenn eingabe keine nummer
					System.out.println("Eingabe war keine Zahl!");// fehler
				}
			} else if (str.equalsIgnoreCase("e")) { // Wenn Eingabe E
				System.out.println("Tschüssi!"); // Freundlich sein
				break; // Programm beenden
			}
		}
	}

	public static boolean isNumeric(String s) {
		return s.matches("[-+]?\\d*\\.?\\d+");
	}

}
