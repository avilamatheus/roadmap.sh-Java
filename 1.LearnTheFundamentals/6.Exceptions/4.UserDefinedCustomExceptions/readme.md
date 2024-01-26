# Exceção personalizada definida pelo usuário / User-defined Custom Exceptions 

**PT-BR**  
O Java nos fornece a facilidade de criar nossas próprias exceções, que são basicamente classes derivadas de Exception. Criar nossa própria exceção é conhecido como uma exceção personalizada ou exceção definida pelo usuário. Basicamente, as exceções personalizadas do Java são usadas para personalizar a exceção de acordo com as necessidades do usuário. Em palavras simples, podemos dizer que uma exceção definida pelo usuário ou exceção personalizada está criando sua própria classe de exceção e lançando essa exceção usando a palavra-chave 'throw'.

***

**EN-US**  
Java provides us the facility to create our own exceptions which are basically derived classes of Exception. Creating our own Exception is known as a custom exception or user-defined exception. Basically, Java custom exceptions are used to customize the exception according to user needs. In simple words, we can say that a User-Defined Exception or custom exception is creating your own exception class and throwing that exception using the ‘throw’ keyword.

***

## Por que usar exceções personalizadas? / Why use Custom Exceptions?

**PT-BR**  
As exceções Java cobrem quase todos os tipos gerais de exceções que podem ocorrer na programação. No entanto, às vezes precisamos criar exceções personalizadas.

A seguir estão alguns dos motivos para usar exceções personalizadas:

1. Para capturar e fornecer tratamento específico a um subconjunto de exceções Java existentes.

2. Exceções de lógica de negócios: são exceções relacionadas à lógica de negócios e ao fluxo de trabalho. É útil para os usuários do aplicativo ou os desenvolvedores entenderem o problema exato.

Para criar uma exceção personalizada, precisamos estender a classe Exception que pertence ao pacote java.lang.

***

**EN-US**  
Java exceptions cover almost all the general types of exceptions that may occur in the programming. However, we sometimes need to create custom exceptions.

Following are a few of the reasons to use custom exceptions:

1. To catch and provide specific treatment to a subset of existing Java exceptions.

2. Business logic exceptions: These are the exceptions related to business logic and workflow. It is useful for the application users or the developers to understand the exact problem.

In order to create a custom exception, we need to extend the Exception class that belongs to java.lang package.

***

Ex:    
```java
// A Class that represents use-defined exception
 
class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
// A Class that uses above MyException
public class Main {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException("GeeksGeeks");
        }
        catch (MyException ex) {
            System.out.println("Caught");
 
            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}
```

Saída / Output:  
```bash
Caught
GeeksGeeks
```