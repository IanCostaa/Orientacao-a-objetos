import java.util.Scanner;

public class MainNotas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float[] notas = new float[4];

        for(int i = 0;i < 4;i++){
            System.out.printf("Digite a %d nota\n", i+1);
            
            notas[i] = -1;
            while((notas[i] < 0) || (notas[i] > 10)){
                notas[i] = scan.nextFloat();
            }

            switch(i+1){
                case 1:
                    if(notas[i] < 6.0){
                        System.out.println("Conceito D - reprovado");
                        break;
                    }
                    if(notas[i] < 7.5){
                        System.out.println("Conceito C - aprovado");
                        break;
                    }
                    if(notas[i] < 9){
                        System.out.println("Conceito B - aprovado");
                        break;
                    }
                    if(notas[i] >= 9){
                        System.out.println("Conceito A - aprovadíssimo");
                        break;
                    }

                case 2:
                    if(notas[i] < 6.0){
                        System.out.println("Conceito D - reprovado");
                        break;
                    }
                    if(notas[i] < 7.5){
                        System.out.println("Conceito C - aprovado");
                        break;
                    }
                    if(notas[i] < 9){
                        System.out.println("Conceito B - aprovado");
                        break;
                    }
                    if(notas[i] >= 9){
                        System.out.println("Conceito A - aprovadíssimo");
                        break;
                    }
                
                case 3:
                    if(notas[i] < 6.0){
                        System.out.println("Conceito D - reprovado");
                        break;
                    }
                    if(notas[i] < 7.5){
                        System.out.println("Conceito C - aprovado");
                        break;
                    }
                    if(notas[i] < 9){
                        System.out.println("Conceito B - aprovado");
                        break;
                    }
                    if(notas[i] >= 9){
                        System.out.println("Conceito A - aprovadíssimo");
                        break;
                    }
                
                case 4:
                    if(notas[i] < 6.0){
                        System.out.println("Conceito D - reprovado");
                        break;
                    }
                    if(notas[i] < 7.5){
                        System.out.println("Conceito C - aprovado");
                        break;
                    }
                    if(notas[i] < 9){
                        System.out.println("Conceito B - aprovado");
                        break;
                    }
                    if(notas[i] >= 9){
                        System.out.println("Conceito A - aprovadíssimo");
                        break;
                    }
            }
        }

        scan.close();
    }
}
