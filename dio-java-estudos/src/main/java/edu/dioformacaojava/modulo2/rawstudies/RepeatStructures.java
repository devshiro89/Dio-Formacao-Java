package edu.dioformacaojava.modulo2.rawstudies; 

import java.util.concurrent.ThreadLocalRandom; // essa importação é necessária para gerar números aleatórios de forma 
// segura em ambientes multithread

    /*
        As estruturas de repetição permitem que um bloco de código seja executado várias vezes, com base em uma condição. 
        Em Java, as estruturas de repetição são implementadas através das instruções for, while e do-while.
        Temos a estrutura de repetição for, que é usada quando sabemos o número de iterações que queremos executar. 
        A estrutura while é usada quando não sabemos o número de iterações, mas queremos continuar executando enquanto 
        uma condição for verdadeira. A estrutura do-while é semelhante à estrutura while, mas garante que o bloco de código 
        seja executado pelo menos uma vez, mesmo que a condição seja falsa na primeira verificação.
    */


public class RepeatStructures {
    public static void main(String[] args) {

        /*
            A condicional for é usada quando sabemos o número de iterações que queremos executar. A sintaxe do for é a seguinte:
            for (inicialização; condição; incremento) {
                // bloco de código a ser executado
            }
        */
         System.out.println("=========   Estrutura FOR   ========= \n");
         int share = 0;
         String characterName = "Vert",
                CPUname = "Green Heart";

         for (int battleTurn = 1; share < 100; battleTurn++) {
            System.out.printf("Turno de batalha: %d%n", battleTurn);
            System.out.printf("Share: %d%%%n", share);
            System.out.printf("%s atacou e ganhou share!%n", characterName);
            share += 30;
            if (share <= 100) {
                System.out.printf("Share Atualizado: %d%%%n%n", share);
            } else {
                share = 100; // Share não pode ultrapassar 100%
                System.out.printf("Share Atualizado: %d%%%n%n", share);
            }
         }

        System.out.printf("Share suficiente para transformar em HDD!, %s Transformou em %s!!%n", characterName, CPUname);

        System.out.println("\n--------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("=========    Estrutura FOR Arrays  ========= \n");

        /*
            A estrutura de repetição for também pode ser usada para percorrer arrays. A sintaxe é a seguinte:
            for (int i = 0; i < array.length; i++) {
                // bloco de código a ser executado
            }
        */

        String[] characters = {"Vert", "Noire", "Blanc", "Neptune"};
        String[] nameCPU = {"Green Heart", "Black Heart", "White Heart", "Purple Heart"};
        int[] shareArray = {0, 0, 0, 0},
              characterTurnCount = {0, 0, 0, 0};
        int battleTurn = 0;

        for (int i = 0; characters.length > i && shareArray[i] < 100; i = i) {
            battleTurn ++;

            switch(i) {
                case 0:
                    shareArray[i] += 30;
                    characterTurnCount[i]++;
                    break;
                case 1:
                    shareArray[i] += 20;
                    characterTurnCount[i]++;
                    break;
                case 2:
                    shareArray[i] += 25;
                    characterTurnCount[i]++;
                    break;
                case 3:
                    shareArray[i] += 15;
                    characterTurnCount[i]++;
                    break;
            }         
            if (shareArray[i] > 100) {
                shareArray[i] = 100;
            }
            System.out.printf("%s Atacou no turno %d.%n", characters[i], battleTurn);
            System.out.printf("%s ganhou %d pontos de share.%n%n", characters[i], shareArray[i]);

            if (shareArray[i] >= 100) {
                System.out.printf("%s transformou em %s!%n%n",characters[i],nameCPU[i]);
               i++;
            }
        }
        System.out.println("\n");
        for (int i = 0; characters.length > i; i++) {
                System.out.printf("%s levou %d turnos para transformar em %s.%n", characters[i],characterTurnCount[i],nameCPU[i]);
        }

        System.out.println("\n--------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("=========    BREAK e CONTINUE  ========= \n");

        /*
            O break na estrutura de repetição for é usado para interromper a execução do loop quando uma condição específica é 
            atendida.
            O continue é usado para pular a iteração atual do loop e passar para a próxima iteração, ignorando o restante do 
            código dentro do loop para aquela iteração específica.
        */

            for (int turno = 1; turno <= 5; turno++) {
                if (turno == 3) {
                    System.out.printf("Turno %d: O inimigo usou uma habilidade especial! Pulando este turno.%n%n", turno);
                    continue; // Pula a iteração atual e vai para a próxima
                }
                System.out.printf("Turno %d: O personagem atacou o inimigo.%n%n", turno);
            }

            System.out.println("\n");

            for (int turno = 1; turno <= 5; turno++) {
                if (turno == 4) {
                    System.out.printf("Turno %d: O inimigo derrotou o personagem! Interrompendo a batalha.%n%n", turno);
                    break; // Interrompe o loop
                }
                System.out.printf("Turno %d: O personagem atacou o inimigo.%n%n", turno);
            }

        System.out.println("\n");
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("=========    Estrutura WHILE  ========= \n");

        /*
            A estrutura while é usada para repetir um bloco de código enquanto uma condição específica for verdadeira.
            A condição é verificada antes de cada iteração, e o loop continua enquanto a condição for verdadeira.
        */

        int enemyHP = 200,
            playerAttackMin = 30,
            playerAttackMax = 90,
            playerTurn = 0;

        while (enemyHP > 0) {
            playerTurn++;
            int playerAttack = randomNumber(playerAttackMin, playerAttackMax);
            enemyHP -= playerAttack;
            if (enemyHP < 0) {
                enemyHP = 0; // HP do inimigo não pode ser negativo
            }
            System.out.printf("Turno %d: O personagem atacou o inimigo causando %d de dano. HP do inimigo: %d%n", playerTurn, playerAttack, enemyHP);
            if (enemyHP <= 0) {                
                System.out.printf("O inimigo foi derrotado no turno %d!%n", playerTurn);
                break;
            }
        }

        System.out.println("\n");
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("=========    Estrutura DO WHILE  ========= \n");
        
        /*
            A estrutura do-while é usada para repetir um bloco de código enquanto uma condição específica for verdadeira.
            A condição é verificada após cada iteração, garantindo que o loop seja executado pelo menos uma vez.
        */
            playerTurn = 0;
            enemyHP = 200;
       do { playerTurn++;
            int playerAttack = randomNumber(playerAttackMin, playerAttackMax);
            enemyHP -= playerAttack;
            if (enemyHP < 0) {
                enemyHP = 0; // HP do inimigo não pode ser negativo
            }
            System.out.printf("Turno %d: O personagem atacou o inimigo causando %d de dano. HP do inimigo: %d%n", playerTurn, playerAttack, enemyHP);
            if (enemyHP <= 0) {                
                System.out.printf("O inimigo foi derrotado no turno %d!%n", playerTurn);
                break;
            }
       } while (enemyHP > 0);
    }


        
    public static int randomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1); // Gera um número aleatório entre min (inclusive) e max (inclusive)
    }   
}
