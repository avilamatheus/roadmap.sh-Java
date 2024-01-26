# Java Try Catch Block

**PT-BR**  
Em Java exceção é um “evento indesejado ou inesperado”, que ocorre durante a execução do programa. Quando ocorre uma exceção, a execução do programa é encerrada. Para evitar essas condições de término podemos usar o bloco try catch em Java.  

***

**EN-US**  
In Java exception is an “unwanted or unexpected event”, that occurs during the execution of the program. When an exception occurs, the execution of the program gets terminated. To avoid these termination conditions we can use try catch block in Java. 

## Blocos e Palavras-chave Usadas Para Tratamento de Exceção / Blocks and Keywords Used For Exception Handling

## try
**PT-BR**  
O bloco try contém um conjunto de instruções onde uma exceção pode ocorrer.

***

**EN-US**  
The try block contains a set of statements where an exception can occur.

***

ex:
```java
try {
    // codigo que pode gerar uma exceção (PT-BR)
    // code that may raise exception (EN-US)
}
```

## catch
**PT-BR**  
O bloco catch é usado para lidar com a condição incerta de um bloco try. Um bloco try é sempre seguido por um bloco catch, que lida com a exceção que ocorre no bloco try associado.

***

**EN-US**  
The catch block is used to handle the uncertain condition of a try block. A try block is always followed by a catch block, which handles the exception that occurs in the associated try block.

***
ex: 
```java
try {
    // codigo que pode gerar uma exceção (PT-BR)
    // code that may raise exception (EN-US)
}
catch(Exception e) {
    // codigo para lidar com a exceção (PT-BR)
    // code to handle the exception (EN-US)
}
```

## finally
**PT-BR**  
É executado após o bloco catch. Usamos para colocar algum código comum (a ser executado independentemente de ter ocorrido uma exceção ou não) quando existem vários blocos catch.

***

**EN-US**  
It is executed after the catch block. We use it to put some common code (to be executed irrespective of whether an exception has occurred or not ) when there are multiple catch blocks. 

***
ex:
```java
class Division {
    public static void main(String[] args)
    {
        int a = 10, b = 5, c = 5, result;
        try {
            result = a / (b - c);
            System.out.println("result" + result);
        }
 
        catch (ArithmeticException e) {
            System.out.println("Exception caught:Division by zero");
        }
 
        finally {
            System.out.println("I am in final block");
        }
    }
}
```
Saída / Output:
```
Exception caught:Division by zero
I am in final block
```

## throw
**PT-BR**  
A palavra-chave throw é usada para transferir o controle do bloco try para o bloco catch.

***

**EN-US**  
The throw keyword is used to transfer control from the try block to the catch block. 

***
Ex:
```java
class Division {
    public static void main(String[] args)
    {
        int a = 10, b = 5, c = 5, result;
        try {
            if ((b - c) == 0)
                throw new ArithmeticException();
            else {
                result = a / (b - c);
                System.out.println("result" + result);
            }
        }
 
        catch (ArithmeticException e) {
            System.out.println("Exception caught:Division by zero");
        }
 
        finally {
            System.out.println("I am in final block");
        }
    }
}
```

Saída / Output:
```
Exception caught:Division by zero
I am in final block
```

## throws
**PT-BR**  
A palavra-chave throws é usada para tratamento de exceções sem bloco try & catch. Ele especifica as exceções que um método pode lançar para o chamador, que são exceções que o próprio método não trata.

***

**EN-US**  
The throws keyword is used for exception handling without try & catch block. It specifies the exceptions that a method can throw to the caller and does not handle itself.

***  
Ex:
```java
class ThrowsExecp {
    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }
 
    // This is a caller function 
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