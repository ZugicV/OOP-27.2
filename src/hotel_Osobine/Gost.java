package hotel_Osobine;

public class Gost {
    private String ime;
    private String prezime;
    private String email;
    private String telefon;
    private int brTelefona;
    private Rezervacija rezervacija;

    public Gost(String ime, String prezime, String email, String telefon, int brTelefona, Rezervacija rezervacija) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.telefon = telefon;
        this.brTelefona = brTelefona;
        this.rezervacija = rezervacija;
    }

    public Gost() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getBrTelefona() {
        return brTelefona;
    }

    public void setBrTelefona(int brTelefona) {
        this.brTelefona = brTelefona;
    }
}