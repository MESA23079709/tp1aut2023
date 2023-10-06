import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // File vraiFauxF =new File()
       // TableauCellule cellule = new TableauCellule('z', 0, 0);
        ArrayList<Boolean> nouvelleL =new ArrayList<>();
        ReseauDeCellules reseau =new ReseauDeCellules();
      //  File monFichier = new File("C://aymen/tp1aut2023/tp1aut2023/src/monFichier.txt");
        // File ficherVide = new File("C://aymen/tp1aut2023/tp1aut2023/src/fichierVide.txt");
        // File fausseValeur = new File("C://aymen/tp1aut2023/tp1aut2023/src/fausseValeur.txt");
        //  File vraiFaux = new File("C://aymen/tp1aut2023/tp1aut2023/src/vraiFaux.txt");
       nouvelleL= reseau.executer("C://aymen/tp1aut2023/tp1aut2023/src/monFichier.txt","C://aymen/tp1aut2023/tp1aut2023/src/vraiFaux.txt");
     // nouvelleL= cellule.evolutionC(tableau);
        for(int i=0;i<nouvelleL.size();i++){
            System.out.println(" case :"+ nouvelleL.get(i));
        }





    }






            /*
            switch(S0.getTypeCellule()){
                case 'E':
                    boolean courantLien1;
                    boolean courantLien2;
                    Cellule S1;
                    Cellule S2;
                    S1=(Cellule) tableau[S0.getLienCellule1()];
                    S2=(Cellule) tableau[S0.getLienCellule2()];
                    courantLien1=S1.getCourant();
                    courantLien2=S2.getCourant();
                    S0.setSuivant(cherchetype.Equivalence(courantLien1,courantLien2));
            }

             */



        // cellule.CelluleRemplireFichier(monFichier,nombreDeLigne);







        /*
        Scanner scannerMonF;
        Scanner scannerVraiFaux;
        char s;
        int nombreLigne=0;
        int nombreDeLignes = 0;


        try (BufferedReader lecteur = new BufferedReader(new FileReader(monFichier))) {

            while (lecteur.readLine() != null) {
                nombreDeLignes++;
               // System.out.println(lecteur.readLine());
            }
            System.out.println(nombreDeLignes);


        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println("hi im here");
        try{
            System.out.println("hi im here 44");
             scannerMonF = new Scanner(monFichier);
            scannerVraiFaux=new Scanner(vraiFaux);
            /*
            while(){
            nombreLigne++;
            }
            System.out.println("nombre :"+nombreLigne);

             */
        /*
            int lien1=0;
            int lien2=0;
            int tableInt=0;
            int tableLettre=0;
            String ligne;
            //////////////////////// mettre les lettre dans un tableau et les entiers dans un tableau ////////////////
            char [] mont =new char[nombreDeLignes];
            Integer [] intt =new Integer[nombreDeLignes*2];
            for (int i =0; i<nombreDeLignes*3; i++){
                ligne=scannerMonF.next();
                 s = ligne.charAt(0);
                 s=Character.toUpperCase(s);

                if (Character.isDigit(s)) {
                    System.out.println("Le caractère est un chiffre.");

                    lien1= Character.getNumericValue(s);
                    intt[tableInt]=lien1;
                    System.out.println("i :"+i+" int []:"+intt[tableInt]);
                    tableInt++;

                } else if(s=='F'||s=='N'||s=='C'||s=='D'||s=='E'||s=='I'||s=='V'){
                    System.out.println("Le caractère n'est pas un chiffre.");
                    System.out.println("char DAKHEL IF :"+s + " : i :"+i);
                    mont[tableLettre]=s;
                    tableLettre++;
                }
                //Cellule S0 = new Cellule(,intt[i],lien2);

              }
            for(int i=0;i<intt.length;i++){
                System.out.println("i :"+i+" intt []:"+intt[i]);
            }

            for(int i=0;i<mont.length;i++){
                System.out.println("i :"+i+" char []:"+mont[i]);
            }
            ///// methode pour remplire le tableau D'objet ///////////////////////////////
            for(int i=0;i<mont.length;i++){
                Cellule S0 = new Cellule(mont[i],intt[i*2],intt[(i*2)+1]);
                tableau[i]=S0;
            }
            Cellule S1 ;
            for(int i=0;i<mont.length;i++){
                S1=(Cellule) tableau[i];

                System.out.println("S1 type :"+S1.getTypeCellule());
                System.out.println("S1 lien1 :"+S1.getLienCellule1());
                System.out.println("S1 lien2 :"+S1.getLienCellule2());
                ;
                ;
            }




        }catch(FileNotFoundException e){
            System.out.println(" makanch fichier");
        }

         */





        /*
        Cellule S0 = new Cellule('Z',0,1);
        Cellule S1 = new Cellule('F',0,1);
        Cellule S2 = new Cellule('E',0,1);
        Cellule S3 = new Cellule('C',0,2);
        Cellule S4 = new Cellule('N',3,0);
        tableau[0]=S0;
        S0.setCourant(true);
        Cellule S;
        S=(Cellule) tableau[0];
        for(int i=1 ; i<5 ;i++){
            Cellule A =new Cellule('Z',0,0);
            tableau[1]=A;
        }

        System.out.println("tableau :"+S.getCourant());




        System.out.println("S0 courant :"+ S0.courant +"\n"+ "S0 suivant :"+ S0.suivant+"\n");
        System.out.println("S3 courant :"+ S3.courant +"\n"+ "S3 suivant :"+ S3.suivant+"\n");
        System.out.println("S4 courant :"+ S4.courant +"\n"+ "S4 suivant :"+ S4.suivant);
        switch (S4.typeCellule){
            case 'F':
           S2.setSuivant(cherchetype.Contradiction(S3.courant,S0.courant));
           break;
            case 'V':
                System.out.println("V");
                break;
            case 'I':
                System.out.println("I");
                break;
            case 'N':
                System.out.println("n");
                S4.setSuivant(cherchetype.Negation(S3.courant,S0.courant));

                break;
            case 'E':
                System.out.println("E");
                S2.setSuivant(cherchetype.Equivalence(S0.courant,S1.courant));
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'C':
                System.out.println("C");
                S3.setSuivant(cherchetype.Conjocntion(S0.courant,S2.courant));

                break;

            default:



        }

        System.out.println("S0 courant :"+ S0.courant +"\n"+ "S0 suivant :"+ S0.suivant+"\n");
        System.out.println("S3 courant :"+ S3.courant +"\n"+ "S3 suivant :"+ S3.suivant+"\n");
        System.out.println("S4 courant :"+ S4.courant +"\n"+ "S4 suivant :"+ S4.suivant);

         */


}