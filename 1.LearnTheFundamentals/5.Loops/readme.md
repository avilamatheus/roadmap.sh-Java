# Loops

## For Loop

**PT-BR**  
O laço for em Java é usado para iterar uma parte do programa várias vezes. Se o número de iterações for fixo, é recomendável usar o laço for.

Existem dois tipos de laços for em Java:
- Laço for simples
- Laço for-each ou aprimorado

***

**EN-US**  
The Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop.

There are two types of for loops in Java:
- Simple for Loop
- For-each or Enhanced for Loop

### Laço for simples / Simple for Loop
**PT-BR**  
Um laço for simples é o mesmo que C/C++. Podemos inicializar a variável, verificar a condição e incrementar/decrementar o valor. Consiste em quatro partes:

1. Inicialização: é a condição inicial que é executada uma vez quando o laço começa. Aqui, podemos inicializar a variável, ou podemos usar uma variável já inicializada. É uma condição opcional.

2. Condição: é a segunda condição que é executada cada vez para testar a condição do laço. Ele continua a execução até que a condição seja falsa. Deve retornar um valor booleano, verdadeiro ou falso. É uma condição opcional.

3. Incremento/Decremento: ele incrementa ou decrementa o valor da variável. É uma condição opcional.

4. Declaração: a declaração do laço é executada cada vez até que a segunda condição seja falsa.

Sintaxe:
```java
for(inicialização; condição; incremento/decremento){    
    //declaração ou código a ser executado    
}    
```

Exemplo de um laço for simples que imprime os números de 1 a 10:
```java
for(int i=1;i<=10;i++){  
        System.out.println(i);  
    }  
```
***

**EN-US**  
A simple for loop is the same as C/C++. We can initialize the variable, check condition and increment/decrement value. It consists of four parts:

1. Initialization: It is the initial condition which is executed once when the loop starts. Here, we can initialize the variable, or we can use an already initialized variable. It is an optional condition.
2. Condition: It is the second condition which is executed each time to test the condition of the loop. It continues execution until the condition is false. It must return boolean value either true or false. It is an optional condition.
3. Increment/Decrement: It increments or decrements the variable value. It is an optional condition.
4. Statement: The statement of the loop is executed each time until the second condition is false.

Syntax:
```java
for(initialization; condition; increment/decrement){    
    //statement or code to be executed    
}    
```

Example of a simple for loop that prints the numbers from 1 to 10:
```java
for(int i=1;i<=10;i++){  
        System.out.println(i);  
    }  
```

### Laço for-each / For-each Loop
**PT-BR**  
O laço for-each é usado para percorrer array ou coleção em Java. É mais fácil de usar do que o laço for simples porque não precisamos incrementar o valor e usar a notação de subscrito.

Ele funciona com base nos elementos e não no índice. Ele retorna o elemento um por um na variável definida.

Sintaxe:
```java
for(data_type variable : array | collection){  
    //code to be executed  
}  
```

Exemplo de laço for-each:
```java
int arr[]={12,23,44,56,78};
for(int i:arr){
    System.out.println(i);
}
```


***

**EN-US**  
The for-each loop is used to traverse array or collection in Java. It is easier to use than simple for loop because we don't need to increment value and use subscript notation.

It works on the basis of elements and not the index. It returns element one by one in the defined variable.

Syntax:
```java
for(data_type variable : array | collection){  
    //code to be executed  
}  
```

Example of for-each loop:
```java
int arr[]={12,23,44,56,78};
for(int i:arr){
    System.out.println(i);
}
```

## While Loop
**PT-BR**  
O laço while em Java é usado para iterar uma parte do programa repetidamente até que a condição booleana especificada seja verdadeira. Assim que a condição booleana se tornar falsa, o laço para automaticamente.

O laço while é considerado como uma declaração if repetida. Se o número de iteração não for fixo, é recomendável usar o laço while.

Sintaxe:
```java
while(condição){  
    //código a ser executado  
}  
```

Exemplo de laço while que imprime os números de 1 a 10:
```java
public static void main(String[] args) {
    int i=1;
    while(i<=10){
        System.out.println(i);
        i++;
    }
}
```

***  

**EN-US**  
The Java while loop is used to iterate a part of the program repeatedly until the specified Boolean condition is true. As soon as the Boolean condition becomes false, the loop automatically stops.

The while loop is considered as a repeating if statement. If the number of iteration is not fixed, it is recommended to use the while loop.

Syntax:
```java
while(condition){  
    //code to be executed  
}  
```

Example of while loop that prints numbers from 1 to 10:
```java
public static void main(String[] args) {
    int i=1;
    while(i<=10){
        System.out.println(i);
        i++;
    }
}
```

## Do-While Loop

**PT-BR**  
O laço do-while em Java é usado para iterar uma parte do programa repetidamente até que a condição booleana especificada seja verdadeira. Assim que a condição booleana se tornar falsa, o laço para automaticamente.

O laço do-while é chamado de laço de controle de saída. Portanto, ao contrário do laço while e do laço for, o do-while verifica a condição no final do corpo do laço. O laço do-while em Java é executado pelo menos uma vez porque a condição é verificada após o corpo do laço.

Sintaxe:
```java
do{  
    //código a ser executado
}while(condição);
```

***

**EN-US**  
The Java do-while loop is used to iterate a part of the program repeatedly, until the specified condition is true. If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use a do-while loop.

Java do-while loop is called an exit control loop. Therefore, unlike while loop and for loop, the do-while check the condition at the end of loop body. The Java do-while loop is executed at least once because condition is checked after loop body.

Syntax:
```java
do{  
    //code to be executed
}while(condition);
```

Example of do-while loop that prints numbers from 1 to 10:
```java
public static void main(String[] args) {
    int i=1;
    do{
        System.out.println(i);
        i++;
    }while(i<=10);
}
```