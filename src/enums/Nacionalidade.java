package enums;

public enum Nacionalidade {
    
    BRASILEIRO(7, "brasil"),
    AMERICANO(3, "EUA");

    private Integer codigo;
    private String nacionalidade;
    
    Nacionalidade(Integer codigo, String nacionalidade) {
        this.codigo = codigo;
        this.nacionalidade = nacionalidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

}
