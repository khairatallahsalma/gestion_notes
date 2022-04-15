package gestion_notes;
import java.util.ArrayList;

public class ListeEtudiant extends ArrayList<Etudiant> {
	public boolean add(Etudiant e) {
		if(this.contains(e)) return false;
		return super.add(e);
	}

}
