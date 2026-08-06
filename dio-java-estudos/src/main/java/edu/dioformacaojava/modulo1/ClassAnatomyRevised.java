package main.java.edu.dioformacaojava.modulo1;

/**
 * Guia didático sobre a Anatomia de uma Classe em Java, usando como
 * tema a entrada de uma personagem em uma dungeon (RPG).
 *
 * Cada bloco isola um conceito estrutural da classe e executa código
 * real, para que você veja a saída junto da explicação.
 */
public class ClassAnatomyRevised {

    // ===================================================================
    // ATRIBUTOS DE CLASSE (fora de qualquer método)
    // ===================================================================
    // Modificadores de acesso controlam quem pode enxergar o membro:
    // - public:  visível de qualquer lugar.
    // - private: visível somente dentro desta classe.
    // "static" faz o atributo pertencer à CLASSE, e não a cada objeto
    // criado a partir dela — por isso dá pra usá-lo sem instanciar nada.
    private static final String GAME_NAME = "Hyperdimension Neptunia";

    public static void main(String[] args) {

        // ===================================================================
        // 1) O MÉTODO main: PONTO DE ENTRADA DO PROGRAMA
        // ===================================================================
        // O Java procura automaticamente por um método com essa assinatura
        // exata para começar a execução:
        //   public static void main(String[] args)
        // - public: precisa ser acessível de fora da classe (a JVM chama ele).
        // - static: chamado sem precisar criar um objeto de ClassAnatomyClaude.
        // - void: não devolve nenhum valor para quem chamou.
        // - String[] args: argumentos passados pela linha de comando.
        System.out.println("=== 1) Método main ===");
        System.out.printf("Argumentos recebidos via linha de comando: %d%n%n", args.length);

        // ===================================================================
        // 2) VARIÁVEIS vs CONSTANTES
        // ===================================================================
        // Variável: valor pode mudar durante a execução. Convenção: camelCase.
        // Constante: usa "final" e NUNCA muda depois de inicializada.
        // Convenção: UPPER_SNAKE_CASE (tudo maiúsculo, palavras com "_").
        System.out.println("=== 2) Variáveis vs Constantes ===");

        String name = "Noire";
        String city = "Lastation";
        int recommendedLevel = 50;
        int currentLevel = 45; // pode ser reatribuída depois, é variável de verdade

        final int MAX_PARTY_SIZE = 4; // constante local: não muda mais depois desta linha

        System.out.printf("name = %s (variável) | MAX_PARTY_SIZE = %d (constante)%n%n", name, MAX_PARTY_SIZE);

        // ===================================================================
        // 3) System.out — SAÍDA PADRÃO
        // ===================================================================
        // "System" é uma classe do próprio Java. "out" é um objeto dela que
        // representa a tela (saída padrão). Existe também "System.in" para
        // ler dados digitados pelo usuário (entrada padrão).
        System.out.println("=== 3) System.out ===");
        System.out.printf("Welcome to Gamindustri, %s from %s.%n", name, city);
        System.out.printf("Entering on %s universe...%n%n", GAME_NAME);

        // ===================================================================
        // 4) CHAMANDO UM MÉTODO DA PRÓPRIA CLASSE
        // ===================================================================
        // Como o método é "static", conseguimos chamá-lo diretamente pelo
        // nome, sem precisar de "new ClassAnatomyClaude()".
        System.out.println("=== 4) Chamando outro método ===");
        System.out.printf("Current level: %d | Recommended level: %d%n", currentLevel, recommendedLevel);
        System.out.println("Entering on dungeon...");
        System.out.println(compareLevelForDungeon(currentLevel, recommendedLevel));

        currentLevel = 55; // agora acima do recomendado, pra mostrar outro caminho do método
        System.out.printf("%nCurrent level: %d | Recommended level: %d%n", currentLevel, recommendedLevel);
        System.out.println(compareLevelForDungeon(currentLevel, recommendedLevel));
    }

    // ===================================================================
    // 5) MÉTODOS: RESPONSABILIDADE ÚNICA
    // ===================================================================
    // Boas práticas:
    // - Nome de método no infinitivo, em camelCase (ex: compareLevelForDungeon).
    // - Um método deve fazer UMA coisa só. Se ele calcula E imprime, por
    //   exemplo, fica mais difícil de reutilizar e de testar. Aqui o método
    //   só CALCULA e devolve o texto; quem decide imprimir é o main().
    public static String compareLevelForDungeon(int currentLevel, int recommendedLevel) {
        if (currentLevel < recommendedLevel) {
            return "Your level is too low for this dungeon. Recommended level is "
                    + recommendedLevel + ". You need to level up!";
        } else if (currentLevel == recommendedLevel) {
            return "Your level is just right for this dungeon. Good luck!";
        } else {
            return "Your level is higher than recommended for this dungeon. You should be fine!";
        }
    }

}
