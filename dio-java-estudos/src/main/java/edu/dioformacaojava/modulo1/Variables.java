package main.java.edu.dioformacaojava.modulo1;

/*
    Tipos de Variáveis
    
    Tipos primitivos:
    - int: números inteiros (ex: 1, 2, 3)
    - double: números decimais (ex: 1.5, 2.0, 3.14)
    - char: caracteres (ex: 'a', 'b', 'c')
    - boolean: valores lógicos (true ou false)
    
    Tipos de referência:
    - String: sequência de caracteres (ex: "Olá", "Mundo")
    - Arrays: coleção de elementos do mesmo tipo (ex: int[], String[])
    - Classes e Objetos: tipos definidos pelo usuário

    O tamanho dos tipos primitivos númericos em memória são:
    - byte: 1 byte
    Exemplo: valor minimo -128, valor máximo 127
    - short: 2 bytes
    Exemplo: valor minimo -32.768, valor máximo 32.767
    - int: 4 bytes
    Exemplo: valor minimo -2.147.483.648, valor máximo 2.147.483.647
    - long: 8 bytes
    Exemplo: valor minimo -9.223.372.036.854.775.808, valor máximo 9.223.372.036.854.775.807
    - float: 4 bytes
    Exemplo: valor minimo 1.4E-45, valor máximo 3.4028235E38
    - double: 8 bytes
    Exemplo: valor minimo 4.9E-324, valor máximo 1.7976931348623157E308

    O tipo int é o mais utilizado para representar números inteiros, pelo java conseguir compilar mais rápido,
    e o tipo double é o mais utilizado para representar números decimais, pelo java conseguir compilar mais rápido.

    Caso um valor de uma variável inteiro comece com 0, precisamos usar um tipo String para representar esse valor, 
    pois o java entende que esse valor é um número octal, e não decimal.

    Também usamos para o tipo float o sufixo f ou F, e para o tipo long usamos o sufixo l ou L, para que o java entenda 
    que aquele valor é do tipo float ou long, respectivamente.

    ------------------------------------------------------------------------------------------------------------------------------

    O Java é fortemente tipado, ou seja, não é possível atribuir um valor de um tipo a uma variável de outro tipo sem fazer uma 
    conversão explícita.
    Por exemplo, não é possível atribuir um valor do tipo double a uma variável do tipo int sem fazer uma conversão explícita, 
    pois o tipo double é maior que o tipo int.
    Da mesma forma String não é compatível com int, double, float, long, short, byte, char e boolean.
*/

public class Variables {
    
}
