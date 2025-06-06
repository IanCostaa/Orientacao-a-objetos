package models;
import enums.Nacionalidade;

public class Autor {

        private String nome;
        private Nacionalidade Nacionalidade;
        
        public Autor(String nome, enums.Nacionalidade nacionalidade) {
            this.nome = nome;
            Nacionalidade = nacionalidade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Nacionalidade getNacionalidade() {
            return Nacionalidade;
        }

        public void setNacionalidade(Nacionalidade nacionalidade) {
            Nacionalidade = nacionalidade;
        }
        
}
