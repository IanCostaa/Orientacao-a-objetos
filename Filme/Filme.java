package Filme;
public class Filme {

    private Diretor diretor;
    private Integer anoLancamento;
    private String titulo;

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Filme(Diretor diretor, Integer anoLancamento, String titulo) {
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.titulo = titulo;
    }
    public String exibirDetalhe(){

        return "\nDiretor:" + diretor + "\nAno Lançamento" + anoLancamento + "\nTitulo" + titulo;
    }

}
