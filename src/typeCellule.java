public class typeCellule {
    boolean resultat=false;

    public boolean Equivalence(boolean CourantE1,boolean CourantE2 ){
        if(CourantE1 == CourantE2 ){
            resultat= true;
        }else{
            resultat=false;
        }
        return resultat;
    }
    public boolean Negation(boolean CourantE1,boolean CourantE2 ){
        if(CourantE1){
            resultat= false;
        }else{
            resultat=true;
        }
        return resultat;
    }
    public boolean Disjonction(boolean CourantE1,boolean CourantE2 ){
        if(!CourantE1 && !CourantE2){
            resultat= false;
        }else{
            resultat=true;
        }
        return resultat;
    }
    public boolean Identite(boolean CourantE1,boolean CourantE2 ){
      //  return !Negation(CourantE1,CourantE2);
        if(CourantE1){
            resultat= true;
        }else{
            resultat=false;
        }
        return resultat;
    }
    public boolean Tautologie(boolean CourantE1,boolean CourantE2 ){
        return !resultat;
    }
    public boolean Conjocntion(boolean CourantE1,boolean CourantE2 ){
        if(CourantE1 && CourantE2){
            resultat= true;
        }else{
            resultat=false;
        }
        return resultat;
    }
    public boolean Contradiction(boolean CourantE1,boolean CourantE2 ){
        return resultat;
    }

}
