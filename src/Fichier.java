import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Fichier {
    Scanner scannerLeFichier;


    Boolean vide;
    public Boolean VerifierFichierVide(File nomDeFichier){

        if(nomDeFichier.length()==0){
            vide=true;
            System.out.println("le fichier est Vide !");
        }else{
            vide=false;
        }
        return vide;
    }
    int nombreDeLignes;
    public int verifierLonguerDeFichier(File nomDeFicher){

        try (BufferedReader lecteur = new BufferedReader(new FileReader(nomDeFicher))) {
            while (lecteur.readLine() != null) {
                nombreDeLignes++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nombreDeLignes;
    }
    /*
    public int compteNombreDeCaracteresDeFichier(File nomDeFichier){

    }

     */
    char lettre;
    int indiceTableLettre=0;
    String ligne;
    Scanner scannerLeFicher;
    Scanner scannerLe;
    public char [] SauvgarderLettresDeFichier(File nomDeFichier,char [] tableauDeLettres,int nombreDeLignes){
        try {
            scannerLe = new Scanner(nomDeFichier);
            if(nomDeFichier.length()==0){
                System.out.println("Le fichier est vide.");
            }else {
                //  System.out.println("tableau 9bal for :" + nombreDeLignes);
                for (int i = 0; i < nombreDeLignes * 3; i++) {
                    //System.out.println("tableau 9bal rah lawla :");
                    ligne = scannerLe.next();
                    lettre = ligne.charAt(0);
                    lettre = Character.toUpperCase(lettre);
                    // System.out.println("tableau 9bal rah lawla :");
                    if (lettre == 'F' || lettre == 'N' || lettre == 'C' || lettre == 'D' || lettre == 'E' || lettre == 'I' || lettre == 'V') {
                        tableauDeLettres[indiceTableLettre] = lettre;
                        // System.out.println("tableau 9bal rah :" + tableauDeLettres[indiceTableLettre]);
                        indiceTableLettre++;
                    }
                }
            }
        }catch(Exception e){
            System.out.println(" Fichier n'existe pas");
        }
        return tableauDeLettres;
    }
    int indiceTableChiffres=0;
    char caracter;
    int leChiffre;

    public void SauvgarderChiffresDeFichier(File nomDeFichier,int [] tableauDeChiffres){
        try{
            scannerLe = new Scanner(nomDeFichier);
            //nomDeFichier.length()
            System.out.println("la taille :"+nomDeFichier.length());

            if(nomDeFichier.length()==0){
                System.out.println("Le fichier est vide.");
            }else {
                for (int i = 0; i < nombreDeLignes * 3; i++) {
                    //  System.out.println(" nombre de lin" + nombreDeLignes);
                    // System.out.println(" Sauv hna i rah :" +i);
                    ligne = scannerLe.next();
                    caracter = ligne.charAt(0);
                    caracter = Character.toUpperCase(caracter);
                    if (Character.isDigit(caracter)) {
                        leChiffre = Character.getNumericValue(caracter);
                        tableauDeChiffres[indiceTableChiffres] = leChiffre;
                        indiceTableChiffres++;
                    }
                }
            }
    }catch(Exception e){
            System.out.println(" Fichier n'existe pas");
        }
    }
    Boolean laBonneValeur=true;
    int tour=0;
    int nmbrDeCaracteres;
    boolean fichierestvide;

    public Boolean VerifierFichierSiCorrect(File nomDeFichier,int nombreDeLignes){
        try{
            scannerLeFichier = new Scanner(nomDeFichier);
            nmbrDeCaracteres=nombreDeLignes*3;
            fichierestvide= VerifierFichierVide(nomDeFichier);

            while(laBonneValeur && tour!=nmbrDeCaracteres-1 ) {
            for (int i =0; i<nmbrDeCaracteres; i++) {
                    tour=i;
                  //  System.out.println("L iiiii  :" + i + "tour :"+ tour + "nombre de ligne :" + nombreDeLignes*3);
                    ligne = scannerLeFichier.next();
                    lettre = ligne.charAt(0);
                    lettre = Character.toUpperCase(lettre);
                    if (ligne.matches("[a-zA-Z0-9]+")) {
                        if (lettre == 'F' || lettre == 'N' || lettre == 'C' || lettre == 'D' || lettre == 'E' || lettre == 'I' || lettre == 'V') {
                            laBonneValeur = true;
                        } else if (Character.isDigit(lettre)) {
                            laBonneValeur = true;
                        } else {
                            laBonneValeur = false;
                            i = nmbrDeCaracteres;
                            System.out.println("le Fichier n'est pas Correct, il contient des lettres non supportable :" + lettre);

                        }
                    } else {
                        laBonneValeur = false;
                        i = nmbrDeCaracteres;
                        System.out.println("le Fichier n'est pas Correct");
                    }
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("le fichier n'existe pas");
        }//catch(NoSuchElementException e){
           System.out.println("------------------- exception ---------");
       // }
        if(!laBonneValeur){
            System.out.println("le fichier n'est pas correct !!, Verifier le Fichier. \n " +
                    " Exemple Format du Fichier : F 0 0 \n" +
                    " les lettres acceptees : C D E N I F V ");
        }
        return laBonneValeur;
        }

        public int nombreDeChiffresDansFichier(String nomDeFichier){
            //String nomFichier = "C://aymen/tp1aut2023/tp1aut2023/src/vraiFaux.txt"; // Remplacez par le nom de votre fichier
            int compteurChiffres = 0;

            try (BufferedReader br = new BufferedReader(new FileReader(nomDeFichier))) {
                int caractere;
                while ((caractere = br.read()) != -1) {
                    char charactereLu = (char) caractere;
                    if (Character.isDigit(charactereLu)) {
                        // Si le caractère est un chiffre, incrémentez le compteur
                        compteurChiffres++;
                    }
                }
            } catch (IOException e) {
                System.out.println("Fichier N'existe pas : ");

            }
           // System.out.println("Nombre de chiffres dans le fichier : " + compteurChiffres);

        return  compteurChiffres;
        }

        public int [] remplirTableauDeFichierValeur(String FichierValuer){
            int [] tableauDeFichierValuer=new int[0];
            try {
                // String number;
                char chiffre;
                int numero;
                File lesChiffres =new File(FichierValuer);
                Scanner scani = new Scanner(lesChiffres);
                int nombreDeChiffres;
               // Fichier fichierVleur =new Fichier();
                nombreDeChiffres=nombreDeChiffresDansFichier(FichierValuer);
                 tableauDeFichierValuer= new int[nombreDeChiffres];
                for(int i=0;i<nombreDeChiffres;i++) {
                    chiffre = scani.next().charAt(0);
                    if (Character.isDigit(chiffre)) {
                        numero = Character.getNumericValue(chiffre);
                        tableauDeFichierValuer[i]=numero;
                    } else {
                        System.out.println("Le fichier ne contient pas que des chiffres ");
                    }
                }

            }catch (Exception e){
                System.out.println("FILE NOT FOUNDED :");
            }


        return tableauDeFichierValuer;

        }


        }



