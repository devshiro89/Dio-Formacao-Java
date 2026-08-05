package main.java.edu.dioformacaojava.modulo1;
/*
    A classe é a estrutura básica de um programa Java. Ela é usada para definir 
    objetos e suas propriedades e comportamentos. A classe é composta por atributos (variáveis)
    e métodos (funções) que definem o que o objeto pode fazer.

    Uma boa prática de escrever a classe é seguir a convenção de nomenclatura, que recomenda
    que o nome da classe comece com uma letra maiúscula e use camel case 
    para nomes compostos.

    É uma boa prática darmos os nomes em inglês, pois é uma linguagem universal e facilita a
    compreensão do código por outros desenvolvedores.

    Sempre o arquivo .java deve ser coerente com o que irá realizar a classe, ou seja, 
    o nome do arquivo deve ser o mesmo da classe. Ex: se for uma classe de Calcular, o nome 
    do arquivo deve ser Calculate.java.

    Toda classe precisa estar no diretório correto, que é definido pelo pacote (package) 
    em que a classe está localizada.

    Indentação é uma boa prática de programação que consiste em organizar o código de forma hierárquica,
    usando espaços ou tabulações para indicar o nível de aninhamento do código. Isso facilita a leitura e 
    manutenção do código.
    Por padrão , a indentação deve ser de 4 espaços ou 1 tabulação, e deve ser consistente em todo o código.
    Precisa ser configurado na IDE a tabulação para 4 espaços, pois ela pode variar de acordo com a IDE ou editor de texto
    se não for configurada.
*/

public class ClassAnatomy {
    /*
    Denominamos o método main o método que irá inicializar a execução do programa. 
    Ele é o ponto de entrada do programa e é chamado automaticamente pelo Java quando o 
    programa é executado.

    Usamos o void para indicar que o método não retorna nenhum valor. 
    O método main é declarado como public para que possa ser acessado de qualquer lugar do 
    programa.

    Nesse exemplo os parâmetros do método main são passados como um array de Strings, 
    que é usado para receber argumentos da linha de comando. 
    Esses argumentos podem ser usados para personalizar o comportamento do programa.
    */

    public static void main(String[] args) {
        /*
         Todo código escrito aqui como funções ou variáveis será executado somente aqui. Não podendo
         ser chamado de outro lugar, a não ser que seja instanciado um objeto da classe.

         Usamos a classe System para acessar o método out, que é um objeto que representa a 
         saída padrão do programa.

         Além do System.out, podemos usar o System.in para acessar a entrada padrão do 
         programa, que é usada para ler dados de entrada do usuário.
         */

        /*
         Para declaração de uma variável, precisamos definir o tipo de dado que ela irá armazenar, seguido do nome da variável.
         O tipo de dado define o tamanho e o formato da variável, e o nome da variável é usado para referenciá-la no código.
         A convenção de nomenclatura para variáveis é usar camel case, começando com uma letra minúscula e usando letras maiúsculas 
         para separar palavras compostas.

         Para declaração de uma constante, usamos a palavra-chave final antes do tipo de dado. As constantes são usadas para armazenar 
         valores que NÃO PODEM SER ALTERADOS durante a execução do programa.
         A convenção de nomenclatura para constantes é usar letras maiúsculas e separar palavras compostas com underline(_).

         Por boas práticas, não podemos iniciar o nome de uma variável ou constante com números, e não podemos usar palavras 
         reservadas do Java como nomes de variáveis ou constantes. Podemos iniciar com letras, underline(_) ou cifrão($), 
         mas não é recomendado iniciar com underline ou cifrão, pois são usados para outros fins no Java.

         Exemplos de tipos de dados primitivos em Java:
            - int: usado para armazenar números inteiros, como 1, 2, 3, etc.
            - double: usado para armazenar números decimais, como 1.0, 2.5, 3.14, etc.
            - boolean: usado para armazenar valores lógicos, como true ou false.
            - char: usado para armazenar um único caractere, como 'a', 'b', 'c', etc.
            Exemplos de tipos de dados não primitivos em Java:
            - String: usado para armazenar uma sequência de caracteres, como "Hello, World!".
            
         Exemplos de palavras reservadas do Java que não podem ser usadas como nomes de variáveis ou constantes:
            - class
            - public
            - static
            - void
            - int
            - double
            - boolean
            - char
            - String
        
        */

         String name = "Noire",
                city = "Lastation";
         int recomendedLevel = 50,
                currentLevel = 45;

        final String GAME_NAME = "Hyperdimension Neptunia",
                     WELCOME_MESSAGE = "Welcome to Gamindustri %s from %s. %n%n",
                     COMPARATE_LEVEL_DUNGEON = comparateLevelForDungeon(currentLevel, recomendedLevel);

        System.out.printf(WELCOME_MESSAGE, name, city);
        System.out.printf("Entering on %s universe... %n%n", GAME_NAME);
        System.out.println("Entering on dungeon...");
        System.out.printf(COMPARATE_LEVEL_DUNGEON);
    }

    /*
     O static indica que o método pertence à classe, e não a uma instância específica da classe.
     Isso significa que podemos chamar o método sem precisar criar um objeto da classe.
     Nome de métodos deve ser no infinitivo, e a convenção de nomenclatura é usar camel case, começando com uma 
     letra minúscula e usando letras maiúsculas para separar palavras compostas.

     Por boas práticas, não podemos fazer um método com duas funcionalidades diferentes, pois isso pode gerar confusão e dificultar 
     a manutenção do código.
     Um método deve ter apenas uma responsabilidade, e seu nome deve refletir claramente o que ele faz. 
     Se um método tiver duas funcionalidades diferentes, é recomendável dividi-lo em dois métodos separados, 
     cada um com uma responsabilidade clara e um nome descritivo.
     Por exemplo, se tivermos um método que calcula a média de uma lista de números e também imprime o resultado na tela, 
     é recomendável dividi-lo em dois métodos separados: um método que calcula a média e outro método que imprime o resultado. 
     Isso torna o código mais legível, fácil de entender e de manter.
    */
    public static String comparateLevelForDungeon(int currentLevel, int recomendedLevel) {
        if (currentLevel < recomendedLevel) {
            return "Your level is too low for this dungeon. Recommended level is " + recomendedLevel + ". %nYou need to level up!";
        } else if (currentLevel == recomendedLevel) {
            return "Your level is just right for this dungeon. Good luck!";
        } else {
            return "Your level is higher than recommended for this dungeon. You should be fine!";
        }
    }
}
