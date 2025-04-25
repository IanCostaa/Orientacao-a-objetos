package models;

public class Carro {

    private String placa;
    private String modelo;
    private String marca;
    private Motor motor;
    private Condutor condutor;

    public Carro(String placa, String modelo, String marca,Condutor condutor){
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    
        this.condutor = condutor;

    }
    public Carro(String placa, String modelo, String marca ){
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;

    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
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

}
