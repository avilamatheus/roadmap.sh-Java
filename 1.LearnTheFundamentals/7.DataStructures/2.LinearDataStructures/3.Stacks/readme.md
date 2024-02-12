# Pilhas / Stacks

## O que é uma Pilha? / What is a Stack? 

**PT-BR**  
Uma pilha é uma estrutura de dados linear na qual a inserção de um novo elemento e a remoção de um elemento existente ocorre no mesmo extremo representado como o topo da pilha.

Para implementar a pilha, é necessário manter o ponteiro para o topo da pilha, que é o último elemento a ser inserido, pois só podemos acessar os elementos no topo da pilha.

***

**EN-US**  
A stack is a linear data structure in which the insertion of a new element and removal of an existing element takes place at the same end represented as the top of the stack.

To implement the stack, it is required to maintain the pointer to the top of the stack, which is the last element to be inserted because we can access the elements only on the top of the stack.

## LIFO (Last In First Out)

**PT-BR**  
Essa estratégia afirma que o elemento que é inserido por último sairá primeiro. Você pode pegar um monte de pratos empilhados como um exemplo da vida real. O prato que colocamos por último está no topo e, como removemos o prato que está no topo, podemos dizer que o prato que foi colocado por último sai primeiro.

***

**EN-US**  
This strategy states that the element that is inserted last will come out first. You can take a pile of plates kept on top of each other as a real-life example. The plate which we put last is on the top and since we remove the plate that is at the top, we can say that the plate that was put last comes out first.

## Operações em uma Pilha / Operations on a Stack
**PT-BR**  
- push()
    - Insere um elemento na pilha
    - Complexidade de Tempo: O(1)

- pop()
    - Remove um elemento da pilha
    - Complexidade de Tempo: O(1)

- top()
    - Retorna o elemento do topo da pilha.
    - Complexidade de Tempo: O(1)

- isEmpty()
    - Retorna verdadeiro se a pilha estiver vazia, ou falso caso contrário.
    - Complexidade de Tempo: O(1)

- size()
    - Retorna o tamanho da pilha.
    - Complexidade de Tempo: O(1)

***

**EN-US**  
- push()
    - Inserts an element into the stack
    - Time Complexity: O(1)

- pop()
    - Removes an element from the stack
    - Time Complexity: O(1)

- top()
    - Returns the top element of the stack.
    - Time Complexity: O(1)

- isEmpty()
    - Returns true if stack is empty, or false otherwise.
    - Time Complexity: O(1)

- size()
    - Returns the size of stack.
    - Time Complexity: O(1)

## Tipos de Pilhas / Types of Stacks
**PT-BR**  
- Pilha de Tamanho Fixo: Como o nome sugere, uma pilha de tamanho fixo tem um tamanho fixo e não pode crescer ou encolher dinamicamente. Se a pilha estiver cheia e uma tentativa for feita para adicionar um elemento a ela, ocorre um erro de overflow. Se a pilha estiver vazia e uma tentativa for feita para remover um elemento dela, ocorre um erro de underflow.

- Pilha de Tamanho Dinâmico: Uma pilha de tamanho dinâmico pode crescer ou encolher dinamicamente. Quando a pilha está cheia, ela aumenta automaticamente seu tamanho para acomodar o novo elemento, e quando a pilha está vazia, ela diminui seu tamanho. Esse tipo de pilha é implementado usando uma lista encadeada, pois permite o redimensionamento fácil da pilha.

***

**EN-US**  
- Fixed Size Stack: As the name suggests, a fixed size stack has a fixed size and cannot grow or shrink dynamically. If the stack is full and an attempt is made to add an element to it, an overflow error occurs. If the stack is empty and an attempt is made to remove an element from it, an underflow error occurs.

- Dynamic Size Stack: A dynamic size stack can grow or shrink dynamically. When the stack is full, it automatically increases its size to accommodate the new element, and when the stack is empty, it decreases its size. This type of stack is implemented using a linked list, as it allows for easy resizing of the stack.

***

## Implementação de Pilhas / Stack Implementation
**PT-BR**  
Uma pilha pode ser implementada usando um array ou uma lista encadeada. Em uma implementação baseada em array, a operação push é implementada incrementando o índice do elemento do topo e armazenando o novo elemento nesse índice. A operação pop é implementada decrementando o índice do elemento do topo e retornando o valor armazenado nesse índice.

Em uma implementação baseada em lista encadeada, a operação push é implementada criando um novo nó com o novo elemento e definindo o ponteiro next do nó do topo atual para o novo nó. A operação pop é implementada definindo o ponteiro next do nó do topo atual para o próximo nó e retornando o valor do nó do topo atual.

As vantagens da Implementação baseada em Array são:
- É fácil de implementar.
- De certa forma, a memória é economizada porque não precisamos usar ponteiros.

As desvantagens da Implementação baseada em Array são:
- O tamanho da pilha deve ser conhecido antecipadamente (Mas no caso de arrays de tamanho dinâmico como vector em C++, list em Python, ArrayList em Java, as pilhas podem crescer e encolher com a implementação de array também).

As vantagens da Implementação baseada em Lista Encadeada são:
- O tamanho da pilha pode ser alterado dinamicamente.

As desvantagens da Implementação baseada em Lista Encadeada são:
- Requer memória extra devido ao uso de ponteiros.

***

**EN-US**  
A stack can be implemented using an array or a linked list. In an array-based implementation, the push operation is implemented by incrementing the index of the top element and storing the new element at that index. The pop operation is implemented by decrementing the index of the top element and returning the value stored at that index. 

In a linked list-based implementation, the push operation is implemented by creating a new node with the new element and setting the next pointer of the current top node to the new node. The pop operation is implemented by setting the next pointer of the current top node to the next node and returning the value of the current top node.
    
The advantages of Array-based Implementation are:
- It is easy to implement.
- In a certain way, memory is saved because we don't need to use pointers.

The disadvantages of Array-based Implementation are:
- The size of the stack must be known in advance (But in case of dynamic sized arrays like vector in C++, list in Python, ArrayList in Java, stacks can grow and shrink with array implementation as well).

The advantages of Linked List-based Implementation are:
- The size of the stack can be changed dynamically.

The disadvantages of Linked List-based Implementation are:
- It requires extra memory due to the use of pointers.

***

