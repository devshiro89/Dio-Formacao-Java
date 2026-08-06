package main.java.edu.dioformacaojava.modulo1.rawstudies;

public class Operators {

    public static void main(String[] args) {
            // Operador de atribuição (=) é usado para atribuir um valor a uma variável.
        int a = 10; // Atribuindo o valor 10 à variável a
        int b = 5;  // Atribuindo o valor 5 à variável b

       /*
            Operadores aritméticos são usados para realizar operações matemáticas básicas, como adição, subtração, 
            multiplicação e divisão.
            - Adição (+): soma dois valores.
            - Subtração (-): subtrai o segundo valor do primeiro.
            - Multiplicação (*): multiplica dois valores.
            - Divisão (/): divide o primeiro valor pelo segundo.
            - Módulo (%): retorna o resto da divisão do primeiro valor pelo segundo.
        
            int sum = a + b;          
                // Adição: 10 + 5 = 15

            int difference = a - b;   
                // Subtração: 10 - 5 = 5

            int product = a * b;      
                // Multiplicação: 10 * 5 = 50

            int quotient = a / b;     
                // Divisão: 10 / 5 = 2

            int remainder = a % b;     
                // Módulo: 10 % 5 = 0

        */
    
        /*
            O operador de adição (+) também pode ser usado para concatenar strings. Quando usado com strings, ele une 
            os valores em uma única string.

            Exemplo:
            String firstName = "John";
            String lastName = "Doe";
            String fullName = firstName + " " + lastName; // Concatenação: "John Doe"
            System.out.println(fullName); // Saída: John Doe
        */

        /*
            Operadores Unários são operadores que operam em um único operando. Eles podem ser usados para incrementar, decrementar,
            inverter o sinal de um número ou inverter o valor booleano de uma variável.
            Exemplos:
            - Incremento (++) : aumenta o valor da variável em 1.
            - Decremento (--) : diminui o valor da variável em 1.
            - Negação (-) : inverte o sinal de um número.
            - Negação lógica (!) : inverte o valor booleano de uma variável.
        

            int increase = a++; 
                // Incremento: 10 + 1 = 11

            int decrease = a--; 
                // Decremento: 11 - 1 = 10

            int negative = -a; 
                // Negação: -10

            boolean isTrue = true;
            boolean isFalse = !isTrue; 
                // Negação lógica: !true = false
        */

        /*
            Operadores ternários são operadores que operam em três operandos. 
            Eles são usados para avaliar uma expressão e retornar um valor com base na avaliação dessa expressão. 
            Ele é representado pelo símbolo "?" e ":" e é uma forma concisa de escrever uma instrução if-else.

            A sintaxe do operador ternário é a seguinte: expressão ? valor_se_verdadeiro : valor_se_falso;
        */

        String name = "Noire";
        int currentLevel = 30,
            requiredLevel = 50;
        
        System.out.printf("Player %s: %s %n", name, levelPenalty(currentLevel, requiredLevel));
            // Saída: Player Noire: Has no exp penalty.

        currentLevel = 60;

        System.out.printf("Player %s: %s %n %n", name, levelPenalty(currentLevel, requiredLevel));
            // Saída: Player Noire: Level is too high, experience penalty applied.

        /*
            Operadores relacionais são usados para comparar dois valores e retornar um valor booleano (true ou false) 
            com base na comparação.

            - Igual a (==): verifica se dois valores são iguais.
            - Diferente de (!=): verifica se dois valores são diferentes.
            - Maior que (>): verifica se o primeiro valor é maior que o segundo.
            - Menor que (<): verifica se o primeiro valor é menor que o segundo.
            - Maior ou igual a (>=): verifica se o primeiro valor é maior ou igual ao segundo.
            - Menor ou igual a (<=): verifica se o primeiro valor é menor ou igual ao segundo.
        */

        System.out.printf("Is %d equal to %d? %b %n %n", a, b, (a == b)); 
            // Saída: Is 10 equal to 5? false


        System.out.printf("Is %d different from %d? %b %n %n", a, b, (a != b));
            // Saída: Is 10 different from 5? true

        System.out.printf("Is %d greater than %d? %b %n %n", a, b, (a > b)); 
            // Saída: Is 10 greater than 5? true

        System.out.printf("Is %d less than %d? %b %n %n", a, b, (a < b)); 
            // Saída: Is 10 less than 5? false

        System.out.printf("Is %d greater than or equal to %d? %b %n %n", a, b, (a >= b)); 
            // Saída: Is 10 greater than or equal to 5? true

        System.out.printf("Is %d less than or equal to %d? %b %n %n", a, b, (a <= b)); 
            // Saída: Is 10 less than or equal to 5? false

        /*
            Para fazer comparação entre Strings, usamos o método equals() da classe String ou de um objeto String, que compara o 
            conteúdo das strings e retorna true se forem iguais e false caso contrário.
        */
        String trueName = "Noire",
            falseName = "noire";
        
        System.out.println(trueName.equals(falseName)+ "\n"); 
            // Saída: false

        /*
            Operadores lógicos são usados para combinar expressões booleanas e retornar um valor booleano (true ou false) 
            com base na avaliação dessas expressões.

            - E lógico (&&): retorna true se ambas as expressões forem verdadeiras.
            - OU lógico (||): retorna true se pelo menos uma das expressões for verdadeira.
            - Negação lógica (!): inverte o valor booleano de uma expressão.
        */

        // AND (&&)
        if (currentLevel > requiredLevel && falseName != trueName) {
            System.out.println("Character " + name + " is above the required level and has a different name.\n");
        } else {
            System.out.println("Character " + name + " is not above the required level or has the same name.\n");
        }
        // Saída: Character Noire is above the required level and has a different name.

        // OR (||)
        if (falseName == trueName || currentLevel <= 0) {
            System.out.println("System error!");
        }
        else {
            System.out.printf("Character %s is created! %n%n", name);
        }
        // Saída: Character Noire is created!

        // NOT (!)
        if (!(currentLevel < requiredLevel)) {
            System.out.printf("Character %s is above the required level! %n%n", name);
        } else {
            System.out.printf("Character %s is below the required level! %n%n", name);
        }
        //Saída: Character Noire is above the required level!
    }

    public static String levelPenalty(int currentLevel, int requiredLevel) {
        return currentLevel < requiredLevel ? "Has no exp penalty." : "Level is too high, experience penalty applied.";
    }

}
