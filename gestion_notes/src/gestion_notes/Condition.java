package gestion_notes;

import java.util.List;

public interface Condition {
	
	public boolean estVrai(Etudiant e);
	 public List<Etudiant> filter(Condition c);
	 

}
