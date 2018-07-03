import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

import java.util.ArrayList;
import java.util.List;

public class KeysEvent implements EventHandler<KeyEvent> {
    @Override
    public void handle(KeyEvent event) {
        String get = MyClipboard.clipboard.getString();
        String[] texts = get.split(";");
        List<String> stringList = new ArrayList<>();
        texts[0] = " "+ texts[0];
        for(String s : texts){
            if(s.length() > 1){
                stringList.add(s.substring(1));
            }
            System.out.println(s);
        }





        Firma firma = new Firma(stringList);
        firma.setPassword(firma.getEmail().substring(firma.getEmail().lastIndexOf('@')));
        Kolejka.createKolejka(firma);
        System.out.println("Wypisanie wartosci");
        System.out.println();
        System.out.println("Nazwa: " + firma.getNazwa());
        System.out.println("NIP: " + firma.getNIP());
        System.out.println("Forma Prawna: " + firma.getFormaPrawna());
        System.out.println("Branza: " + firma.getBranza());
        System.out.println("Telefon: " + firma.getTelefon());
        System.out.println("Email: " + firma.getEmail());
        System.out.println("Adres: " + firma.getAdres());
        System.out.println("Kod: " + firma.getKod());
        System.out.println("Miasto: " + firma.getMiasto());
        System.out.println("Wojewodztwo: " + firma.getWojewodztwo());
        System.out.println("WWW: " + firma.getWWW());
        System.out.println("Password: " + firma.getPassword());
    }
}
