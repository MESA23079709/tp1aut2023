import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;


// AYMEN MESSAAD

public class ReseauDeCellules {



    public static ArrayList< Boolean >
    executer( String nomFichierReseau, String nomFichierValeur ){
        ArrayList<Boolean> celluleList = new ArrayList<>();
        File monFichier = new File(nomFichierReseau);
        if(monFichier.length()==0 ){
        System.out.println("fichier est vide");
        }
        if(monFichier.length()==0 ){
            System.out.println("fichier est vide");
        }
        System.out.println(" le fichier :" + nomFichierReseau +" et "+nomFichierValeur );
        // File ficherVide = new File("C://aymen/tp1aut2023/tp1aut2023/src/fichierVide.txt");
        // File fausseValeur = new File("C://aymen/tp1aut2023/tp1aut2023/src/fausseValeur.txt");
        //  File vraiFaux = new File("C://aymen/tp1aut2023/tp1aut2023/src/monFichier.txt");
        Fichier monfile = new Fichier();
        TableauCellule cellule = new TableauCellule('z', 0, 0);



        // int longeur;
        int nombreDeLigne = 0;
       // System.out.println("virifier si le fichier est vide");
        if (!monfile.VerifierFichierVide(monFichier)) {
           // System.out.println("verifierFichierSiCorrect");
            nombreDeLigne = monfile.verifierLonguerDeFichier(monFichier);
           // System.out.println("nombredeligne: " + nombreDeLigne);
          //  System.out.println(" f ou v :" + monfile.VerifierFichierSiCorrect(monFichier, nombreDeLigne));
        }
       // System.out.println("nmbr " + nombreDeLigne);
        int[] tableauChiffre = new int[nombreDeLigne * 2];
        char[] tableaulettre = new char[nombreDeLigne];
        monfile.SauvgarderChiffresDeFichier(monFichier, tableauChiffre);
        monfile.SauvgarderLettresDeFichier(monFichier, tableaulettre, nombreDeLigne);
        Object[] tableauDeCellules = new Object[nombreDeLigne + 1];
        cellule.remplirTableauDojbet(tableauDeCellules, tableaulettre, tableauChiffre);
       // System.out.println("taille ;" + tableauDeCellules.length);
        celluleList= cellule.evolutionCellule(tableauDeCellules,nomFichierValeur);

        return celluleList;
    }








}

