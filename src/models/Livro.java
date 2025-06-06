package models;

public class Livro {
    
    private Autor autor;
    private Integer anoPublicacao;
    private String titulo;

    public Livro(Autor autor, Integer anoPublicacao, String titulo) {
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.titulo = titulo;
    }

    
}

