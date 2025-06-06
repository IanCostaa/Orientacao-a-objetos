package models;

public class LivroDigital extends Livro{
    
    private Double tamanhoArquivoMb;

    public LivroDigital(Autor autor, Integer anoPublicacao, String titulo, Double tamanhoArquivoMb) {
        super(autor, anoPublicacao, titulo);
        this.tamanhoArquivoMb = 2.0;
    }
    
}
