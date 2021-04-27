package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;
import it.polito.tdp.parole.model.ParoleArrayList;
import it.polito.tdp.parole.model.ParoleLinkedList;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;
	//ParoleLinkedList elenco;
	//ParoleArrayList elenco;
	

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;
    
    @FXML
    private TextArea txtTime;
    
    
    @FXML
    void doInsert(ActionEvent event) {
    	long startTime = System.nanoTime();
    	String risultato = "";
    	elenco.addParola(txtParola.getText());
    	long endTime = System.nanoTime() - startTime;
    	txtParola.setText("");
    	
    	for(String s : elenco.getElenco()) {
    		risultato += s+"\n";
    	}
    	txtResult.setText(risultato);
    	
    	txtTime.setText("Tempo di esecuzione: "+endTime/1e9+" secondi");
    }

    @FXML
    void doReset(ActionEvent event) {
    	long startTime = System.nanoTime();
    	elenco.reset();
    	long endTime = System.nanoTime() - startTime;
    	
    	txtResult.setText("");
    	txtParola.setText("");
    	txtTime.setText("");
    	
    	txtTime.setText("Tempo di esecuzione: "+endTime/1e9+" secondi");
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	long startTime = System.nanoTime();
    	elenco.removeParola(txtResult.getSelectedText());
    	long endTime = System.nanoTime() - startTime;
    	
    	String risultato = "";
    	for(String s : elenco.getElenco()) {
    		risultato += s+"\n";
    	}
    	txtResult.setText(risultato);
    	
    	txtTime.setText("Tempo di esecuzione: "+endTime/1e9+" secondi");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
        //elenco = new ParoleLinkedList() ;
        //elenco = new ParoleArrayList();
    }
}
