import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Lot> loty = new ArrayList<>();
        List<Rezerwacja> rezerwacje = new ArrayList<>();

        Lot PierwszyLot = new Lot("Warszawa","Londyn","2000/03/03",60,30);
        Rezerwacja Adam = new Rezerwacja("Adam","Zakolak","12345678901","733644123",PierwszyLot,20);
        Rezerwacja Janusz = new Rezerwacja("Janusz","Janula","12335678901","736454123",PierwszyLot,20);


        loty.add(PierwszyLot);
        rezerwacje.add(Adam);
        rezerwacje.add(Janusz);

//        System.out.println(Adam);
//        System.out.println(PierwszyLot);
//        System.out.println(Janusz);
//        System.out.println(PierwszyLot);
        System.out.println(rezerwacje);
        System.out.println(loty);
    }
}