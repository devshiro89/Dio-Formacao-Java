package edu.dioformacaojava.modulo2.rawstudies;

public class EstruturasCondicionais {
    /*
        A estrutura condicional possibilita que o programa tome decisões com base em condições. Em Java, a estrutura condicional é 
        implementada através das instruções if, else if e else.
        Temos a estrutura simples que é composta apenas pelo if, a estrutura composta que é composta pelo if e else, 
        e a estrutura encadeada que é composta pelo if, else if e else.

    */
    public static void main(String[] args) {
        int share = 100;
        String CPUname = "Vert";

        final int LIMIAR_HDD = 100;

        // Estrutura condicional simples
        // If é usado para verificar se uma condição é verdadeira. Se for, o bloco de código dentro do if será executado.
        System.out.printf("Estrutura condicional simples:\n");
        System.out.printf("Share: %d%%%n", share);
        if ( share >= LIMIAR_HDD) {
            System.out.printf("Share suficiente para transformar em HDD!, %s Transformou em HDD!!%n", CPUname);
            share = 0;
            System.out.printf("Share Atualizado: %d%%%n%n", share);
        }


        // Estrutura condicional composta
        // If é usado para verificar se uma condição é verdadeira. Se for, o bloco de código dentro do if será executado.  
        // Caso contrário, o bloco de código dentro do else será executado.
        System.out.printf("Estrutura condicional composta:%n");
        System.out.printf("Share: %d%%%n", share);
        if ( share >= LIMIAR_HDD) {
            System.out.printf("Share suficiente para transformar em HDD!, %s Transformou em HDD!!%n%n", CPUname);
            share = 0;
            System.out.printf("Share Atualizado: %d%%%n%n", share);
        } else {
            System.out.printf("Share insuficiente para transformar em HDD!%n%n");
        }

        // Estrutura condicional encadeada
        // If é usado para verificar se uma condição é verdadeira. Se for, o bloco de código dentro do if será executado.  
        // Caso contrário, o bloco de código dentro do else if será executado. Se a condição do else if também for falsa,
        // o bloco de código dentro do else será executado.
        System.out.printf("Estrutura condicional encadeada:%n");
        System.out.printf("Share: %d%%%n", share);
        int itemHDDCharge = 1;
        if ( share >= LIMIAR_HDD) {
            System.out.printf("Share suficiente para transformar em HDD!, %s Transformou em HDD!!%n%n", CPUname);
            share = 0;
            System.out.printf("Share Atualizado: %d%%%n%n", share);
        } else if ( share < LIMIAR_HDD  && itemHDDCharge > 0) {
            System.out.printf("O item HDD Charge foi usado por %s.%n", CPUname);
            itemHDDCharge--;
            System.out.printf("Item HDD Charge Atualizado: %d%n", itemHDDCharge);
            share = 100;
            System.out.printf("Share Atualizado: %d%%%n", share);
            System.out.printf("Share suficiente para transformar em HDD!, %s Transformou em HDD!!%n", CPUname);
            share = 0;
            System.out.printf("Share Atualizado: %d%%%n%n", share);
            
        } else {
            System.out.printf("Share insuficiente para transformar em HDD!%n%n");
        }


        // Estrutura condicional ternária
        // A estrutura condicional ternária é uma forma concisa de escrever uma instrução if else. 
        // Ela é composta por três partes: a condição, o valor retornado se a condição for verdadeira e o valor 
        // retornado se a condição for falsa.
        share = 99;
        itemHDDCharge = 1;
        System.out.printf("Estrutura condicional ternária:%n");
        String transformHDD = (share >= LIMIAR_HDD) ? String.format("Share suficiente para transformar em HDD!, %s Transformou em HDD!!%n%n", CPUname)
        : share < LIMIAR_HDD  && itemHDDCharge > 0 ? String.format("%s Usou uma Poção HDD Charge. Share suficiente para transformar em HDD! %s Transformou em HDD!!%n%n", CPUname, CPUname)
        : String.format("Share insuficiente para transformar em HDD!%n%n");


        System.out.println(transformHDD);

        // Estrutura condicional switch case
        // A estrutura condicional switch case é usada para selecionar uma entre várias opções com base no valor de uma variável.
        // Ela é composta por uma expressão que é avaliada e um conjunto de casos que são comparados com o valor da expressão. 
        // Se um caso corresponder ao valor da expressão, o bloco de código dentro desse caso será executado.
        // O uso do break é necessário para evitar que o código continue a ser executado nos casos subsequentes.
        System.out.printf("Estrutura condicional switch case:%n");

        int starsNumber = 3;
        switch (starsNumber) {
            case 1:
                System.out.printf("O monstro é fraco, possui %d estrelas. Será moleza.%n", starsNumber);
                break;
            case 2:
                System.out.printf("O monstro é mediano, possui %d estrelas.%n", starsNumber);
                break;
            case 3:
                System.out.printf("O monstro é forte, possui %d estrelas.%n", starsNumber);
                break;
            case 4:
                System.out.printf("O monstro é supremo, possui %d estrelas. Cuidado!%n", starsNumber);
                break;
            default:
                System.out.printf("Monstro muito fraco, não possui estrelas.%n%n");
        }
        System.out.printf("%n");

        // Estrutura condicional switch case sem break
        // A estrutura condicional switch case sem break é usada para selecionar uma entre várias opções com base no valor de uma variável.
        // Ela é composta por uma expressão que é avaliada e um conjunto de casos que são comparados com o valor da expressão.
        // Se um caso corresponder ao valor da expressão, o bloco de código dentro desse caso será executado, e o código continuará a ser executado nos casos subsequentes até encontrar um break ou o final do switch.
        System.out.printf("Estrutura condicional switch case sem break:%n");
        String itemsCombo = "Medium";
        switch (itemsCombo) {
            case "Supreme":
                System.out.printf("Você ganhou uma Arma Lendária%n", starsNumber);
            case "Strong":
                System.out.printf("Você ganhou 2 HDD Charge Potions.%n", starsNumber);
            case "Medium":
                System.out.printf("Você ganhou 3 Strength Potions.%n", starsNumber);
            case "Weak":
                System.out.printf("Você ganhou 3 Mana Potions.%n", starsNumber);
            default:
                System.out.printf("Você ganhou 3 Health Potions.%n");
        }
         System.out.printf("%n");
    }
}
