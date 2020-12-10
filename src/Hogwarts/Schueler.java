package Hogwarts;

public class Schueler extends Person {
    
    private int schuelerID;
    private Object haus;
    private Object blutstatus;
    
    private static int letzteSchuelerID = 0;

    public Schueler(String vorname, String nachname, Object haus, Object blutstatus) {
        super(vorname, nachname);
        this.haus = haus;
        this.blutstatus = blutstatus;
        schuelerID = letzteSchuelerID + 1;
        letzteSchuelerID = letzteSchuelerID + 1;
    }

    public int getSchuelerID() {
        return schuelerID;
    }

    public void setSchuelerID(int schuelerID) {
        this.schuelerID = schuelerID;
    }

    public Object getHaus() {
        return haus;
    }

    public void setHaus(Object haus) {
        this.haus = haus;
    }

    public Object getBlutstatus() {
        return blutstatus;
    }

    public void setBlutstatus(Object blutstatus) {
        this.blutstatus = blutstatus;
    }

    public static int getLetzteSchuelerID() {
        return letzteSchuelerID;
    }

    public static void setLetzteSchuelerID(int letzteSchuelerID) {
        Schueler.letzteSchuelerID = letzteSchuelerID;
    }
    
    public Object[] zeigeSchueler() {
        Object[] eineZeile = { this.getSchuelerID(), this.getVorname(), this.getNachname(), this.getHaus(), this.getBlutstatus() };
        return eineZeile;
    }
    
}