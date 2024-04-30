public class Rezerwacja extends Lot{
//    •	Zawiera pole wskazujące na konkretny lot oraz dane posiadacza i cenę biletu
    private String imie;
    private String nazwisko;
    private String pesel;
    private String numerTelefonu;
    private Lot konkretnyLot;
    private float cenaBiletu;


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public Lot getKonkretnyLot() {
        return konkretnyLot;
    }

    public float getCenaBiletu() {
        return cenaBiletu;
    }

    public Rezerwacja(String imie, String nazwisko, String pesel, String numerTelefonu, Lot konkretnyLot, float cenaBiletu) {
        super();
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.numerTelefonu = numerTelefonu;
        this.konkretnyLot = konkretnyLot;
        this.cenaBiletu = cenaBiletu;
        konkretnyLot.setLiczbaMiejsc(konkretnyLot.getLiczbaMiejsc() - 1);
    }
    @Override
    public String toString() {
        return "Rezerwacja{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", numerTelefonu='" + numerTelefonu + '\'' +
                ", konkretnyLot=" + konkretnyLot +
                ", cenaBiletu=" + cenaBiletu +
                '}';
    }
}
