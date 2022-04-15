package gestion_notes;
import java.util.ArrayList;
import java.util.List;


public class ListeEtudiant extends ArrayList<Etudiant> {
	public boolean add(Etudiant e) {
		if(this.contains(e)) return false;
		return super.add(e);
	}
	
	public List<Etudiant> filtrer(Condition c){
		ListeEtudiant l = new ListeEtudiant();
		for(Etudiant e : this) {
			if(c.estVrai(e)) {
				l.add(e);
			}
		}
	 
		 return l;
		
	}
	
	
	

}
