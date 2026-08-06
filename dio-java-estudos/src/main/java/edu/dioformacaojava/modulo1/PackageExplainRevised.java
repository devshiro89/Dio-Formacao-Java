package main.java.edu.dioformacaojava.modulo1;

/**
 * Guia didático sobre Packages (Pacotes) em Java.
 *
 * Diferente dos outros temas do módulo, "package" não é algo que se
 * "executa" — é organização de projeto. Por isso este arquivo usa
 * código real só para provar, em tempo de execução, conceitos que
 * normalmente ficam só na teoria (como descobrir o próprio pacote).
 */
public class PackageExplainRevised {

    public static void main(String[] args) {

        // ===================================================================
        // 1) O QUE É UM PACKAGE
        // ===================================================================
        // Package agrupa classes relacionadas em um mesmo "diretório lógico",
        // facilitando organização e reuso. A convenção é usar letras
        // minúsculas separadas por ponto, geralmente no formato invertido
        // do domínio da empresa/projeto (ex: com.empresa.projeto.modulo).
        //
        // Podemos provar isso em tempo de execução: toda classe carregada
        // pela JVM sabe informar de qual pacote ela veio.
        System.out.println("=== 1) O que é um package ===");
        System.out.printf("Esta classe pertence ao pacote: %s%n%n", PackageExplainRevised.class.getPackageName());

        // ===================================================================
        // 2) PARA QUE SERVE: EVITAR CONFLITO DE NOMES
        // ===================================================================
        // Duas classes com o MESMO nome podem coexistir no projeto, desde
        // que estejam em pacotes diferentes. Por exemplo, poderíamos ter:
        //   edu.dioformacaojava.modulo1.Player
        //   edu.dioformacaojava.modulo2.Player
        // Para usar uma classe de outro pacote, importamos com "import":
        //   import edu.dioformacaojava.modulo1.ClassAnatomyClaude;
        System.out.println("=== 2) Evitando conflito de nomes ===");
        System.out.println("Exemplo: modulo1.Player e modulo2.Player podem coexistir,");
        System.out.println("pois o pacote completo (nome + endereço) é o que identifica a classe.\n");

        // ===================================================================
        // 3) CONVENÇÕES DE NOME DE PACOTE POR RESPONSABILIDADE
        // ===================================================================
        // Em projetos maiores, é comum separar pacotes por "papel" da classe
        // dentro da arquitetura. Isso ajuda qualquer dev a adivinhar onde
        // procurar algo só pelo nome do pacote.
        System.out.println("=== 3) Convenções por responsabilidade ===");

        String[][] packageRoles = {
                {"utils",      "Classes utilitárias (strings, datas, arquivos)"},
                {"model",      "Modelos de dados: entidades, DTOs"},
                {"service",    "Regras de negócio: autenticação, pagamentos, e-mails"},
                {"controller", "Entrada/saída do usuário: endpoints, telas"},
                {"repository", "Persistência de dados: acesso a banco, arquivos"},
                {"test",       "Testes unitários e de integração"}
        };

        for (String[] role : packageRoles) {
            System.out.printf("  %-12s -> %s%n", role[0], role[1]);
        }
        System.out.println();

        // ===================================================================
        // 4) DOMÍNIOS DE NÍVEL SUPERIOR (TLDs) — de onde vem a convenção
        // ===================================================================
        // A convenção "com.empresa.projeto" existe porque pacotes costumam
        // usar o domínio da empresa invertido. Conhecer os TLDs ajuda a
        // entender pacotes de bibliotecas conhecidas (com.google.*, org.apache.*).
        System.out.println("=== 4) TLDs e o que costumam indicar ===");

        String[][] tlds = {
                {".com", "Sites comerciais — o TLD mais popular"},
                {".org", "Organizações sem fins lucrativos, ONGs"},
                {".net", "Redes e tecnologia, provedores de internet"},
                {".gov", "Sites governamentais oficiais"},
                {".edu", "Instituições educacionais credenciadas"},
                {".io",  "Startups e empresas de tecnologia"}
        };

        for (String[] tld : tlds) {
            System.out.printf("  %-5s -> %s%n", tld[0], tld[1]);
        }
    }

}
