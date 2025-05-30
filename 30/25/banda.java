public class banda {
    
    private String nome;
    private EstiloEnum estilo;
    private cd cds;
    private musica[] musicas;
    private musico[] musicos;
    
    public banda(String nome, EstiloEnum estilo, cd cds, musica[] musicas, musico[] musicos) {
        this.nome = nome;
        this.estilo = estilo;
        this.cds = cds;
        this.musicas = musicas;
        this.musicos = musicos;
    }
}
