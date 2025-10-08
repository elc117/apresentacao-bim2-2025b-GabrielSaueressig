import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private int duracaoMinutos;
    private int nota = 0;
    private List atores = new ArrayList();
    private boolean filmeLancado;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setNota(int nota) {
        if(this.nota == 0){
            this.nota = nota;
        }else{
            this.nota = (this.nota+nota)/2;
        }
    }

    public void setAtor(String nome) {
        this.atores.add(nome);
    }

    public void setFilmeLancado(boolean statusFilme) {
        this.filmeLancado = statusFilme;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public int getNota() {
        return nota;
    }

    public List getAtores() {
        return atores;
    }
    public boolean  getFilmeLancado(){
        return filmeLancado;
    }


}
