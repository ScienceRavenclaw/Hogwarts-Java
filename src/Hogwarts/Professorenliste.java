package Hogwarts;
import java.util.ArrayList;

public class Professorenliste extends ArrayList<Professoren> {
    
    public Professoren findeProfessorUeberID(int professorenID) {
        for(Professoren einProfessor : this) {
            if(einProfessor.getProfessorenID() == professorenID) {
                return einProfessor;
            }
        }
        return null;
    }
    
        public Professoren findeProfessorUeberName(String professorenNachname) {
        
        for(Professoren einProfessor : this) {
            if(einProfessor.getNachname().equals(professorenNachname)) {
                return einProfessor;
            }
        }
        return null;
    }
    
    public Professoren loescheProfessor(Professoren einProfessor) {
        if(this.contains(einProfessor)) {
            this.remove(einProfessor);
        }
        return null;
    }
}
