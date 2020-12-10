package Hogwarts;

public class Professoren extends Person {
    
    private int professorenID;
    private String fach;
    private Object hauslehrer;
    
    private static int letzteProfessorenID = 0;

    public Professoren(String vorname, String nachname, String fach, Object hauslehrer) {
        super(vorname, nachname);
        this.fach = fach;
        this.hauslehrer = hauslehrer;
        professorenID = letzteProfessorenID + 1;
        letzteProfessorenID = letzteProfessorenID + 1;
    }

    public int getProfessorenID() {
        return professorenID;
    }

    public void setProfessorenID(int professorenID) {
        this.professorenID = professorenID;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    public Object getHauslehrer() {
        return hauslehrer;
    }

    public void setHauslehrer(Object hauslehrer) {
        this.hauslehrer = hauslehrer;
    }
    
    public Object[] zeigeProfessor() {
        Object[] eineZeile = { this.getProfessorenID(), this.getVorname(), this.getNachname(), this.getFach(), this.getHauslehrer() };
        return eineZeile;
    }
}