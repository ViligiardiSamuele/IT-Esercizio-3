import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Regista regista1 = new Regista("Roberto","ciao","CVB3LL0",1900);
        Regista regista2 = new Regista("Giomperto","DiCapriolo","B3LL0CV",2000);
        Regista regista3 = new Regista("Giovanni","Paolino","N0NL0S0",2000);
        Film[] movie = { //Array di Film
                //Creazione Oggetti nelle celle dell'array
                new Film("La bestia e la bella", regista1, "Horror", 4090, 200),
                new Film("Titanico", regista2, "Per Bambini",1912,160),
                new Film("Injection", regista3, "Thriller/Noir",1500, 2077),
        };
        for (Film film : movie) {
            System.out.println(
                    "Titolo: " + film.getTitolo() +
                            " - Regista: " + film.getRegista() +
                            " - Genere: " + film.getGenere() +
                            " - Anno: " + film.getAnno() +
                            " - Durata: " + film.getDurata()
            );
        }
        System.out.println("Comparazione regista: " + movie[1].compareRegista(regista2)); //Compara con DiCapriolo
        System.out.println("Comparazione anno: " + movie[2].compareAnno(2076)); //Compara con 1500
        System.out.println("Oltre l'anno 3000: " + movie[0].overYear(3000));
        System.out.println("Verifica regista: " + movie[0].compareFilm(movie[1],movie[0]));
    }
}