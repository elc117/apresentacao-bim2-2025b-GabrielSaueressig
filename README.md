# Apresentação de Exercícios — 2º Bimestre

Como atividade de apresentação do 2º bimestre, foram desenvolvidos exercícios com o objetivo de compreender melhor o funcionamento da linguagem Java e suas principais ferramentas.

---

## Classe Filme

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

## Classe TestFilme 

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

![Execução TestFilme](midias/2025-10-08-13-34-53-_online-video-cutter.com_.gif)

## Classe TestFilmeJunit

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

![Execução TestFilmeJUnit](midias/2025-10-08-13-35-21-_online-video-cutter.com_.gif)

---
## Diagrama de Classes

Foi elaborado um diagrama de classes no estilo UML, com o objetivo de apresentar uma visão geral do sistema, destacando os atributos e métodos das classes e suas relações.

![Diagrama da Classe](midias/diagramaParadigma.png)

---

## Referências Bibliográficas

- Visual Paradigm Online :  https://online.visual-paradigm.com/

- Documentação Oficial do JUnit: https://docs.junit.org/current/user-guide/

- Melhores Ferramentas de Teste Java — APIDog : https://apidog.com/pt/blog/best-testing-java-tools-pt/

- Criando Listas em Java — DelftStack :  https://www.delftstack.com/pt/howto/java/how-to-create-a-new-list-in-java/
