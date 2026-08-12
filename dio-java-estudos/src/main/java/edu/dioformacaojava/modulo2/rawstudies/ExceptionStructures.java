package edu.dioformacaojava.modulo2.rawstudies;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExceptionStructures {

    public static void main (String[] args) {

        /*
            Exceções são eventos que ocorrem durante a execução de um programa e que interrompem o fluxo normal de execução.
            Em Java, as exceções são representadas por objetos que herdam da classe Throwable.
            As excessões mais comum são:
            - ArithmeticException: ocorre quando há uma operação aritmética inválida, como divisão por zero.
            - ArrayIndexOutOfBoundsException: ocorre quando tentamos acessar um índice inválido de um array.
            - NullPointerException: ocorre quando tentamos acessar um objeto que é nulo.
            - NumberFormatException: ocorre quando tentamos converter uma String em um número, mas a String não tem o formato correto.
            - IOException: ocorre quando há um erro de entrada/saída, como ao ler ou escrever em um arquivo.
            - FileNotFoundException: ocorre quando tentamos acessar um arquivo que não existe. 
            - ClassNotFoundException: ocorre quando tentamos carregar uma classe que não existe.
            - SQLException: ocorre quando há um erro ao acessar um banco de dados.
            - InputMismatchException: ocorre quando há uma tentativa de ler um tipo de dado diferente do esperado.

            --------------------------------------------------------------------------------------------------------------------

            A instrução try é usada para envolver o código que pode gerar uma exceção. Se uma exceção ocorrer dentro do bloco try, 
            o fluxo de execução é transferido para o bloco catch correspondente.
            A instrução catch é usada para capturar a exceção e tratar o erro de forma adequada. Podemos ter múltiplos blocos 
            catch para capturar diferentes tipos de exceções.
            A instrução finally é usada para executar um bloco de código independentemente de uma exceção ter ocorrido ou não. 
            O bloco finally é útil para liberar recursos, como fechar arquivos ou conexões de banco de dados.

            --------------------------------------------------------------------------------------------------------------------

            Hierarquia das exceções em Java:

            Temos as classificações de checked e unchecked exceptions. 

            As checked exceptions são verificadas em tempo de compilação, enquanto as unchecked exceptions 
            não são verificadas em tempo de compilação.
            A hierarquia das exceções em Java é a seguinte:

            Throwable
                ├── Error (unchecked)
                └── Exception
                    ├── RuntimeException (unchecked)
                    └── Checked Exceptions
            
            Nas exception temos por exemplo:
            - IOException (checked)
            - SQLException (checked)
            - MalformedURLException (checked)
            - ClassNotFoundException (checked)

            Nas runtime exception temos por exemplo:
            - ArithmeticException (unchecked)
            - ArrayIndexOutOfBoundsException (unchecked)
            - NullPointerException (unchecked)
            - NumberFormatException (unchecked)
            - InputMismatchException (unchecked)
            --------------------------------------------------------------------------------------------------------------------

        */
        try{
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            
        System.out.println("=========   Tratamento de Exceções (try/catch/finally)   ========= \n");

        System.out.println("Insert your name: ");
        String playerName = sc.nextLine();

        System.out.println("Insert your age: ");
        int playerAge = sc.nextInt();

        System.out.println("Welcome to Gamindustri "+ playerName);
        System.out.println("Verifying your age... \nYou're "+playerAge+" years old, allowed to connect.");
        sc.close();
        }
        catch(InputMismatchException e){
            System.err.println("Campos digitados não numéricos - " + e.getMessage());
        }
    }
    
}
