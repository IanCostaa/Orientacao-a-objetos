package Filme;
import java.util.Scanner;

public class Main {
    
    Diretor diretor1 = new Diretor("José" , "Brasil");
    Diretor diretor2 = new Diretor("Mohamed" , "Mexico");

    FilmeCinema filmeCinema1 = new FilmeCinema(diretor1, 2000, "As longas tranças de um careca");
    FilmeCinema filmeCinema2 = new FilmeCinema(diretor2, 1970, "Branca de neve e os 7 negões");

    FilmeStreaming filmeStreaming1 = new FilmeStreaming();
    FilmeStreaming filmeStreaming2 = new FilmeStreaming();

    Array<Filme> colecaoFilme = new Arraylist<>();

    colecaoFilme.add(filmeCinema1);
    colecaoFilme.add(filmeCinema2);
    colecaoFilme.add(filmeStreaming1);
    colecaoFilme.add(filmeStreaming2);
}
