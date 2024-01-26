# throw e throws em Java / throw and throws in Java

## throw
**PT-BR**  
A palavra-chave throw em Java é usada para lançar explicitamente uma exceção de um método ou qualquer bloco de código. Podemos lançar exceção verificada ou não verificada. A palavra-chave throw é usada principalmente para lançar exceções personalizadas.

***

**EN-US**  
The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. We can throw either checked or unchecked exception. The throw keyword is mainly used to throw custom exceptions.

***

Ex:
```java
public class Test {
   public static void main(String args[]) {
      try {
         throw new NullPointerException("demo");
      } catch(NullPointerException e) {
         System.out.println("Caught inside main.");
      }
   }
}
```

Saída / Output:
```bash
Caught inside main.
```

## throws
**PT-BR**  
throws é uma palavra-chave em Java que é usada na assinatura de um método para indicar que este método pode lançar uma das exceções do tipo listado. O chamador desses métodos deve lidar com a exceção usando um bloco try-catch.

Em um programa, se houver uma chance de gerar uma exceção, o compilador sempre nos avisa sobre isso e, obrigatoriamente, devemos lidar com essa exceção verificada, caso contrário, receberemos um erro de tempo de compilação dizendo que a exceção não relatada XXX deve ser capturada ou declarada para ser lançada. Para evitar esse erro de tempo de compilação, podemos lidar com a exceção de duas maneiras:

1. Usando try catch
2. Usando a palavra-chave throws

Pontos importantes a serem lembrados sobre a palavra-chave throws:

- A palavra-chave throws é necessária apenas para exceções verificadas e o uso da palavra-chave throws para exceções não verificadas é sem sentido.
- A palavra-chave throws é necessária apenas para convencer o compilador e o uso da palavra-chave throws não impede a terminação anormal do programa.
- Com a ajuda da palavra-chave throws, podemos fornecer informações ao chamador do método sobre a exceção.

***

**EN-US**  
throws is a keyword in Java that is used in the signature of a method to indicate that this method might throw one of the listed type exceptions. The caller to these methods has to handle the exception using a try-catch block. 

In a program, if there is a chance of raising an exception then the compiler always warns us about it and compulsorily we should handle that checked exception, Otherwise, we will get compile time error saying unreported exception XXX must be caught or declared to be thrown. To prevent this compile time error we can handle the exception in two ways: 

1. By using try catch
2. By using the throws keyword

Important Points to Remember about throws Keyword:

- throws keyword is required only for checked exceptions and usage of the throws keyword for unchecked exceptions is meaningless.
- throws keyword is required only to convince the compiler and usage of the throws keyword does not prevent abnormal termination of the program.
- With the help of the throws keyword, we can provide information to the caller of the method about the exception.

***

Exemplo / Example:
```java
class ThrowsExecp {
 
    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }
 
    public static void main(String args[])
    {
        try {
            fun();
        }
        catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        }
    }
}
```

Saída / Output:
```
Inside fun().
caught in main.
```