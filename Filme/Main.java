package Filme;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public Integer opçao;
    Private String nomeBusca;

    for(;;){
        switch (opçao){
            case 1:
                Scanner scanner = new Scanner(System.in);
                System.out.printl("Digite o nome do diretor:");
                nomeBusca = scanner.nextline();
                filtrarPorDiretor(colecaoFilme , nomeBusca);
        };
       
    }
    
    Diretor diretor1 = new Diretor("José" , "Brasil");
    Diretor diretor2 = new Diretor("Mohamed" , "Mexico");

    FilmeCinema filmeCinema1 = new FilmeCinema(diretor1, 2000, "Carros5");
    FilmeCinema filmeCinema2 = new FilmeCinema(diretor2, 1970, "Wally");

    FilmeStreaming filmeStreaming1 = new FilmeStreaming();
    FilmeStreaming filmeStreaming2 = new FilmeStreaming();

    Array<Filme> colecaoFilme = new Arraylist<>();

    colecaoFilme.add(filmeCinema1);
    colecaoFilme.add(filmeCinema2);
    colecaoFilme.add(filmeStreaming1);
    colecaoFilme.add(filmeStreaming2);

    
}
public static void filtrarPorDiretor(Array<Filme> String plataformaDesejada){
     
     private boolean encontrou = false;

     for(filme Filme : lista){
        if(filme.getDiretor().getNome() equalsIgnoreCase(nomeDiretor)){
            filmes.exibirDetalhe();
            System.out.println();
            encontrou = true;
        }
        if(!encontrou){
            Syestem.out.printl("Nenhum filme encontrado com esse diretor " + nomeDiretor);
        }
     }


}
public static void exibirOpções(){

    Syestem.out.println(------------------------------------------------------);
    Syestem.out.println("1- Buscar filme por diretor");
    Syestem.out.println("2- Buscar por ano de lançamento");
    System.out.println("3- Buscar por Por plataforma");
    
}
