import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.input.Clipboard;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;


//todo
/*
1. dwa watki, jeden wyswietla , drugi ciągle pobiera ze schowka systemowego wartosci i zapisuje je na liscie o ile ostatnia zapisana i obecna ze schowka się różnią


 */

public class MyClipboard extends Application {
    public static Clipboard clipboard;
    public static String get;
    public static Label label1, label2, label3;
    public static Button copyToClipboard;
    public static Button paste;


    private List<String> stringList;
    public static VBox rootNode;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Schowek");
         rootNode = new VBox(15);
        Scene scene = new Scene(rootNode, 250,200);
        rootNode.setAlignment(Pos.CENTER);

        paste = new Button("Wklej");
        paste.setOnAction(ea-> paste());

        copyToClipboard = new Button("Kopiuj");
        copyToClipboard.setMaxWidth(200);
        copyToClipboard.setMaxHeight(150);
        copyToClipboard.setOnAction(ae-> Kolejka.dropElement());

        label1 = new Label();
        label2 = new Label();
        label3 = new Label();

        rootNode.getChildren().addAll(paste,copyToClipboard,
                label1, label2, label3);
        primaryStage.setScene(scene);



       // Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

         clipboard = Clipboard.getSystemClipboard();


        primaryStage.show();
        primaryStage.setAlwaysOnTop(true);



    }


    public static void paste(){
        Kolejka.dropList();

        String get = MyClipboard.clipboard.getString();
        String[] texts = get.split(";");
        List<String> stringList = new ArrayList<>();
       // texts[0] = " "+ texts[0];
        for(String s : texts){
            if(s.length() > 1){
                stringList.add(s);
            }
            System.out.println(s);
        }
        Firma firma = new Firma(stringList);
        firma.setPassword(firma.getEmail().substring(firma.getEmail().lastIndexOf('@')));
        Kolejka.createKolejka(firma);
        copyToClipboard.setText(firma.getEmail());

        label1.setText(firma.getBranza());
        label2.setText(firma.getMiasto());
        label3.setText(firma.getWojewodztwo());
        try{
            Desktop.getDesktop().browse(new URI(firma.getWWW()));
        }
        catch (Exception e){

        }
    }

}
