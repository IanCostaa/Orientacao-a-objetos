package Filme;

public class FilmeStreaming extends Filme{
    
    private String plataforma;

    public FilmeStreaming(Diretor diretor, Integer anoLancamento, String titulo, String plataforma) {
        super(diretor, anoLancamento, titulo);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

}
