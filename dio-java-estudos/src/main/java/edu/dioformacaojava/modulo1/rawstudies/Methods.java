package edu.dioformacaojava.modulo1.rawstudies;

public class Methods {
    
    /* 
        Métodos é uma função que pertence a uma classe, ou seja, é um bloco de código que realiza uma tarefa específica e 
        pode ser chamado em diferentes partes do programa.
        O critério de nomeação de métodos é o mesmo que o critério de nomeação de variáveis, ou seja, 
        deve ser um nome descritivo e seguir a convenção camelCase.
        Não existe métodos globais, eles precisam estar dentro de uma classe, e podem ser chamados através de um objeto da classe 
        ou diretamente se forem métodos estáticos.
        Devemos seguir alguns critérios de boas práticas na criação de métodos, como:
        - Nome descritivo e seguindo a convenção camelCase;
        - Tamanho reduzido, evitando métodos muito longos;
        - Realizar apenas uma tarefa específica;
        - Evitar efeitos colaterais, ou seja, não alterar o estado de objetos fora do método;
        - Documentar o método, explicando seu propósito, parâmetros e valor de retorno.

        Quando um método não retorna nenhum valor, ele é chamado de método void, e quando retorna um valor, 
        ele é chamado de método não void.

        A visibilidade do método pode ser definida através dos modificadores de acesso, como public, private e protected,
        sendo que o modificador public permite que o método seja acessado de qualquer lugar, o private permite que o 
        método seja acessado apenas dentro da classe e o protected permite que o método seja acessado apenas dentro do 
        pacote e pelas subclasses.
        O modificador static indica que o método pertence à classe e não a um objeto específico, e pode ser chamado 
        sem criar uma instância da classe.
    
    */
    public static void main(String[] args){
            //Capacidade máxima do inventário
            final int INVENTORY_CAPACITY = 10;
            //Quantidade de items que o jogador pegou
            int quantityItemsTaken = 5;
            //Quantidade de items que o jogador já possui no inventário 
            int quantityItemsInInventory = 2;
            //Quantidade de items que o jogador poderá pegar, considerando a capacidade do inventário 
            int newInventoryTotal = inventoryCapacity(quantityItemsTaken, quantityItemsInInventory, INVENTORY_CAPACITY);
            int itemsGained = calculateItemsGained(newInventoryTotal, quantityItemsInInventory);
        
            String itemName = "Books",
                messageNewItem = getItems(newInventoryTotal, itemName, itemsGained );
     

        if (messageNewItem.equals("Your inventory is full.")){
            System.out.printf(messageNewItem);
        } else {
             System.out.printf(messageNewItem);
             quantityItemsInInventory = newInventoryTotal;
             System.out.println(quantityItemsInInventory);

        }

    }
    
    /* 
        Todo método utilizando um retorno, precisa usar a palavra reservada return, que indica o valor que será retornado pelo método.
        Todo método que não utiliza um retorno, precisa utilizar a palavra reservada void, que indica que o método
        não retorna nenhum valor. 

        O método private é um método que só pode ser acessado dentro da classe em que foi declarado, e não pode ser 
        acessado por outras classes.
    */

    public static int inventoryCapacity (int quantityItemsTaken, int quantityItemsInInventory, int inventoryCapacity){
        if ((quantityItemsTaken + quantityItemsInInventory) < inventoryCapacity){
            return quantityItemsTaken + quantityItemsInInventory;
        }
        else
            return inventoryCapacity;
           // return  quantityItemsInInventory + (inventoryCapacity - (quantityItemsInInventory + quantityItemsTaken)) + quantityItemsTaken ;
        }
    

    public static String getItems (int newInventoryTotal, String itemName, int  itemsGained ){
        if (newInventoryTotal != 0) {
            return String.format("You got %d %s.%n", itemsGained ,itemName);
        }
        else {
            return String.format("Your inventory is full.");
        }
    }

    public static int calculateItemsGained (int newInventoryTotal, int quantityItemsInInventory){
        return newInventoryTotal - quantityItemsInInventory;
    }

}
