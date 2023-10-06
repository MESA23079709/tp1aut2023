
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    private enum Test {
        TestExemple( "src/rExemple.txt", "src/eExemple.txt", Arrays.asList( true, true, false, true, false, true, true, true ) ),
        TestVideVrai( "src/rVide.txt", "src/eUnVrai.txt" , Arrays.asList( true )),
        TestVideFaux( "src/rVide.txt", "src/eUnFaux.txt" , Arrays.asList( false )),
        TestVidePlusieurs( "src/rVide.txt", "src/ePlusieurs.txt" , Arrays.asList( false, true, false, false, true, true, false )),

        TestConjonctionVrai( "src/rConjonctionVrai.txt", "src/eVF.txt", Arrays.asList( false, true, false )),
        TestConjonctionFaux( "src/rConjonctionFaux.txt", "src/eVF.txt", Arrays.asList( false, false, false )),

        TestDisjonctionVrai( "src/rDisjonctionVrai.txt", "src/eVF.txt", Arrays.asList( false, true, true )),
        TestDisjonctionFaux( "src/rDisjonctionFaux.txt", "src/eVF.txt", Arrays.asList( false, true, false )),

        TestEquivalenceVrai( "src/rEquivalenceVrai.txt", "src/eVF.txt", Arrays.asList( true, true, false )),
        TestEquivalenceFaux( "src/rEquivalenceFaux.txt", "src/eVF.txt", Arrays.asList( true, false, true )),

        TestNegationVrai( "src/rNegationVrai.txt", "src/eVF.txt", Arrays.asList( true, false, true )),
        TestNegationFaux( "src/rNegationFaux.txt", "src/eVF.txt", Arrays.asList( true, false, true )),

        TestIdentiteVrai( "src/rIdentiteVrai.txt", "src/eVF.txt", Arrays.asList( false, true, false )),
        TestIdentiteFaux( "src/rIdentiteFaux.txt", "src/eVF.txt", Arrays.asList( false, true, false )),

        TestTautologieVrai( "src/rTautologieVrai.txt", "src/eVF.txt", Arrays.asList( true, true, true )),
        TestTautologieFaux( "src/rTautologieFaux.txt", "src/eVF.txt", Arrays.asList( true, true, true )),

        TestContradictionVrai( "src/rContradictionVrai.txt", "src/eVF.txt", Arrays.asList( false, false, false )),
        TestContradictionFaux( "src/rContradictionFaux.txt", "src/eVF.txt", Arrays.asList( false, false, false )),

        ;
        private String nomFichierDescription;
        private String nomFichierEntrees;
        private List<Boolean> resultatAttendu;

        Test(String nomFichierDescription, String nomFichierEntrees, List<Boolean> resultatAttendu) {
            this.nomFichierDescription = nomFichierDescription;
            this.nomFichierEntrees = nomFichierEntrees;
            this.resultatAttendu = resultatAttendu;
        }

        public boolean tester() {
            ArrayList< Boolean > resultat = ReseauDeCellules.executer( nomFichierDescription, nomFichierEntrees );
            boolean estCorrect = resultat.equals( resultatAttendu );
            if( ! estCorrect ) {
                System.err.println( "Le resultat du " + name() + " est incorrect.\n" +
                        "    Obtenue : " + resultat + "\n" +
                        "    Attendu : " + resultatAttendu + "\n" );
            }
            return estCorrect;
        }

        public static int testerTous() {
            int nbCorrect = 0;

            for( Test test : Test.class.getEnumConstants() ) {
                if( test.tester() ) {
                    ++ nbCorrect;
                }
            }

            return nbCorrect;
        }
    }

    public static void main( String [] argv ) {
        int nbReussi = Test.testerTous();
        int nbTests = Test.class.getEnumConstants().length;

        System.out.println( "\nTotal : " + nbReussi + " / " + nbTests );
    }
}
