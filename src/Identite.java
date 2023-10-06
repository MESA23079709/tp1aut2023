public class Identite extends Cellule {
    int premierLien;
    int deuxiemeLiem;
    boolean resultat;
    public Identite(char typeDeCellule,int premierLien,int deuxiemeLien){
        super(typeDeCellule);
        this.premierLien=premierLien;
        this.deuxiemeLiem=deuxiemeLien;
    }
    public boolean TypeIdentite(boolean CourantE1,boolean CourantE2 ){
        //  return !Negation(CourantE1,CourantE2);
        if(CourantE1){
            resultat= true;
        }else{
            resultat=false;
        }
        return resultat;
    }
}
