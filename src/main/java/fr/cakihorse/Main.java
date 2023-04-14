package fr.cakihorse;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("NoteApp");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton addButton = new JButton("Ajouter une note");
        //frame.add(addButton);

        addButton.addActionListener(e -> {String noteTitle = JOptionPane.showInputDialog(frame, "Titre de la note :");
            String noteContent = JOptionPane.showInputDialog(frame, "Contenu de la note :");

            // Créer une nouvelle note avec le titre et le contenu saisis
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        String userInput = JOptionPane.showInputDialog(null, "Entrez une chaîne de caractères :");

        JLabel title = new JLabel("");
        JTextArea textArea = new JTextArea();
        textArea.setText(userInput);




        frame.add(textArea);






    }
}
