#questionário
1. O que é um objeto?
```
R: Qualquer coisa que tenha uma identidade.
```

2. Identifique 3 características e 3 comportamentos de um carro. 
```
Características: cor, limpeza, motor;
Comportamentos: em movimento, janelas abertas, ligado.
```

3. No contexto de Orientação a Objetos, as características e comportamentos são chamados respectivamente de?
```
R: Atributos e métodos.
```

4. Qual é o objetivo da programação orientada à objetos? 
```
R: Reduzir a complexidade e aumentar a produtividade.
```

5. O que é abstração? Cite um exemplo.
```
R: Isolar apenas as características principais de um objeto. Como o objeto Pessoa, por exemplo, atendo-se apenas à cor dos olhos e status de movimento.
```

6. O que é classe?
```
R: Abstração de um grupo de objetos com características em comum.
```

7. Qual é o padrão utilizado para nomear as classes? Cite um exemplo. 
```
R: Classes devem começar com uma letra maiúscula e sem caracteres especiais. Cadastro, por exemplo.
```

8. Qual opção apresenta corretamente o nome da classe carro elétrico?
```
1. carroeletrico
2. carroEletrico 
3. Carroeletrico <---
4. CarroEletrico 
5. carro_eletrico
```

9. Qual é o padrão utilizado para nomear os atributos? Cite um exemplo. 
```
R: Nome de atributos não podem ter números em sua composição, bem como podem começar com “$” ou “ _ “.
```

10. Qual opção apresenta corretamente o nome do atributo cor de fundo? 
```
1. CordeFundo
2. CorDeFundo
3. corDeFundo 
4. _cor_de_fundo <---
5. _corDeFundo 
6. CorDeFundo
```

11. Qual é o padrão utilizado para nomear os métodos? Cite um exemplo.
```
R: Sintaticamente, é bastante difundida a forma com iniciais das palavras maiúsculas, e sem espaço, e em favor da organização do código, o método deve receber o nome de acordo com a sua finalidade. fazerCafé(), por exemplo.
```

12. Qual opção apresenta corretamente o nome do método está vazio? 
```
1. estaVazio <---
2. _estaVazio
3. estavazio
4. EstaVazio
5. Estavazio
6. Esta_vazio
```

13. No contexto de orientação à objetos, o que é um objeto? Em que momento existe um objeto? Quando ele deixa de existir?
```
R: Um objeto é a instância de uma classe, e ele surge partindo de sua instanciação, e deixa de existir ao término da classe.
```

14. Qual é o objetivo do operador new?
```
R: Usado para instanciar um objeto novo. 
```

15. O que é o construtor? Qual é o seu objetivo? Qual deve ser o seu nome? Cite um exemplo.
```java
// exemplo:
public class Suco {
    private float quantidade_agua;
    private int quantidade_fruta;
    private String tipo_fruta;

    private String Suco(String tipo_fruta, float quantidade_agua, int quantidade_fruta) {
        this.tipo_fruta = "Laranja";
        this.quantidade_fruta = 2;
        this.quantidade_agua = 10,5;
    }
}
```
```
R: O método construtor é chamado sempre que criamos um objeto, cujas características perpetuarão sempre que o objeto for executado.
```

16. Caso o construtor da classe Aluno não for declarado, qual será o seu construtor? 
```
R: Construtor Padrão.
```

17. Crie um exemplo de instanciação da classe Aluno. Utilize o construtor padrão.
```java
public Aluno aluno = new Aluno();
```

18. O que é encapsulamento?
```
R: Une os atributos pertinentes à determinada implementação, e proteje a integridade dos atributos não necessários escondendo e impossibilitando a alteração.
```

19. Qual é o objetivo do modificador de acesso public? 
```
Tornar os métodos e atributos acessíveis à inserção de dados do usuário. 
```

20. Qual é o objetivo do modificador de acesso private? 
```
R: Limitar o acesso apenas 
```

21. Como é aplicado o encapsulamento em uma classe? Considere a classe Aluno com o atributo matrícula.
```java
public class Aluno {
    private String matricula;
    public String getMatricula() {
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
```

22. Qual o objetivo dos métodos getters? Crie um exemplo. 
```
R: Tem o intúito de apenas retornar o valor de um atributo.
```
```java
public int getIdade() {
    return idade;
}
```

23. Qual o objetivo dos métodos setters? Crie um exemplo.
```
R: Tem o intúito de alterar o valor de um atributo.
```
```java
public void setIdade(int apto) {
    this.apto = idade;
}
```

24. O diagrama de classe UML é composto por 3 partes. O que vai em cada parte?
```
R: Nome, atributos e métodos.
```

25. Qual é o padrão utilizado para representar um atributo no diagrama de classe UML? Crie um exemplo.
```
R: Modificador de acesso ("+" para público, "-" para privado e "#" para protegido) nome do atributo : tipo. "+ endereco String"
```

26. Qual é o padrão utilizado para representar um método no diagrama de classe UML? Crie um exemplo.
```
R: Modificador de acesso, nome do método e entre parênteses o tipo parâmetro (se houver), seguido de dois pontos e o tipo de retorno (se houver). "-getEndereco(): String"
```

27. Como o construtor de uma classe pode ser diferenciado no diagrama de classe UML? Crie um exemplo.
```
R: Com a inserção de um sinal positivo ou negativo na frente do nome do atributo ou método. "-idade:int".
```

28. Quais são os símbolos utilizados no diagrama de classe UML para representar os modificadores de acessos ao atributos e métodos? Crie um exemplo.
```
R: "+" para público, "-" para privado e "#" para protegido.
```

29. Considere a classe Cliente, com os atributos nome, email e telefone com os respectivos métodos getters e setters. Desenvolva o diagrama de classe UML. 

| Cliente                          |
| -------------------------------- |
| - nome: String <br> - email: String <br> - telefone: String |
| + getNome(): String <br> + setNome(nome:String) <br> + getTelefone(): String <br> + setTelefone(Telefone:String) <br> + getEmail(): String <br> + setEmail(email: String) |

30. Considere a classe Cliente apresentado no Problema 29, e desenvolva o código Java correspondente.
```java
public class Cliente{
    private String nome;
    private String email;
    private String telefone;
    
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
```

31. Desenvolva o código java das classes do apresentadas no diagrama de classes:
```java
public class Produto{
    private String nome;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}

public class Password{
    private String value;
    public String Password(String value){
        this.password = password;
    }
    public boolean isEqual(Password p){
        p = true;
    }
}

public class Animal{
    private boolean alive;
    public void isAlive(){
        this.alive = true;
    }
    private void die(){

    }
}
```

32. Desenvolva o diagrama de classe dos códigos Java abaixo.
```java
public class Livro{
    private String nome;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
public class ContaCorrente{
    private double saldo;
    public double sacar(double valor){
        return 0.0;
    }
    public void depositar(double valor){
        this.saldo = saldo;
    }
    private void recalcularSaldo(){
    }
}
public class Par{
    public String chave;
    public String valor;
}
public class Impressora{
    public void imprimir(Documento documento){
    }
}
```

| Livro                            |
| -------------------------------- |
| - nome: String                   |
| + getNome(): String <br> + setNome(nome:String) |

| ContaCorrente                    |
| -------------------------------- |
| - saldo: double                  |
| + sacar(valor: double): String <br> + depositar(): String <br> + recalcularSaldo() |

| Par                              |
| -------------------------------- |
| + chave: double <br> + valor: double |
|                                  |

| Impressora                       |
| -------------------------------- |
|                                  |
| + imprimir(documento: Documento) |


33. O que é o estado de um objeto? Cite um exemplo com a classe Aluno com os atributos nome, idade, matrícula e curso. Utilize o diagrama de estado de objeto.
```
R: É o valor atribuído à seus atributos em determinado momento.
```

| Aluno: 2122221     |
| ------------------ |
| nome: "Alberto"<br> idade: 19 <br> matrícula: 2222222 <br> curso: Sociologia |

34. Qual é o estado do objeto da classe Dog quando é inicializado? Desenvolva o diagrama de objetos.

| Dog:               |
| ------------------ |
| years: <br> name: <br> alive: |

35. Qual é o estado do objeto dog no final da execução do método main? Desenvolva o diagrama de objetos.

| Dog:               |
| ------------------ |
| years: 10 <br> name: "Spike" <br> alive: true |

36. Qual é o estado do objeto pug e buldog após a execução da linha 6? Desenvolva o diagrama de objetos.


| Pug:               |
| ------------------ |
| years: 2 <br> name: "Spoke" <br> alive: true |

| Bulldog:           |
| ------------------ |
| years: <br> name: "Spike" <br> alive: |


37. Analise o código abaixo. Verifique se existem problemas, caso sim, indique o problema e sugere as correções.
```java
public class Cat{
    private String name;
    public double weight;
// Getters e Setters suprimidos
}
public class Main{
    public static void main(String args[]){
        Cat c = new Cat();
        c.weight = 3.5;
        c.name = "BlackCat";
}
}
```
```
R: O atributo "weight" na classe Cat está público e isso pode acarretar alterações indevidas no programa.
```