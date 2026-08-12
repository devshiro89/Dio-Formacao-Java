package edu.dioformacaojava.modulo2.rawstudies;

public class RepeatStructuresReview {

    public static void main (String[] args) {
        System.out.println("============================= Desafio 1 ===========================\n");

        String[] characterName = {"Vert", "Noire", "Blanc", "Neptune"},
                 characterDistraction = {" se distraiu e caiu."," se concentrou demais e errou.", " foi discutir com a treinadora."," foi comer doces."};
        int[] skillLevel = {0,0,0,0},
                characterTotalTurnTraining = {0,0,0,0},
                characterTotalTurnBattle = {0,0,0,0},
                sharePoints = {0,0,0,0};
        boolean[] defeated = {false,false,false,false};
        int totalTurnCount = 0, distraction, i = 0, enemyCriticalAttack;

        do {
            distraction = (int)(Math.random() * 10); //Gera o valor random e atribui na variável
            totalTurnCount++; // incrementa +1 ao numero de tentativa
            characterTotalTurnTraining[i]++; // incrementa +1 ao turno da respectiva personagem.

            // Se o número gerado para distração for 0, a personagem precisará repetir o turno.
            if (distraction == 0) {
                System.out.println(characterName[i]+characterDistraction[i]);
                continue;
            }
            skillLevel[i]++;
            System.out.println(characterName[i]+" ganhou "+skillLevel[i]+" level de aprimoramento.");

            if (skillLevel[i] > 4) {
                i++;
                 System.out.println();
            }
        } while (characterName.length > i);

        //Contagem do número total de turnos
        System.out.println("Foram no total de "+totalTurnCount+" para todas participantes.\n"); 

        //Imprime quantos turnos cada uma levou para concluir o treinamento
        for (i = 0; characterName.length > i; i++){
            System.out.printf("%s usou %d turnos para concluir o treinamento.%n", characterName[i],characterTotalTurnTraining[i]);
        }

        System.out.println();
        System.out.println("============================= Desafio 2 ===========================\n");


        // Estrutura para correr todos os arrays das personagens
        for (i = 0; characterName.length > i; i++){
            while (sharePoints[i] < 100){
               characterTotalTurnBattle[i]++;
                enemyCriticalAttack = (int)(Math.random() * 100);
                if (enemyCriticalAttack > 90){
                    defeated[i] = true;
                    System.out.printf("%n%s morreu com ataque crítico do inimigo.",characterName[i]);
                    break;
                }
                sharePoints[i] += 25;
                if (sharePoints[i] > 100){
                    sharePoints[i] = 100;
                }
                System.out.printf("%s atacou e ganhou 25 de Share Points. %nShare Points Atuais: %d.%n",characterName[i], sharePoints[i]);
            }
            if (sharePoints[i] == 100){ 
                System.out.println();
                System.out.printf("%s Transformou em HDD!!",characterName[i] );
            }

            System.out.println("\n");
        }
        
        System.out.println("===================================================================================\n");
        for (i = 0; characterName.length > i; i++){
            if (defeated[i] == true){
                System.out.printf("%s morreu tentando salvar Gamindustri em %d turnos.%n%n",characterName[i],characterTotalTurnBattle[i]);
            } else {
                System.out.printf("%s fez uma maravilhosa transformação em HDD e venceu a batalha em %d turnos.%n%n",characterName[i],characterTotalTurnBattle[i]);
            }
         }
    }
    
}
