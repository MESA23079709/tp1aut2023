public class Conjonction extends Cellule {
    int premierLien;
    int deuxiemeLiem;
    boolean resultat;
    public Conjonction(char typeDeCellule,int premierLien,int deuxiemeLien){
        super('C');
        this.premierLien=premierLien;
        this.deuxiemeLiem=deuxiemeLien;
    }
    public boolean TypeConjocntion(boolean CourantE1,boolean CourantE2 ){
        if(CourantE1 && CourantE2){
            resultat= true;
        }else{
            resultat=false;
        }
        return resultat;
    }
}
