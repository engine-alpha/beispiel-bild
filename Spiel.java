import ea.*;

/**
 * Dieses Beispiel demonstriert, wie man Bilder in der Engine Alpha benutzen kann.<br /><br />
 * 
 * Notiz:<br />
 * Die hier zugehoerige Bilddatei befindet sich im Projektordner.
 * @version 2.0
 * @author Michael Andonie
 */
public class Spiel 
extends Game {
    
    /**
     * Das Bild, das dargestellt wird.
     */
    private Bild bild;
    
    /**
     * Konstruktor-Methode.<br />
     * Erstellt das Spiel und beginnt das Beispiel. Hierdrin wird das Bild geladen und sichtbar gemacht.
     */
    public Spiel() {
        super(550, 600, "Bilder-Beispiel");
        
        //Lade das Bild:
        //X-Koordinate der linken oberen Ecke: 5
        //Y-Koordinate der linken oberen Ecke: 3
        //Dateipfad vom Projektordner aus: "bilddatei.png"
        bild = new Bild(5, 5, "bilddatei.png");
        
        //Mache das Bild auch sichtbar!
        //Die Methode habe ich dir im Kapitel 'Raum' mitgegeben.
        sichtbarMachen(bild);
    }
    
    /**
     * Macht ein beliebiges Raum-Objekt sichtbar.<br />
     * Dank der Vererbungshierarchie koennen ueber 
     * diese Methode Texte wie Bilder und andere 
     * grafische Elemente mit einer Methode behandelt werden.<br />
     * Diese Methode muss noch nicht verstanden werden. Sie wird 
     * im Kapitel 'Knoten' behandelt und erklaert.
     * @param   m   Das sichtbar zu machende Raum-Objekt
     */
    public void sichtbarMachen(Raum m) {
        wurzel.add(m);
    }
    
    /**
     * Die Taste-Reagieren-Methode zum Reagieren auf Tastendruck.<br />
     * Hierdrin wird das Bild bei Druck auf die Pfeiltasten einfach verschoben.<br /><br `/>
     * 
     * Die Methode zum verschieben kann bei jeder grafischen Klasse genutzt werden, sowohl fuer 
     * <b>Bilder</b> als auch fuer <b>Texte, geometrische Figuren etc.</b>. Denn diese Methode ist 
     * in der Klasse <code>Raum</code> definiert und <b>ALLE</b> grafischen Objekte leiten sich 
     * aus dieser Klasse <code>Raum</code> ab.
     *  @param  tastencode  Der Code, der angibt, welche Taste gedrueckt wurde.
     */
    @Override
    public void tasteReagieren(int tastencode) {
        switch(tastencode) {
            case 26: //Pfeil rauf
                //Verschiebe das Bild um Delta-X = 0 und Delta-Y = -10
                bild.verschieben(0, -10);
                break;
            case 27: //Pfeil rechts
                //Verschiebe das Bild um Delta-X = 0 und Delta-Y = 0
                bild.verschieben(10, 0);
                break;
            case 28: //Pfeil runter
                //Verschiebe das Bild um Delta-X = 0 und Delta-Y = 10
                bild.verschieben(0, 10);
                break;
            case 29: //Pfeil links
                //Verschiebe das Bild um Delta-X = -10 und Delta-Y = 0
                bild.verschieben(-10, 0);
                break;
        }
    }
}