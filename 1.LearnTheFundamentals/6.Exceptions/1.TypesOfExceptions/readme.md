# Tipos de exceções em Java com exemplos / Types of Exception in Java with Examples

## ArithmeticException
**PT-BR**  
É lançada quando ocorre uma condição excepcional em uma operação aritmética.

***

**EN-US**  
It is thrown when an exceptional condition has occurred in an arithmetic operation.

***

Exemplo / Example:
```java
class ArithmeticException_Demo 
{ 
	public static void main(String args[]) 
	{ 
		try { 
			int a = 30, b = 0; 
			int c = a/b; // cannot divide by zero 
			System.out.println ("Result = " + c); 
		} 
		catch(ArithmeticException e) { 
			System.out.println ("Can't divide a number by 0"); 
		} 
	} 
} 
```

Saída / Output:
```
Can't divide a number by 0
```

## ArrayIndexOutOfBoundsException
**PT-BR**  
É lançada para indicar que um array foi acessado com um índice ilegal. O índice é negativo ou maior ou igual ao tamanho do array.

***

**EN-US**  
It is thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.

***

Exemplo / Example:
```java
class ArrayIndexOutOfBound_Demo 
{ 
	public static void main(String args[]) 
	{ 
		try{ 
			int a[] = new int[5]; 
			a[6] = 9; // accessing 7th element in an array of 
					// size 5 
		} 
		catch(ArrayIndexOutOfBoundsException e){ 
			System.out.println ("Array Index is Out Of Bounds"); 
		} 
	} 
} 
```

Saída / Output:
```
Array Index is Out Of Bounds
```

## ClassNotFoundException
**PT-BR**  
É lançada quando uma aplicação tenta carregar em tempo de execução uma classe através de seu nome, mas não consegue encontrá-la.

***

**EN-US**  
This Exception is raised when we try to access a class whose definition is not found

***

Exemplo / Example:
```java
public class ClassNotFoundException_Demo 
{ 
	public static void main(String[] args) { 
		try{ 
			Class.forName("Class1"); // Class1 is not defined 
		} 
		catch(ClassNotFoundException e){ 
			System.out.println(e); 
			System.out.println("Class Not Found..."); 
		} 
	} 
}
```

Saída / Output:
```
java.lang.ClassNotFoundException: Class1
Class Not Found...
```

## FileNotFoundException
**PT-BR**  
Essa exceção é lançada quando um arquivo não é acessível ou não abre.

***

**EN-US**  
This Exception is raised when a file is not accessible or does not open.

***

Exemplo / Example:
```java
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
class File_notFound_Demo { 

	public static void main(String args[]) { 
		try { 

			// Following file does not exist 
			File file = new File("E://file.txt"); 

			FileReader fr = new FileReader(file); 
		} catch (FileNotFoundException e) { 
		System.out.println("File does not exist"); 
		} 
	} 
} 

```

Saída / Output:
```
File does not exist
```

## IOException
**PT-BR**  
É lançada quando uma operação de entrada-saída falhou ou foi interrompida

***

**EN-US**  
It is thrown when an input-output operation failed or interrupted

***

Exemplo / Example:
```java
class IOException_Demo { 

	public static void main(String[] args) 
	{ 

		// Create a new scanner with the specified String 
		// Object 
		Scanner scan = new Scanner("Hello Geek!"); 

		// Print the line 
		System.out.println("" + scan.nextLine()); 

		// Check if there is an IO exception 
		System.out.println("Exception Output: "
						+ scan.ioException()); 

		scan.close(); 
	} 
}
```

Saída / Output:
```
Hello Geek! 
Exception Output: null
```

## InterruptedException
**PT-BR**  
É lançada quando uma thread está esperando, dormindo ou fazendo algum processamento, e é interrompida.

***

**EN-US**  
It is thrown when a thread is waiting, sleeping, or doing some processing, and it is interrupted.

## NoSuchFieldException
**PT-BR**  
É lançada quando uma classe não contém o campo (ou variável) especificado

***

**EN-US**  
It is thrown when a class does not contain the field (or variable) specified.

## NoSuchMethodException
**PT-BR**  
É lançada quando um método não é encontrado.

***

**EN-US**  
It is thrown when accessing a method that is not found.


## NullPointerException
**PT-BR**  
Essa exceção é lançada ao se referir aos membros de um objeto nulo. Nulo representa nada.

***

**EN-US**  
This exception is raised when referring to the members of a null object. Null represents nothing.

***

Exemplo / Example:
```java
class NullPointer_Demo 
{ 
    public static void main(String args[]) 
    { 
        try { 
            String a = null; //null value 
            System.out.println(a.charAt(0)); 
        } catch(NullPointerException e) { 
            System.out.println("NullPointerException.."); 
        } 
    } 
} 
```

Saída / Output:
```
NullPointerException..
```


## NumberFormatException
**PT-BR**  
Essa exceção é lançada quando um método não consegue converter uma string em um formato numérico.

***

**EN-US**  
This exception is raised when a method could not convert a string into a numeric format.
***

Exemplo / Example:
```java
class  NumberFormat_Demo 
{ 
    public static void main(String args[]) 
    { 
        try { 
            // "akki" is not a number 
            int num = Integer.parseInt ("akki") ; 
  
            System.out.println(num); 
        } catch(NumberFormatException e) { 
            System.out.println("Number format exception"); 
        } 
    } 
} 
```

Saída / Output:
```
Number format exception
```


## RuntimeException
**PT-BR**  
Isso representa uma exceção que ocorre durante a execução.

***

**EN-US**  
This represents an exception that occurs during runtime.


## StringIndexOutOfBoundsException
**PT-BR**  
É lançada pelos métodos da classe String para indicar que um índice é negativo ou maior que o tamanho da string

***

**EN-US**  
It is thrown by String class methods to indicate that an index is either negative or greater than the size of the string
***

Exemplo / Example:
```java
class StringIndexOutOfBound_Demo 
{ 
    public static void main(String args[]) 
    { 
        try { 
            String a = "This is like chipping "; // length is 22 
            char c = a.charAt(24); // accessing 25th element 
            System.out.println(c); 
        } 
        catch(StringIndexOutOfBoundsException e) { 
            System.out.println("StringIndexOutOfBoundsException"); 
        } 
    } 
} 
```

Saída / Output:
```
StringIndexOutOfBoundsException
```



## IllegalArgumentException
**PT-BR**  
Essa exceção lançará o erro ou a instrução de erro quando o método receber um argumento que não se encaixa com precisão na relação ou condição dada. Ele vem sob a exceção não verificada.

***

**EN-US**  
This exception will throw the error or error statement when the method receives an argument which is not accurately fit to the given relation or condition. It comes under the unchecked exception. 
***

Exemplo / Example:
```java
class GFG { 
   public static void print(int a)  
    { 
         if(a>=18){ 
          System.out.println("Eligible for Voting"); 
          } 
          else{ 
     
          throw new IllegalArgumentException("Not Eligible for Voting"); 
                                     
          } 
        
    } 
    public static void main(String[] args) { 
         GFG.print(14);  
    } 
} 
```

Saída / Output:
```
Exception in thread "main" java.lang.IllegalArgumentException: Not Eligible for Voting
at GFG.print(File.java:13)
at GFG.main(File.java:19)
```


## IllegalStateException
**PT-BR**  
Essa exceção lançará o erro ou a instrução de erro quando o método não for acessado para a operação específica na aplicação. Ele vem sob a exceção não verificada.

***

**EN-US**  
This exception will throw an error or error message when the method is not accessed for the particular operation in the application. It comes under the unchecked exception.
***

Exemplo / Example:
```java
class GFG { 
      public static void  print(int a,int b) 
     { 
         System.out.println("Addition of Positive Integers :"+(a+b)); 
     } 
      
    public static void main(String[] args) { 
    int n1=7; 
    int n2=-3; 
     if(n1>=0 && n2>=0) { 
         GFG.print(n1,n2); 
     } 
     else { 
         throw new IllegalStateException("Either one or two numbers are not Positive Integer"); 
     } 
    } 
} 
```

Saída / Output:
```
Exception in thread "main" java.lang.IllegalStateException: Either one or two numbers are not Positive Integer
at GFG.main(File.java:20)
```