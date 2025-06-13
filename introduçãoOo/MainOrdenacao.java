import java.util.Random;
import java.util.Scanner;

public class MainOrdenacao {
    public static void main(String[] args){
        int[] matriz = new int[30];
        int choice;
        int aux;
        Scanner scan = new Scanner(System.in);

        for(int i = 0;i < 30;i++){
            Random gerador = new Random();
            matriz[i] = gerador.nextInt(300) + 1;
        }
        System.out.println("Deseja ordena-los em ordem crescente(1) ou decrescente(2)?");
        choice = scan.nextInt();

        switch(choice){
            case 1:
                for(int i = 0;i < 30;i++){
                    for(int j = i+1;j < 30;j++){
                        if(matriz[i] < matriz[j]){
                            aux = matriz[i];
                            matriz[i] = matriz[j];
                            matriz[j] = aux;
                        }
                    }
                }
                break;
            
            case 2:
                for(int i = 0;i < 30;i++){
                    for(int j = i+1;j < 30;j++){
                        if(matriz[i] > matriz[j]){
                            aux = matriz[i];
                            matriz[i] = matriz[j];
                            matriz[j] = aux;
                        }
                    }
                }
                break;

            default:
                System.out.println("Valor inválido");
        }

        for(int i = 0;i < 30;i++){
            System.out.printf("%d ", matriz[i]);
        }

        scan.nextInt();
        scan.close();
    }
}
