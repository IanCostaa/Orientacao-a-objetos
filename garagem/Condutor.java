
public class Condutor {
    
    private  String CNH;
    private String nome;

    public  Condutor(String CNH, String nome ){
        this.CNH = CNH;
        this.nome = nome;

    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toString() {
    return "Nome: " + nome + ", CNH: " + CNH;
    }


}
