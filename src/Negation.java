public class Negation extends Cellule {
    int premierLien;
    int deuxiemeLiem;
    boolean resultat;
    public Negation(char typeDeCellule,int premierLien,int deuxiemeLien){
        super(typeDeCellule);
        this.premierLien=premierLien;
        this.deuxiemeLiem=deuxiemeLien;
    }
    public boolean TypeNegation(boolean CourantE1,boolean CourantE2 ){
        if(CourantE1){
            resultat= false;
        }else{
            resultat=true;
        }
        return resultat;
    }
}
