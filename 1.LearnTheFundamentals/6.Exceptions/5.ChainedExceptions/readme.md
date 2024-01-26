# Exceções encadeadas em Java / Chained Exceptions in Java
**PT-BR**  
Exceções encadeadas permitem relacionar uma exceção com outra exceção, ou seja, uma exceção descreve a causa de outra exceção. Por exemplo, considere uma situação em que um método lança uma ArithmeticException por causa de uma tentativa de divisão por zero, mas a causa real da exceção foi um erro de E/S que causou o divisor ser zero. O método lançará apenas ArithmeticException para o chamador. Portanto, o chamador não saberá a causa real da exceção. A exceção encadeada é usada nesse tipo de situação.

Construtores da classe Throwable que suportam exceções encadeadas em java:

1. **Throwable(Throwable cause)**: onde a causa é a exceção que causa a exceção atual.
2. **Throwable(String msg, Throwable cause)**: onde msg é a mensagem de exceção e a causa é a exceção que causa a exceção atual.

Métodos da classe Throwable que suportam exceções encadeadas em java:

1. Método **getCause()**: Este método retorna a causa real de uma exceção.
2. Método **initCause(Throwable cause)**: Este método define a causa para a exceção de chamada.

***

**EN-US**  
Chained Exceptions allows to relate one exception with another exception, i.e one exception describes cause of another exception. For example, consider a situation in which a method throws an ArithmeticException because of an attempt to divide by zero but the actual cause of exception was an I/O error which caused the divisor to be zero. The method will throw only ArithmeticException to the caller. So the caller would not come to know about the actual cause of exception. Chained Exception is used in such type of situations.  

Constructors Of Throwable class Which support chained exceptions in java:

1. **Throwable(Throwable cause)**: Where cause is the exception that causes the current exception.
2. **Throwable(String msg, Throwable cause)**: Where msg is the exception message and cause is the exception that causes the current exception.

Methods Of Throwable class Which support chained exceptions in java:

1. **getCause()** method: This method returns actual cause of an exception.
2. **initCause(Throwable cause)** method: This method sets the cause for the calling exception.
***

Ex:
```java
public class ExceptionHandling 
{ 
    public static void main(String[] args) 
    { 
        try
        { 
            // Creating an exception 
            NumberFormatException ex = 
                       new NumberFormatException("Exception"); 
  
            // Setting a cause of the exception 
            ex.initCause(new NullPointerException( 
                      "This is actual cause of the exception")); 
  
            // Throwing an exception with cause. 
            throw ex; 
        } 
  
        catch(NumberFormatException ex) 
        { 
            // displaying the exception 
            System.out.println(ex); 
  
            // Getting the actual cause of the exception 
            System.out.println(ex.getCause()); 
        } 
    } 
} 
```

Saída/Output:
```bash
java.lang.NumberFormatException: Exception
java.lang.NullPointerException: This is actual cause of the exception
```