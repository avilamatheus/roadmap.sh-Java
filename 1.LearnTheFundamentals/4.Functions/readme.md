## Métodos/Funções / Methods/Functions

## Oque são métodos/funções? / What are methods/functions?
**PT-BR**  
Um método é um bloco de código ou coleção de declarações ou um conjunto de código agrupado para executar uma determinada tarefa ou operação. É usado para alcançar a reutilização de código. Escrevemos um método uma vez e o usamos muitas vezes. Não precisamos escrever o código repetidamente. Ele também fornece a fácil modificação e legibilidade do código, apenas adicionando ou removendo um trecho de código. O método é executado apenas quando o chamamos ou invocamos.

***

**EN-US**  
A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation. It is used to achieve the reusability of code. We write a method once and use it many times. We do not require to write code again and again. It also provides the easy modification and readability of code, just by adding or removing a chunk of code. The method is executed only when we call or invoke it.

## Sintaxe / Syntax
**PT-BR**  
```
<access_modifier> <return_type> <method_name>( list_of_parameters)
{
    //body
}
```
exemplificando:
```
public int sum(int a, int b)
{
    return a+b;
}
```


Em geral, as declarações de método têm 6 componentes:

1. Modificador: define o tipo de acesso do método, ou seja, de onde ele pode ser acessado em seu aplicativo. Em Java, existem 4 tipos de especificadores de acesso.

    - public: é acessível em todas as classes do seu aplicativo.
    - protected: é acessível dentro da classe em que é definido e em sua subclasse / es
    - private: é acessível apenas dentro da classe em que é definido.
    - default: é declarado / definido sem usar nenhum modificador. É acessível dentro da mesma classe e pacote dentro do qual sua classe é definida.

2. O tipo de retorno: o tipo de dados do valor retornado pelo método ou void se não retornar um valor. É obrigatório na sintaxe.

3. Nome do método: as regras para nomes de campo também se aplicam aos nomes de método, mas a convenção é um pouco diferente. É obrigatório na sintaxe.

4. Lista de parâmetros: lista separada por vírgulas dos parâmetros de entrada é definida, precedida pelo tipo de dados, dentro do parêntese fechado. Se não houver parâmetros, você deve usar parênteses vazios (). É opcional na sintaxe.

5. Lista de exceções: as exceções que você espera que o método possa lançar, você pode especificar essas exceções. É opcional na sintaxe.

6. Corpo do método: é delimitado por chaves. O código que você precisa ser executado para realizar suas operações pretendidas. É opcional na sintaxe.


***

**EN-US**  
```
<access_modifier> <return_type> <method_name>( list_of_parameters)
{
    //body
}
```

example:
```
public int sum(int a, int b)
{
    return a+b;
}
```

In general, method declarations have 6 components:

1. Modifier: It defines the access type of the method i.e. from where it can be accessed in your application. In Java, there 4 types of access specifiers. 

    - public: It is accessible in all classes in your application.
    - protected: It is accessible within the class in which it is defined and in its subclass/es
    - private: It is accessible only within the class in which it is defined.
    - default: It is declared/defined without using any modifier. It is accessible within the same class and package within which its class is defined.

2. The return type: The data type of the value returned by the method or void if does not return a value. It is Mandatory in syntax.

3. Method Name: the rules for field names apply to method names as well, but the convention is a little different. It is Mandatory in syntax.

4. Parameter list: Comma-separated list of the input parameters is defined, preceded by their data type, within the enclosed parenthesis. If there are no parameters, you must use empty parentheses ().  It is Optional in syntax.

5. Exception list: The exceptions you expect by the method can throw, you can specify these exception(s). It is Optional in syntax.

6. Method body: it is enclosed between braces. The code you need to be executed to perform your intended operations.  It is Optional in syntax.

## Nomeando métodos / Naming methods

**PT-BR**  
Ao definir um método, lembre-se de que o nome do método deve ser um verbo e começar com uma letra minúscula. Se o nome do método tiver mais de duas palavras, o primeiro nome deve ser um verbo seguido de adjetivo ou substantivo. No nome do método de várias palavras, a primeira letra de cada palavra deve estar em maiúscula, exceto a primeira palavra. Por exemplo:

Nome do método de uma única palavra: sum (), area ()

Nome do método de várias palavras: areaOfCircle (), stringComparision ()

Também é possível que um método tenha o mesmo nome que outro nome de método na mesma classe, é conhecido como sobrecarga de método. Nesse caso, o método deve ter parâmetros diferentes.

*** 

**EN-US**  
While defining a method, remember that the method name must be a verb and start with a lowercase letter. If the method name has more than two words, the first name must be a verb followed by adjective or noun. In the multi-word method name, the first letter of each word must be in uppercase except the first word. For example:

Single-word method name: sum(), area()

Multi-word method name: areaOfCircle(), stringComparision()

It is also possible that a method has the same name as another method name in the same class, it is known as method overloading. In this case, the method must have different parameters.

## Métodos estáticos / Static methods

**PT-BR**  
Um método que possui a palavra-chave "static" é conhecido como método estático. Em outras palavras, um método que pertence a uma classe em vez de uma instância de uma classe é conhecido como um método estático.

A principal vantagem de um método estático é que podemos chamá-lo sem criar um objeto. Ele pode acessar membros de dados estáticos e também alterar o valor dele. É usado para criar um método de instância. É invocado usando o nome da classe.

Exemplo de uma classe "Calculadora" com um método estático "soma":
```
public class Calculator
{
    public static int sum(int a, int b)
    {
        return a+b;
    }
}
```

Exemplo de uso do método estático "soma":
```
public class Main
{
    public static void main(String[] args)
    {
        int result = Calculator.sum(10, 20);
        System.out.println(result);
    }
}
```


***

**EN-US**  
A method that has static keyword is known as static method. In other words, a method that belongs to a class rather than an instance of a class is known as a static method.

The main advantage of a static method is that we can call it without creating an object. It can access static data members and also change the value of it. It is used to create an instance method.

## Métodos de instância / Instance methods
**PT-BR**  
O método da classe é conhecido como método de instância. É um método não estático definido na classe. Antes de chamar ou invocar o método de instância, é necessário criar um objeto de sua classe.

Usando o mesmo exemplo da classe "Calculadora" com um método de instância "soma":
```
public class Calculator
{
    public int sum(int a, int b)
    {
        return a+b;
    }
}
```

Exemplo de uso do método de instância "soma":
```
public class Main
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        int result = calc.sum(10, 20);
        System.out.println(result);
    }
}
```

***

**EN-US**  
The method of the class is known as an instance method. It is a non-static method defined in the class. Before calling or invoking the instance method, it is necessary to create an object of its class.

Using the same example of the class "Calculator" with an instance method "sum":
```
public class Calculator
{
    public int sum(int a, int b)
    {
        return a+b;
    }
}
```

Example of using the instance method "sum":
```
public class Main
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        int result = calc.sum(10, 20);
        System.out.println(result);
    }
}
```