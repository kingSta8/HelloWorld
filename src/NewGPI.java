import javax.swing.*;
import java.awt.*;

public class NewGPI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Hello,mthrfckr! program");
        frame.setSize(1920, 1080);

        JButton button = new JButton("Hello, mthrfckr!");
        frame.getContentPane().add(button);

        frame.setVisible(true);

    }

    /*public void changeIt() {
        button.setText("I've been clicked!");
    }*/
}
