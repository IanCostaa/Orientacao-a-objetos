class Aluno{

    String nome;
    Integer idade;
    String matricula;
    String nota;
    String numeroTelefone;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    public Integer getIdade(){
        return idade;
    }
    public void setIdade(Integer novaIdade){
        this.idade = novaIdade;
    }
   
    public String getMatricula(){
        return matricula;
        

    }
    public void setMatricula(String novaMatricula){
        this.matricula = novaMatricula;
    }
   
    public String getNota(){
        return nota;

    }
    public void setNota(String novaNota){
        this.nota = novaNota;

    }
    public String getnumeroTelefone(){
        return numeroTelefone;
        
    }
    public void setnumeroTelefone(String novoNumeroTelefone){
        this.numeroTelefone = novoNumeroTelefone;

    }
    public String ToString(){
        return "Nome: " + this.nome + "\n"+
                "Idade: " + this.idade + "\n" +
                "nota: " + this.nota + "\n" +
                "matricula: " + this.matricula + "\n" +
                "Numero de telefone: " + this.numeroTelefone + "\n";

    }
   
    String messagemString(){

        return "Olá";
    }
}