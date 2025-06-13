import java.util.Scanner;

public class MainJokenpo{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = 0;

        while(n % 2 == 0){
            System.out.println("Digite o numero de rounds (ímpar): ");
            n = scan.nextInt();
        }

        int userWins = 0;
        int computerWins = 0;
        int empates = 0;
        int[][] escolhas = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                escolhas[i][j] = 0;
            }
        }
        
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
                empates++;
            }
            else{
                System.out.println("O usuario ganhou está rodada");
                userWins++;
            }


            if(userChoice == 1){
                escolhas[0][0] += 1;
            }
            if(userChoice == 2){
                escolhas[0][1] += 1;
            }
            if(userChoice == 3){
                escolhas[0][2] += 1;
            }

            if(computerChoice == 1){
                escolhas[1][0] += 1;
            }
            if(computerChoice == 2){
                escolhas[1][1] += 1;
            }
            if(computerChoice == 3){
                escolhas[1][2] += 1;
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
        System.out.printf("Usuário %d x %d Computador | %d Empates \n\n", userWins, computerWins, empates);
        System.out.printf("Usuário: %d Pedras, %d Papeis, %d Tesouras\n", escolhas[0][0], escolhas[0][1], escolhas[0][2]);
        System.out.printf("Computador: %d Pedras, %d Papeis, %d Tesouras\n",  escolhas[1][0], escolhas[1][1], escolhas[1][2]);


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