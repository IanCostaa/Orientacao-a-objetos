

public class Carro{

    private String placa;
    private String marca;
    private String modelo;
    private Motor motor;
    private Condutor condutor;

    public Carro(String placa, String marca, String modelo, Motor motor, Condutor condutor  ){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.condutor = condutor;
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }
    public void exibirInfo(){
        System.out.println("Carro:");
        System.out.println("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("Placa:" + placa);
        System.out.println("Condutor:" + condutor);
        System.out.println("Motor:" + motor);
        
    }

    

}