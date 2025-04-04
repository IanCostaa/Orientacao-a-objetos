class Main {

     public static void main(String[] args){

        
        Aluno alunoInstancia = new Aluno();
        alunoInstancia.setNome("João");
        alunoInstancia.setIdade(24);
        alunoInstancia.setMatricula("123456");
        alunoInstancia.setNota("A");
        alunoInstancia.setnumeroTelefone("123456789");

        System.out.println(alunoInstancia.getNome());
        System.out.println(alunoInstancia.getIdade());
        System.out.println(alunoInstancia.getNota());
        System.out.println(alunoInstancia.getnumeroTelefone());
        System.out.println(alunoInstancia.getMatricula());
     }

    
}
