import java.util.ArrayList;
import java.util.List;

public class Systemrezerwacjilotow implements Systemrezerwujacyloty  {
    List<Systemrezerwacjilotow> rezerwacje = new ArrayList<>();
    public void rezerwacja(Lot lot) {
        if (lot.getLiczbaMiejsc() != 0){
            rezerwacje.add(this);
            lot.setLiczbaMiejsc(lot.getLiczbaMiejsc() - 1);
        }
        else {
            throw new ArrayIndexOutOfBoundsException("Brak miejsc");
        }
    }


    public void anulowanieRezerwacji(Lot lot) {
        if (rezerwacje.contains(this)) {
            rezerwacje.remove(this);
            lot.setLiczbaMiejsc(lot.getLiczbaMiejsc() + 1);

        }
        else {
            throw new IllegalArgumentException("Nie ma takiej rezerwacji");
        }
    }

    public void wyszukiwanieLotow(List<Lot> loty) {
        System.out.println("Dostępne loty:");
       for (Lot lot:loty){
           if (lot.getLiczbaMiejsc()>0){
               System.out.println(lot);
           }
       }
    }

    @Override
    public void wyswietl() {
        System.out.println(this.toString());
    }

}
