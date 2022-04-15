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
	
	//redéfinition de la méthode tostring 
	public String toString() {
		return this.nom+" : "+this.note;
	}
	
	//redéfinition de la méthode equals
	public boolean equals(Object obj) {
		if (! (obj instanceof Etudiant) ){
			return false;
		}
		return (((Etudiant)obj).id==this.id);
	}
	
	//l'implémentation de l interface comparable
	@Override
	public int compareTo(Etudiant e) {
		if(this.note>=e.note) return 1;
		if(this.note<e.note) return 0;
		return -1;
		
		
	}
	
	public static void main (String[] args) {
		Etudiant e1 , e2 ,e3 ;
		e1=new Etudiant(111,"ahmad");
		e2=new Etudiant(222, "salma" , 12.00);
		e3=new Etudiant(333, "fatima");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
	
	

}
