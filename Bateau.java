public class Bateau {

Pont pont;
Cabine cabine;
Voile voile;

//3 attributs
String nom ;
int age ;
final int k=1;


//2 constructeurs 
Bateau(){
}
Bateau(){int age,String nom,Pont pont,Cabine cabine,Voile voile}   
        this.nom=nom;        
        this.age=25;
        this.pont=pont;
	this.cabine=cabine; 
	this.voile=voile;
}
//une fonction
public int Age ( int A){
   system.out.println("Age du bateau"+Bateau.age");
}
}