
public class Main {
    public static void main(String[] args) {

       Motor Ap = new Motor("gasolina", 200);
       Condutor c1 = new Condutor("123456", "Ian");
       Carro Golzao = new Carro("AAA-157", "Volks", "gol", Ap, c1);

       Golzao.exibirInfo();


    }
}
