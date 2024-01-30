# Introdução para Estruturas de Dados / Introduction to Data Structures

## O que são Estruturas de Dados? / What are Data Structures?
**PT-BR**  
Uma estrutura de dados é uma maneira particular de organizar dados em um computador para que possa ser usado de forma eficaz. A ideia é reduzir as complexidades de espaço e tempo de diferentes tarefas.

A escolha de uma boa estrutura de dados torna possível executar uma variedade de operações críticas de forma eficaz. Uma estrutura de dados eficiente também usa o mínimo de espaço de memória e tempo de execução para processar a estrutura. Uma estrutura de dados não é usada apenas para organizar os dados. Também é usado para processar, recuperar e armazenar dados. Existem diferentes tipos básicos e avançados de estruturas de dados que são usados em quase todos os programas ou sistemas de software que foram desenvolvidos. Portanto, devemos ter um bom conhecimento de estruturas de dados.

***

**EN-US**  
A data structure is a particular way of organising data in a computer so that it can be used effectively. The idea is to reduce the space and time complexities of different tasks. 

The choice of a good data structure makes it possible to perform a variety of critical operations effectively. An efficient data structure also uses minimum memory space and execution time to process the structure. A data structure is not only used for organising the data. It is also used for processing, retrieving, and storing data. There are different basic and advanced types of data structures that are used in almost every program or software system that has been developed. So we must have good knowledge of data structures.
***

## Necessidade de Estruturas de Dados / Need of Data Structures
**PT-BR**  
A estrutura dos dados e a síntese do algoritmo são relativas entre si. A apresentação dos dados deve ser de fácil compreensão para que o desenvolvedor, bem como o usuário, possa fazer uma implementação eficiente da operação. 

As estruturas de dados fornecem uma maneira fácil de organizar, recuperar, gerenciar e armazenar dados.

Aqui está uma lista das necessidades para dados.

- A modificação da estrutura de dados é fácil.
- Requer menos tempo.
- Economiza espaço de memória de armazenamento.
- A representação de dados é fácil.
- Acesso fácil ao grande banco de dados

***

**EN-US**  
The structure of the data and the synthesis of the algorithm are relative to each other. Data presentation must be easy to understand so the developer, as well as the user, can make an efficient implementation of the operation.

Data structures provide an easy way of organising, retrieving, managing, and storing data.

Here is a list of the needs for data.

- Data structure modification is easy. 
- It requires less time. 
- Save storage memory space. 
- Data representation is easy. 
- Easy access to the large database
***

## Classificação e Tipos de Estruturas de Dados / Classification and Types of Data Structures 
**PT-BR**  
1. Estruturas de Dados Lineares
    - Os elementos são organizados em uma dimensão, também conhecida como dimensão linear.
    - Exemplo: listas, pilha, fila, etc.

2. Estruturas de Dados Não-Lineares
    - Os elementos são organizados em forma multidimensional.
    - Exemplo: árvore, grafos, etc.

***

**EN-US**  
1. Linear Data Structures
    - Elements are arranged in one dimension ,also known as linear dimension.
    - Example: lists, stack, queue, etc.

2. Non-Linear Data Structures
    - Elements are arranged in multidimensional form.
    - Example: tree, graph, etc.

***
![Classificação de Estruturas de Dados](https://media.geeksforgeeks.org/wp-content/uploads/20220520182504/ClassificationofDataStructure-660x347.jpg)
***

## Estruturas de Dados Mais Populares / Most Popular Data Structures

## Array
**PT-BR**  
Um array é uma coleção de itens de dados armazenados em locais de memória contíguos. A ideia é armazenar vários itens do mesmo tipo juntos. Isso torna mais fácil calcular a posição de cada elemento simplesmente adicionando um deslocamento a um valor base, ou seja, a localização de memória do primeiro elemento da matriz (geralmente denotado pelo nome da matriz).

***

**EN-US**  
An array is a collection of data items stored at contiguous memory locations. The idea is to store multiple items of the same type together. This makes it easier to calculate the position of each element by simply adding an offset to a base value, i.e., the memory location of the first element of the array (generally denoted by the name of the array). 

***
![Array Data Structure](https://media.geeksforgeeks.org/wp-content/uploads/20230302092653/C-array-initialization.png)
***

## Lista Encadeada / Linked List
**PT-BR**  
Como arrays, a lista encadeada é uma estrutura de dados linear. Ao contrário dos arrays, os elementos da lista encadeada não são armazenados em um local contíguo; os elementos são vinculados usando ponteiros.

***

**EN-US**  
Like arrays, Linked List is a linear data structure. Unlike arrays, linked list elements are not stored at a contiguous location; the elements are linked using pointers. 

***
![Linked Data Structure](https://media.geeksforgeeks.org/wp-content/uploads/20220816144425/LLdrawio.png)
***

## Pilha / Stack
**PT-BR**  
Pilha é uma estrutura de dados linear que segue uma ordem particular na qual as operações são realizadas. A ordem pode ser LIFO (Last In First Out) ou FILO (First In Last Out). Na pilha, todas as inserções e exclusões são permitidas em apenas uma extremidade da lista (no caso, o topo da pilha).

Operações de pilha:
- **push()**: Quando essa operação é realizada, um elemento é inserido na pilha.
- **pop()**: Quando essa operação é realizada, um elemento é removido do topo da pilha e é retornado.
- **top()**: Essa operação retornará o último elemento inserido (que está no topo), sem removê-lo.
- **size()**: Essa operação retornará o tamanho da pilha, ou seja, o número total de elementos presentes na pilha.
- **isEmpty()**: Essa operação indica se a pilha está vazia ou não.
***

**EN-US**  
Stack is a linear data structure which follows a particular order in which the operations are performed. The order may be LIFO(Last In First Out) or FILO(First In Last Out). In stack, all insertion and deletion are permitted at only one end of the list (in case of stack, the top end).

Stack operations:
- **push()**: When this operation is performed, an element is inserted into the stack.
- **pop()**: When this operation is performed, an element is removed from the top of the stack and is returned.
- **top()**: This operation will return the last inserted element that is at the top without removing it.
- **size()**: This operation will return the size of the stack i.e. the total number of elements present in the stack.
- **isEmpty()**: This operation indicates whether the stack is empty or not.
***
![Stack Data Structure](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20221219100314/stack.drawio2.png)
***

## Fila / Queue
**PT-BR**  
Assim como a Pilha, a Fila é uma estrutura linear que segue uma ordem específica em que as operações são executadas. A ordem é First In First Out (FIFO). Na fila, os itens são inseridos em uma extremidade e excluídos na outra. Um bom exemplo de fila é qualquer fila de consumidores para um recurso onde o consumidor que chegou primeiro é atendido primeiro. A diferença entre pilhas e filas está na remoção. Em uma pilha, removemos o item adicionado mais recentemente; em uma fila, removemos o item adicionado menos recentemente.

Operações de fila:

- **Enqueue()**: Adiciona (ou armazena) um elemento ao final da fila.
- **Dequeue()**: Remoção de elementos da fila (ou seja, do início da fila).
- **Peek()** ou **front()**: Adquire o elemento de dados disponível no nó frontal da fila sem excluí-lo.
- **rear()**: Essa operação retorna o elemento do final da fila sem removê-lo.
- **isFull()**: Verifica se a fila está cheia.
- **isNull()**: Verifica se a fila está vazia.

***

**EN-US**  
Like Stack, Queue is a linear structure which follows a particular order in which the operations are performed. The order is First In First Out (FIFO). In the queue, items are inserted at one end and deleted from the other end. A good example of the queue is any queue of consumers for a resource where the consumer that came first is served first. The difference between stacks and queues is in removing. In a stack we remove the item the most recently added; in a queue, we remove the item the least recently added. 

Queue Operations:

- **Enqueue()**: Adds (or stores) an element to the end of the queue.
- **Dequeue()**: Removal of elements from the queue (i.e., from the front of the queue).
- **Peek()** or **front()**: Acquires the data element available at the front node of the queue without deleting it.
- **rear()**: This operation returns the element at the rear end without removing it.
- **isFull()**: Checks if the queue is full.
- **isNull()**: Checks if the queue is empty.

***
![Queue Data Structure](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20221213113312/Queue-Data-Structures.png)
***

## Árvore Binária / Binary Tree 
**PT-BR**  
Ao contrário de Arrays, Listas Encadeadas, Pilha e Filas, que são estruturas de dados lineares, as árvores são estruturas de dados hierárquicas. Uma árvore binária é uma estrutura de dados em árvore na qual cada nó tem no máximo dois filhos, que são referidos como filho esquerdo e filho direito. É implementado principalmente usando Links.

Uma árvore binária é representada por um ponteiro para o nó mais alto da árvore. Se a árvore estiver vazia, o valor da raiz será NULL.

Um nó de árvore binária contém as seguintes partes:

1. Dados
2. Ponteiro para filho esquerdo
3. Ponteiro para filho direito

***

**EN-US**  
Unlike Arrays, Linked Lists, Stack and queues, which are linear data structures, trees are hierarchical data structures. A binary tree is a tree data structure in which each node has at most two children, which are referred to as the left child and the right child. It is implemented mainly using Links. 

A Binary Tree is represented by a pointer to the topmost node in the tree. If the tree is empty, then the value of root is NULL.

A Binary Tree node contains the following parts:

1. Data
2. Pointer to left child
3. Pointer to right child

***
![Binary Tree Data Structure](https://media.geeksforgeeks.org/wp-content/uploads/20221124174432/binary.png)
***

## Arvore Binária de Busca / Binary Search Tree
**PT-BR**  
Uma Arvore Binária de Busca é uma Árvore Binária que segue as propriedades adicionais:

- A parte esquerda do nó raiz contém chaves menores que a chave do nó raiz.
- A parte direita do nó raiz contém chaves maiores que a chave do nó raiz.
- Não há chave duplicada presente na árvore binária.

Uma árvore binária que possui as propriedades acima é conhecida como Arvore Binária de Busca (BST).

***

**EN-US**  
A Binary Search Tree is a Binary Tree following the additional properties: 

- The left part of the root node contains keys less than the root node key.
- The right part of the root node contains keys greater than the root node key.
- There is no duplicate key present in the binary tree.

A binary tree having the above properties is known as a binary search tree (BST).
***
![Binary Search Tree Data Structure](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20221215114732/bst-21.png)
***

## Heap
**PT-BR**  
Um Heap é uma estrutura de dados especial baseada em árvore em que a árvore é uma árvore binária completa. Geralmente, os Heaps podem ser de dois tipos:

- **Max-Heap**: Em um Max-Heap, a chave presente no nó raiz deve ser a maior entre as chaves presentes em todos os seus filhos. A mesma propriedade deve ser recursivamente verdadeira para todas as subárvores nessa Árvore Binária.

- **Min-Heap**: Em um Min-Heap, a chave presente no nó raiz deve ser a menor entre as chaves presentes em todos os seus filhos. A mesma propriedade deve ser recursivamente verdadeira para todas as subárvores nessa Árvore Binária.

***

**EN-US**  
A Heap is a special Tree-based data structure in which the tree is a complete binary tree. Generally, Heaps can be of two types: 

- **Max-Heap**: In a Max-Heap the key present at the root node must be greatest among the keys present at all of its children. The same property must be recursively true for all sub-trees in that Binary Tree.
- **Min-Heap**: In a Min-Heap the key present at the root node must be minimum among the keys present at all of its children. The same property must be recursively true for all sub-trees in that Binary Tree.

***
![Max and Min Heap](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20221220165711/MinHeapAndMaxHeap1.png)
***

## Hashing
**PT-BR**  
Hashing é uma estrutura de dados importante que é projetada para usar uma função especial chamada função Hash que é usada para mapear um determinado valor com uma chave específica para acesso mais rápido dos elementos. A eficiência do mapeamento depende da eficiência da função hash usada.

Dada uma função hash H(x) mapeando o valor x no índice x%10 em uma matriz. Por exemplo, se a lista de valores for [11, 12, 13, 14, 15], ela será armazenada nas posições {1, 2, 3, 4, 5} na matriz ou tabela de hash, respectivamente.

***

**EN-US**  
Hashing is an important Data Structure which is designed to use a special function called the Hash function which is used to map a given value with a particular key for faster access of elements. The efficiency of mapping depends on the efficiency of the hash function used. 

Let a hash function H(x) maps the value x at the index x%10 in an Array. For example, if the list of values is [11, 12, 13, 14, 15] it will be stored at positions {1, 2, 3, 4, 5} in the array or Hash table respectively.
***
![Hash Data Structure](https://media.geeksforgeeks.org/wp-content/uploads/20220701080941/ComponentsofHashing-660x342.png)
***