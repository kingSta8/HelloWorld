package GraphicsUserInterface;

import javax.swing.*;
import java.awt.*;

public class NewGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Hello,mthrfckr! program");
        frame.setSize(1080, 720);

        JButton button = new JButton("Hello, mthrfckr!");
        JButton button2 = new JButton("U r ccksckr");
        JButton button3 = new JButton("Fck u");
        JButton button4 = new JButton("G0 fck urslf");
        /*button4.addActionListener();*/
        frame.getContentPane().add(BorderLayout.WEST,button);
        frame.getContentPane().add(BorderLayout.EAST,button2);
        frame.getContentPane().add(BorderLayout.NORTH,button3);
        frame.getContentPane().add(BorderLayout.SOUTH,button4);

        frame.setVisible(true);

    }
}
