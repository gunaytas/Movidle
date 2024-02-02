package com.example.p1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML private TextField guessInput;
    @FXML private Label l1 = new Label();    @FXML private Label l2 = new Label();    @FXML private Label l3 = new Label();    @FXML private Label l4 = new Label();    @FXML private Label l5 = new Label();
    @FXML private Label guess00 = new Label(); @FXML private Label guess01 = new Label(); @FXML private Label guess02 = new Label(); @FXML private Label guess03 = new Label(); @FXML private Label guess04 = new Label(); @FXML private Label guess05 = new Label();
    @FXML private Label guess10 = new Label(); @FXML private Label guess11 = new Label(); @FXML private Label guess12 = new Label(); @FXML private Label guess13 = new Label(); @FXML private Label guess14 = new Label(); @FXML private Label guess15 = new Label();
    @FXML private Label guess20 = new Label(); @FXML private Label guess21 = new Label(); @FXML private Label guess22 = new Label(); @FXML private Label guess23 = new Label(); @FXML private Label guess24 = new Label(); @FXML private Label guess25 = new Label();
    @FXML private Label guess30 = new Label(); @FXML private Label guess31 = new Label(); @FXML private Label guess32 = new Label(); @FXML private Label guess33 = new Label(); @FXML private Label guess34 = new Label(); @FXML private Label guess35 = new Label();
    @FXML private Label guess40 = new Label(); @FXML private Label guess41 = new Label(); @FXML private Label guess42 = new Label(); @FXML private Label guess43 = new Label(); @FXML private Label guess44 = new Label(); @FXML private Label guess45 = new Label();


    public boolean isStarted = false;
    public int count = 0;

    String[] randomMovie = new String[8];
    @FXML
     void checkGuess(ActionEvent event) {

        RandomNumber rnd =new RandomNumber();
        WhichMovie whichMovie = new WhichMovie();

        String guess = guessInput.getText();
        String[] selectedMovie = new String[8];

        selectedMovie = whichMovie.MovieGuess(guess);
        guessInput.clear();


        if (isStarted == false)//
        {
            randomMovie= rnd.Rnd();

            isStarted = true;
        }
        if (selectedMovie[1] == null)
        {
            Dialog dialog = new Dialog();
            dialog.setTitle("Uyarı!");
            dialog.getDialogPane().setContentText("Böyle bir film mevcut değil.");
            dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
            dialog.show();

            return;
        }


        if(count==0) {
            guess00.setVisible(true);guess01.setVisible(true);guess02.setVisible(true);guess03.setVisible(true);guess04.setVisible(true);guess05.setVisible(true);
            guess00.setText(selectedMovie[1]);guess01.setText(selectedMovie[2]);guess02.setText(selectedMovie[3]);guess03.setText(selectedMovie[4]);guess04.setText(selectedMovie[5]);guess05.setText(selectedMovie[6]);
            l1.setVisible(true);
            if (selectedMovie[1].equals(randomMovie[1])) {guess00.setStyle("-fx-background-color: #52BE80;");} else {guess00.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[2].equals(randomMovie[2])) {guess01.setStyle("-fx-background-color: #52BE80;");} else {guess01.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[3].equals(randomMovie[3])) {guess02.setStyle("-fx-background-color: #52BE80;");} else {guess02.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[4].equals(randomMovie[4])) {guess03.setStyle("-fx-background-color: #52BE80;");} else {guess03.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[5].equals(randomMovie[5])) {guess04.setStyle("-fx-background-color: #52BE80;");} else {guess04.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[6].equals(randomMovie[6])) {guess05.setStyle("-fx-background-color: #52BE80;");} else {guess05.setStyle("-fx-background-color: #E74C3C;");}
        }
        else if(count==1) {
            guess10.setVisible(true);guess11.setVisible(true);guess12.setVisible(true);guess13.setVisible(true);guess14.setVisible(true);guess15.setVisible(true);
            guess10.setText(selectedMovie[1]);guess11.setText(selectedMovie[2]);guess12.setText(selectedMovie[3]);guess13.setText(selectedMovie[4]);guess14.setText(selectedMovie[5]);guess15.setText(selectedMovie[6]);
            l2.setVisible(true);
            if (selectedMovie[1].equals(randomMovie[1])) {guess10.setStyle("-fx-background-color: #52BE80;");} else {guess10.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[2].equals(randomMovie[2])) {guess11.setStyle("-fx-background-color: #52BE80;");} else {guess11.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[3].equals(randomMovie[3])) {guess12.setStyle("-fx-background-color: #52BE80;");} else {guess12.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[4].equals(randomMovie[4])) {guess13.setStyle("-fx-background-color: #52BE80;");} else {guess13.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[5].equals(randomMovie[5])) {guess14.setStyle("-fx-background-color: #52BE80;");} else {guess14.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[6].equals(randomMovie[6])) {guess15.setStyle("-fx-background-color: #52BE80;");} else {guess15.setStyle("-fx-background-color: #E74C3C;");}
        }
        else if(count==2) {
            guess20.setVisible(true);guess21.setVisible(true);guess22.setVisible(true);guess23.setVisible(true);guess24.setVisible(true);guess25.setVisible(true);
            guess20.setText(selectedMovie[1]);guess21.setText(selectedMovie[2]);guess22.setText(selectedMovie[3]);guess23.setText(selectedMovie[4]);guess24.setText(selectedMovie[5]);guess25.setText(selectedMovie[6]);
            l3.setVisible(true);
            if (selectedMovie[1].equals(randomMovie[1])) {guess20.setStyle("-fx-background-color: #52BE80;");} else {guess20.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[2].equals(randomMovie[2])) {guess21.setStyle("-fx-background-color: #52BE80;");} else {guess21.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[3].equals(randomMovie[3])) {guess22.setStyle("-fx-background-color: #52BE80;");} else {guess22.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[4].equals(randomMovie[4])) {guess23.setStyle("-fx-background-color: #52BE80;");} else {guess23.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[5].equals(randomMovie[5])) {guess24.setStyle("-fx-background-color: #52BE80;");} else {guess24.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[6].equals(randomMovie[6])) {guess25.setStyle("-fx-background-color: #52BE80;");} else {guess25.setStyle("-fx-background-color: #E74C3C;");}
        }
        else if(count==3) {
            guess30.setVisible(true);guess31.setVisible(true);guess32.setVisible(true);guess33.setVisible(true);guess34.setVisible(true);guess35.setVisible(true);
            guess30.setText(selectedMovie[1]);guess31.setText(selectedMovie[2]);guess32.setText(selectedMovie[3]);guess33.setText(selectedMovie[4]);guess34.setText(selectedMovie[5]);guess35.setText(selectedMovie[6]);
            l4.setVisible(true);
            if (selectedMovie[1].equals(randomMovie[1])) {guess30.setStyle("-fx-background-color: #52BE80;");} else {guess30.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[2].equals(randomMovie[2])) {guess31.setStyle("-fx-background-color: #52BE80;");} else {guess31.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[3].equals(randomMovie[3])) {guess32.setStyle("-fx-background-color: #52BE80;");} else {guess32.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[4].equals(randomMovie[4])) {guess33.setStyle("-fx-background-color: #52BE80;");} else {guess33.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[5].equals(randomMovie[5])) {guess34.setStyle("-fx-background-color: #52BE80;");} else {guess34.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[6].equals(randomMovie[6])) {guess35.setStyle("-fx-background-color: #52BE80;");} else {guess35.setStyle("-fx-background-color: #E74C3C;");}
        }
        else if(count==4) {
            guess40.setVisible(true);guess41.setVisible(true);guess42.setVisible(true);guess43.setVisible(true);guess44.setVisible(true);guess45.setVisible(true);
            guess40.setText(selectedMovie[1]);guess41.setText(selectedMovie[2]);guess42.setText(selectedMovie[3]);guess43.setText(selectedMovie[4]);guess44.setText(selectedMovie[5]);guess45.setText(selectedMovie[6]);
            l5.setVisible(true);
            if (selectedMovie[1].equals(randomMovie[1])) {guess40.setStyle("-fx-background-color: #52BE80;");} else {guess40.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[2].equals(randomMovie[2])) {guess41.setStyle("-fx-background-color: #52BE80;");} else {guess41.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[3].equals(randomMovie[3])) {guess42.setStyle("-fx-background-color: #52BE80;");} else {guess42.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[4].equals(randomMovie[4])) {guess43.setStyle("-fx-background-color: #52BE80;");} else {guess43.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[5].equals(randomMovie[5])) {guess44.setStyle("-fx-background-color: #52BE80;");} else {guess44.setStyle("-fx-background-color: #E74C3C;");}
            if (selectedMovie[6].equals(randomMovie[6])) {guess45.setStyle("-fx-background-color: #52BE80;");} else {guess45.setStyle("-fx-background-color: #E74C3C;");}
        }
        count++;
        if ( count>=5 )
        {
            Dialog dialog = new Dialog();
            dialog.setTitle("Oyun Bitti!");
            dialog.getDialogPane().setContentText("Kaybettiniz!  Doğru cevap: "+ randomMovie[1]);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
            dialog.show();
        }

        else if ( selectedMovie[1].equals(randomMovie[1]) && selectedMovie[2].equals(randomMovie[2]) && selectedMovie[3].equals(randomMovie[3]) && selectedMovie[4].equals(randomMovie[4]) && selectedMovie[5].equals(randomMovie[5]) && selectedMovie[6].equals(randomMovie[6])){
            Dialog dialog = new Dialog();
            dialog.setTitle("Tebrikler!");
            dialog.getDialogPane().setContentText("Kazandınız!");
            dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
            dialog.show();
        }
    }

    @FXML
    void Restart (ActionEvent event){
        count=0;
        isStarted=false;
        guess00.setVisible(false);guess01.setVisible(false);guess02.setVisible(false);guess03.setVisible(false);guess04.setVisible(false);guess05.setVisible(false);
        guess00.setText("");guess01.setText("");guess02.setText("");guess03.setText("");guess04.setText("");guess05.setText("");
        guess10.setVisible(false);guess11.setVisible(false);guess12.setVisible(false);guess13.setVisible(false);guess14.setVisible(false);guess15.setVisible(false);
        guess10.setText("");guess11.setText("");guess12.setText("");guess13.setText("");guess14.setText("");guess15.setText("");
        guess20.setVisible(false);guess21.setVisible(false);guess22.setVisible(false);guess23.setVisible(false);guess24.setVisible(false);guess25.setVisible(false);
        guess20.setText("");guess21.setText("");guess22.setText("");guess23.setText("");guess24.setText("");guess25.setText("");
        guess30.setVisible(false);guess31.setVisible(false);guess32.setVisible(false);guess33.setVisible(false);guess34.setVisible(false);guess35.setVisible(false);
        guess30.setText("");guess31.setText("");guess32.setText("");guess33.setText("");guess34.setText("");guess35.setText("");
        guess40.setVisible(false);guess41.setVisible(false);guess42.setVisible(false);guess43.setVisible(false);guess44.setVisible(false);guess45.setVisible(false);
        guess40.setText("");guess41.setText("");guess42.setText("");guess43.setText("");guess44.setText("");guess45.setText("");
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
    }

}