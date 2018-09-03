/*
 * Created by Joel Barr
 * 8/30/18 2:24 PM.
 * SAIT CMPP-264, Summer 2018
 * Day 6 Exercise
 */

package TextAnalyzer;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
//import org.apache.commons.lang;

public class Controller {

    public MenuItem mnuFill;
    public MenuItem mnuClose;
    public MenuItem mnuReset;
    public Button btnAnalyze;
    public TextArea txtSubject;
    public TextField txtLines;
    public TextField txtChars;
    public TextField txtWords;

    public void closeApp(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void fillText(ActionEvent actionEvent) throws IOException {
        File file = null;
        FileReader stream = null;

        try {
            // Open file
            file = new File("data/sample.txt");
            int fileLength = (int)file.length();
            stream = new FileReader(file);

            // Get random text from file
            int length = 200 + new Random().nextInt(1000);
            int offset = new Random().nextInt(fileLength - length);
            //Burn through the offset
            for (int i = 0; i < offset; i++) {
                stream.read();
            }

            char[] cbuf = new char[length];
            //Read from file into cbuf
            for (int i = 0; i < cbuf.length; i++) {
                cbuf[i] = (char)stream.read();
            }

            //set text
            txtSubject.setText("..." + new String(cbuf) + "...");
            //...and analyze it automatically
            analyzeText(actionEvent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (stream != null){
                stream.close();
            }
        }
    }

    public void resetText(ActionEvent actionEvent) {
        // clear text area
        txtSubject.setText("");

        // analyze text
        analyzeText(actionEvent);
    }

    public void analyzeText(ActionEvent actionEvent) {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        String text = txtSubject.getText();

        if (text.length() > 0) {
            //Count
            charCount = text.length();
            wordCount = text.split("\\s+").length;
            lineCount = txtSubject.getParagraphs().size();
        }
        //Display
        txtChars.setText(Integer.toString(charCount));
        txtWords.setText(Integer.toString(wordCount));
        txtLines.setText(Integer.toString(lineCount));
    }
}
