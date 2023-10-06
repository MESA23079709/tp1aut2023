public class Equivalence extends Cellule {


    boolean resultat;
    public Equivalence(char typeDeCellule,int premierLien,int deuxiemeLien){
        super('E');
        this.premierLien=premierLien;
        this.deuxiemeLien=deuxiemeLien;
    }
    public boolean TypeEquivalence(boolean CourantE1,boolean CourantE2 ){
        if(CourantE1 == CourantE2 ){
            resultat= true;
        }else{
            resultat=false;
        }
        return resultat;
    }

}
