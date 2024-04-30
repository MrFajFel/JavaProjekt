import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Lot> loty = new ArrayList<>();

        Lot PierwszyLot = new Lot("Warszawa","Londyn","2000/03/03",60,30);
        Rezerwacja Adam = new Rezerwacja("Adam","wow","12345678901","733644123",20);
        Rezerwacja Janusz = new Rezerwacja("Janusz","wow2","12335678901","736454123",20);
        Lot DrugiLot = new Lot("Warszawa","Londyn","2000/03/03",60,0);

        loty.add(PierwszyLot);

        Adam.rezerwacja(PierwszyLot);
        PierwszyLot.wyswietl();
        Adam.anulowanieRezerwacji(PierwszyLot);
//        Adam.rezerwacja(DrugiLot);
//        Janusz.anulowanieRezerwacji(DrugiLot);

    }
}