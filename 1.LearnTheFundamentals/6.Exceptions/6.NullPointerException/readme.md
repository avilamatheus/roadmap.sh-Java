# Null Pointer Exception
**PT-BR**  
NullPointerException é uma RuntimeException. Em Java, um valor nulo especial pode ser atribuído a uma referência de objeto. NullPointerException é lançado quando o programa tenta usar uma referência de objeto que tem o valor nulo.

Estes podem ser:

- Invocando um método de um objeto nulo.
- Acessando ou modificando o campo de um objeto nulo.
- Tomando o comprimento de nulo, como se fosse uma matriz.
- Acessando ou modificando os slots de objeto nulo, como se fosse uma matriz.
- Lançando nulo, como se fosse um valor Throwable.
- Quando você tenta sincronizar em um objeto nulo.

***

**EN-US**  
NullPointerException is a RuntimeException. In Java, a special null value can be assigned to an object reference. NullPointerException is thrown when program attempts to use an object reference that has the null value.

These can be: 

- Invoking a method from a null object.
- Accessing or modifying a null object’s field.
- Taking the length of null, as if it were an array.
- Accessing or modifying the slots of null object, as if it were an array.
- Throwing null, as if it were a Throwable value.
- When you try to synchronize over a null object.

***

## Por que precisamos do valor nulo? / Why do we need the null value?
**PT-BR**  
Null é um valor especial usado em Java. É usado principalmente para indicar que nenhum valor é atribuído a uma variável de referência. Uma aplicação de nulo está na implementação de estruturas de dados como linked list e árvores. Outras aplicações incluem o padrão Null Object e o padrão Singleton.

***

**EN-US**  
Null is a special value used in Java. It is mainly used to indicate that no value is assigned to a reference variable. One application of null is in implementing data structures like linked list and tree. Other applications include Null Object pattern and Singleton pattern.

***

## Como evitar NullPointerException? / How to avoid NullPointerException?
**PT-BR**  
Para evitar o NullPointerException, devemos garantir que todos os objetos sejam inicializados corretamente, antes de usá-los. Quando declaramos uma variável de referência, devemos verificar se o objeto não é nulo, antes de solicitar um método ou um campo dos objetos.

***

**EN-US**  
To avoid the NullPointerException, we must ensure that all the objects are initialized properly, before you use them. When we declare a reference variable, we must verify that object is not null, before we request a method or a field from the objects.

***
