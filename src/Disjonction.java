public class Disjonction extends Cellule{
    int premierLien;
    int deuxiemeLiem;
    boolean resultat;
    public Disjonction(char typeDeCellule,int premierLien,int deuxiemeLien){
        super('D');
        this.premierLien=premierLien;
        this.deuxiemeLiem=deuxiemeLien;
    }
    public boolean TypeDisjonction(boolean CourantE1,boolean CourantE2 ){
        if(!CourantE1 && !CourantE2){
            resultat= false;
        }else{
            resultat=true;
        }
        return resultat;
    }
}
