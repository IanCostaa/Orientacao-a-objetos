import java.util.ArrayList;

import enums.Nacionalidade;
import models.*;

public class App {

    public static void main(String[] args) throws Exception {
        
        ArrayList<Livro> biblioteca = new ArrayList<>();

        Autor autor1 = new Autor("Joao", Nacionalidade.BRASILEIRO);
        autor1.getNacionalidade().getCodigo();
        Autor autor2 = new Autor("Biu" , Nacionalidade.AMERICANO);

        LivroDigital digital1 = new LivroDigital(autor1, 2000, "Alcorao", 8.0);
        LivroFisico  fisico1 = new LivroFisico(autor1, 2020, "pequeno pricipe", 300);

        biblioteca.add(fisico1);
        biblioteca.add(digital1);

    }
}
 