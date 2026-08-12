package edu.dioformacaojava.modulo2.rawstudies;
import java.util.Scanner;

public class ExeceptionStructureReview {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        boolean validate = false;
        String[] characterName = {"Vert","Noire","Blanc","Neptune"};
        int characterChoise;
        while (!validate) {
            try{
                System.out.printf("Digite um número para invocar um personagem: %n1 - Vert %n2 - Noire %n3 - Blanc %n4 - Neptune%n");
                characterChoise = (Integer.parseInt(sc.nextLine())-1);
                System.out.println(characterName[characterChoise]+" foi invocada com sucesso!");
                validate = true;
            }catch (NumberFormatException nfe) {
                System.out.println("\nDigite apenas um número. Error - "+ nfe.getMessage());
            }catch (ArrayIndexOutOfBoundsException aioe){
                System.out.println("\nDigite um valor entre 1 e 4. Error - " + aioe.getMessage());
            }finally{
                System.out.println("\nTentativa de invocação encerrada.\n");
            }
        }
    }   
}
