/* Name: Nick Austen
 * Date: 30 Mar 2024
 * Purpose: This class generates a GUI based on the user inputs in the main window. Will create JTextFields based on user inputs in previous
 * window. JTextFields are set as arrays to be accessible for further programming efforts. Also creates window to scale with largest user input.
 * 
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import java.util.ArrayList;

public class WordInputs extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField[] nounsFields;
    private JTextField[] verbsFields;
    private JTextField[] adverbsFields;
    private JTextField[] adjectivesFields;
    private JTextField[] namesFields;

    /**
     * Create the frame.
     */
    public WordInputs(Main mainInstance) {
    	
    	int [] numArray = {mainInstance.getNouns(), mainInstance.getVerbs(), mainInstance.getAdverbs(),
    		mainInstance.getAdjectives(), mainInstance.getNames()};
    	
    	int max = numArray[0];
    	
    	for (int i = 1; i < numArray.length; i++) {
    		if (numArray[i] > max) {
    			max = numArray[i];
    		}
    	}
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 551, (400 + (max * 20)));
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        // Initialize arrays for text fields
        nounsFields = new JTextField[mainInstance.getNouns()];
        verbsFields = new JTextField[mainInstance.getVerbs()];
        adverbsFields = new JTextField[mainInstance.getAdverbs()];
        adjectivesFields = new JTextField[mainInstance.getAdjectives()];
        namesFields = new JTextField[mainInstance.getNames()];

        contentPane.setLayout(null);
        int y = 36;

        // Create and add nouns text fields
        for (int a = 0; a < mainInstance.getNouns(); a++) {
            nounsFields[a] = new JTextField();
            nounsFields[a].setBounds(10, y, 94, 20);
            contentPane.add(nounsFields[a]);
            y += 30;
        }

        // Create and add verbs text fields
        y = 36;
        for (int b = 0; b < mainInstance.getVerbs(); b++) {
            verbsFields[b] = new JTextField();
            verbsFields[b].setBounds(114, y, 94, 20);
            contentPane.add(verbsFields[b]);
            y += 30;
        }

        // Create and add adverbs text fields
        y = 36;
        for (int c = 0; c < mainInstance.getAdverbs(); c++) {
            adverbsFields[c] = new JTextField();
            adverbsFields[c].setBounds(218, y, 94, 20);
            contentPane.add(adverbsFields[c]);
            y += 30;
        }

        // Create and add adjectives text fields
        y = 36;
        for (int d = 0; d < mainInstance.getAdjectives(); d++) {
            adjectivesFields[d] = new JTextField();
            adjectivesFields[d].setBounds(322, y, 94, 20);
            contentPane.add(adjectivesFields[d]);
            y += 30;
        }

        // Create and add names text fields
        y = 36;
        for (int e = 0; e < mainInstance.getNames(); e++) {
            namesFields[e] = new JTextField();
            namesFields[e].setBounds(426, y, 94, 20);
            contentPane.add(namesFields[e]);
            y += 30;
        }

        JLabel inputNounLabel = new JLabel("Nouns");
        inputNounLabel.setBounds(5, 5, 105, 351);
        inputNounLabel.setVerticalAlignment(SwingConstants.TOP);
        inputNounLabel.setBackground(new Color(255, 255, 255));
        inputNounLabel.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(inputNounLabel);

        JLabel inputVerbLabel = new JLabel("Verbs");
        inputVerbLabel.setBounds(110, 5, 105, 351);
        inputVerbLabel.setVerticalAlignment(SwingConstants.TOP);
        inputVerbLabel.setHorizontalAlignment(SwingConstants.CENTER);
        inputVerbLabel.setBackground(Color.WHITE);
        contentPane.add(inputVerbLabel);

        JLabel inputAdverbLabel = new JLabel("Adverbs");
        inputAdverbLabel.setBounds(215, 5, 105, 351);
        inputAdverbLabel.setVerticalAlignment(SwingConstants.TOP);
        inputAdverbLabel.setHorizontalAlignment(SwingConstants.CENTER);
        inputAdverbLabel.setBackground(Color.WHITE);
        contentPane.add(inputAdverbLabel);

        JLabel inputAdjectiveLabel = new JLabel("Adjectives");
        inputAdjectiveLabel.setBounds(320, 5, 105, 351);
        inputAdjectiveLabel.setVerticalAlignment(SwingConstants.TOP);
        inputAdjectiveLabel.setHorizontalAlignment(SwingConstants.CENTER);
        inputAdjectiveLabel.setBackground(Color.WHITE);
        contentPane.add(inputAdjectiveLabel);

        JLabel inputNameLabel = new JLabel("Names");
        inputNameLabel.setBounds(425, 5, 105, 351);
        inputNameLabel.setVerticalAlignment(SwingConstants.TOP);
        inputNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        inputNameLabel.setBackground(Color.WHITE);
        contentPane.add(inputNameLabel);
    }

    // Method to get nouns text fields
    public JTextField[] getNounsFields() {
        return nounsFields;
    }

    // Method to get verbs text fields
    public JTextField[] getVerbsFields() {
        return verbsFields;
    }

    // Method to get adverbs text fields
    public JTextField[] getAdverbsFields() {
        return adverbsFields;
    }

    // Method to get adjectives text fields
    public JTextField[] getAdjectivesFields() {
        return adjectivesFields;
    }

    // Method to get names text fields
    public JTextField[] getNamesFields() {
        return namesFields;
    }
}
