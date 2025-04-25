import models.*;
public class App {

    public static void main(String[] args) throws Exception {

        Condutor condutor = new Condutor("ian" ,"123");
        Condutor  condutor2 = new Condutor("ken", "kkk-157");
        
        Motor motor = new Motor("Diesel", 200);
        Motor motor2 = new Motor("alcool", 100);

        Carro carro = new Carro("bod-168", "uno", "fiat");
        Carro carro2 = new Carro("fbw-124", "golf", "volkswagem", condutor2 );
        
        carro2.setCondutor(condutor);
        carro.setCondutor(condutor2);

    }
}
