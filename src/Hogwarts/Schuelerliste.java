package Hogwarts;
import java.util.ArrayList;

public class Schuelerliste extends ArrayList<Schueler> {
    
    public Schueler findeSchuelerUeberID(int schuelerID) {
        
        for(Schueler einSchueler : this) {
            if(einSchueler.getSchuelerID() == schuelerID) {
                return einSchueler;
            }
        }
        return null;
    }
    
    public Schueler findeSchuelerUeberName(String schuelerNachname) {
        
        for(Schueler einSchueler : this) {
            if(einSchueler.getNachname().equals(schuelerNachname)) {
                return einSchueler;
            }
        }
        return null;
    }
    
    public Schueler loescheSchueler(Schueler einSchueler) throws Exception {
        
        if(this.contains(einSchueler)) {
            this.remove(einSchueler);
        }
        return null;
    }
}
