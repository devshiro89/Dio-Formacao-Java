package main.java.edu.dioformacaojava.modulo1.rawstudies;

public class CodeScopeReview {
    
    public final static int LIMIAR_HDD = 100;
    

    public static void main (String[] args) {
        String nomeCPU = "Noire";
        int share;
        boolean emCombate;
        
        share = 100;
        emCombate = true;
        if ( share >= LIMIAR_HDD && emCombate)
        {
            System.out.printf("%s transformou em HDD!", nomeCPU);
        }
        else if(share >= LIMIAR_HDD && !emCombate) {
            System.out.printf("%s tem share suficiente, mas não está em combate.", nomeCPU);
        }
        else {
             System.out.printf("%s não tem share suficiente.",nomeCPU);
        }

    }
}
