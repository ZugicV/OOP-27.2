package hotel_Osobine;

public class Rezervacija {
    private String pocetak_rez;
    private String kraj_rez;

    private int brojNocenja;
    private Smestaj smestaj;

    public Rezervacija(String pocetak_rez, String kraj_rez, int brojNocenja,Smestaj smestaj) {
        this.pocetak_rez = pocetak_rez;
        this.kraj_rez = kraj_rez;
        this.brojNocenja = brojNocenja;
        this.smestaj = smestaj;
    }

    public int cenaRezervacije(int brojNocenja,int cenaNocenja){
        return this.brojNocenja * smestaj.getCenaNocenja();
    }

    public int getBrojNocenja() {
        return brojNocenja;
    }

    public void setBrojNocenja(int brojNocenja) {
        this.brojNocenja = brojNocenja;
    }

    public Rezervacija() {
    }

    public String getPocetak_rez() {
        return pocetak_rez;
    }

    public void setPocetak_rez(String pocetak_rez) {
        this.pocetak_rez = pocetak_rez;
    }

    public String getKraj_rez() {
        return kraj_rez;
    }

    public void setKraj_rez(String kraj_rez) {
        this.kraj_rez = kraj_rez;
    }
}
