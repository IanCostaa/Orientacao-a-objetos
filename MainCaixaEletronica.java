import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		
		int op = 0;
		Scanner scan = new Scanner(System.in);
		int saldo = 0;
		int saque =0;
		
		
		do{
	    	System.out.println("Selecione a opçõe:");
    		System.out.println("1 - Ver saldo");
    		System.out.println("2 - Depósito");
    		System.out.println("3 - Saque");
    		System.out.println("0 - Sair");
    		op = scan.nextInt();
    		
    		switch(op){
    		    case 1:
    		        System.out.printf("\n saldo:" + saldo + "\n");
    		        break;
    		        
    		    case 2:
    		        System.out.println("Digite o valor que deseja depositar:");
    		        saldo = scan.nextInt();
    		        break;
    		   
    		    case 3:
    		        System.out.println("Digite o valor que deseja sacar:");
    		        saque = scan.nextInt();
    		        
    		        saldo = saldo - saque;
    		       
    		        System.out.println("Saldo: " + saldo);
    		        
    		        break;
    		}
    		
		}while(op != 0 );
		
		scan.close();

}
    
}