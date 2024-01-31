# Arrays
**PT-BR**  
Um array é uma coleção de itens do mesmo tipo de variável que são armazenados em locais de memória contíguos. É uma das estruturas de dados mais populares e simples e é frequentemente usada para implementar outras estruturas de dados. Cada item em um array é indexado a partir de 0.

***

**EN-US**  
An array is a collection of items of the same variable type that are stored at contiguous memory locations. It’s one of the most popular and simple data structures and is often used to implement other data structures. Each item in an array is indexed starting with 0.

***

## Terminologias básicas de array / Basic terminologies of array
**PT-BR**  
- **Índice do array**: Em um array, os elementos são identificados por seus índices. O índice do array começa em 0 (usando a linguagem Java como exemplo).
- **Elemento do array**: Os elementos são itens armazenados em um array e podem ser acessados por seu índice.
- **Comprimento do array**: O comprimento de um array é determinado pelo número de elementos que ele pode conter.

***

**EN-US**  
- **Array Index**: In an array, elements are identified by their indexes. Array index starts at 0 (using the Java language as an example).
- **Array element**: Elements are items stored in an array and can be accessed by their index.
- **Array Length**: The length of an array is determined by the number of elements it can contain. 

***

## Representação de Array / Representation of Array
**PT-BR**  
A representação de um array pode ser definida por sua declaração. Uma declaração significa alocar memória para um array de um tamanho dado. Arrays podem ser declarados de várias maneiras em diferentes linguagens. No caso da linguagem Java, a declaração de um array é feita da forma ilustrada abaixo.
***

**EN-US**  
The representation of an array can be defined by its declaration. A declaration means allocating memory for an array of a given size. Arrays can be declared in various ways in different languages. In the case of the Java language, the declaration of an array is done as illustrated below.

***
```java
/* Arrays in Java can be categorized as static or dynamic.
Static Arrays are declared and assigned values before runtime. 
*/

// The syntax for declaring a static array is:
// <data type>[] <variable name> = {<data1>, <data2>, ..., <dataN>};
  
// Example:
int[] arr = {2, 5, 6, 9, 7, 4, 3};

// The syntax for declaring a dynamic array is:

// <data type>[] <variable name> = new <data type>[<Total Number of elements to be stored in array>];
// Example:
int[] dynamicArr = new int[10]; // Store integer elements
String[] stringArr = new String[5]; // Store elements of type String
```
***
![Array Representation](https://media.geeksforgeeks.org/wp-content/uploads/20220721080308/array.png)
***

## Porque usar arrays? / Why use arrays?
**PT-BR**  
Suponha que haja uma turma de cinco alunos e se tivermos que manter registros de suas notas no exame, podemos fazer isso declarando cinco variáveis individuais e mantendo o controle dos registros, mas e se o número de alunos se tornar muito grande, seria difícil manipular e manter os dados.

O que isso significa é que podemos usar variáveis normais (v1, v2, v3, ..) quando temos um pequeno número de objetos. Mas se quisermos armazenar um grande número de instâncias, torna-se difícil gerenciá-las com variáveis normais. A ideia de um array é representar muitas instâncias em uma variável.

***

**EN-US**  
Assume there is a class of five students and if we have to keep records of their marks in examination then, we can do this by declaring five variables individual and keeping track of records but what if the number of students becomes very large, it would be challenging to manipulate and maintain the data.

What it means is that, we can use normal variables (v1, v2, v3, ..) when we have a small number of objects. But if we want to store a large number of instances, it becomes difficult to manage them with normal variables. The idea of an array is to represent many instances in one variable.

***
![Array](https://media.geeksforgeeks.org/wp-content/uploads/20220728175153/Needforarray-660x379.png)
***

## Tipos de arrays / Types of arrays
### 1. Array Unidimensional / One-dimensional Array
**PT-BR**  
Você pode imaginar um array 1d como uma linha, onde os elementos são armazenados um após o outro.

***

**EN-US**  
You can imagine a 1d array as a row, where elements are stored one after another.

***
![1d Array](https://media.geeksforgeeks.org/wp-content/uploads/20220721112600/1Darray.png)
***
```java
// 1d static array
int[] staticArray = {1, 2, 3, 4, 5};

// 1d dynamic array
int[] dynamicArray = new int[7];
```
***

### 2. Array Bidimensional / Two-dimensional Array
**PT-BR**  
Arrays Bidimensionais podem ser considerados como um array de arrays ou como uma matriz composta por linhas e colunas.

***

**EN-US**  
2-D Multidimensional arrays can be considered as an array of arrays or as a matrix consisting of rows and columns.
***
![2d Array](https://media.geeksforgeeks.org/wp-content/uploads/20220721112715/2Darray.png)
***
```java
// 2D static array
int[][] staticArray = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// 2D dynamic array
int[][] dynamicArray = new int[3][3];
```

### 3. Array Tridimensional / Three-dimensional Array
**PT-BR**  
Um array tridimensional contém três dimensões, portanto, pode ser considerado um array de arrays bidimensionais.

***

**EN-US**  
A 3-D Multidimensional array contains three dimensions, so it can be considered an array of two-dimensional arrays.
***
![3d Array](https://media.geeksforgeeks.org/wp-content/uploads/20230321164742/3D-array.png)
***
```java
// 3D static array
int[][][] staticArray = {
    {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
    {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
    {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
};

// 3D dynamic array
int[][][] dynamicArray = new int[3][3][3];
```
***

## Características de Arrays /  Characteristics of Arrays
**PT-BR**  
- **Elementos Homogêneos**: Todos os elementos dentro de um array devem ser do mesmo tipo de dados. Isso significa que um array é capaz de armazenar apenas elementos de um tipo específico, como inteiros, strings, objetos, entre outros.

- **Alocação de Memória Contígua**: Em Java, assim como em muitas linguagens de programação, os elementos em um array são armazenados em locais de memória contíguos. Isso facilita o acesso eficiente aos elementos do array.

- **Indexação Baseada em Zero**: Java utiliza indexação baseada em zero para arrays, o que significa que o primeiro elemento é acessado com um índice de 0, o segundo com um índice de 1 e assim por diante. Por exemplo, em um array int[] numeros, numeros[0] acessaria o primeiro elemento.

- **Acesso Aleatório**: Os arrays proporcionam acesso de tempo constante (O(1)) aos elementos. Isso significa que, independentemente do tamanho do array, o tempo necessário para acessar qualquer elemento é constante com base em seu índice.

***

**EN-US**  
- **Homogeneous Elements**: In Java, all elements within an array must be of the same data type. This means that an array in Java is capable of storing only elements of a specific type, such as integers, strings, objects, and so on.

- **Contiguous Memory Allocation**: In Java, as in many programming languages, elements in an array are stored at contiguous memory locations. This facilitates efficient access to the elements of the array.

- **Zero-Based Indexing**: Java uses zero-based indexing for arrays, which means that the first element is accessed with an index of 0, the second with an index of 1, and so on. For example, in an int[] numbers array, numbers[0] would access the first element.

- **Random Access**: Arrays provide constant time (O(1)) access to elements. This means that, regardless of the size of the array, the time required to access any element is constant based on its index.

***

## Operações de array / Array Operations
**PT-BR**  
- **Acessando Elementos**: Acessar um elemento específico em um array por seu índice é uma operação de tempo constante. Tem uma complexidade de tempo de O(1).
- **Inserção**: Anexar um elemento ao final de um array é geralmente uma operação de tempo constante, O(1) mas a inserção no início ou em qualquer índice específico leva tempo O(n) porque requer o deslocamento de todos os elementos.
- **Exclusão**: O mesmo que a inserção, a exclusão do último elemento é uma operação de tempo constante, O(1) mas a exclusão do elemento no início ou em qualquer índice específico leva tempo O(n) porque requer o deslocamento de todos os elementos.
- **Pesquisa**: A Pesquisa Linear leva tempo O(n) que é útil para dados não classificados e a Pesquisa Binária leva tempo O(logn) que é útil para dados classificados.
- **Ordenação**: A ordenação de um array leva tempo O(nlogn) para algoritmos de ordenação eficientes como Merge Sort, Quick Sort, Heap Sort, etc.

***

**EN-US**  
- **Accessing Elements**: Accessing a specific element in an array by its index is a constant-time operation. It has a time complexity of O(1).
- **Insertion**: Appending an element to the end of an array is usually a constant-time operation, O(1) but insertion at the beginning or any specific index takes O(n) time because it requires shifting all of the elements.
- **Deletion**: Same as insertion, deleting the last element is a constant-time operation, O(1) but deletion of element at the beginning or any specific index takes O(n) time because it requires shifting all of the elements.
- **Searching**: Linear Search takes O(n) time which is useful for unsorted data and Binary Search takes O(logn) time which is useful for sorted data.
- **Sorting**: Sorting an array takes O(nlogn) time for efficient sorting algorithms like Merge Sort, Quick Sort, Heap Sort, etc.

***

## Vantagens de usar arrays / Advantages of using arrays
**PT-BR**  
- Arrays permitem acesso aleatório aos elementos. Isso torna o acesso aos elementos por posição mais rápido.
- Arrays têm melhor localidade de cache, o que faz uma grande diferença no desempenho.
- Arrays representam vários itens de dados do mesmo tipo usando um único nome.
- Estruturas de dados de array são usadas para implementar outras estruturas de dados como listas encadeadas, pilhas, filas, árvores, grafos, etc.

***

**EN-US**  
- Arrays allow random access to elements. This makes accessing elements by position faster.
- Arrays have better cache locality which makes a pretty big difference in performance.
- Arrays represent multiple data items of the same type using a single name.
- Array data structures are used to implement the other data structures like linked lists, stacks, queues, trees, graphs, etc.

***

## Desvantagens de usar arrays / Disadvantages of using arrays
**PT-BR**  
- Como os arrays têm um tamanho fixo, uma vez que a memória é alocada para eles, não pode ser aumentada ou diminuída, tornando impossível armazenar dados extras, se necessário.
- Alocar menos memória do que o necessário para um array leva à perda de dados. Um array é homogêneo por natureza, então, um único array não pode armazenar valores de diferentes tipos de dados.
- Os arrays armazenam dados em locais de memória contíguos, o que torna a exclusão e a inserção muito difíceis de implementar. Esse problema é superado pela implementação de listas encadeadas, que permitem que os elementos sejam acessados sequencialmente.

***

**EN-US**  
- As arrays have a fixed size, once the memory is allocated to them, it cannot be increased or decreased, making it impossible to store extra data if required. 
- Allocating less memory than required to an array leads to loss of data.
An array is homogeneous in nature so, a single array cannot store values of different data types. 
- Arrays store data in contiguous memory locations, which makes deletion and insertion very difficult to implement. This problem is overcome by implementing linked lists, which allow elements to be accessed sequentially.  

***