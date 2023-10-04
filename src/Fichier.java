import java.io.*;
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
    char lettre;
    int indiceTableLettre=0;
    String ligne;
    Scanner scannerLeFicher;
    public void SauvgarderLettresDeFichier(File nomDeFichier,char [] tableauDeLettres){

        for (int i =0; i<nombreDeLignes*3; i++){
            ligne=scannerLeFicher.next();
            lettre = ligne.charAt(0);
            lettre=Character.toUpperCase(lettre);
            if(lettre=='F'||lettre=='N'||lettre=='C'||lettre=='D'||lettre=='E'||lettre=='I'||lettre=='V'){
                tableauDeLettres[indiceTableLettre]=lettre;
                indiceTableLettre++;
            }
            }
    }
    int indiceTableChiffres=0;
    char caracter;
    int leChiffre;

    public void SauvgarderChiffresDeFichier(File nomDeFichier,int [] tableauDeChiffres){

        for (int i =0; i<nombreDeLignes*3; i++){
            ligne=scannerLeFicher.next();
            caracter = ligne.charAt(0);
            caracter=Character.toUpperCase(caracter);
            if(Character.isDigit(caracter)){
                leChiffre= Character.getNumericValue(caracter);
                tableauDeChiffres[indiceTableChiffres]=leChiffre;
                indiceTableChiffres++;
            }
        }
    }
    Boolean laBonneValeur=false;
    public Boolean VerifierFichierSiCorrect(File nomDeFichier,int nombreDeLignes){
        try{
            scannerLeFichier = new Scanner(nomDeFichier);
            for (int i =0; i<nombreDeLignes*3; i++) {
                ligne = scannerLeFichier.next();
                lettre = ligne.charAt(0);
                lettre = Character.toUpperCase(lettre);
                if (ligne.matches("[a-zA-Z0-9]+")) {
                    if (lettre == 'F' || lettre == 'N' || lettre == 'C' || lettre == 'D' || lettre == 'E' || lettre == 'I' || lettre == 'V') {
                        laBonneValeur = true;
                        System.out.println("L "+lettre);
                    } else if (Character.isDigit(lettre)) {
                        laBonneValeur = true;
                        System.out.println("C "+lettre);
                    } else {
                        laBonneValeur = false;
                        System.out.println("mich kima nhab "+lettre);

                    }
                } else {
                    laBonneValeur = false;
                    System.out.println("la valeur khatya khlas");
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("le fichier n'existe pas");
        }
        if(!laBonneValeur){
            System.out.println("le fichier n'est pas correct !!, Verifier le Fichier. \n " +
                    " Exemple Format du Fichier : F 0 0 \n" +
                    " les lettres acceptees : C D E N I F V ");
        }
        return laBonneValeur;
        }


        }



