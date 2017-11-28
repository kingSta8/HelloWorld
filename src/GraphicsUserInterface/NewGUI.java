package GraphicsUserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewGUI extends JFrame {

    private JButton button = new JButton("Далее");
    private JLabel label1 = new JLabel("Введите ваше имя:");
    private JLabel label2 = new JLabel("Кто вы?");
    private JTextField input = new JTextField("", 5);
    private JRadioButton radio1 = new JRadioButton("дебил");
    private JRadioButton radio2 = new JRadioButton("не дебил");

   public NewGUI() {
       super("Тест 'Познай себя'");
       this.setBounds(100, 100, 500, 200);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label1);
        container.add(input);

        container.add(label2);
       ButtonGroup group = new ButtonGroup();
       group.add(radio1);
       group.add(radio2);
        container.add(radio1);
       radio1.setSelected(true);
       container.add(radio2);

       button.addActionListener(new ButtonEventListener());
       container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Поздравляю, " + input.getText() + ", вы ";
            message +=  ((radio1.isSelected())
                    ? "дебил" : "не дебил" );
            message += " !";
            JOptionPane.showMessageDialog(null,
                    message,
                    "Результат",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        NewGUI test = new NewGUI();
        test.setVisible(true);
    }
}
