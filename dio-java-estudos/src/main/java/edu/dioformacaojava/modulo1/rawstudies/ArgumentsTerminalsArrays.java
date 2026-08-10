package edu.dioformacaojava.modulo1.rawstudies;

public class ArgumentsTerminalsArrays{
    /*
        Podemos executar uma classe Java com argumentos de linha de comando, que são passados para o método main como um array de Strings.
        Esses argumentos podem ser usados para personalizar o comportamento do programa, como definir configurações,
        opções de execução ou fornecer dados de entrada.

        Podemos chama-lo por um terminal ou prompt de comando, utilizando o comando java seguido do nome da classe e dos argumentos
         desejados.
    */

    /*
        Argumentos é uma forma de passar informações para o programa no momento da execução, sem precisar alterar o código-fonte.
        Eles são úteis para criar programas mais flexíveis e configuráveis, permitindo que o usuário 
        defina parâmetros de execução sem precisar modificar o código-fonte.

        Exemplo de execução: java ArgumentsTerminals arg1 arg2 arg3
        Nesse exemplo, arg1, arg2 e arg3 são os argumentos passados para o programa, que podem ser acessados no método 
        main como um array de Strings.

    
    */

    public static void main(String[] args) {
        String nomeCPU = args[0];
        String cityBorn = args[1];
        int share = Integer.valueOf(args[2]);
        double attack = Double.valueOf(args[3]);

        System.out.printf("CPU: %s, Cidade Natal: %s, Share: %d, Ataque: %.2f", nomeCPU, cityBorn, share, attack);
        System.out.println();
        }
}
