import java.util.Scanner;

class Carro {
    String placa;
    String modelo;
    int ano;
    double velocidade;
    double combustivel;
    double capacidadeMaxima;

    Carro(String placa, String modelo, int ano, double combustivel, double capacidadeMaxima) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
        this.combustivel = combustivel;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    void acelerar(double valor) {
        if (combustivel > 0) {
            double aumento = velocidade * 0.10;
            if (velocidade + aumento > 150) {
                System.out.println("Velocidade máxima atingida.");
                velocidade = 150;
            } else {
                velocidade += aumento;
            }

            double consumo = valor * 0.01;
            combustivel -= consumo;
            if (combustivel < 0) combustivel = 0;
        } else {
            System.out.println("Sem combustível para acelerar.");
        }
    }

    void frear(double valor) {
        if (velocidade > 0) {
            double reducao = velocidade * 0.10;
            velocidade -= reducao;
            if (velocidade < 0) velocidade = 0;
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    void abastecer(double valor) {
        if (combustivel + valor > capacidadeMaxima) {
            combustivel = capacidadeMaxima;
            System.out.println("Tanque cheio.");
        } else {
            combustivel += valor;
        }
    }

    public String toString() {
        return "\nCarro:\nPlaca: " + placa + "\nModelo: " + modelo + "\nAno: " + ano +
                "\nVelocidade: " + velocidade + "\nCombustível: " + combustivel +
                "\nCapacidade Máxima do Tanque: " + capacidadeMaxima;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Coleta de dados do carro
        System.out.print("Digite a placa do carro: ");
        String placa = sc.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = sc.nextInt();

        System.out.print("Digite a quantidade de combustível atual: ");
        double combustivel = sc.nextDouble();

        System.out.print("Digite a capacidade máxima do tanque: ");
        double capacidadeMaxima = sc.nextDouble();

        // Criando o objeto carro
        Carro meuCarro = new Carro(placa, modelo, ano, combustivel, capacidadeMaxima);

        int opcao;
        do {
            System.out.println("\n1 - Acelerar\n2 - Frear\n3 - Abastecer\n4 - Mostrar dados\n0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para acelerar: ");
                    double valAcelerar = sc.nextDouble();
                    meuCarro.acelerar(valAcelerar);
                    break;
                case 2:
                    System.out.print("Valor para frear: ");
                    double valFrear = sc.nextDouble();
                    meuCarro.frear(valFrear);
                    break;
                case 3:
                    System.out.print("Valor para abastecer: ");
                    double valComb = sc.nextDouble();
                    meuCarro.abastecer(valComb);
                    break;
                case 4:
                    System.out.println(meuCarro.toString());
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
