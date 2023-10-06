public class Tautologie extends Cellule {
    int premierLien;
    int deuxiemeLiem;
    boolean resultat;
    public Tautologie(char typeDeCellule,int premierLien,int deuxiemeLien){
        super(typeDeCellule);
        this.premierLien=premierLien;
        this.deuxiemeLiem=deuxiemeLien;
    }
    public boolean TypeTautologie(boolean CourantE1,boolean CourantE2 ){
        return !resultat;
    }

}
