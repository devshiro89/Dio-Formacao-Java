package edu.dioformacaojava.modulo1.rawstudies;

public class ArgumentsTerminalsReview {
    final static int LIMIAR_HDD = 100;
    
    public static void main(String[] args) {
            if (args.length != 3) {
            System.out.printf("Uso: java Programa <nomeCPU> <share> <emCombate>");
            System.exit(1);
        } else {
            String argNomeCPU = args[0];
            int share = Integer.parseInt(args[1]);
            boolean emCombate = Boolean.parseBoolean(args[2]);
            if ( share >= LIMIAR_HDD && emCombate)
            {
                System.out.printf("%s transformou em HDD!", argNomeCPU);
            }
            else if(share >= LIMIAR_HDD && !emCombate) {
                System.out.printf("%s tem share suficiente, mas não está em combate.", argNomeCPU);
            }
            else {
                System.out.printf("%s não tem share suficiente.", argNomeCPU);
            }
        }
    }
}
