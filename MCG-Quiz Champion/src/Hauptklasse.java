
public class Hauptklasse {

	private static int spielerZahl = 0;
	public static FragenKatalog fragenkatalog = new FragenKatalog();
	private static String spielername1, spielername2, spielername3;
	private static int punkteS1 = 0, punkteS2 = 0, punkteS3 = 0;
	private static GUI_Fragen guifragen;
	private final static int anzahlSchwierigkeitsgrade = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int getSpielerZahl() {
		return spielerZahl;
	}

	public static void setSpielerZahl(int spielerZahl) {
		Hauptklasse.spielerZahl = spielerZahl;
	}

	public static FragenKatalog getFragenkatalog() {
		return fragenkatalog;
	}

	public static void setFragenkatalog(FragenKatalog fragenkatalog) {
		Hauptklasse.fragenkatalog = fragenkatalog;
	}

	public static String getSpielername1() {
		return spielername1;
	}

	public static void setSpielername1(String spielername1) {
		Hauptklasse.spielername1 = spielername1;
	}

	public static String getSpielername2() {
		return spielername2;
	}

	public static void setSpielername2(String spielername2) {
		Hauptklasse.spielername2 = spielername2;
	}

	public static String getSpielername3() {
		return spielername3;
	}

	public static void setSpielername3(String spielername3) {
		Hauptklasse.spielername3 = spielername3;
	}

	public static int getPunkteS1() {
		return punkteS1;
	}

	public static void setPunkteS1(int punkteS1) {
		Hauptklasse.punkteS1 = punkteS1;
	}

	public static int getPukteS2() {
		return punkteS2;
	}

	public static void setPukteS2(int pukteS2) {
		Hauptklasse.punkteS2 = pukteS2;
	}

	public static int getPunkteS3() {
		return punkteS3;
	}

	public static void setPunkteS3(int punkteS3) {
		Hauptklasse.punkteS3 = punkteS3;
	}

	public static GUI_Fragen getGuifragen() {
		return guifragen;
	}

	public static void setGuifragen(GUI_Fragen guifragen) {
		Hauptklasse.guifragen = guifragen;
	}

	public static int getAnzahlschwierigkeitsgrade() {
		return anzahlSchwierigkeitsgrade;
	}

}
