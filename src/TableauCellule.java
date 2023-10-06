public class TableauCellule extends Cellule{

    boolean resultat;
    public TableauCellule(char typeDeCellule,int premierLien,int deuxiemeLien){
        super(typeDeCellule);
        this.premierLien=premierLien;
        this.deuxiemeLien=deuxiemeLien;
    }

}
