public class Main {
    public static void main(String[] args) {
        typeCellule cherchetype=new typeCellule();
        Object [] tableau=new Object[5];


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


    }


}