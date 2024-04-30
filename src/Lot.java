public class Lot {
//miejsce docelowe, miejsce wylotu, data wylotu, czas trwania lotu, liczba dostępnych miejsc
    private String miejsceDocelowe;
    private String miejsceWylotu;
    private String dataWylotu;
    private double czasTrwaniaLotu;
    private int liczbaMiejsc;



    public String getMiejsceDocelowe() {
        return miejsceDocelowe;
    }

    public String getMiejsceWylotu() {
        return miejsceWylotu;
    }

    public String getDataWylotu() {
        return dataWylotu;
    }

    public double getCzasTrwaniaLotu() {
        return czasTrwaniaLotu;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setCzasTrwaniaLotu(double czasTrwaniaLotu) {
        this.czasTrwaniaLotu = czasTrwaniaLotu;
    }

    public void setLiczbaMiejsc(int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }

    public Lot(String miejsceDocelowe, String miejsceWylotu, String dataWylotu, double czasTrwaniaLotu, int liczbaMiejsc) {
        this.miejsceDocelowe = miejsceDocelowe;
        this.miejsceWylotu = miejsceWylotu;
        this.dataWylotu = dataWylotu;
        this.czasTrwaniaLotu = czasTrwaniaLotu;
        this.liczbaMiejsc = liczbaMiejsc;
    }

    public Lot() {

    }

    @Override
    public String toString() {
        return String.format("Miejsce docelowe %s, Miejsce Wylotu %s, DataWylotu %s, CzasTrwania %f, LiczbaMiejsc %d,",miejsceDocelowe,miejsceWylotu,dataWylotu,czasTrwaniaLotu,liczbaMiejsc);
    }
}
