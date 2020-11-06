package jogoInterfaceGrafica;

/* Tic Tac Toe */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Tictactoe implements ActionListener {
    JFrame window = new JFrame("Tic Tac Toe");
    JButton b[] = new JButton[9];

    String letter = "";
    ImageIcon X;
    ImageIcon O;
    ImageIcon ltr;
    int value = 0;
    boolean win = false;
    String[] letters = new String[9];

    public Tictactoe() {
        // Initialize Array
        for (int i = 0; i < 9; i++) {
            letters[i] = "";
        }

        // Assign images
        X = new ImageIcon(getClass().getResource(""));
        O = new ImageIcon(getClass().getResource(""));
        // Create the Window
        window.setSize(500,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new GridLayout(6,7));

        // Add Buttons
        for (int i = 0; i < 9; i++) {
            b[i] = new JButton();
            window.add(b[i]);
        }

        // Add ActionListener
        for (int i = 0; i < 9; i++) {
            b[i].addActionListener(this);
        }

        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent a) {
        value++;
        // Who's Turn
        if (value % 2 == 1) {
            ltr = X;
            letter = "X";
        }
        if (value % 2 == 0) {
            ltr = O;
            letter = "O";
        }

        // Display Letters
        for (int i = 0; i < 9; i++) {
            if (a.getSource() == b[i]) {
                b[i].setIcon(ltr);
                b[i].setDisabledIcon(ltr);
                b[i].setEnabled(false);
                letters[i] = letter;
            }
        }

        // Who Won

        // Horizontal
        if (letters[0].equals(letters[1]) && letters[1].equals(letters[2]) && !letters[0].equals("")) {
            win = true;
        } else if (letters[3].equals(letters[4]) && letters[4].equals(letters[5]) && !letters[3].equals("")) {
            win = true;
        } else if (letters[6].equals(letters[7]) && letters[7].equals(letters[8]) && !letters[6].equals("")) {
            win = true;
        }

        // Vertical
        if (letters[0].equals(letters[3]) && letters[3].equals(letters[6]) && !letters[0].equals("")) {
            win = true;
        } else if (letters[1].equals(letters[4]) && letters[4].equals(letters[7]) && !letters[1].equals("")) {
            win = true;
        } else if (letters[2].equals(letters[5]) && letters[5].equals(letters[8]) && !letters[2].equals("")) {
            win = true;
        }

        // Diagonal
        if (letters[0].equals(letters[4]) && letters[4].equals(letters[8]) && !letters[0].equals("")) {
            win = true;
        } else if (letters[2].equals(letters[4]) && letters[4].equals(letters[6]) && !letters[2].equals("")) {
            win = true;
        }

        if (win) {
            JOptionPane.showMessageDialog(null, "Player " + letter + " wins!");
            for (JButton i : b) {
                i.setEnabled(false);
            }
        } else if (!win && value == 9) {
            JOptionPane.showMessageDialog(null, "The game ended in a tie.");
        }
    }

    public static void main(String[] args) {
        new Tictactoe();
    }
}
        