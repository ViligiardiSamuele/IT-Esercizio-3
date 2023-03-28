import javax.security.auth.callback.CallbackHandler;
import java.lang.String;

import java.awt.im.InputMethodRequests;
import java.lang.String;
public class Film {
    public String titolo, genere;
    public int anno, durata;
    Regista regista;

    //Costruttori
    Film(String titolo, Regista regista, String genere, int anno, int durata){
        this.titolo = titolo;
        this.regista = regista;
        this.genere = genere;
        this.anno = anno;
        this.durata = durata;
    }

    //Setter
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public void setRegista(Regista regista){
        this.regista = regista;
    }
    public void setGenere(String genere){
        this.genere = genere;
    }
    public void setAnno(int anno){
        this.anno = anno;
    }
    public void setDurata(int durata){
        this.durata = durata;
    }

    //Getter
    public String getTitolo(){
        return titolo;
    }
    public Regista getRegista(){
        return  regista;
    }
    public String getGenere(){
        return  genere;
    }
    public int getAnno(){
        return  anno;
    }
    public int getDurata(){
        return  durata;
    }

    //Metodi
    public boolean compareRegista(Regista regista){
        if(this.regista.getCF().equals(regista.getCF())){
            return true;
        }
        else return false;
    }
    public boolean compareAnno(int anno){
        if(this.anno == anno){
            return true;
        }
        else return false;
    }
    public boolean overYear(int anno){
        if(this.anno < anno){
            return true;
        }
        return false;
    }
    public float compareFilm(Film film1, Film film2){
        if(this.regista.getCF().equals(film1.regista.getCF()) && this.equals(film2.regista.getCF()) && film1.regista.getCF().equals(film2.regista.getCF())){
            return (this.getDurata() + film1.getDurata() + film2.getDurata()) / 3;
        }
        return -1;
    }
    public boolean compareDurata(int durata){
        if(this.getDurata() == durata)
            return true;
        return false;
    }
    public float mediaDurate(Film movie1, Film movie2){
        return (movie1.getDurata() + movie2.getDurata() + this.getDurata())/3;
    }
    public float maxDurata(Film movie1, Film movie2){
        return Math.max(Math.max(movie1.getDurata(), movie2.getDurata()), this.getDurata());
    }
    public String outRegista(){
        return this.regista.getNome()+" "+this.regista.getCognome()+" "+this.regista.getNascita()+" "+this.regista.getCF();
    }
    public String outFilm(){
        return this.getTitolo()+" "+this.getRegista()+" "+this.getDurata()+" "+this.getGenere()+" "+this.getTitolo()+" "+this.getAnno();
    }
    public int numCaratteriConsecutivi(Film movie){
		return this.getTitolo().length() - this.getTitolo().compareTo(movie.getTitolo());
    }
    public Boolean oneCapsChr(){
        char ch;
        for(int i = 0; i < this.getTitolo().length(); i++){
            ch = this.getTitolo().charAt(i);
            if(Character.isUpperCase(ch)){
                if(ch == 'A' && ch == 'E'&& ch == 'I'&& ch == 'O'&& ch == 'U')
                    return true;
            }
        }
        return false;
    }
    public Boolean contieneDoppia(){
        char ch1 = ' ', ch2;
        for(int a = 0; a < this.getRegista().getNome().length(); a++){
            ch2 = ch1;
            ch1 = this.getRegista().getNome().charAt(a);
            if(ch1 == ch2)
                return true;
        }
        return false;
    }
    public int chSeparazione(){
        //String temp;
        char ch;
        int n = 0;
        for(int a = 0; a < this.getTitolo().length(); a++){
            //temp = String.valueOf(this.getTitolo().charAt(a));
            ch = this.getTitolo().charAt(a);
            if(ch == ' ' || ch == ',' || ch == '.' || ch == ':' || ch == ';' || ch == '-')
                n++;
        }
        return n;
    }
}