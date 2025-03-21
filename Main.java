import java.nio.charset.UnsupportedCharsetException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o numero de rounds: ");
        int n = scan.nextInt();
        int userWins = 0;
        int computerWins = 0;
        int Empates = 0;
        
         System.out.println("O valor de n é: "+ n);

        for(int i = 0;i < n;i++){
            System.out.println("1- Pedra, 2- Papel, 3- Tesoura");
            int userChoice = scan.nextInt();
            String userChoiceString = getCastChoice(userChoice);

            int computerChoice = (int)(Math.random()* 3) + 1;
            String computerChoiceString = getCastChoice(computerChoice);

            System.out.println("Você escolheu " + userChoiceString + " e o computador escolheu " + computerChoiceString);

            
            if(computerChoice == 1 && userChoice == 3){
                System.out.println("O computador ganhou está rodada");
                computerWins++;
            }
            else if(computerChoice == 2 && userChoice == 1){
                System.out.println("O computador ganhou está rodada");
                computerWins++;
            }
            else if(computerChoice == 3 && userChoice == 2){
                System.out.println("O computador ganhou está rodada");
                computerWins++;
            }
            else if(computerChoice == userChoice){
                System.out.println("Empatou está rodada");
                Empates++;
            }
            else{
                System.out.println("O usuario ganhou está rodada");
                userWins++;
            }
        }

        if(computerWins > userWins){
            System.out.println("O computador ganhou");
        }
        else if(computerWins < userWins){
            System.out.println("O usuario ganhou");
        }
        else{
            System.out.println("Empate");
        }
        System.out.printf("Usuário %d x %d Computador | %d Empates ", userWins, computerWins, Empates);

        scan.close();
    }
    
    public static String getCastChoice(int choice){
        switch(choice){
            case 1:
                return "Pedra";
            case 2:
                return "Papel";
            case 3:
                return "Tesoura";
            default:
                return "Opção inválida";
            }
        }
}