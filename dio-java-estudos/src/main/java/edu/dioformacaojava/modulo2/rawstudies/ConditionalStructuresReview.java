package edu.dioformacaojava.modulo2.rawstudies;

public class ConditionalStructuresReview {
    /*
    Crie um método que recebe shareAcumulado (int) de uma CPU e retorna sua classificação de poder. If/else encadeado 
    obrigatório — a mistura de condição numérica com booleana exige isso:

    < 0 → valor inválido (Share não pode ser negativo — pense em como sinalizar erro sem só imprimir e seguir)
    0 – 999 → "CPU Selada"
    1000 – 4999 → "CPU Despertada"
    5000 – 9999 → "CPU em Forma HDD"
    ≥ 10000, mas só se o segundo parâmetro booleano possuiShareCristalizado for true → "CPU Verdadeira Suprema"
    ≥ 10000 sem o Share Cristalizado → "Forma HDD Máxima" (poder suficiente não basta sem o cristal — ordem das cláusulas 
    importa aqui)
    */

    public static void main (String[] args){
        System.out.println("=========   Desafio 1 - Hierarquia de CPUs por Share Acumulado (if/else encadeado)   ========= \n");
        int shareAcumulado = 99999;
        boolean possuiShareCristalizado = true;

        if (shareAcumulado >= 0 && shareAcumulado <= 999){
            System.out.println("CPU Selada");
        }
        else if (shareAcumulado >= 1000 && shareAcumulado <= 4999){
            System.out.println("CPU Despertada");
        }
        else if (shareAcumulado >= 5000 && shareAcumulado <= 9999){
            System.out.println("CPU em Forma HDD");
        }
        else if (shareAcumulado >= 10000 && possuiShareCristalizado == true){
            System.out.println("CPU Verdadeira Suprema");
        }
        else if (shareAcumulado >= 10000 && possuiShareCristalizado == false){
            System.out.println("Forma HDD Máxima");
        } else {
            throw new IllegalArgumentException("Share não pode ser negativo.");
        }
         System.out.println("\n--------------------------------------------------------------------------------------------------------------------\n");
         System.out.println("=========   Desafio 2 - Loja de Lowee: categorias de item (switch com fall-through controlado)   ========= \n");

         /*
            Desafio 2 — Loja de Lowee: categorias de item (switch com fall-through controlado)

            switch sobre String categoria ("ArmaCPU", "ArmaduraCPU", "PoçãoShare", "MaterialForja", "SucataBasilicom"):

            "ArmaCPU" e "ArmaduraCPU" caem no mesmo bloco — fall-through intencional — mensagem: "Item de equipamento de CPU — pode ser forjado em Lastation"
            "PoçãoShare" tem mensagem própria, isolada
            "MaterialForja" e "SucataBasilicom" compartilham outra mensagem, sem vazar pras de cima
            Categoria desconhecida → default: item não catalogado no Basilicom 
        */

            String categoria = "MaterialForja";

            switch(categoria){
                case "ArmaCPU":
                case "ArmaduraCPU":
                    System.out.println("Item de equipamento de CPU - pode ser forjado em Lastation.");
                    break;
                
                case "PoçãoShare":
                    System.out.println("Pode ser comprado em qualquer loja.");
                    break;
                
                case "MaterialForja":
                case "SucataBasilicom":
                    System.out.println("Item de Craft pode ser comprado em Lowee.");
                    break;

                default:
                    System.out.println("item não catalogado no Basilicom.");
            }

        System.out.println("\n--------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("=========    Desafio 3 - Transformação HDD validada (a régua do ternário em ação)   ========= \n");

         /*
            Desafio 3 — Transformação HDD validada (a régua do ternário em ação)

            Método podeTransformar(int share, int limiar, boolean temPocaoHDDCharge):

            Primeiro resolve o estado com if normal: se share < limiar mas tem poção, ela é consumida (boolean pocaoConsumida) e o share sobe pro limiar — tudo como instrução explícita, nada escondido
            Depois, com o estado já fechado, usa ternário só pra decidir a String de retorno — "Vert transformou em HDD!", "Vert usou uma Poção Share e transformou!", ou "Share insuficiente, sem poções disponíveis" — zero efeito colateral dentro da expressão
         */

        int share = 99,
            limiar = 100;

        boolean temPocaoHDDCharge = true,
                pocaoConsumida = usedPotion(share, limiar, temPocaoHDDCharge);
        
        if (pocaoConsumida) {
            share = limiar;
        }

        String transformHDD = 
        (pocaoConsumida) ? String.format("Vert usou uma Poção Share e transformou") 
        : (comparateLimitShare(share, limiar)) ?String.format("Vert transformou em HDD!")
        : String.format("Share insuficiente, sem poções disponíveis");

        System.out.println(transformHDD);
    }

    public static boolean usedPotion (int share, int limiar, boolean temPocaoHDDCharge){
        return (share < limiar && temPocaoHDDCharge) ? true
        : false;
    }

    public static boolean comparateLimitShare(int share, int maxHDD) {
        return share >= maxHDD
        ? true
        : false;
    }
}


