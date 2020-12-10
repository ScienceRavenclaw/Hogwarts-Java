package Hogwarts;

public class Global {
    
    private static Professorenliste eineProfessorenliste;
    private static Professoren einProfessor;
    private static Schuelerliste eineSchuelerliste;
    private static Schueler einSchueler;
    private static Hauspunktliste eineHauspunktliste;
    private static Hauspunkte einHauspunkt;

    public static Professorenliste getEineProfessorenliste() {
        return eineProfessorenliste;
    }

    public static void setEineProfessorenliste(Professorenliste eineProfessorenliste) {
        Global.eineProfessorenliste = eineProfessorenliste;
    }

    public static Schuelerliste getEineSchuelerliste() {
        return eineSchuelerliste;
    }

    public static void setEineSchuelerliste(Schuelerliste eineSchuelerliste) {
        Global.eineSchuelerliste = eineSchuelerliste;
    }

    public static Hauspunktliste getEineHauspunktliste() {
        return eineHauspunktliste;
    }

    public static void setEineHauspunktliste(Hauspunktliste eineHauspunktliste) {
        Global.eineHauspunktliste = eineHauspunktliste;
    }
    
    public static void initProfessoren() {
        eineProfessorenliste = new Professorenliste();
        eineProfessorenliste.add(new Professoren("Minerva", "McGonagall", "Verwandlung", "Gryffindor"));
        eineProfessorenliste.add(new Professoren("Filius", "Flitwick", "Zauberkunst", "Ravenclaw"));
        eineProfessorenliste.add(new Professoren("Horace", "Slughorn", "Zaubertränke", "Slytherin"));
        eineProfessorenliste.add(new Professoren("Pomona", "Sprout", "Kräuterkunde", "Hufflepuff"));
        eineProfessorenliste.add(new Professoren("Alastor", "Moody", "Verteidigung gegen die dunklen Künste", "-"));
    }
    
    public static void initSchueler() {
        eineSchuelerliste = new Schuelerliste();
        eineSchuelerliste.add(new Schueler("Luna", "Lovegood", "Ravenclaw", "Reinblütig"));
        eineSchuelerliste.add(new Schueler("Harry", "Potter", "Gryffindor", "Halbblütig"));
        eineSchuelerliste.add(new Schueler("Cedric", "Diggory", "Hufflepuff", "Reinblütig"));
        eineSchuelerliste.add(new Schueler("Hermine", "Granger", "Gryffindor", "Muggelstämmig"));
        eineSchuelerliste.add(new Schueler("Blaise", "Zabini", "Slytherin", "Reinblütig"));
        eineSchuelerliste.add(new Schueler("Emily", "Lowrey", "Ravenclaw", "Edelblütig"));
    }
    
    public static void initHauspunkte() {
        eineHauspunktliste = new Hauspunktliste();
        //Ereignis 1
        einProfessor = Global.getEineProfessorenliste().findeProfessorUeberName("McGonagall");
        einSchueler = Global.getEineSchuelerliste().findeSchuelerUeberName("Granger");
        einHauspunkt = new Hauspunkte("20.03.2017", einSchueler, einProfessor, "Gryffindor", 10);
        eineHauspunktliste.add(einHauspunkt);
        
        //Ereignis 2
        einProfessor = Global.getEineProfessorenliste().findeProfessorUeberName("Flitwick");
        einSchueler = Global.getEineSchuelerliste().findeSchuelerUeberName("Lovegood");
        einHauspunkt = new Hauspunkte("25.03.2017", einSchueler, einProfessor, "Ravenclaw", 25);
        eineHauspunktliste.add(einHauspunkt);
        
        //Ereignis 3
        einProfessor = Global.getEineProfessorenliste().findeProfessorUeberName("Sprout");
        einSchueler = Global.getEineSchuelerliste().findeSchuelerUeberName("Diggory");
        einHauspunkt = new Hauspunkte("30.03.2017", einSchueler, einProfessor, "Hufflepuff", 15);
        eineHauspunktliste.add(einHauspunkt);
    }
}