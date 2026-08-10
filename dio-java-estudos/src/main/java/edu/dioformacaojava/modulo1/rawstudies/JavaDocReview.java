package main.java.edu.dioformacaojava.modulo1.rawstudies;

public class JavaDocReview {

    public final static int LIMIAR_HDD = 100;

    String nomeCPU = "Noire";
    int share = 100;
    boolean emCombate = true;


    /** 
     * <h2> verificarTransformacao </h2>
     * <p>Este método é utilizado para verificar se a CPU pode transformar ou não. </p>
     * <p> A constante LIMIAR_HDD é utilizado como um comparativo com parametro share, pois, ele é referencia se o share 
     * chegou ao limite certo. </p>
     * <p> As condições verdades precisa ser atendida da seguinte forma: </p>
     * <p><b> O share precisa estar no valor maior ou igual a LIMIAR_HDD e emCombate precisa ser true. </b></p>
     * @param share é utilizado como o medidor atual da CPU.
     * @param emCombate é utilizado para verificar se a CPU está em combate.
     * @param nomeCPU é o nome da personagem que estamos usando.
     * @return É a mensagem no log se a CPU pode ou não transformar
     * 
    */
    public static String verificarTransformacao(String nomeCPU, int share, boolean emCombate) {
    if (share >= LIMIAR_HDD && emCombate) {
        return String.format("%s transformou em HDD!", nomeCPU);
    } else if (share >= LIMIAR_HDD && !emCombate) {
        return String.format("%s tem share suficiente, mas não está em combate.", nomeCPU);
    } else {
        return String.format("%s não tem share suficiente.", nomeCPU);
    }
}
}
