package fr.cakihorse;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //oui j'utilise swing....

        DiscordRpc.main();
        System.setProperty( "file.encoding", "UTF-8" );
        JFrame frame = new JFrame("NoteApp");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //ajout d'une icon
        ImageIcon icon = new ImageIcon("C:\\Users\\Julian Familly\\IdeaProjects\\LetOut\\src\\main\\resources\\LetOut.png");



        frame.setIconImage(icon.getImage());










    }
}
