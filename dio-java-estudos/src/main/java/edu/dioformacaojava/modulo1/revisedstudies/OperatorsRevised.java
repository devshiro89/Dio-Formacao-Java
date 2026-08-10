package edu.dioformacaojava.modulo1.revisedstudies;

/**
     Guia didático sobre Operadores em Java, usando como tema a criação
     e evolução de um personagem de RPG.
 *
     Cada bloco abaixo isola uma categoria de operador, executa o código
     de verdade (em vez de deixá-lo comentado) e imprime o resultado,
     para que você veja a saída junto da explicação.
 */
public class OperatorsRevised {

    public static void main(String[] args) {

        // ===================================================================
        // 1) OPERADOR DE ATRIBUIÇÃO ( = )
        // ===================================================================
        // Atribui o valor do lado direito à variável do lado esquerdo.
        // É sempre o primeiro operador que você aprende, pois toda variável
        // precisa de um valor antes de ser usada.
        int strength = 10;
        int agility = 5;

        System.out.println("=== 1) Atribuição ===");
        System.out.printf("strength = %d | agility = %d%n%n", strength, agility);

        // ===================================================================
        // 2) OPERADORES ARITMÉTICOS ( + -     / % )
        // ===================================================================
        // Usados para fazer contas com valores numéricos.
        // Atenção: divisão entre dois "int" descarta a parte decimal
        // (divisão inteira). Para resultado com casas decimais, pelo
        // menos um dos operandos precisa ser double/float.
        System.out.println("=== 2) Aritméticos ===");

        int sum = strength + agility;          // Adição: 10 + 5 = 15
        int difference = strength - agility;    // Subtração: 10 - 5 = 5
        int product = strength  *  agility;       // Multiplicação: 10 * 5 = 50
        int quotient = strength / agility;      // Divisão inteira: 10 / 5 = 2
        int remainder = strength % agility;     // Módulo (resto): 10 % 5 = 0

        System.out.printf("Soma (strength + agility): %d%n", sum);
        System.out.printf("Subtração (strength - agility): %d%n", difference);
        System.out.printf("Multiplicação (strength * agility): %d%n", product);
        System.out.printf("Divisão inteira (strength / agility): %d%n", quotient);
        System.out.printf("Módulo (strength %% agility): %d%n", remainder);

        // Exemplo de divisão "quebrada" para reforçar o cuidado com tipos:
        double preciseQuotient = strength / 3.0; // usar 3.0 força resultado decimal
        System.out.printf("Divisão decimal (strength / 3.0): %.2f%n%n", preciseQuotient);

        // ===================================================================
        // 3) OPERADORES DE ATRIBUIÇÃO COMPOSTA ( += -= *= /= %= )
        // ===================================================================
        // São atalhos que combinam uma conta com a atribuição.
        // "xp += 20" é o mesmo que "xp = xp + 20", só que mais curto.
        System.out.println("=== 3) Atribuição composta ===");

        int xp = 100;
        System.out.printf("xp inicial = %d%n", xp);

        xp += 20; // xp = xp + 20 -> 120
        System.out.printf("xp += 20  -> %d%n", xp);

        xp -= 30; // xp = xp - 30 -> 90
        System.out.printf("xp -= 30  -> %d%n", xp);

        xp *= 2;  // xp = xp     2  -> 180
        System.out.printf("xp *= 2   -> %d%n", xp);

        xp /= 4;  // xp = xp / 4  -> 45
        System.out.printf("xp /= 4   -> %d%n%n", xp);

        // ===================================================================
        // 4) OPERADOR "+" COM STRINGS (CONCATENAÇÃO)
        // ===================================================================
        // Quando pelo menos um dos lados do "+" é uma String, o Java não soma:
        // ele concatena (junta) os textos. Isso vale até para números, que
        // acabam virando texto na concatenação.
        System.out.println("=== 4) Concatenação de Strings ===");

        String firstName = "Noire";
        String className = "Swordswoman";
        String fullTitle = firstName + " the " + className; // concatenação
        System.out.println(fullTitle);
        System.out.println("Nível atual concatenado: " + 30); // int virando texto
        System.out.println();

        // ===================================================================
        // 5) OPERADORES UNÁRIOS ( ++ -- - ! )
        // ===================================================================
        // Operam sobre um único operando.
        // Cuidado com pré-incremento (++x) vs pós-incremento (x++):
        // - x++ usa o valor ATUAL de x e só depois incrementa.
        // - ++x incrementa PRIMEIRO e só depois usa o novo valor.
        System.out.println("=== 5) Unários ===");

        int level = 30;
        int postIncrement = level++; // usa 30, depois level vira 31
        System.out.printf("postIncrement = level++ -> postIncrement= %d, level = %d%n", postIncrement, level);

        int preIncrement = ++level;  // level vira 32, depois usa 32
        System.out.printf("preIncrement = ++level  -> preIncrement= %d, level = %d%n", preIncrement, level);

        int negative = -level;       // inverte o sinal: -32
        System.out.printf("negative = -level -> %d%n", negative);

        boolean isAlive = true;
        boolean isDead = !isAlive;   // inverte o booleano: false
        System.out.printf("isDead = !isAlive -> %b%n%n", !isDead);

        // ===================================================================
        // 6) OPERADOR TERNÁRIO ( ?: )
        // ===================================================================
        // Forma resumida de um if-else que RETORNA um valor.
        // Sintaxe: condição ? valorSeVerdadeiro : valorSeFalso;
        // Ideal para decisões simples de uma linha; para lógica complexa,
        // prefira if-else normal (mantém a legibilidade).
        System.out.println("=== 6) Ternário ===");

        String playerName = "Noire";
        int currentLevel = 30,
            requiredLevel = 50,
            maximumLevelRequired = 60;

        System.out.printf("Player: %s %nLevel: %d %nMaximum Level Required: %d %n%s%n%n", playerName, currentLevel, maximumLevelRequired, levelPenalty(currentLevel, maximumLevelRequired));
        // Saída esperada: Has no exp penalty.

        currentLevel = 61;
        System.out.printf("Player: %s %nLevel: %d %nMaximum Level Required: %d %n%s%n%n", playerName, currentLevel, maximumLevelRequired, levelPenalty(currentLevel, maximumLevelRequired));
        // Saída esperada: Level is too high, experience penalty applied.

        // ===================================================================
        // 7) OPERADORES RELACIONAIS ( == != > < >= <= )
        // ===================================================================
        // Comparam dois valores e retornam sempre um boolean.
        // Para tipos primitivos (int, double, etc.) o "==" compara o VALOR.
        System.out.println("=== 7) Relacionais ===");

        System.out.printf("strength == agility ? %b%n", strength == agility); // false
        System.out.printf("strength != agility ? %b%n", strength != agility); // true
        System.out.printf("strength >  agility ? %b%n", strength > agility);  // true
        System.out.printf("strength <  agility ? %b%n", strength < agility);  // false
        System.out.printf("strength >= agility ? %b%n", strength >= agility); // true
        System.out.printf("strength <= agility ? %b%n%n", strength <= agility); // false

        // ===================================================================
        // 8) COMPARANDO STRINGS: "==" vs equals()
        // ===================================================================
        // "==" em objetos (Strings inclusas) compara REFERÊNCIA de memória,
        // não o conteúdo. Para comparar o conteúdo de duas Strings,
        // sempre use o método equals() (ou equalsIgnoreCase() para
        // ignorar maiúsculas/minúsculas).
        System.out.println("=== 8) Comparando Strings ===");

        String trueName = "Noire";
        String falseName = "noire";

        System.out.printf("trueName = %s | falseName = %s%n%n", trueName, falseName);
        System.out.printf("trueName == falseName                -> %b%n", trueName == falseName); // false, referências diferentes
        System.out.printf("trueName.equals(falseName)           -> %b%n", trueName.equals(falseName)); // false, "N" != "n"
        System.out.printf("trueName.equalsIgnoreCase(falseName) -> %b%n%n", trueName.equalsIgnoreCase(falseName)); // true

        // ===================================================================
        // 9) OPERADORES LÓGICOS ( && || ! )
        // ===================================================================
        // Combinam expressões booleanas.
        // - && (AND): true somente se AMBOS os lados forem true.
        // - || (OR):  true se PELO MENOS UM dos lados for true.
        // - !  (NOT): inverte um valor booleano.
        //
        // Curto-circuito: em "a && b", se "a" já for false, o Java nem
        // avalia "b" (o resultado já é false). O mesmo vale para "a || b"
        // quando "a" já é true. Isso é útil para evitar, por exemplo,
        // checar algo em um objeto nulo.
        System.out.println("=== 9) Lógicos ===");

        boolean aboveLevel = currentLevel > requiredLevel; // true (60 > 50)
        boolean differentName = !trueName.equals(falseName); // true

        // AND (&&)
        if (aboveLevel && differentName) {
            System.out.printf("Character %s is above the required level and has a different name.%n", playerName);
        } else {
            System.out.printf("Character %s is not above the required level or has the same name.%n", playerName);
        }

        // OR (||)
        boolean sameName = trueName.equals(falseName);
        boolean levelIsInvalid = currentLevel <= 0;
        if (sameName || levelIsInvalid) {
            System.out.println("System error!");
        } else {
            System.out.printf("Character %s is created!%n", playerName);
        }

        // NOT (!)
        if (!(currentLevel < requiredLevel)) {
            System.out.printf("Character %s is above the required level!%n%n", playerName);
        } else {
            System.out.printf("Character %s is below the required level!%n%n", playerName);
        }

        // ===================================================================
        // 10) PRECEDÊNCIA DE OPERADORES
        // ===================================================================
        // Assim como na matemática, operadores têm ordem de prioridade:
        // 1º parênteses () -> 2º unários (++ -- ! -) -> 3º */% -> 4º +-
        // -> 5º relacionais (> < >= <=) -> 6º igualdade (== !=)
        // -> 7º && -> 8º || -> 9º ternário -> 10º atribuição (=)
        //
        // Na dúvida, use parênteses: eles deixam a intenção explícita e
        // evitam bugs sutis de prioridade.
        System.out.println("=== 10) Precedência ===");

        int result = 2 + 3  *   4;       // multiplicação primeiro -> 2 + 12 = 14
        int resultWithParens = (2 + 3)  *   4; // parênteses forçam a soma primeiro -> 5     4 = 20

        System.out.printf("2 + 3     4   -> %d%n", result);
        System.out.printf("(2 + 3)     4 -> %d%n", resultWithParens);
    }

    /**
         Usa o operador ternário para decidir, em uma única linha, se o
         personagem sofre penalidade de experiência por estar muito acima
         do nível exigido pela missão.
     */
    public static String levelPenalty(int currentLevel, int requiredLevel) {
        return currentLevel <= requiredLevel
                ? "Has no exp penalty."
                : "Level is too high, experience penalty applied.";
    }

}
