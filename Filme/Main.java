package Filme;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Diretor diretor1 = new Diretor("José", "Brasil");
        Diretor diretor2 = new Diretor("Mohamed", "Mexico");

        FilmeCinema filmeCinema1 = new FilmeCinema(diretor1, 2000, "Carros5");
        FilmeCinema filmeCinema2 = new FilmeCinema(diretor2, 1970, "Wally");

        FilmeStreaming filmeStreaming1 = new FilmeStreaming(new Diretor("Ana", "Argentina"), 2020, "Digital 1", "Netflix");
        FilmeStreaming filmeStreaming2 = new FilmeStreaming(new Diretor("Carlos", "Chile"), 2022, "Digital 2", "Amazon");

        ArrayList<Filme> colecaoFilme = new ArrayList<>();

        colecaoFilme.add(filmeCinema1);
        colecaoFilme.add(filmeCinema2);
        colecaoFilme.add(filmeStreaming1);
        colecaoFilme.add(filmeStreaming2);

        while (true) {
            exibirOpcoes();
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do diretor: ");
                    String nomeBusca = scanner.nextLine();
                    filtrarPorDiretor(colecaoFilme, nomeBusca);
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void filtrarPorDiretor(ArrayList<Filme> lista, String nomeDiretor) {
        boolean encontrou = false;

        for (Filme filme : lista) {
            if (filme.getDiretor().getNome().equalsIgnoreCase(nomeDiretor)) {
                filme.exibirDetalhe();
                System.out.println();
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum filme encontrado com esse diretor: " + nomeDiretor);
        }
    }

    public static void exibirOpcoes() {
        System.out.println("------------------------------------------------------");
        System.out.println("1- Buscar filme por diretor");
        System.out.println("0- Sair");
    }
}
