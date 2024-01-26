# Exceções / Exceptions

**PT-BR**  
O tratamento de exceções em Java é um dos meios eficazes para lidar com erros em tempo de execução, de modo que o fluxo regular da aplicação possa ser preservado. O tratamento de exceções em Java é um mecanismo para lidar com erros em tempo de execução, como ClassNotFoundException, IOException, SQLException, RemoteException, etc.

***

**EN-US**  
Exception Handling in Java is one of the effective means to handle runtime errors so that the regular flow of the application can be preserved. Java Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

## O que são Exceções em Java? / What are Java Exceptions?

**PT-BR**  
Em Java, Exception é um evento indesejado ou inesperado, que ocorre durante a execução de um programa, ou seja, em tempo de execução, que interrompe o fluxo normal das instruções do programa. As exceções podem ser capturadas e tratadas pelo programa. Quando uma exceção ocorre dentro de um método, ela cria um objeto. Este objeto é chamado de objeto de exceção. Ele contém informações sobre a exceção, como o nome e a descrição da exceção e o estado do programa quando a exceção ocorreu.

***

**EN-US**  
In Java, Exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program’s instructions. Exceptions can be caught and handled by the program. When an exception occurs within a method, it creates an object. This object is called the exception object. It contains information about the exception, such as the name and description of the exception and the state of the program when the exception occurred.

## Razões pelas quais uma exceção pode ocorrer / Reasons why an Exception may occur

**PT-BR**  
Os principais motivos que causam uma exceção em Java são:

- Entrada de usuário inválida
- Falha do dispositivo
- Perda de conexão de rede
- Limitações físicas (sem memória de disco)
- Erros de código
- Abrir um arquivo indisponível

***

**EN-US**  
The major reasons that cause an exception in Java are:

- Invalid user input
- Device failure
- Loss of network connection
- Physical limitations (out-of-disk memory)
- Code errors
- Opening an unavailable file

## Diferença entre Erro e Exceção / Difference between Error and Exception

**PT-BR**  
Os erros representam condições irreversíveis, como a máquina virtual Java (JVM) ficando sem memória, vazamentos de memória, erros de stack overflow, incompatibilidade de biblioteca, recursão infinita, etc. Os erros geralmente estão além do controle do programador e não devemos tentar lidar com erros.

As diferenças são:

- **Erro**: indica um problema sério que um aplicativo razoável não deve tentar capturar.

- **Exceção**: indica condições que um aplicativo razoável pode tentar capturar.

***

**EN-US**  
Errors represent irrecoverable conditions such as Java virtual machine (JVM) running out of memory, memory leaks, stack overflow errors, library incompatibility, infinite recursion, etc. Errors are usually beyond the control of the programmer, and we should not try to handle errors.

The differences are:

- **Error**: indicates a serious problem that a reasonable application should not try to catch.
- **Exception**: indicates conditions that a reasonable application might try to catch.

## Hierarquia de Exceções / Exception Hierarchy
**PT-BR**  
Todos os tipos de exceção e erro são subclasses da classe **Throwable**, que é a classe base da hierarquia. Um ramo é liderado por Exception. Esta classe é usada para condições excepcionais que os programas do usuário devem capturar. NullPointerException é um exemplo de tal exceção. Outro ramo, Error é usado pelo sistema de tempo de execução do Java (JVM) para indicar erros relacionados ao próprio ambiente de tempo de execução (JRE). StackOverflowError é um exemplo de tal erro.

![Exception Hierarchy](https://media.geeksforgeeks.org/wp-content/uploads/20230613122108/Exception-Handling-768.png)

***

**EN-US**  
All exception and error types are subclasses of the class **Throwable**, which is the base class of the hierarchy. One branch is headed by Exception. This class is used for exceptional conditions that user programs should catch. NullPointerException is an example of such an exception. Another branch, Error is used by the Java run-time system(JVM) to indicate errors having to do with the run-time environment itself(JRE). StackOverflowError is an example of such an error.

![Exception Hierarchy](https://media.geeksforgeeks.org/wp-content/uploads/20230613122108/Exception-Handling-768.png)

## Tipos de Exceções / Types of Exceptions

**PT-BR**  
Java define vários tipos de exceções que se relacionam com suas várias bibliotecas de classes. Java também permite que os usuários definam suas próprias exceções.

![Tipos de Exceções](https://media.geeksforgeeks.org/wp-content/uploads/20230714113547/Exceptions-in-Java-1-768.png)

As exceções podem ser categorizadas de duas maneiras:
1. Exceções integradas, divididas em duas categorias:
    - Exceção Verificada
    - Exceção Não Verificada
2. Exceções definidas pelo usuário

### Exceções Integradas
As exceções integradas são as exceções que estão disponíveis nas bibliotecas Java. Essas exceções são adequadas para explicar certas situações de erro.

- **Exceções Verificadas**: As exceções verificadas são chamadas de exceções de tempo de compilação porque essas exceções são verificadas no tempo de compilação pelo compilador.

- **Exceções Não Verificadas**: As exceções não verificadas são exatamente o oposto das exceções verificadas. O compilador não verificará essas exceções no momento da compilação. Em palavras simples, se um programa lançar uma exceção não verificada e mesmo que não a tratemos ou declaremos, o programa não dará um erro de compilação.

### Exceções Definidas pelo Usuário

Às vezes, as exceções integradas em Java não conseguem descrever uma determinada situação. Nesses casos, os usuários também podem criar exceções, que são chamadas de 'Exceções definidas pelo usuário'.

As vantagens do tratamento de exceções em Java são as seguintes:

1. Provisão para concluir a execução do programa
2. Identificação fácil do código do programa e do código de tratamento de erros
3. Propagação de erros
4. Relatório de erros significativo
5. Identificando tipos de erros

***

**EN-US**  
Java defines several types of exceptions that relate to its various class libraries. Java also allows users to define their own exceptions.

![Types of Exceptions](https://media.geeksforgeeks.org/wp-content/uploads/20230714113547/Exceptions-in-Java-1-768.png)

Exceptions can be categorized in two ways:
1. Built-in Exceptions, divided into two categories:
    - Checked Exception
    - Unchecked Exception 
2. User-defined Exceptions

### Built-in Exceptions 
Built-in exceptions are the exceptions that are available in Java libraries. These exceptions are suitable to explain certain error situations.

- **Checked Exceptions**: Checked exceptions are called compile-time exceptions because these exceptions are checked at compile-time by the compiler.
 
- **Unchecked Exceptions**: The unchecked exceptions are just opposite to the checked exceptions. The compiler will not check these exceptions at compile time. In simple words, if a program throws an unchecked exception, and even if we didn’t handle or declare it, the program would not give a compilation error.

### User-defined Exceptions 
Sometimes, the built-in exceptions in Java are not able to describe a certain situation. In such cases, users can also create exceptions, which are called ‘user-defined Exceptions’. 

The advantages of Exception Handling in Java are as follows:

1. Provision to Complete Program Execution
2. Easy Identification of Program Code and Error-Handling Code
3. Propagation of Errors
4. Meaningful Error Reporting
5. Identifying Error Types

## Métodos para imprimir exceções / Methods to print Exceptions

**PT-BR**  

### printStackTrace()
Este método imprime informações de exceção no formato do Nome da exceção: descrição da exceção, rastreamento de pilha.

Exemplo:
```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    e.printStackTrace();
}
```

Saída:
```
java.lang.ArithmeticException: / by zero
    at Main.main(Main.java:3)
```

### toString()
Este método imprime informações de exceção no formato do Nome da exceção: descrição da exceção.

Exemplo:
```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println(e.toString());
}
```

Saída:
```
java.lang.ArithmeticException: / by zero
```

### getMessage()
Este método imprime informações de exceção no formato da descrição da exceção.

Exemplo:
```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}
```
Saída:
```
/ by zero
```

***

**EN-US**  
### printStackTrace()
This method prints exception information in the format of the Name of the exception: description of the exception, stack trace.

Example:
```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    e.printStackTrace();
}
```

Output:
```
java.lang.ArithmeticException: / by zero
    at Main.main(Main.java:3)
```

### toString()
This method prints exception information in the format of the Name of the exception: description of the exception.

Example:
```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println(e.toString());
}
```

Output:
```
java.lang.ArithmeticException: / by zero
```

### getMessage()
This method prints exception information in the format of the description of the exception.

Example:
```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}
```

Output:
```
/ by zero
```

## Como lidar com exceções em Java? / How to handle exceptions in Java?
**PT-BR**  
O tratamento de exceções em Java é gerenciado por cinco palavras-chave: try, catch, throw, throws e finally. 

As instruções do programa que você acha que podem gerar exceções são contidas em um bloco try.
Se uma exceção ocorrer dentro do bloco try, ela será lançada. Seu código pode capturar essa exceção (usando o bloco catch) e tratá-la de maneira racional. As exceções geradas pelo sistema são automaticamente lançadas pelo sistema de tempo de execução Java. Para lançar manualmente uma exceção, use a palavra-chave throw. Qualquer exceção que seja lançada fora de um método deve ser especificada como tal por uma cláusula throws. Qualquer código que absolutamente deve ser executado após a conclusão de um bloco try é colocado em um bloco finally.

Exemplo:
```java
try {
    // bloco de código para monitorar erros
    // o código que você acha que pode gerar uma exceção
} catch (ExceptionType1 excep1) {
    // manipulador de exceção para ExceptionType1
} catch (ExceptionType2 excep2) {
    // manipulador de exceção para ExceptionType2
}
// opcional
finally {  // bloco de código a ser executado após o término do bloco try 
}
```

Alguns pontos-chave precisam ser lembrados, que são os seguintes:

- Em um método, pode haver mais de uma instrução que pode gerar uma exceção, portanto, coloque todas essas instruções em seu próprio bloco try e forneça um manipulador de exceção separado em seu próprio bloco catch para cada uma delas.

- Se ocorrer uma exceção dentro do bloco try, essa exceção será tratada pelo manipulador de exceção associado a ela. Para associar o manipulador de exceção, devemos colocar um bloco catch após ele. Pode haver mais de um manipulador de exceção. Cada bloco catch é um manipulador de exceção que trata a exceção para o tipo indicado por seu argumento. O argumento, ExceptionType declara o tipo de exceção que ele pode manipular e deve ser o nome da classe que herda da classe Throwable.

- Para cada bloco try, pode haver zero ou mais blocos catch, mas apenas um bloco final.

- O bloco finally é opcional. Ele sempre é executado se ocorrer uma exceção no bloco try ou não. Se ocorrer uma exceção, ela será executada após os blocos try e catch. E se uma exceção não ocorrer, ela será executada após o bloco try. O bloco finally em Java é usado para colocar códigos importantes, como código de limpeza, por exemplo, fechar o arquivo ou fechar a conexão.

- Se escrevermos System.exit no bloco try, o bloco finally não será executado.



***

**EN-US**  
Customized Exception Handling: Java exception handling is managed via five keywords: try, catch, throw, throws, and finally.

Program statements that you think can raise exceptions are contained within a try block. 
If an exception occurs within the try block, it is thrown. Your code can catch this exception (using catch block) and handle it in some rational manner. System-generated exceptions are automatically thrown by the Java run-time system. To manually throw an exception, use the keyword throw. Any exception that is thrown out of a method must be specified as such by a throws clause. Any code that absolutely must be executed after a try block completes is put in a finally block.

Example:
```java
try {
    // block of code to monitor for errors
    // the code you think can raise an exception
} catch (ExceptionType1 excep1) {
    // exception handler for ExceptionType1
} catch (ExceptionType2 excep2) {
    // exception handler for ExceptionType2
}
// optional
finally {  // block of code to be executed after try block ends 
}
```

Certain key points need to be remembered that are as follows:   

- In a method, there can be more than one statement that might throw an exception, So put all these statements within their own try block and provide a separate exception handler within their own catch block for each of them.

- If an exception occurs within the try block, that exception is handled by the exception handler associated with it. To associate the exception handler, we must put a catch block after it. There can be more than one exception handler. Each catch block is an exception handler that handles the exception to the type indicated by its argument. The argument, ExceptionType declares the type of exception that it can handle and must be the name of the class that inherits from the Throwable class.

- For each try block, there can be zero or more catch blocks, but only one final block.

- The finally block is optional. It always gets executed whether an exception occurred in try block or not. If an exception occurs, then it will be executed after try and catch blocks. And if an exception does not occur, then it will be executed after the try block. The finally block in Java is used to put important codes such as clean-up code e.g., closing the file or closing the connection.

- If we write System.exit in the try block, then finally block will not be executed.