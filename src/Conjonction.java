public class Conjonction extends Cellule{

    public Conjonction(char typeCellule,int lienCellule1,int lienCellule2){
       super(Cellule);
        this.typeCellule=typeCellule;
        this.lienCellule1=lienCellule1;
        this.lienCellule2=lienCellule2;
        this.courant=false;
        this.suivant=false;
    }
}
