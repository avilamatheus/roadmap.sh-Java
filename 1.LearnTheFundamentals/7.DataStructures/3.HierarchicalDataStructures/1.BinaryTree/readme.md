# Arvore Binária / Binary Tree
**PT-BR**  
Diferente de Arrays, Linked Lists, Stacks, e Queues, que são estruturas de dados lineares, árvores são estruturas de dados hierárquicas.

Uma árvore binária é uma estrutura de dados em árvore na qual cada nó tem no máximo dois filhos, que são referidos como filho esquerdo e filho direito. É implementada principalmente usando ponteiros.


***

**EN-US**  
Unlike Arrays, Linked Lists, Stack, and Queues, which are linear data structures, trees are hierarchical data structures. 

A binary tree is a tree data structure in which each node has at most two children, which are referred to as the left child and the right child. It is implemented mainly using pointers. 

***
## Representação / Representation
**PT-BR**  
Uma árvore é representada por um ponteiro para o nó mais alto na árvore. Se a árvore estiver vazia, então o valor do nó raiz é NULL. Um nó de árvore binária contém as seguintes partes:

1. Dados
2. Ponteiro para o filho esquerdo
3. Ponteiro para o filho direito

Além disso, uma árvore binária pode ser percorrida de duas maneiras:
- Travessia em Profundidade: Inorder (Esquerda-Raiz-Direita), Preorder (Raiz-Esquerda-Direita), e Postorder (Esquerda-Direita-Raiz)
- Travessia em Largura: Travessia em Ordem de Nível

***

**EN-US**  
A tree is represented by a pointer to the topmost node in the tree. If the tree is empty, then the value of the root is NULL. A Binary Tree node contains the following parts:
1. Data 
2. Pointer to left child 
3. Pointer to the right child

Also, a Binary Tree can be traversed in two ways: 
- Depth First Traversal: Inorder (Left-Root-Right), Preorder (Root-Left-Right), and Postorder (Left-Right-Root) 
- Breadth-First Traversal: Level Order Traversal 

***

## Propriedades / Properties
**PT-BR**  
- O número máximo de nós no nível ‘L’ é dado por 2^L.
- O número máximo de nós é dado por 2^(h + 1) – 1. Aqui h é a altura da árvore. A altura é considerada como o número máximo de arestas em um caminho da raiz para a folha.
- Em uma árvore binária, o número de nós do tipo folha é sempre um a mais do que os nós com dois filhos.
- Complexidade de tempo da travessia de árvore: O(n)

***

**EN-US**  
- The maximum number of nodes on level ‘L’ is 2^L.
- The maximum number of nodes is 2^(h + 1) – 1. Here h is the height of the tree. Height is considered as the number of edges on the longest path from the root to a leaf.
- In a binary tree, the number of leaf nodes is always one more than nodes with two children.
- Time complexity of tree traversals: O(n)

***

## Operações / Operations
**PT-BR**  
Operações Básicas Em Árvore Binária:

- Inserir um elemento.
- Remover um elemento.
- Procurar um elemento.

Operações Auxiliares Em Árvore Binária:

- Encontrar a altura da árvore.
- Encontrar o nível da árvore.
- Encontrar o tamanho da árvore inteira.
***

**EN-US**  
Basic Operation On Binary Tree:

- Insert an element.
- Remove an element.
- Search for an element.

Auxiliary Operation On Binary Tree:

- Finding the height of the tree.
- Find the level of the tree.
- Finding the size of the entire tree.

***

## Travessia de Árvore Binária / Binary Tree Traversal
**PT-BR**  
- **Pré-ordem**: Aqui, a travessia é: raiz – filho esquerdo – filho direito. Significa que o nó raiz é percorrido primeiro, depois seu filho esquerdo e, finalmente, o filho direito.
- **Em-ordem**: Aqui, a travessia é: filho esquerdo – raiz – filho direito. Significa que o filho esquerdo é percorrido primeiro, depois seu nó raiz e, finalmente, o filho direito.
- **Pós-ordem**: Aqui, a travessia é: filho esquerdo – filho direito – raiz. Significa que o filho esquerdo é percorrido primeiro, depois o filho direito e, finalmente, seu nó raiz.
***

**EN-US**  
- **Preorder Traversal**: Here, the traversal is : root – left child – right child. It means that the root node is traversed first then its left child and finally the right child.
- **Inorder Traversal**: Here, the traversal is : left child – root – right child.  It means that the left child is traversed first then its root node and finally the right child.
- **Postorder Traversal**: Here, the traversal is : left child – right child – root.  It means that the left child is traversed first then the right child and finally its root node.

***