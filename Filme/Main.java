package Filme;

public class Main {
    
    Diretor diretor1 = new Diretor("José" , "Brasil");
    Diretor diretor2 = new Diretor("Mohamed" , "Mexico");

    FilmeCinema filmeCinema1 = new FilmeCinema(diretor1, 2000, "as longas tranças de um careca");
    FilmeCinema filmeCinema2 = new FilmeCinema(diretor2, 1970, "Branca de neve e os 7 negões");

    FilmeStreaming filmeStreaming1 = new FilmeStreaming(diretor1, 2000, "as longas tranças de um careca", "FilmeFlix");
    FilmeStreaming filmeStreaming2 = new FilmeStreaming(direotr2 , 1970, "Branca de neve e os 7 negões", "xfilmes");
}
