package Filme;
public class FilmeCinema extends Filme {

    private Integer duracaoMinutos;

    public FilmeCinema(Diretor diretor, Integer anoLancamento, String titulo) {
        super(diretor, anoLancamento, titulo);
    }

    public Integer getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(Integer duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
    @Override
    public String exibirDetalhe(){
        return super.exibirDetalhe() + "Duração em minutos"  + duracaoMinutos;
    }


}