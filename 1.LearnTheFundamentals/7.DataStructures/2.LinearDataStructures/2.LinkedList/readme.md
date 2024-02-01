# Listas Encadeadas / Linked Lists
**PT-BR**  
Uma Lista Encadeada é uma estrutura de dados linear que se parece com uma cadeia de nós, onde cada nó é um elemento diferente. Diferente de Arrays, os elementos de uma Lista Encadeada não são armazenados em um local contíguo de memória.

Então, Listas Encadeadas são basicamente cadeias de nós, cada nó contém informações como dados e um ponteiro para o próximo nó na cadeia. Na lista encadeada existe um ponteiro chamado HEAD, que aponta para o primeiro elemento da lista encadeada, e se a lista estiver vazia, então ele simplesmente aponta para null.

***

**EN-US**  
A Linked List is a linear data structure which looks like a chain of nodes, where each node is a different element. Unlike Arrays, Linked List elements are not stored at a contiguous location in memory.

So, Linked Lists are basically chains of nodes, each node contains information such as data and a pointer to the next node in the chain. In the linked list there is a head pointer, which points to the first element of the linked list, and if the list is empty then it simply points to null or nothing.

***

## Porque usar Listas Encadeadas? / Why use Linked Lists?
**PT-BR**  
Abaixo estão algumas das vantagens de usar Listas Encadeadas:

- **Estrutura de Dados Dinâmica**: O tamanho da memória pode ser alocado ou desalocado em tempo de execução com base na operação de inserção ou exclusão.
- **Facilidade de Inserção/Exclusão**: A inserção e exclusão de elementos são mais simples do que arrays, pois nenhum elemento precisa ser deslocado após a inserção e exclusão, apenas o endereço precisa ser atualizado.
- **Utilização Eficiente de Memória**: Como sabemos que a Lista Encadeada é uma estrutura de dados dinâmica, o tamanho aumenta ou diminui conforme a necessidade, evitando assim o desperdício de memória.
- **Implementação**: Várias estruturas de dados avançadas podem ser implementadas usando uma lista encadeada, como pilha, fila, gráfico, mapas de hash, etc.

***

**EN-US**  
Below are some of advantages of using Linked Lists:

- **Dynamic Data structure**: The size of memory can be allocated or de-allocated at run time based on the operation insertion or deletion.
- **Ease of Insertion/Deletion**: The insertion and deletion of elements are simpler than arrays since no elements need to be shifted after insertion and deletion, Just the address needed to be updated.
- **Efficient Memory Utilization**: As we know Linked List is a dynamic data structure the size increases or decreases as per the requirement so this avoids the wastage of memory. 
- **Implementation**: Various advanced data structures can be implemented using a linked list like a stack, queue, graph, hash maps, etc. 

***

## Elementos comuns da Lista Encadeada / Common Elements of Linked List
**PT-BR**   
- **Nó**: Cada elemento em uma lista encadeada é representado por um nó, que contém dois componentes:
    - **Dados**: Os dados reais ou valor associado ao elemento.
    - **Próximo Ponteiro**: Uma referência ou ponteiro para o próximo nó na lista encadeada.
- **Head**: O primeiro nó em uma lista encadeada é chamado de “Head”. Ele serve como ponto de partida para percorrer a lista.
- **Tail**: O último nó em uma lista encadeada é chamado de “Tail”.

***

**EN-US**  
- **Node**: Each element in a linked list is represented by a node, which contains two components:
    - **Data**: The actual data or value associated with the element.
    - **Next Pointer**: A reference or pointer to the next node in the linked list.
- **Head**: The first node in a linked list is called the “head.” It serves as the starting point for traversing the list.
- **Tail**: The last node in a linked list is called the “tail.”

***

## Tipos de Listas Encadeadas / Types of Linked Lists
**PT-BR**  
Existem principalmente três tipos de listas encadeadas:

1. Lista encadeada simples
2. Lista encadeada dupla
3. Lista encadeada circular

***

**EN-US**  
There are mainly three types of linked lists:

1. Single-linked list
2. Double linked list
3. Circular linked list
***

### Lista Encadeada Simples / Single Linked List
**PT-BR**  
Neste tipo de lista encadeada, a travessia dos itens pode ser feita apenas na direção para frente devido à ligação de cada nó ao seu próximo nó.

***

**EN-US**  
In this type of linked list, the traversal of items can be done in the forward direction only due to the linking of every node to its next node.

***
![Single Linked List](https://media.geeksforgeeks.org/wp-content/uploads/20220712172013/Singlelinkedlist.png)
***

### Lista Encadeada Dupla / Double Linked List
**PT-BR**  
Neste tipo de lista encadeada, a travessia dos itens pode ser feita em ambas as direções, para frente e para trás, pois cada nó contém um ponteiro adicional chamado prev que aponta para o nó anterior.

***

**EN-US**  
In this type of linked list, the traversal of items can be done in both forward and backward directions as every node contains an additional prev pointer that points to the previous node.

***
![Doubly linked list](https://media.geeksforgeeks.org/wp-content/uploads/20220712180755/Doublylinkedlist.png)
***

### Lista Encadeada Circular / Circular Linked List
**PT-BR**  
Uma lista encadeada circular é um tipo de lista encadeada em que o primeiro e o último nó também estão conectados entre si para formar um círculo, não há NULL no final.

***

**EN-US**  
A circular linked list is a type of linked list in which the first and the last nodes are also connected to each other to form a circle, there is no NULL at the end.

***
![Circular Linked List](https://media.geeksforgeeks.org/wp-content/uploads/20220712181336/Circularlinkedlist.png)
***

## Linked List vs Array
**PT-BR**  
| ARRAY | LISTA ENCADEADA |
| ----------- | ----------- |
| Arrays são armazenados em local contíguo | Listas Encadeadas não são armazenadas em local contíguo |
| Tamanho fixo | Tamanho dinâmico |
| A memória é alocada em tempo de compilação | A memória é alocada em tempo de execução |
| Usa menos memória do que listas encadeadas | Usa mais memória porque armazena tanto os dados quanto o endereço do próximo nó |
| Os elementos podem ser acessados facilmente usando índice | Acessar elementos requer a transversal de toda a lista encadeada |
| A inserção e exclusão são difíceis devido ao deslocamento de elementos | A operação de inserção e exclusão é mais rápida |

### Na complexidade de tempo
| Operação | Array | Lista Encadeada |
| ----------- | ----------- | ----------- |
| Acesso aleatório | O(1) | O(n) |
| Inserção/Exclusão no início | O(n) | O(1) |
| Inserção/Exclusão no final | O(1) | O(n) |
| Inserção/Exclusão no meio | O(n) | O(n) |

***

**EN-US**  
| ARRAY | LINKED LIST |
| ----------- | ----------- |
| Arrays are stored in contiguous location | Linked Lists are not stored in contiguous location |
| Fixed in size | Dynamic in size |
| Memory is allocated at compile time | Memory is allocated at run time |
| Uses less memory than linked lists | Uses more memory because it stores both data and the address of next node |
| Elements can be acessed easily using index | Element accessing requires the transversal of whole linked list |
| Insertion and deletion is difficult due to shifting of elements | Insertion and deletion operation is faster |

### In time complexity
| Operation | Array | Linked List |
| ----------- | ----------- | ----------- |
| Random Access | O(1) | O(n) |
| Insertion/Deletion at beginning | O(n) | O(1) |
| Insertion/Deletion at end | O(1) | O(n) |
| Insertion/Deletion at middle | O(n) | O(n) |

***

## Vantagens e Desvantagens / Advantages and Disadvantages

**PT-BR**  
### Vantagens
- **Natureza dinâmica**: Listas encadeadas são usadas para alocação de memória dinâmica.
- **Eficiente em memória**: O consumo de memória de uma lista encadeada é eficiente, pois seu tamanho pode crescer ou diminuir dinamicamente de acordo com nossos requisitos, o que significa utilização efetiva de memória, portanto, sem desperdício de memória.
- **Facilidade de Inserção e Exclusão**: A inserção e exclusão de nós são facilmente implementadas em uma lista encadeada em qualquer posição.
- **Implementação**: Para a implementação de pilhas e filas e para a representação de árvores e grafos.

### Desvantagens
- **Uso de memória**: O uso de ponteiros é maior em listas encadeadas, portanto, complexo e requer mais memória.
- **Acessar um nó**: O acesso aleatório não é possível devido à alocação dinâmica de memória.
- **Operação de busca custosa**: A busca por um elemento é custosa e requer complexidade de tempo O(n).
- **Travessia em ordem reversa**: A travessia é mais demorada e a travessia reversa não é possível em listas encadeadas simples.

***

**EN-US**  
### Advantages
- **Dynamic nature**: Linked lists are used for dynamic memory allocation.
- **Memory efficient**: Memory consumption of a linked list is efficient as its size can grow or shrink dynamically according to our requirements, which means effective memory utilization hence, no memory wastage.
- **Ease of Insertion and Deletion**: Insertion and deletion of nodes are easily implemented in a linked list at any position.
- **Implementation**: For the implementation of stacks and queues and for the representation of trees and graphs.

### Disadvantages
- **Memory usage**: The use of pointers is more in linked lists hence, complex and requires more memory.
- **Accessing a node**: Random access is not possible due to dynamic memory allocation.
- **Search operation costly**: Searching for an element is costly and requires O(n) time complexity.
- **Traversing in reverse order**: Traversing is more time-consuming and reverse traversing is not possible in singly linked lists. 

***