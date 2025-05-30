public class cd {
    
    private String titulo;
    private Integer ano;
    private Boolean ehDuplo;
    private Banda banda;
    private musica[] musicas;

    
    public cd(String titulo, Integer ano, Boolean ehDuplo, Banda banda, musica[] musicas) {
        this.titulo = titulo;
        this.ano = ano;
        this.ehDuplo = ehDuplo;
        this.banda = banda;
        this.musicas = musicas;
    }
    public String getTitulo() {

        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public Boolean getEhDuplo() {
        return ehDuplo;
    }
    public void setEhDuplo(Boolean ehDuplo) {
        this.ehDuplo = ehDuplo;
    }


}
