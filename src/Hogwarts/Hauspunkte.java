package Hogwarts;

public class Hauspunkte {
    
    private int id;
    private static int letzteID = 0;
    private String datum;
    Schueler einSchueler;
    Professoren einProfessor;
    private Object haus;
    private int hauspunkte;

    public Hauspunkte(String datum, Schueler einSchueler, Professoren einProfessor, Object haus, int hauspunkte) {
        this.datum = datum;
        this.einSchueler = einSchueler;
        this.einProfessor = einProfessor;
        this.haus = haus;
        this.hauspunkte = hauspunkte;
        id = letzteID + 1;
        letzteID = letzteID + 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getLetzteID() {
        return letzteID;
    }

    public static void setLetzteID(int letzteID) {
        Hauspunkte.letzteID = letzteID;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public Schueler getEinSchueler() {
        return einSchueler;
    }

    public void setEinSchueler(Schueler einSchueler) {
        this.einSchueler = einSchueler;
    }

    public Professoren getEinProfessor() {
        return einProfessor;
    }

    public void setEinProfessor(Professoren einProfessor) {
        this.einProfessor = einProfessor;
    }

    public Object getHaus() {
        return haus;
    }

    public void setHaus(Object haus) {
        this.haus = haus;
    }

    public int getHauspunkte() {
        return hauspunkte;
    }

    public void setHauspunkte(int hauspunkte) {
        this.hauspunkte = hauspunkte;
    }
    
    public Object[] zeigeHauspunkte() {
        Object[] eineZeile = { this.getId(), this.getDatum(), this.getEinSchueler().getNachname(), this.getEinProfessor().getNachname(),
                                this.getHaus(), this.getHauspunkte() };
        return eineZeile;
    }
}
