package edu.dioformacaojava.modulo1.revisedstudies;

/**
 * Guia didático sobre Tipos de Variáveis em Java, usando como tema
 * a ficha de atributos de uma personagem de RPG.
 *
 * Cada bloco isola um grupo de tipos e executa código real, mostrando
 * faixas de valores, conversões e as pegadinhas mais comuns.
 */
public class VariablesRevised {

    public static void main(String[] args) {

        // ===================================================================
        // 1) TIPOS PRIMITIVOS INTEIROS (byte, short, int, long)
        // ===================================================================
        // Diferem no tamanho em memória e, por consequência, na faixa de
        // valores que conseguem representar.
        System.out.println("=== 1) Inteiros ===");

        byte partySize = 4;   // 1 byte  -> -128 a 127
        short goldCoins = 1200; // 2 bytes -> -32.768 a 32.767
        int expPoints = 1_500_000; // 4 bytes -> ~-2,1 bi a 2,1 bi (o mais usado)
        long totalDamageDealt = 9_999_999_999L; // 8 bytes -> precisa do sufixo "L"

        System.out.printf("byte  partySize        = %d  (faixa: %d a %d)%n", partySize, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short goldCoins         = %d  (faixa: %d a %d)%n", goldCoins, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int   expPoints         = %d  (faixa: %d a %d)%n", expPoints, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long  totalDamageDealt  = %d  (faixa: %d a %d)%n%n", totalDamageDealt, Long.MIN_VALUE, Long.MAX_VALUE);

        // ===================================================================
        // 2) TIPOS PRIMITIVOS DECIMAIS (float, double)
        // ===================================================================
        // "float" usa sufixo "f"/"F" e tem menos precisão (bom pra economizar
        // memória); "double" é o padrão do Java para decimais e é o mais usado.
        System.out.println("=== 2) Decimais ===");

        float criticalChance = 27.5f; // precisa do "f", senão o Java entende como double
        double dropRate = 0.03215;    // sem sufixo: já é double por padrão

        System.out.printf("float  criticalChance = %.2f%%%n", criticalChance);
        System.out.printf("double dropRate        = %.5f%n%n", dropRate);

        // ===================================================================
        // 3) char e boolean
        // ===================================================================
        // "char" guarda UM único caractere entre aspas simples.
        // "boolean" guarda apenas true ou false.
        System.out.println("=== 3) char e boolean ===");

        char rank = 'S';       // rank da personagem: S, A, B, C...
        boolean isBossAlive = true;

        System.out.printf("char    rank         = %c%n", rank);
        System.out.printf("boolean isBossAlive  = %b%n%n", isBossAlive);

        // ===================================================================
        // 4) TIPOS DE REFERÊNCIA (String, Arrays, Objetos)
        // ===================================================================
        // Diferente dos primitivos, tipos de referência guardam um "endereço"
        // que aponta para o objeto na memória, não o valor puro.
        System.out.println("=== 4) Tipos de referência ===");

        String characterName = "Noire"; // sequência de caracteres
        String[] partyMembers = {"Noire", "Neptune", "Blanc", "Vert"}; // array de Strings

        System.out.printf("String characterName = %s%n", characterName);
        System.out.print("String[] partyMembers = ");
        for (String member : partyMembers) {
            System.out.print(member + " ");
        }
        System.out.println("\n");

        // ===================================================================
        // 5) CONVERSÃO IMPLÍCITA (widening) vs EXPLÍCITA (casting)
        // ===================================================================
        // Java é fortemente tipado: não dá pra misturar tipos sem conversão.
        // - Widening (implícita, automática): tipo menor -> tipo maior.
        //   Ex: int -> long -> float -> double. Não perde informação.
        // - Narrowing (explícita, exige cast): tipo maior -> tipo menor.
        //   Ex: double -> int. PODE perder informação (a parte decimal é
        //   descartada, não arredondada).
        System.out.println("=== 5) Conversão implícita vs explícita ===");

        int intLevel = 42;
        long longLevel = intLevel; // widening: automático, sem cast
        System.out.printf("int -> long (implícita): %d -> %d%n", intLevel, longLevel);

        double preciseDamage = 99.87;
        int truncatedDamage = (int) preciseDamage; // narrowing: exige "(int)", trunca o decimal
        System.out.printf("double -> int (explícita, com cast): %.2f -> %d (a parte .87 é descartada, não arredondada)%n%n",
                preciseDamage, truncatedDamage);

        // ===================================================================
        // 6) A PEGADINHA DO ZERO À ESQUERDA (literal octal)
        // ===================================================================
        // Um literal int que começa com "0" é interpretado como OCTAL
        // (base 8), não decimal! Por isso "010" vale 8, não 10.
        // Se você precisa manter o "0" na frente (ex: CEP, código com
        // zeros à esquerda), guarde o valor como String, não como int.
        System.out.println("=== 6) Pegadinha do zero à esquerda ===");

        int octalTrap = 010; // parece "dez", mas é octal -> vale 8
        String safeCode = "010"; // assim preserva o valor exato "010"

        System.out.printf("int    octalTrap = 010  -> valor real: %d (octal!)%n", octalTrap);
        System.out.printf("String safeCode  = \"010\" -> valor real: %s (preservado)%n", safeCode);
    }

}
