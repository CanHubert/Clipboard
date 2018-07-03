import javafx.scene.input.ClipboardContent;

import java.util.LinkedList;
import java.util.List;

public class Kolejka {
   static private List<String> lista ;

    public Kolejka() {

    }

    public static void createKolejka(Firma firma){
        if(lista== null){
            lista = new LinkedList<>();
        }
        lista.add(firma.getEmail());
        lista.add(firma.getPassword());
        lista.add(firma.getNazwa());
        lista.add(firma.getNIP());
        lista.add(firma.getAdres());
        lista.add(firma.getKod());
        lista.add(firma.getEmail());
        lista.add(firma.getTelefon());
        lista.add("Strona główna");
        lista.add(firma.getWWW());
        lista.add("Zrobione! ;)");
    }

    public  static void dropElement(){
        try{
            ClipboardContent content = new ClipboardContent();
            content.putString(lista.get(0));
            MyClipboard.copyToClipboard.setText(lista.get(1));
            lista.remove(0);
            MyClipboard.clipboard.setContent(content);
        }catch (NullPointerException e){

        }
    }

    public static void dropList(){
        if(lista!= null){
            lista = null;
        }
    }
}
