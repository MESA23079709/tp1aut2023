public class Cellule {
    char typeCellule;
    int lienCellule1;
    int lienCellule2;
    boolean courant;
    boolean suivant;
    public Cellule(char typeCellule,int lienCellule1,int lienCellule2){
        this.typeCellule=typeCellule;
        this.lienCellule1=lienCellule1;
        this.lienCellule2=lienCellule2;
        this.courant=false;
        this.suivant=false;
    }
    public char getTypeCellule(){
        return typeCellule;
    }
    public void setTypeCellule(char typeCellule){
        this.typeCellule=typeCellule;
    }
    public int getLienCellule1(){
        return lienCellule1;
    }
    public void setLienCellule1(char lienCellule1){
        this.lienCellule1=lienCellule1;
    }
    public int getLienCellule2(){
        return lienCellule2;
    }
    public void setLienCellule2(char lienCellule2){
        this.lienCellule2=lienCellule2;
    }
    public boolean getCourant(){
        return courant;
    }
    public void setCourant(boolean courant){
        this.courant=courant;
    }
    public boolean getSuivant(){
        return suivant;
    }
    public void setSuivant(boolean suivant){
        this.suivant=suivant;
    }

    public void remplirTableauDojbet(Object [] tableauDobjet,char [] tableauDeLettre,int[] tableauDeChiffres){
        for(int i=0;i<tableauDobjet.length;i++){
            Cellule S0 = new Cellule(tableauDeLettre[i],tableauDeChiffres[i*2],tableauDeChiffres[(i*2)+1]);
            tableauDobjet[i]=S0;
        }

    }
}
