package edu.dioformacaojava.modulo1.rawstudies;

    /**
        <h2> JavaDoc </h2>
        <p> Método transformHDD responsável por chamar um System.out.println quando uma CPU transformar em HDD no modo batalha. </p>
        <b> Leia atentatamente a documentação do método para entender como ele funciona e como utilizá-lo corretamente. </b>
        @author Noire
        @version 1.0
        @since 2024-06-10
    */

public class JavaDoc {
    /*
        Java docs é uma ferramenta que permite gerar documentação em HTML a partir de comentários no código-fonte Java.
        A documentação gerada pelo Java docs inclui informações sobre classes, métodos, atributos e pacotes, 
        além de exemplos de uso e links para outras classes e pacotes.
        Para gerar a documentação, é necessário utilizar comentários especiais no código-fonte, que começam com
        /"* e terminam com *"/, e incluem tags especiais que indicam o tipo de informação que está sendo documentada.

        Algumas das tags mais comuns usadas no Java docs incluem:
        @param: usada para documentar os parâmetros de um método.
        @return: usada para documentar o valor de retorno de um método.
        @throws: usada para documentar as exceções que um método pode lançar.
        @see: usada para criar links para outras classes ou métodos relacionados.
        @version: usada para documentar a versão de uma classe ou método.
        @created: usada para documentar a data de criação de uma classe ou método.
        @author: usada para documentar o autor de uma classe ou método.
        @since: usada para documentar a versão do Java em que uma classe ou método foi introduzido.
    */
        public static boolean transformTrueForm = false;

        /**
            * Este método é responsável por transformar a CPU em HDD no modo batalha.
             * Ele verifica se a transformação já foi realizada, caso contrário, realiza a transformação e exibe uma mensagem no console.
             * Usa o campo {@link #transformTrueForm} para verificar se a transformação já foi realizada.
        */

        /*
            O comando no terminal javadoc -encoding UTF-8 -d -docencoding ISO-8859-1 -d 
            ../docs src/main/java/edu/dioformacaojava/modulo1/rawstudies/JavaDoc.java é usado para gerar a documentação em HTML a 
            partir do código-fonte Java.

            O parâmetro -encoding UTF-8 especifica a codificação de caracteres usada no código-fonte, enquanto o parâmetro 
            -docencoding ISO-8859-1 especifica a codificação de caracteres usada na documentação gerada.

            O parâmetro -d ../docs especifica o diretório onde a documentação gerada será salva, enquanto o parâmetro 
            src/main/java/edu/dioformacaojava/modulo1/rawstudies/JavaDoc.java especifica o caminho para o arquivo Java que será 
            documentado.
            
            O comando javadoc é uma ferramenta de linha de comando incluída no JDK (Java Development Kit) que permite gerar 
            documentação em HTML a partir de comentários no código-fonte Java. 
        */
        public void transformHDD(){

            System.out.println("Transformação completa de HDD");
            transformTrueForm = true;


        }
}
