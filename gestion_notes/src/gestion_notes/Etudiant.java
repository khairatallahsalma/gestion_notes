package gestion_notes;



public class Etudiant implements Comparable<Etudiant> {
	private int id;
	private String nom;
	private double note;
	
	/*creation du constructeur */
	public Etudiant( int id , String nom) {
		this.id=id;
		this.nom=nom;
		this.note=10;
	}
	
	public Etudiant( int id , String nom ,double note) {
		this.id=id;
		this.nom=nom;
		this.note=note;
	}
	
	//red�finition de la m�thode tostring 
	public String toString() {
		return this.nom+" : "+this.note;
	}
	
	//red�finition de la m�thode equals
	public boolean equals(Object obj) {
		if (! (obj instanceof Etudiant) ){
			return false;
		}
		return (((Etudiant)obj).id==this.id);
	}
	
	//l'impl�mentation de l interface comparable
	@Override
	public int compareTo(Etudiant e) {
		if(this.note>=e.note) return 1;
		if(this.note<e.note) return 0;
		return -1;
		
		
	}
	
	
	
	
	

}
