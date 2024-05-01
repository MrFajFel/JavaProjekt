import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Lot> loty = new ArrayList<>();

        Systemrezerwacjilotow szukajlot = new Systemrezerwacjilotow();
        Lot pierwszyLot = new Lot("Warszawa", "Londyn", "03/03/2023", 60, 30);
        Lot drugiLot = new Lot("Warszawa", "Londyn", "03/06/2023", 60, 0);
        Lot trzecilot = new Lot("Rzym", "Berlin", "12/05/2023", 60, 2);
        Lot czwartylot = new Lot("Amsterdam", "Kyoto", "13/11/2023", 60, 5);
        Lot piatylot = new Lot("Wrocław", "Moskwa", "15/12/2023", 60, 5);
        Rezerwacja adam = new Rezerwacja("Adam","wow","12345678901","733644123",20);
        Rezerwacja janusz = new Rezerwacja("Janusz","wow2","12335678901","736454123",20);


        loty.add(pierwszyLot);
        loty.add(drugiLot);
        loty.add(trzecilot);
        loty.add(czwartylot);
        loty.add(piatylot);
//
        adam.rezerwacja(pierwszyLot);
        pierwszyLot.wyswietl();
        adam.anulowanieRezerwacji(pierwszyLot);
//        adam.rezerwacja(drugiLot);    tu będzie specjalnie zrobiony wyjątek
//        janusz.anulowanieRezerwacji(drugiLot); tu będzie specjalnie zrobiony wyjątek
        szukajlot.wyszukiwanieLotow(loty);



    }
}