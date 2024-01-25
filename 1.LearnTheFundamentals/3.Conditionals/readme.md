# Condicionais / Conditionals

## Introdução / Introduction
**PT-BR**  
Declarações condicionais, expressões ou simplesmente condicionais são recursos de linguagens de programação que dizem ao computador para executar determinadas ações, desde que certas condições sejam atendidas.

As declarações condicionais são usadas nas várias linguagens de programação para instruir o computador sobre a decisão a tomar quando dadas algumas condições. Essas decisões são tomadas se e somente se as condições pré-estabelecidas forem verdadeiras ou falsas, dependendo das funções que o programador tem em mente.

Todas as linguagens de programação têm sintaxe de expressão condicional (embora a sintaxe seja ligeiramente diferente de uma linguagem de programação para outra).

Por exemplo, uma declaração condicional típica do Java:

```java
if (condition) {
    // do something
} else if (condition2) {
    // do something else
} else {
    // do something else
}
```

Além das declarações condicionais if, else if e else (como ilustrado no exemplo acima), o Java também possui uma declaração condicional switch case, que será discutida posteriormente.

***

**EN-US**  
Conditional statements, expressions, or simply conditionals are features of programming languages that tell the computer to execute certain actions, provided certain conditions are met.

Conditional statements are used through the various programming languages to instruct the computer on the decision to make when given some conditions. These decisions are made if and only if the pre-stated conditions are either true or false, depending on the functions the programmer has in mind.

All programming languages have conditional expression syntax (although the syntax slightly differs from one programming language to the others). 

For example, a typical Java conditional statement:
```java
if (condition) {
    // do something
} else if (condition2) {
    // do something else
} else {
    // do something else
}
```

Besides if, else if, and else conditional statements (as illustrated in the example above), Java also has a switch case conditional statement, which will be discussed later.

## "if"
**PT-BR**  
A instrução if é a primeira condição que um programador usa para abrir o solo das instruções condicionais. A sintaxe if é tão simples quanto escrever if com chaves abertas e fechadas, seguido pela condição que o programador pretende comparar ou verificar. A expressão if simplesmente compara se a condição (ou condições) contida entre os parênteses é verdadeira ou falsa.

se verdadeiro, o bloco de código if é executado. Se falso, a execução passa para o próximo bloco para verificar.

```java
if(day == "Monday") {
            System.out.println("f***");
}
```

***

**EN-US**  
The if statement is the first condition a programmer uses to open the ground of the conditional statements. if syntax is as simple as writing if with open and close braces, followed by the condition the programmer intends to compare or check. The if expression simply compares whether the condition (or conditions) enclosed in the braces are true or false.

if true, the ifcode block executes. If false, the execution moves to the next block to check.

```java
if(day == "Monday") {
            System.out.println("f***");
}
```

## "else if"
**PT-BR**  
Embora a instrução if possa ser usada para verificar uma condição, else if é usada para verificar várias condições. A instrução else if, tem sintaxe semelhante à instrução if, seguida pelo bloco else if. Por exemplo:
    
```java
if (condition) {
    // do something if condition is true
} else if (condition2) {
    // do something else if condition2 is true
}
```

***

**EN-US**  
While the if statement can be used to check one condition, else if is used to check multiple conditions. The else if statement, has syntax similar to the if statement, then followed by the else if block. For example:
    
```java
if (condition) {
    // do something if condition is true
} else if (condition2) {
    // do something else if condition2 is true
}
```

## "else"
**PT-BR**  
A instrução else é a instrução padrão de todas as expressões condicionais, em todas as linguagens de programação. Ou seja, quando todas as condições if e else if retornam false (de cima para baixo), então a instrução do bloco else final (padrão) é executada.

```java
if (condition) {
    // do something if condition is true
} else if (condition2) {
    // do something else if condition2 is true
} else {
    // do something else if all conditions are false
}
```

***

**EN-US**  
The else statement is the default statement of all the conditional expressions, in all programming languages. That is, when all the if and else if conditions return false (from top to bottom), then the final (default) else block statement executes.

```java
if (condition) {
    // do something if condition is true
} else if (condition2) {
    // do something else if condition2 is true
} else {
    // do something else if all conditions are false
}
```

## "switch case"
**PT-BR**  
A instrução switch Java executa uma instrução de várias condições. A instrução switch funciona com tipos byte, short, int, long, enum, String e alguns tipos de wrapper como Byte, Short, Int e Long. Desde o Java 7, você pode usar strings na instrução switch.

Em outras palavras, a instrução switch testa a igualdade de uma variável em relação a vários valores.

Pontos a lembrar
- Cada instrução case pode ter uma instrução break que é opcional. Quando o controle atinge a instrução break, ele pula o controle após a expressão switch. Se uma instrução break não for encontrada, ela executará o próximo caso.
- O valor do caso pode ter um "default" que é opcional.

Sintaxe básica:

```java
switch(expression){    
    case value1:    
        //code to be executed;    
        break;  //optional  
    case value2:    
        //code to be executed;    
        break;  //optional  
        ......    
        
    default:     
        //code to be executed if all cases are not matched;  
}
```

Sintaxe "Enhanced" do switch:

```java
switch(expression){
    case value1 -> {
        //code to be executed;
        break;
    }
    case value2 -> {
        //code to be executed;
        break;
    }
    default -> {
        //code to be executed;
        break;
    }
}
```

***

**EN-US**  
The Java switch statement executes one statement from multiple conditions. The switch statement works with byte, short, int, long, enum types, String and some wrapper types like Byte, Short, Int, and Long. Since Java 7, you can use strings in the switch statement.

In other words, the switch statement tests the equality of a variable against multiple values. 

Points to Remember
- Each case statement can have a break statement which is optional. When control reaches to the break statement, it jumps the control after the switch expression. If a break statement is not found, it executes the next case.
- The case value can have a default label which is optional.

Basic Syntax:

```java
switch(expression){    
    case value1:    
        //code to be executed;    
        break;  //optional  
    case value2:    
        //code to be executed;    
        break;  //optional  
        ......    
        
    default:     
        //code to be executed if all cases are not matched;  
}
```

Enhanced Switch syntax:

```java
switch(expression){
    case value1 -> {
        //code to be executed;
        break;
    }
    case value2 -> {
        //code to be executed;
        break;
    }
    default -> {
        //code to be executed;
        break;
    }
}
```
