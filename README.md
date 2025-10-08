# Apresentação de Exercícios — 2º Bimestre

Como atividade de apresentação do 2º bimestre, foram desenvolvidos exercícios com o objetivo de compreender melhor o funcionamento da linguagem Java e suas principais ferramentas.

---

1. Classe Filme

A classe Filme foi implementada para representar um filme com os atributos nome, duração, nota, lista de atores e status de lançamento.

Durante a implementação, verificou-se que listas e arrays em Java são objetos pertencentes a classes específicas, possuindo métodos próprios. Esse aspecto evidenciou a importância do uso do método .equals(), utilizado para comparar conteúdos de objetos, e não apenas seus endereços de memória, já que Strings também são objetos em Java.

A classe também apresenta um comportamento específico no método setNota(), que realiza o cálculo da média quando uma nova nota é atribuída.

```
public void setNota(int nota) {
    if (this.nota == 0) {
        this.nota = nota;
    } else {
        this.nota = (this.nota + nota) / 2;
    }
}
```

Outro ponto importante foi o uso de uma lista de atores, demonstrando o funcionamento das coleções em Java:

```
private List<String> atores = new ArrayList<>();
public void setAtor(String nome) {
    this.atores.add(nome);
}
```

Essas implementações reforçaram o entendimento de que coleções e strings em Java são objetos com métodos próprios, o que exige atenção ao manipular e comparar seus valores.

2. Classe TestFilme 

A classe TestFilme foi utilizada para realizar testes manuais dos métodos da classe Filme.
Os valores foram atribuídos a um novo objeto e, em seguida, verificados por meio dos métodos get e set.

Foram utilizadas estruturas condicionais if em conjunto com o método .equals() para confirmar o funcionamento correto dos métodos.
Essa abordagem permitiu validar o comportamento da classe de forma direta e observar a manipulação dos atributos.

```
Filme novoFilme = new Filme();
novoFilme.setNome("Como Treinar o Seu Dragão");
novoFilme.setDuracaoMinutos(125);
novoFilme.setNota(10);
novoFilme.setAtor("Nico Parker");
novoFilme.setFilmeLancado(true);

if (novoFilme.getDuracaoMinutos() == 125) {
    System.out.println("Função de duração correta");
}
```

Após essa etapa, inspirado pela framework de testes do Haskell, foi identificado a possibilidade de automatizar o processo de verificação dos métodos, o que motivou a pesquisa sobre ferramentas de teste para Java, levando à utilização do JUnit.

Gif: Execução da Classe TestFilme
![Execução TestFilme](imagens/testfilme.gif)

3. Classe TestFilmeJunit

Na classe TestFilmeJunit, foi aplicado o framework JUnit para a execução de testes automatizados.
Foram utilizadas as anotações @BeforeEach e @Test, além dos métodos assertEquals() e assertTrue(), responsáveis por comparar os resultados esperados com os resultados obtidos.

Exemplo:
```
@Test
public void testarNome() {
    assertEquals("Como Treinar o Seu Dragão", novoFilme.getNome());
}

@Test
public void testarFilmeLancado() {
    assertTrue(novoFilme.getFilmeLancado());
}

Gif: Execução da Classe TestFilmeJunit
![Execução TestFilmeJunit](imagens/testfilmejunit.gif)
```
Algo que tive um pouco de dificuldade na compreensão foi o uso do @, interpreto como se fosse o nome da função para a biblioteca JUnit, como se ela buscasse esse nome para aplicar seus métodos.
---
## Diagrama de Classes

Foi elaborado um diagrama de classes no estilo UML, com o objetivo de apresentar uma visão geral do sistema, destacando os atributos e métodos das classes e suas relações.

![Diagrama da Classe](imagens/diagrama_filme.png)

---

### Referências Bibliográficas

Visual Paradigm Online

Documentação Oficial do JUnit

Melhores Ferramentas de Teste Java — APIDog

Criando Listas em Java — DelftStack

Quer que eu adicione uma versão com blocos HTML para os GIFs e o diagrama (para exibir vídeos/imagens diretamente no navegador)? Isso é útil se o relatório for usado em sites, GitHub Pages ou no Google Sites.

Você disse:
use outros exemplos, porque no filme voce fez um exemplo que era da classe test
O ChatGPT disse:

Perfeito 👌
Aqui está a versão revisada do seu Markdown, com exemplos coerentes com cada classe, mantendo o tom impessoal e técnico, e agora com trechos realmente da classe Filme.

🎬 Apresentação de Exercícios — 2º Bimestre

Como atividade de apresentação do 2º bimestre, foram desenvolvidos exercícios com o objetivo de compreender melhor o funcionamento da linguagem Java e suas principais ferramentas.

🧱 Classe Filme

A classe Filme foi implementada para representar um filme com os atributos nome, duração, nota, lista de atores e status de lançamento.

Durante a implementação, verificou-se que listas e arrays em Java são objetos pertencentes a classes específicas, possuindo métodos próprios. Esse aspecto evidenciou a importância do uso do método .equals(), utilizado para comparar conteúdos de objetos, e não apenas seus endereços de memória, já que Strings também são objetos em Java.

A classe também apresenta um comportamento específico no método setNota(), que realiza o cálculo da média quando uma nova nota é atribuída.

Exemplo:
public void setNota(int nota) {
    if (this.nota == 0) {
        this.nota = nota;
    } else {
        this.nota = (this.nota + nota) / 2;
    }
}


Outro ponto importante foi o uso de uma lista de atores, demonstrando o funcionamento das coleções em Java:

private List<String> atores = new ArrayList<>();

public void setAtor(String nome) {
    this.atores.add(nome);
}


Essas implementações reforçaram o entendimento de que coleções e strings em Java são objetos com métodos próprios, o que exige atenção ao manipular e comparar seus valores.

🧪 Classe TestFilme (Teste Manual)

A classe TestFilme foi utilizada para realizar testes manuais dos métodos da classe Filme.
Nela, um novo objeto foi criado, e seus atributos foram configurados e verificados por meio dos métodos getters e setters.

Foram utilizadas estruturas condicionais if e o método .equals() para confirmar se as operações foram executadas corretamente. Essa abordagem permitiu validar o comportamento da classe sem o uso de ferramentas externas.

Exemplo:
Filme novoFilme = new Filme();
novoFilme.setNome("Como Treinar o Seu Dragão");
novoFilme.setDuracaoMinutos(125);
novoFilme.setNota(10);
novoFilme.setAtor("Nico Parker");
novoFilme.setFilmeLancado(true);

if (novoFilme.getDuracaoMinutos() == 125) {
    System.out.println("Função de duração correta");
}


Após a execução desses testes, identificou-se a possibilidade de automatizar o processo de verificação de resultados, o que levou à pesquisa e utilização do framework JUnit.

Gif: Execução da Classe TestFilme
![Execução TestFilme](imagens/testfilme.gif)

⚙️ Classe TestFilmeJunit

Na classe TestFilmeJunit, foi aplicado o framework JUnit para a execução de testes automatizados.
Foram utilizadas as anotações @BeforeEach e @Test, além dos métodos assertEquals() e assertTrue(), que permitem comparar automaticamente os resultados esperados com os resultados obtidos.

Inicialmente, acreditava-se que seria necessário o uso de herança para acessar os métodos do JUnit, como em versões anteriores do framework. No entanto, foi observado que, nas versões atuais, é possível utilizá-los diretamente por meio de importações estáticas, tornando o código mais simples e modular.

Exemplo:
@Test
public void testarDuracaoMinutos() {
    assertEquals(125, novoFilme.getDuracaoMinutos());
}

@Test
public void testarFilmeLancado() {
    assertTrue(novoFilme.getFilmeLancado());
}


Essa abordagem proporcionou uma execução automatizada e repetível dos testes, garantindo mais confiabilidade no código.

Gif: Execução da Classe TestFilmeJunit
![Execução TestFilmeJunit](imagens/testfilmejunit.gif)

### Diagrama de Classes

Foi elaborado um diagrama de classes UML para apresentar uma visão geral do sistema, destacando os atributos, métodos e as relações entre as classes implementadas.

![Diagrama da Classe](imagens/diagrama_filme.png)

### Referências Bibliográficas

- Visual Paradigm Online :  https://online.visual-paradigm.com/

- Documentação Oficial do JUnit: https://docs.junit.org/current/user-guide/

- Melhores Ferramentas de Teste Java — APIDog : https://apidog.com/pt/blog/best-testing-java-tools-pt/

- Criando Listas em Java — DelftStack :  https://www.delftstack.com/pt/howto/java/how-to-create-a-new-list-in-java/
