# Tipos de dados e Variaveis / Data Types and Variables

## O que é uma variável em Java? / What is a Variable in Java? 
**PT-BR**  
Variável em Java é um recipiente de dados que armazena os valores de dados durante a execução do programa Java. Cada variável é atribuída um tipo de dados que designa o tipo e a quantidade de valor que ela pode conter. Variável é um nome de localização de memória dos dados. As variáveis Java têm principalmente três tipos: Local, Instância e Estática.

Para usar uma variável em um programa, você precisa executar 2 etapas

1. Declaração de variável
2. Inicialização de variável

*** 

**EN-US**  
Variable in Java is a data container that stores the data values during Java program execution. Every variable is assigned data type which designates the type and quantity of value it can hold. Variable is a memory location name of the data. The Java variables have mainly three types : Local, Instance and Static.

In order to use a variable in a program you to need to perform 2 steps

1. Variable Declaration
2. Variable Initialization

## Declaração de variável / Variable Declaration

**PT-BR**  
Para declarar uma variável, você deve especificar o tipo de dados e dar à variável um nome exclusivo, exemplo:

```
int count;
int a,b,c;
float pi;
double d;
char a;
```

***

**EN-US**  
To declare a variable, you must specify the data type & give the variable a unique name, example:

```
int count;
int a,b,c;
float pi;
double d;
char a;
```

## Inicialização de variável / Variable Initialization

**PT-BR**  
Para inicializar uma variável, você deve atribuir a ela um valor válido, exemplo:

```
int count = 10;
int a = 10, b = 20, c = 30;
float pi = 3.14;
double d = 10.245;
char a = 'A';
```

***

**EN-US**  
To initialize a variable, you must assign it a valid value, example:

```
int count = 10;
int a = 10, b = 20, c = 30;
float pi = 3.14;
double d = 10.245;
char a = 'A';
```

## Tipos de variáveis / Types of variables

**PT-BR**  
Em Java, existem três tipos de variáveis:

1. Variáveis Locais
    - Variáveis locais são variáveis que são declaradas dentro do corpo de um método.

2. Variáveis de Instância
    - Variáveis de instância são definidas sem a palavra-chave STATIC. Elas são definidas fora de uma declaração de método. Elas são específicas do objeto e são conhecidas como variáveis de instância.

3. Variáveis Estáticas
    - Variáveis estáticas são inicializadas apenas uma vez, no início da execução do programa. Essas variáveis devem ser inicializadas primeiro, antes da inicialização de quaisquer variáveis de instância.

Exemplo:

```
class Test {
    static int a = 1; //static variable  
    int data = 99; //instance variable  
    void method() {
        int b = 90; //local variable  
    }
}
```

***

**EN-US**  
In Java, there are three types of variables:

1. Local Variables
    - Local Variables are a variable that are declared inside the body of a method.

2. Instance Variables
    - Instance variables are defined without the STATIC keyword. They are defined Outside a method declaration. They are Object specific and are known as instance variables.
3. Static Variables
    - Static variables are initialized only once, at the start of the program execution. These variables should be initialized first, before the initialization of any instance variables.

Example:

```
class Test {
    static int a = 1; //static variable  
    int data = 99; //instance variable  
    void method() {
        int b = 90; //local variable  
    }
}
```

## O que é Tipos de Dados em Java? / What is Data Types in Java?

**PT-BR**  
Tipos de dados em Java são definidos como especificadores que alocam diferentes tamanhos e tipos de valores que podem ser armazenados na variável ou em um identificador. Java possui um conjunto rico de tipos de dados. Os tipos de dados em Java podem ser divididos em duas partes:

1. Tipos de Dados Primitivos: que incluem inteiro, caractere, booleano e ponto flutuante
    - Os tipos de dados primitivos são predefinidos e disponíveis dentro da linguagem Java. Os valores primitivos não compartilham estado com outros valores primitivos.
    - Existem 8 tipos primitivos: byte, short, int, long, char, float, double e booleano
    
    ```
    byte (1 byte)
    short (2 bytes)
    int (4 bytes)
    long (8 bytes)
    float (4 bytes)
    double (8 bytes)
    char (2 bytes)
    boolean (1 byte) (true/false)
    ```

2. Tipos de Dados Não Primitivos: que incluem classes, matrizes e interfaces.

***

**EN-US**  
Data Types in Java are defined as specifiers that allocate different sizes and types of values that can be stored in the variable or an identifier. Java has a rich set of data types. Data types in Java can be divided into two parts :

1. Primitive Data Types: which include integer, character, boolean, and float
    - Primitive Data Types are predefined and available within the Java language. Primitive values do not share state with other primitive values.
    - There are 8 primitive types: byte, short, int, long, char, float, double, and boolean
    
    ```
    byte (1 byte)
    short (2 bytes)
    int (4 bytes)
    long (8 bytes)
    float (4 bytes)
    double (8 bytes)
    char (2 bytes)
    boolean (1 byte) (true/false)
    ```


2. Non-primitive Data Types: which include classes, arrays and interfaces.
