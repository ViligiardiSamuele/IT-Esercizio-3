public class Regista {
    private String nome, cognome, CF;
    private  int nascita;
    //Constructor
    public Regista(String nome, String cognome, String CF, int nascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.CF = CF;
        this.nascita = nascita;
    }
    //Getter
    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public String getCF() { return CF; }
    public int getNascita() { return nascita; }
    //Setter
    public void setNome(String nome) { this.nome = nome; }
    public void setCognome(String cognome) { this.cognome = cognome; }
    public void setCF(String CF) { this.CF = CF; }
    public void setNascita(int nascita) { this.nascita = nascita; }

}
