# Tipos de estrutura de dados, classificações e aplicações / Data Structure Types, Classifications and Applications

## O que é Estrutura de Dados? / What is Data Structure?
**PT-BR**  
Uma estrutura de dados é um armazenamento que é usado para armazenar e organizar dados. É uma maneira de organizar dados em um computador para que possa ser acessado e atualizado com eficiência.

As estruturas de dados são parte integrante dos computadores usados para organizar os dados na memória. Eles são essenciais e responsáveis por organizar, processar, acessar e armazenar dados de forma eficiente. Mas isto não é tudo. Vários tipos de estruturas de dados têm características, recursos, aplicações, vantagens e desvantagens.

***

**EN-US**  
A data structure is a storage that is used to store and organize data. It is a way of arranging data on a computer so that it can be accessed and updated efficiently.

Data structures are an integral part of computers used for the arrangement of data in memory. They are essential and responsible for organizing, processing, accessing, and storing data efficiently. But this is not all. Various types of data structures have their characteristics, features, applications, advantages, and disadvantages.

***

## Classificação de Estrutura de Dados / Classification of Data Structure
**PT-BR**  
- Estrutura de dados linear: A estrutura de dados na qual os elementos de dados são organizados sequencialmente ou linearmente, onde cada elemento é anexado aos elementos adjacentes anteriores e seguintes, é chamada de estrutura de dados linear. Exemplos de estruturas de dados lineares são array, pilha, fila, lista encadeada, etc.
    - Estrutura de dados estática: a estrutura de dados estática possui um tamanho de memória fixo. É mais fácil acessar os elementos em uma estrutura de dados estática. Um exemplo dessa estrutura de dados é um array.
    - Estrutura de dados dinâmica: Na estrutura de dados dinâmica, o tamanho não é fixo. Ele pode ser atualizado aleatoriamente durante o tempo de execução, o que pode ser considerado eficiente no que diz respeito à complexidade de memória (espaço) do código. Exemplos dessa estrutura de dados são fila, pilha, etc.
- Estrutura de dados não linear: estruturas de dados onde os elementos de dados não são colocados sequencialmente ou linearmente são chamadas de estruturas de dados não lineares. Em uma estrutura de dados não linear, não podemos percorrer todos os elementos em uma única execução. Exemplos de estruturas de dados não lineares são árvores e grafos.
***

**EN-US**  
- Linear data structure: Data structure in which data elements are arranged sequentially or linearly, where each element is attached to its previous and next adjacent elements, is called a linear data structure. 
Examples of linear data structures are array, stack, queue, linked list, etc.
    - Static data structure: Static data structure has a fixed memory size. It is easier to access the elements in a static data structure. An example of this data structure is an array.
    - Dynamic data structure: In the dynamic data structure, the size is not fixed. It can be randomly updated during the runtime which may be considered efficient concerning the memory (space) complexity of the code. Examples of this data structure are queue, stack, etc.
- Non-linear data structure: Data structures where data elements are not placed sequentially or linearly are called non-linear data structures. In a non-linear data structure, we can’t traverse all the elements in a single run only. Examples of non-linear data structures are trees and graphs.
***
![Classification of Data Structure](https://media.geeksforgeeks.org/wp-content/uploads/20220520182504/ClassificationofDataStructure-660x347.jpg)
***

## Arrays
**PT-BR**  
Um array é uma estrutura de dados linear e é uma coleção de itens armazenados em locais de memória contíguos. A ideia é armazenar vários itens do mesmo tipo juntos em um só lugar. Permite o processamento de uma grande quantidade de dados em um período relativamente curto. O primeiro elemento do array é indexado por um index de valor 0. Existem diferentes operações possíveis em um array, como Pesquisar, Ordenar, Inserir, Percorrer, Inverter e Excluir.

### Características de um Array:

Um array possui as seguintes características:

- Os arrays usam uma estrutura de dados baseada em índice, que ajuda a identificar cada um dos elementos em um array facilmente usando este índice.
- Se um usuário deseja armazenar vários valores do mesmo tipo de dados, o array pode ser utilizado de forma eficiente.
- Um array também pode lidar com estruturas de dados complexas armazenando dados em um array bidimensional.
- Um array também é usado para implementar outras estruturas de dados como Stacks, Queues, Heaps, Hash tables, etc.
- O processo de pesquisa em um array pode ser feito muito facilmente.

### Operações realizadas em array:
- Inicialização: Um array pode ser inicializado com valores no momento da declaração ou posteriormente usando uma instrução de atribuição.
- Acessando elementos: Os elementos em um array podem ser acessados por seu índice, que começa em 0 e vai até o tamanho do array menos um.
- Pesquisando elementos: Arrays podem ser pesquisados por um elemento específico usando algoritmos de pesquisa linear ou binária.
- Ordenando elementos: Os elementos em um array podem ser ordenados em ordem crescente ou decrescente usando algoritmos como bubble sort, insertion sort ou quick sort.
- Inserindo elementos: Os elementos podem ser inseridos em um array em um local específico, mas essa operação pode ser demorada porque requer o deslocamento dos elementos existentes no array.
- Excluindo elementos: Os elementos podem ser excluídos de um array deslocando os elementos que vêm depois dele para preencher a lacuna.
- Atualizando elementos: Os elementos em um array podem ser atualizados ou modificados atribuindo um novo valor a um índice específico.
- Percorrendo elementos: Os elementos em um array podem ser percorridos em ordem, visitando cada elemento uma vez.

***

**EN-US**  
An array is a linear data structure and it is a collection of items stored at contiguous memory locations. The idea is to store multiple items of the same type together in one place. It allows the processing of a large amount of data in a relatively short period. The first element of the array is indexed by a subscript of 0. There are different operations possible in an array, like Searching, Sorting, Inserting, Traversing, Reversing, and Deleting.

### Characteristics of an Array: 

An array has various characteristics which are as follows:

- Arrays use an index-based data structure which helps to identify each of the elements in an array easily using the index.
- If a user wants to store multiple values of the same data type, then the array can be utilized efficiently.
- An array can also handle complex data structures by storing data in a two-dimensional array.
- An array is also used to implement other data structures like Stacks, Queues, Heaps, Hash tables, etc.
- The search process in an array can be done very easily.

### Operations performed on array:
- Initialization: An array can be initialized with values at the time of declaration or later using an assignment statement.
- Accessing elements: Elements in an array can be accessed by their index, which starts from 0 and goes up to the size of the array minus one.
- Searching for elements: Arrays can be searched for a specific element using linear search or binary search algorithms.
- Sorting elements: Elements in an array can be sorted in ascending or descending order using algorithms like bubble sort, insertion sort, or quick sort.
- Inserting elements: Elements can be inserted into an array at a specific location, but this operation can be time-consuming because it requires shifting existing elements in the array.
- Deleting elements: Elements can be deleted from an array by shifting the elements that come after it to fill the gap.
- Updating elements: Elements in an array can be updated or modified by assigning a new value to a specific index.
- Traversing elements: The elements in an array can be traversed in order, visiting each element once.
***
![Array](https://media.geeksforgeeks.org/wp-content/uploads/20220518123630/array2.png)
***

## Lista Encadeada / Linked List
**PT-BR**  
Uma Lista Encadeada é uma estrutura de dados linear na qual os elementos não são armazenados em locais de memória contíguos.

Tipos de Lista Encadeadas:

- Lista Encadeada individualmente
- Lista duplamente Encadeada
- Lista Encadeada circular
- Lista Encadeada duplamente circular

### Características de uma Lista Encadeada
Uma lista encadeada possui as seguintes características:

- Uma lista encadeada utiliza memória extra para armazenar os ponteiros.
- Durante a inicialização da lista encadeada, não há necessidade de saber o tamanho dos elementos.
- Listas encadeadas são usadas para implementar pilhas, filas, grafos, etc.
- O primeiro nó da lista encadeada é chamado de Head.
- O próximo ponteiro do último nó sempre aponta para NULL.
- Em uma lista encadeada, a inserção e a exclusão são possíveis facilmente.
- Cada nó da lista encadeada consiste em um ponteiro que é o endereço do próximo nó.
- As listas encadeadas podem diminuir ou aumentar facilmente a qualquer momento.

### Operações realizadas na Lista Encadeada

- Inicialização: Uma Lista Encadeada pode ser inicializada criando um nó principal com uma referência ao primeiro nó. Cada nó subsequente contém um valor e uma referência ao próximo nó.
- Inserindo elementos: Os elementos podem ser inseridos no início, no final ou em uma posição específica na Lista Encadeada.
- Exclusão de elementos: Os elementos podem ser excluídos da Lista Encadeada atualizando a referência do nó anterior para apontar para o próximo nó, removendo efetivamente o nó atual da lista.
- Pesquisa de elementos: As listas encadeadas podem ser pesquisadas por um elemento específico começando no nó principal e seguindo as referências para os próximos nós até que o elemento desejado seja encontrado.
- Atualizando elementos: Os elementos de uma Lista Encadeada podem ser atualizados modificando o valor de um nó específico.
- Percorrendo elementos: Os elementos de uma lista encadeada podem ser percorridos começando no nó principal e seguindo as referências para os próximos nós até chegar ao final da lista.
- Reverter uma Lista Encadeada: A Lista Encadeada pode ser revertida atualizando as referências de cada nó para que apontem para o nó anterior em vez do próximo nó.

***

**EN-US**  
A linked list is a linear data structure in which elements are not stored at contiguous memory locations.

Types of linked lists:

- Singly-linked list
- Doubly linked list
- Circular linked list
- Doubly circular linked list

### Characteristics of a Linked List
A linked list has various characteristics which are as follows:

- A linked list uses extra memory to store links.
- During the initialization of the linked list, there is no need to know the size of the elements.
- Linked lists are used to implement stacks, queues, graphs, etc.
- The first node of the linked list is called the Head.
- The next pointer of the last node always points to NULL.
- In a linked list, insertion and deletion are possible easily.
- Each node of the linked list consists of a pointer/link which is the address of the next node.
- Linked lists can shrink or grow at any point in time easily.

### Operations performed on Linked list

- Initialization: A linked list can be initialized by creating a head node with a reference to the first node. Each subsequent node contains a value and a reference to the next node.
- Inserting elements: Elements can be inserted at the head, tail, or at a specific position in the linked list.
- Deleting elements: Elements can be deleted from the linked list by updating the reference of the previous node to point to the next node, effectively removing the current node from the list.
- Searching for elements: Linked lists can be searched for a specific element by starting from the head node and following the references to the next nodes until the desired element is found.
- Updating elements: Elements in a linked list can be updated by modifying the value of a specific node.
- Traversing elements: The elements in a linked list can be traversed by starting from the head node and following the references to the next nodes until the end of the list is reached.
- Reversing a linked list: The linked list can be reversed by updating the references of each node so that they point to the previous node instead of the next node.

***
![Linked List](https://media.geeksforgeeks.org/wp-content/uploads/20220518123801/Linkedlist1.png)
***

## Pilha / Stack
**PT-BR**  
Uma pilha é uma estrutura de dados linear que segue uma ordem específica na qual as operações são realizadas. A ordem é LIFO (último a entrar, primeiro a sair). A inserção e a recuperação de dados são possíveis apenas de uma extremidade. A inserção e a recuperação de dados também são chamadas de operação push e pop em uma pilha. Existem diferentes operações possíveis em uma pilha, como reverter uma pilha usando recursão, ordenar elementos, excluir o elemento do meio de uma pilha, etc.

### Características de uma Pilha
A pilha possui as seguintes características:

- A pilha é usada em muitos algoritmos diferentes, como Torre de Hanói, travessia de árvore, recursão, etc.
- A pilha é implementada por meio de um array ou lista encadeada.
- Segue a operação Last In First Out, ou seja, um elemento que é inserido primeiro vai sair por último e vice-versa.
- A inserção e a exclusão são realizadas em uma extremidade, ou seja, no topo da pilha.
- Se o espaço alocado para a pilha estiver cheio e tentar adicionar mais elementos, isso levará a um estouro de pilha.

### Operações realizadas na pilha
Uma pilha é uma estrutura de dados linear que implementa o princípio Last-In-First-Out (LIFO). Aqui estão algumas operações comuns realizadas em pilhas:

- Push: Elementos podem ser colocados no topo da pilha, adicionando um novo elemento ao topo da pilha.
- Pop: O elemento superior pode ser removido da pilha realizando uma operação pop, removendo efetivamente o último elemento que foi colocado na pilha.
- Peek: O elemento superior pode ser inspecionado sem removê-lo da pilha usando uma operação peek.
- IsEmpty: Uma verificação pode ser feita para determinar se a pilha está vazia.
- Size: O número de elementos na pilha pode ser determinado usando uma operação de tamanho.



***

**EN-US**  
Stack is a linear data structure that follows a particular order in which the operations are performed. The order is LIFO(Last in first out). Entering and retrieving data is possible from only one end. The entering and retrieving of data is also called push and pop operation in a stack. There are different operations possible in a stack like reversing a stack using recursion, Sorting, etc.

### Characteristics of a Stack
Stack has various different characteristics which are as follows:

- Stack is used in many different algorithms like Tower of Hanoi, tree traversal, recursion, etc.
- Stack is implemented through an array or linked list.
- It follows the Last In First Out operation i.e., an element that is inserted first will pop in last and vice versa.
- The insertion and deletion are performed at one end i.e. from the top of the stack.
- In stack, if the allocated space for the stack is full, and still anyone attempts to add more elements, it will lead to stack overflow.

### Operations performed on stack
A stack is a linear data structure that implements the Last-In-First-Out (LIFO) principle. Here are some common operations performed on stacks:

- Push: Elements can be pushed onto the top of the stack, adding a new element to the top of the stack.
- Pop: The top element can be removed from the stack by performing a pop operation, effectively removing the last element that was pushed onto the stack.
- Peek: The top element can be inspected without removing it from the stack using a peek operation.
- IsEmpty: A check can be made to determine if the stack is empty.
- Size: The number of elements in the stack can be determined using a size operation.

***
![Stack](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20221219100314/stack.drawio2.png)
***

## Fila / Queue
**PT-BR**  
Fila é uma estrutura de dados linear que segue a ordem específica First In First Out (FIFO), ou seja, o item de dados armazenado primeiro será acessado primeiro. Neste, a inserção e recuperação de dados não é feita apenas de uma extremidade. Um exemplo de fila é qualquer fila de consumidores para um recurso em que o consumidor que chegou primeiro é atendido primeiro. Diferentes operações são executadas em uma fila, como reverter uma fila (com ou sem uso de recursão), reverter os primeiros K elementos de uma fila, etc. Algumas operações básicas realizadas na fila são enqueue, dequeue, front, rear, etc.

### Características de uma Fila
A fila possui as seguintes características:

- A fila é uma estrutura FIFO (First In First Out).
- Para remover o último elemento da fila, todos os elementos inseridos antes do novo elemento na fila devem ser removidos.
- Uma fila é uma lista ordenada de elementos de tipos de dados semelhantes.

### Operações realizadas na Fila
Uma fila é uma estrutura de dados linear que implementa o princípio First-In-First-Out (FIFO). Aqui estão algumas operações comuns realizadas em filas:

- Enqueue: Elementos podem ser adicionados à parte de trás da fila, adicionando um novo elemento ao final da fila.
- Dequeue: O elemento frontal pode ser removido da fila realizando uma operação de dequeue, removendo efetivamente o primeiro elemento que foi adicionado à fila.
- Peek: O elemento frontal pode ser inspecionado sem removê-lo da fila usando uma operação peek.
- IsEmpty: Uma verificação pode ser feita para determinar se a fila está vazia.
- Size: O número de elementos na fila pode ser determinado usando uma operação de tamanho.

***

**EN-US**  
Queue is a linear data structure that follows a specific order called First In First Out (FIFO), i.e., the data item stored first will be accessed first. In this, the insertion and retrieval of data is not done from only one end. An example of a queue is any queue of consumers for a resource where the consumer who came first is served first. Different operations are performed on a queue like reversing a queue (with or without using recursion), reversing the first K elements of a queue, etc. Some basic operations performed on the queue are enqueue, dequeue, front, rear, etc.

### Characteristics of a Queue
Queue has various different characteristics which are as follows:

- The queue is a FIFO (First In First Out) structure.
- To remove the last element of the Queue, all the elements inserted before the new element in the queue must be removed.
- A queue is an ordered list of elements of similar data types.

### Operations performed on Queue
A queue is a linear data structure that implements the First-In-First-Out (FIFO) principle. Here are some common operations performed on queues:

- Enqueue: Elements can be added to the back of the queue, adding a new element to the end of the queue.
- Dequeue: The front element can be removed from the queue by performing a dequeue operation, effectively removing the first element that was added to the queue.
- Peek: The front element can be inspected without removing it from the queue using a peek operation.
- IsEmpty: A check can be made to determine if the queue is empty.
- Size: The number of elements in the queue can be determined using a size operation.

***
![Queue](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20221213113312/Queue-Data-Structures.png)
***

## Árvore / Tree
**PT-BR**  
Uma árvore é uma estrutura de dados não linear e hierárquica onde os elementos são organizados em uma estrutura semelhante a uma árvore. Em uma árvore, o nó mais alto é chamado de nó raiz. Cada nó contém alguns dados, e os dados podem ser de qualquer tipo. Consiste em um nó central, nós estruturais e subnós que são conectados por meio de arestas. Diferentes estruturas de dados de árvore permitem acesso mais rápido e fácil aos dados, pois é uma estrutura de dados não linear. Uma árvore possui vários termos como Nó, Raiz, Aresta, Altura de uma árvore, Grau de uma árvore, etc.

Existem diferentes tipos de árvore como:

- Árvore binária,
- Árvore de busca binária,
- Árvore AVL,
- Árvore B, etc.

### Características de uma Árvore
A árvore possui as seguintes características:

- Uma árvore também é conhecida como uma estrutura de dados recursiva.
- Em uma árvore, a altura da raiz pode ser definida como o caminho mais longo do nó raiz ao nó folha.
- Em uma árvore, também pode-se calcular a profundidade do topo para qualquer nó. O nó raiz tem uma profundidade de 0.

### Operações realizadas na Árvore
Uma árvore é uma estrutura de dados não linear que consiste em nós conectados por arestas. Aqui estão algumas operações comuns realizadas em árvores:

- Inserção: Novos nós podem ser adicionados à árvore para criar um novo ramo ou aumentar a altura da árvore.
- Exclusão: Os nós podem ser removidos da árvore atualizando as referências do nó pai para remover a referência ao nó atual.
- Busca: Os elementos podem ser pesquisados ​​em uma árvore começando pelo nó raiz e percorrendo a árvore com base no valor do nó atual até que o nó desejado seja encontrado.
- Traversing: Os elementos em uma árvore podem ser percorridos de várias maneiras diferentes, incluindo travessia em ordem, pré-ordem e pós-ordem.
- Altura: A altura da árvore pode ser determinada contando o número de arestas do nó raiz ao nó folha mais distante.
- Profundidade: A profundidade de um nó pode ser determinada contando o número de arestas do nó raiz ao nó atual.
- Balanceamento: A árvore pode ser equilibrada para garantir que a altura da árvore seja minimizada e a distribuição dos nós seja o mais uniforme possível.
***

**EN-US**  
A tree is a non-linear and hierarchical data structure where the elements are arranged in a tree-like structure. In a tree, the topmost node is called the root node. Each node contains some data, and data can be of any type. It consists of a central node, structural nodes, and sub-nodes which are connected via edges. Different tree data structures allow quicker and easier access to the data as it is a non-linear data structure. A tree has various terminologies like Node, Root, Edge, Height of a tree, Degree of a tree, etc. 

There are different types of Tree-like 

- Binary Tree, 
- Binary Search Tree, 
- AVL Tree, 
- B-Tree, etc.

### Characteristics of a Tree 
The tree has various different characteristics which are as follows:

- A tree is also known as a Recursive data structure.
- In a tree, the Height of the root can be defined as the longest path from the root node to the leaf node.
- In a tree, one can also calculate the depth from the top to any node. The root node has a depth of 0.

### Operations performed on Tree
A tree is a non-linear data structure that consists of nodes connected by edges. Here are some common operations performed on trees:

- Insertion: New nodes can be added to the tree to create a new branch or to increase the height of the tree.
- Deletion: Nodes can be removed from the tree by updating the references of the parent node to remove the reference to the current node.
- Search: Elements can be searched for in a tree by starting from the root node and traversing the tree based on the value of the current node until the desired node is found.
- Traversal: The elements in a tree can be traversed in several different ways, including in-order, pre-order, and post-order traversal.
- Height: The height of the tree can be determined by counting the number of edges from the root node to the furthest leaf node.
- Depth: The depth of a node can be determined by counting the number of edges from the root node to the current node.
- Balancing: The tree can be balanced to ensure that the height of the tree is minimized and the distribution of nodes is as even as possible.

***
![Tree](https://media.geeksforgeeks.org/wp-content/uploads/20220518124202/TreeBasicTerminology.png)
***

## Grafos / Graphs
**PT-BR**  
Um grafo é uma estrutura de dados não linear que consiste em vértices (ou nós) e arestas. Consiste em um conjunto finito de vértices e um conjunto de arestas que conectam um par de nós. O grafo é usado para resolver os problemas de programação mais desafiadores e complexos. Ele tem diferentes terminologias que são Caminho, Grau, Vértices adjacentes, Componentes conectados, etc.

### Características de um Grafo
O grafo possui as seguintes características:
- A distância máxima de um vértice para todos os outros vértices é considerada a Excentricidade desse vértice.
- O vértice com a menor Excentricidade é considerado o ponto central do grafo.
- O valor mínimo de Excentricidade de todos os vértices é considerado o raio de um grafo conectado.

### Operações realizadas no Grafo
Um grafo é uma estrutura de dados não linear que consiste em vértices (ou nós) e arestas. Aqui estão algumas operações comuns realizadas em grafos:

- Adicionar vértice: Novos vértices podem ser adicionados ao grafo para representar um novo nó.
- Adicionar aresta: As arestas podem ser adicionadas entre vértices para representar um relacionamento entre nós.
- Remover vértice: Os vértices podem ser removidos do grafo atualizando as referências dos vértices adjacentes para remover a referência ao vértice atual.
- Remover aresta: As arestas podem ser removidas atualizando as referências dos vértices adjacentes para remover a referência à aresta atual.
- Depth-First Search (DFS): Um grafo pode ser percorrido usando uma pesquisa em profundidade, visitando os vértices em profundidade.
- Breadth-First Search (BFS): Um grafo pode ser percorrido usando uma pesquisa em largura, visitando os vértices em largura.
- Caminho mais curto: O caminho mais curto entre dois vértices pode ser determinado usando algoritmos como o algoritmo de Dijkstra ou o algoritmo A *.
- Componentes conectados: Os componentes conectados de um grafo podem ser determinados encontrando conjuntos de vértices que estão conectados entre si, mas não a nenhum outro vértice no grafo.
- Detecção de ciclo: Os ciclos em um grafo podem ser detectados verificando as arestas de retorno durante uma pesquisa em profundidade.

***

**EN-US**  
A graph is a non-linear data structure that consists of vertices (or nodes) and edges. It consists of a finite set of vertices and set of edges that connect a pair of nodes. The graph is used to solve the most challenging and complex programming problems. It has different terminologies which are Path, Degree, Adjacent vertices, Connected components, etc.

### Characteristics of a Graph
The graph has various different characteristics which are as follows:

- The maximum distance from a vertex to all the other vertices is considered the Eccentricity of that vertex.
- The vertex having minimum Eccentricity is considered the central point of the graph.
- The minimum value of Eccentricity from all vertices is considered the radius of a connected graph.

### Operations performed on Graph
A graph is a non-linear data structure consisting of nodes and edges. Here are some common operations performed on graphs:

- Add Vertex: New vertices can be added to the graph to represent a new node.
- Add Edge: Edges can be added between vertices to represent a relationship between nodes.
- Remove Vertex: Vertices can be removed from the graph by updating the references of adjacent vertices to remove the reference to the current vertex.
- Remove Edge: Edges can be removed by updating the references of the adjacent vertices to remove the reference to the current edge.
- Depth-First Search (DFS): A graph can be traversed using a depth-first search by visiting the vertices in a depth-first manner.
- Breadth-First Search (BFS): A graph can be traversed using a breadth-first search by visiting the vertices in a breadth-first manner.
- Shortest Path: The shortest path between two vertices can be determined using algorithms such as Dijkstra’s algorithm or A* algorithm.
- Connected Components: The connected components of a graph can be determined by finding sets of vertices that are connected to each other but not to any other vertices in the graph.
- Cycle Detection: Cycles in a graph can be detected by checking for back edges during a depth-first search.

***
![Graph](https://media.geeksforgeeks.org/wp-content/uploads/20220518124302/undirectedgraph.png)
***