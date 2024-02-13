# Árvore Binária de Busca / Binary Search Tree 
**PT-BR**  
Árvore Binária de Busca (BST) é uma árvore cuja principal função é buscar um elemento específico.

A Árvore Binária de Busca é uma Árvore Binária com as seguintes propriedades adicionais:
1. A subárvore esquerda de um nó contém apenas nós com chaves menores que a chave do nó.
2. A subárvore direita de um nó contém apenas nós com chaves maiores que a chave do nó.
3. A subárvore esquerda e a subárvore direita também devem ser uma árvore binária de busca.

***

**EN-US**  
Binary Search Tree (BST) is a tree whose main function is to search a specific element.

The Binary Search Tree is a Binary Tree with the following additional properties: 
1. The left subtree of a node contains only nodes with keys less than the node’s key. 
2. The right subtree of a node contains only nodes with keys greater than the node’s key. 
3. The left and right subtree each must also be a binary search tree.

***
## Operações / Operations
**PT-BR**  
Operações Primárias da BST:

- Encontrar o elemento mínimo ou máximo.
- Deletar um elemento específico da árvore.
- Inserir um elemento específico na árvore.

Operações Auxiliares da BST:

- Encontrar o k-ésimo menor elemento.
- Identificar se a árvore dada é uma BST ou não.

Complexidade de Tempo:
- Busca, Inserção e Deleção: O(h), onde:
    - h: Altura da BST
    - n: Número de nós na BST
    - Se a Árvore de Busca Binária é Balanceada, então h = O(Log n)
    - BSTs Auto-Balanceadas como a Árvore AVL garantem que a altura da BST permaneça O(Log n)

BST fornece acesso/pesquisa moderado (mais rápido que Lista Encadeada e mais lento que arrays). Além disso, BST fornece inserção/deleção moderada (mais rápida que Arrays e mais lenta que Listas Encadeadas).


***

**EN-US**  
Primary BST Operations:

- Finding minimum or maximum element.
- Deleting a particular element from the tree.
- Inserting a particular element in the tree.

Auxiliary BST Operations:

- Finding kth smallest element.
- To identify whether the given tree is a BST or not.

Time Complexities: 
- Search, Insertion and Deletion: O(h), where:
    - h: Height of BST
    - n: Number of nodes in BST
    - If Binary Search Tree is Height Balanced, then h = O(Log n)
    - Self-Balancing BSTs such as AVL Tree make sure that height of BST remains O(Log n)

BST provides moderate access/search (quicker than Linked List and slower than arrays). Also, BST provides moderate insertion/deletion (quicker than Arrays and slower than Linked Lists). 



***