public class Voile{
	public int largeur;
	public int longeur;
	private int epaisseur;
	protected String couleur; 
	private boolean enroule, deroule;
	
Voile(){
	largeur=0;
	longeur=0;
        epaisseur=0;
	couleur=""; 
	enroule=false;
	deroule=false;
}

Voile(int plargeur,int plongeur,int phauteur,String pcouleur,boolean penroule,boolean pderoule){
	this.largeur=plarge;
        this.longeur=plongeur;
        this.epaisseur=pepaisseur;
	this.couleur=pcouleur; 
	this.enroule=penroule;
	this.deroule=pderoule;
}	

// fonction enrouler()

public void enrouler(){
       this.enroule =true ;
       this.deroule=false;
}
// fonction derouler()

public void derouler(){
       this.enroule = false ;
       this.deroule=true;
}

}