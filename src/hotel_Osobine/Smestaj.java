package hotel_Osobine;

public class Smestaj {
    private int brSmestaja;
    private int brKreveta;
    private int cenaNocenja;
    private boolean slobodan;
    private String tipSmestaja;

    public Smestaj(int brSmestaja, int brKreveta, int cenaNocenja, boolean slobodan, String tipSmestaja) {
        this.brSmestaja = brSmestaja;
        this.brKreveta = brKreveta;
        this.cenaNocenja = cenaNocenja;
        this.slobodan = slobodan;
        this.tipSmestaja = tipSmestaja;
    }
    public Smestaj() {
    }

    public int getBrSmestaja() {
        return brSmestaja;
    }

    public void setBrSmestaja(int brSmestaja) {
        this.brSmestaja = brSmestaja;
    }

    public int getBrKreveta() {
        return brKreveta;
    }

    public void setBrKreveta(int brKreveta) {
        this.brKreveta = brKreveta;
    }

    public int getCenaNocenja() {
        return cenaNocenja;
    }

    public void setCenaNocenja(int cenaNocenja) {
        this.cenaNocenja = cenaNocenja;
    }

    public boolean isSlobodan() {
        return slobodan;
    }

    public void setSlobodan(boolean slobodan) {
        this.slobodan = slobodan;
    }

    public String getTipSmestaja() {
        return tipSmestaja;
    }

    public void setTipSmestaja(String tipSmestaja) {
        this.tipSmestaja = tipSmestaja;
    }
}
