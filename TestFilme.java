
public class TestFilme{
    public static void main(String[] args) {

        Filme novoFilme = new Filme();
        novoFilme.setNome("Como Treinar o Seu Dragão");
        novoFilme.setDuracaoMinutos(125);
        novoFilme.setNota(10);
        novoFilme.setAtor("Nico Parker");
        novoFilme.setFilmeLancado(true);

        if(novoFilme.getNome().equals("Como Treinar o Seu Dragão")){
            System.out.println("Função Nome Correta");
        }else{
            System.out.println("Função Nome Incorreta");
        }

        if(novoFilme.getDuracaoMinutos() == 125){
            System.out.println("Função Duração em Minutos Correta");
        }else{
            System.out.println("Função Duração em Minutos Incorreta");
        }

        if(novoFilme.getNota() == 10){
            System.out.println("Função nota, para a primeira nota, feita corretamente");
            novoFilme.setNota(2);
            if(novoFilme.getNota() == 6){
                System.out.println("Média de Notas Feita Corretamente");
            }else{
                System.out.println("Média de notas feita INcorretamente");
            }

        }else{
            System.out.println("Primeira Nota não atribuida");
        }

        if(novoFilme.getAtores().getFirst().equals("Nico Parker")){
            System.out.println("Função Atores Correta");
        }else{
            System.out.println("Função Atores Incorreta");
        }
        if(novoFilme.getFilmeLancado()){
            System.out.println("Filme Lançado");
        }else{
            System.out.println("Filme Lançado Incorretamente");
        }

    }
}