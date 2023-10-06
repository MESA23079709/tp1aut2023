import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Cellule {
    char typeDeCellule;
    int premierLien;
    int deuxiemeLien;
    boolean courant;
    boolean suivant;

    public Cellule(char typeDeCellule){
        this.typeDeCellule=typeDeCellule;
       // this.lienCellule1=lienCellule1;
       // this.lienCellule2=lienCellule2;
        this.courant=false;
        this.suivant=false;
    }



    public char getTypeCellule(){
        return typeDeCellule;
    }
    public void setTypeCellule(char typeCellule){
        this.typeDeCellule=typeCellule;
    }
    public int getPremierLien(){
        return premierLien;
    }
    public void setgetPremierLien(char lienCellule1){
        this.premierLien=lienCellule1;
    }
    public int getDeuxiemeLien(){
        return deuxiemeLien;
    }
    public void setgetDeuxiemeLien(char lienCellule2){
        this.deuxiemeLien=lienCellule2;
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

    public void remplirTableauDojbet(Object [] tableauDobjet,char [] tableauDeTypeCellules,int[] tableauDeLiens){
        TableauCellule S0 = new TableauCellule ('Z',0,0);
        tableauDobjet[0]=S0;
      //  System.out.println("S0 : "+S0.getTypeCellule() + " taille de tableau "+ tableauDobjet.length );
        for(int i=0;i<tableauDobjet.length-1;i++){
            TableauCellule S1 = new TableauCellule (tableauDeTypeCellules[i],tableauDeLiens[i*2],tableauDeLiens[(i*2)+1]);
            tableauDobjet[i+1]=S1;
        }
    }
    /*
    public void evolutionCellule(Object [] tableauObjet,String nomFichierValeur){
        try {
            char chiffre;
            int numero;
            File lesChiffres =new File("C://aymen/vraiFaux.txt");
            Scanner scani = new Scanner(lesChiffres);
            int nombreDeChiffres;
            Fichier fichierVleur =new Fichier();
            nombreDeChiffres=fichierVleur.nombreDeChiffresDansFichier("C://aymen/tp1aut2023/tp1aut2023/src/vraiFaux.txt");
            for(int i=0;i<nombreDeChiffres;i++) {
                chiffre = scani.next().charAt(0);
                if (Character.isDigit(chiffre)) {
                    numero = Character.getNumericValue(chiffre);
                    System.out.println("le numero est :"+numero);

                } else {
                    System.out.println("Le fichier ne contient pas que des chiffres ");
                }
            }

        }catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUNDED :");
        }

    }

     */
    public ArrayList<Boolean> evolutionCellule(Object [] tableauDeCellules,String FichierValeur){

        boolean trueOrFlase;
        TableauCellule cellule0;
        TableauCellule celluleActuel;
        TableauCellule CellulePremierLien;
        TableauCellule CelluleDeuxiemeLien;
        int premierLien;
        int deuxiemeLien;
        boolean courantPremierCellule;
        boolean courantDeuxiemeCellule;
        boolean suivantCelluleActuel;
        boolean suivantFinal;
        Fichier fichierVleur =new Fichier();
        ArrayList<Boolean> listeBoolean = new ArrayList<>();
        typeCellule evolutionCellule=new typeCellule();
        if(!FichierValeur.isEmpty()){
        int[]tableauDeFichierValeur=fichierVleur.remplirTableauDeFichierValeur(FichierValeur);


        for (int j : tableauDeFichierValeur) {
            if (j == 1) {
                for (int t = 0; t < tableauDeCellules.length; t++) {

                    if (t == 0) {
                        trueOrFlase = true;
                        cellule0 = (TableauCellule) tableauDeCellules[t];
                        cellule0.setSuivant(trueOrFlase);
                        cellule0.setSuivant(cellule0.getSuivant());
                        tableauDeCellules[t] = cellule0;

                    } else {
                        celluleActuel = (TableauCellule) tableauDeCellules[t];
                        premierLien = celluleActuel.getPremierLien();
                        deuxiemeLien = celluleActuel.getDeuxiemeLien();
                        CellulePremierLien = (TableauCellule) tableauDeCellules[premierLien];
                        courantPremierCellule = CellulePremierLien.getCourant();
                        CelluleDeuxiemeLien = (TableauCellule) tableauDeCellules[deuxiemeLien];
                        courantDeuxiemeCellule = CelluleDeuxiemeLien.getCourant();
                        switch (celluleActuel.getTypeCellule()) {
                            //Conjocntion
                            case 'C' -> {
                                suivantCelluleActuel = evolutionCellule.Conjonction(courantPremierCellule, courantDeuxiemeCellule);
                                celluleActuel.setSuivant(suivantCelluleActuel);
                                tableauDeCellules[t] = celluleActuel;
                            }
                            case 'D' -> {
                                suivantCelluleActuel = evolutionCellule.Disjonction(courantPremierCellule, courantDeuxiemeCellule);
                                celluleActuel.setSuivant(suivantCelluleActuel);
                                tableauDeCellules[t] = celluleActuel;
                            }
                            case 'E' -> {
                                suivantCelluleActuel = evolutionCellule.Equivalence(courantPremierCellule, courantDeuxiemeCellule);
                                celluleActuel.setSuivant(suivantCelluleActuel);
                                tableauDeCellules[t] = celluleActuel;
                            }
                            case 'N' -> {
                                suivantCelluleActuel = evolutionCellule.Negation(courantPremierCellule, courantDeuxiemeCellule);
                                celluleActuel.setSuivant(suivantCelluleActuel);
                                tableauDeCellules[t] = celluleActuel;
                            }
                            case 'I' -> {
                                suivantCelluleActuel = evolutionCellule.Identite(courantPremierCellule, courantDeuxiemeCellule);
                                celluleActuel.setSuivant(suivantCelluleActuel);
                                tableauDeCellules[t] = celluleActuel;
                            }
                            case 'F' -> {
                                suivantCelluleActuel = evolutionCellule.Contradiction(courantPremierCellule, courantDeuxiemeCellule);
                                celluleActuel.setSuivant(suivantCelluleActuel);
                                tableauDeCellules[t] = celluleActuel;
                            }
                            case 'V' -> {
                                suivantCelluleActuel = evolutionCellule.Tautologie(courantPremierCellule, courantDeuxiemeCellule);
                                celluleActuel.setSuivant(suivantCelluleActuel);
                                tableauDeCellules[t] = celluleActuel;
                            }
                        }
                        if (t == tableauDeCellules.length - 1) {
                            suivantFinal = celluleActuel.getSuivant();
                            listeBoolean.add(suivantFinal);
                          //  System.out.println("tttt :" + t + " : " + suivantFinal);
                        }

                    }


                }

            } else {
                for (int t = 0; t < tableauDeCellules.length; t++) {
                    if (t == 0) {
                        trueOrFlase = false;
                        cellule0 = (TableauCellule) tableauDeCellules[t];
                        cellule0.setSuivant(trueOrFlase);
                        cellule0.setSuivant(cellule0.getSuivant());
                        tableauDeCellules[t] = cellule0;
                    } else {
                        celluleActuel = (TableauCellule) tableauDeCellules[t];
                        premierLien = celluleActuel.getPremierLien();
                        deuxiemeLien = celluleActuel.getDeuxiemeLien();
                        CellulePremierLien = (TableauCellule) tableauDeCellules[premierLien];
                        courantPremierCellule = CellulePremierLien.getCourant();
                        CelluleDeuxiemeLien = (TableauCellule) tableauDeCellules[deuxiemeLien];
                        courantDeuxiemeCellule = CelluleDeuxiemeLien.getCourant();
                        switch (celluleActuel.getTypeCellule()) {
                            //Conjocntion
                            case 'C' -> {
                                suivantCelluleActuel = evolutionCellule.Conjonction(courantPremierCellule, courantDeuxiemeCellule);
                                celluleActuel.setSuivant(suivantCelluleActuel);
                                tableauDeCellules[t] = celluleActuel;
                            }
                            case 'D' -> {
                                suivantCelluleActuel = evolutionCellule.Disjonction(courantPremierCellule, courantDeuxiemeCellule);
                                celluleActuel.setSuivant(suivantCelluleActuel);
                                tableauDeCellules[t] = celluleActuel;
                            }
                            case 'E' -> {
                                suivantCelluleActuel = evolutionCellule.Equivalence(courantPremierCellule, courantDeuxiemeCellule);
                                celluleActuel.setSuivant(suivantCelluleActuel);
                                tableauDeCellules[t] = celluleActuel;
                            }
                            case 'N' -> {
                                suivantCelluleActuel = evolutionCellule.Negation(courantPremierCellule, courantDeuxiemeCellule);
                                celluleActuel.setSuivant(suivantCelluleActuel);
                                tableauDeCellules[t] = celluleActuel;
                            }
                            case 'I' -> {
                                suivantCelluleActuel = evolutionCellule.Identite(courantPremierCellule, courantDeuxiemeCellule);
                                celluleActuel.setSuivant(suivantCelluleActuel);
                                tableauDeCellules[t] = celluleActuel;
                            }
                            case 'F' -> {
                                suivantCelluleActuel = evolutionCellule.Contradiction(courantPremierCellule, courantDeuxiemeCellule);
                                celluleActuel.setSuivant(suivantCelluleActuel);
                                tableauDeCellules[t] = celluleActuel;
                            }
                            case 'V' -> {
                                suivantCelluleActuel = evolutionCellule.Tautologie(courantPremierCellule, courantDeuxiemeCellule);
                                celluleActuel.setSuivant(suivantCelluleActuel);
                                tableauDeCellules[t] = celluleActuel;
                            }
                        }
                        if (t == tableauDeCellules.length - 1) {
                            suivantFinal = celluleActuel.getSuivant();
                            listeBoolean.add(suivantFinal);
                            //  System.out.println("tttt :"+t+ " : " +suivantFinal);
                        }
                    }
                    // System.out.println("la premiere valeur est :"+tableauDeFichierValeur[i]);

                }
            }

            // Copier La Valeur De Suivant Dans Courant
            for (Object tableauDeCellule : tableauDeCellules) {
                boolean CopierSuivantDansCourant;
                CopierSuivantDansCourant = ((TableauCellule) tableauDeCellule).getSuivant();
                ((TableauCellule) tableauDeCellule).setCourant(CopierSuivantDansCourant);
            }
            // System.out.println(" hna tableau M3A LAKHER 2222  kima I :=: \n "+i);

        }
                               //FichierValeur
        System.out.println(" tableau taba3 l hadh l fichier :"+FichierValeur);
        for (int k=0;k<listeBoolean.size();k++){
            System.out.println("case k:"+k+ " : " +listeBoolean.get(k));
        }

    }else{
            System.out.println("fichier valeur est vide");
        }

        return listeBoolean;
    }


}
