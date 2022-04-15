package gestion_notes;

public class Etudiant {
	private int id;
	private String nom;
	private double note;
	
	/*creation du constructeur */
	public Etudiant( int id , String nom) {
		this.id=id;
		this.nom=nom;
		this.note=10;
	}
	
	//redéfinition de la méthode tostring 
	public String toString() {
		return this.nom+" : "+this.note;
	}

}
