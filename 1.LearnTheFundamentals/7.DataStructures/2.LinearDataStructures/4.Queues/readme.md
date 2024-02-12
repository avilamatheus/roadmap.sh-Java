# Filas / Queues

## O que é uma Fila? / What is a Queue?
**PT-BR**  
Uma fila é uma estrutura de dados linear na qual as operações são realizadas na ordem First In First Out (FIFO).

Definimos uma fila como uma lista na qual todas as adições à lista são feitas em uma extremidade, e todas as remoções da lista são feitas na outra extremidade. O primeiro elemento a ser inserido na fila é o primeiro a ser removido.

***

**EN-US**  
A queue is a linear data structure in which the operations are performed in the First In First Out (FIFO) order.

We define a queue to be a list in which all additions to the list are made at one end, and all deletions from the list are made at the other end. The first element to be inserted in the queue is the first to be removed.
***

## Características da Fila / Characteristics of Queue
**PT-BR**  
- A fila pode lidar com vários dados.
- Podemos acessar ambas as extremidades.
- Elas são rápidas e flexíveis.

***

**EN-US**  
- Queue can handle multiple data.
- We can access both ends.
- They are fast and flexible. 

***

## Implementação de uma Fila / Implementation of a Queue
**PT-BR**  
Assim como a Pilha, a Fila também pode ser implementada usando um array ou uma lista encadeada.

***

**EN-US**  
Just like Stack, Queue can also be implemented using an array or a linked list.

***

## Tipos de Filas / Types of Queues
**PT-BR**  
1. **Fila de Entrada Restrita**: Esta é uma fila simples. Neste tipo de fila, a entrada pode ser feita apenas de uma extremidade, mas a remoção pode ser feita de qualquer uma das extremidades.

2. **Fila de Saída Restrita**: Esta também é uma fila simples. Neste tipo de fila, a entrada pode ser feita de ambas as extremidades, mas a remoção pode ser feita de apenas uma extremidade.

3. **Fila Circular**: Este é um tipo especial de fila onde a última posição é conectada de volta à primeira posição. Aqui também as operações são realizadas na ordem FIFO.

4. **Fila de Ponta Dupla (Dequeue)**: Em uma fila de ponta dupla, as operações de inserção e remoção podem ser realizadas de ambas as extremidades.

5. **Fila de Prioridade**: Uma fila de prioridade é uma fila especial onde os elementos são acessados com base na prioridade atribuída a eles.

***

**EN-US**  
1. **Input Restricted Queue**: This is a simple queue. In this type of queue, the input can be taken from only one end but deletion can be done from any of the ends.

2. **Output Restricted Queue**: This is also a simple queue. In this type of queue, the input can be taken from both ends but deletion can be done from only one end.

3. **Circular Queue**: This is a special type of queue where the last position is connected back to the first position. Here also the operations are performed in FIFO order.

4. **Double-Ended Queue (Dequeue)**: In a double-ended queue the insertion and deletion operations, both can be performed from both ends.

5. **Priority Queue**: A priority queue is a special queue where the elements are accessed based on the priority assigned to them.
***

## Operações em uma Fila / Operations on a Queue

**PT-BR**  
1. **Enqueue()** – Adiciona (ou armazena) um elemento no final da fila.

2. **Dequeue()** – Remove elementos da fila.

3. **Peek()** ou **front()**- Adquire o elemento de dados disponível no início da fila sem excluí-lo.

4. **rear()** – Retorna o elemento do final da fila sem removê-lo.

5. **isFull()** – Verifica se a fila está cheia.

6. **isNull()** – Verifica se a fila está vazia.

Todas as operações acima têm complexidade de tempo O(1).

***

**EN-US**  
1. **Enqueue()** – Adds (or stores) an element to the end of the queue.

2. **Dequeue()** – Removes elements from the queue.

3. **Peek()** or **front()**- Acquires the data element available at the front node of the queue without deleting it.

4. **rear()** – This operation returns the element at the rear end without removing it.

5. **isFull()** – Validates if the queue is full.

6. **isNull()** – Checks if the queue is empty.

All the above operations have time complexity O(1).

***