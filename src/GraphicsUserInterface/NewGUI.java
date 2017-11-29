package GraphicsUserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewGUI extends JFrame {

    private static final String NEXT = "Далее";
    private static final String ENTER_YOUR_NAME = "Введите ваше имя:";
    private static final String RESULT = "Результат";
    private static final String WHAT = "Какой вы?";
    private static final String WHO = "Кто вы?";
    private static final String DEB = "дебил";
    private static final String ADEB = "не дебил";
    private static final String INTEL = "интеллектуал";
    private static final String BEAU = "красивый ";
    private static final String UGLY = "некрасивый ";
    private static final String TEST = "Тест 'Познай себя'";

    JPanel container;

    private JButton button1 = new JButton(NEXT);
    private JButton button2 = new JButton(RESULT);
    private JLabel label1 = new JLabel(ENTER_YOUR_NAME);
    private JLabel label2 = new JLabel(WHAT);
    private JLabel label3 = new JLabel(WHO);

    private JTextField input = new JTextField("", 5);
    private JRadioButton radio1 = new JRadioButton(BEAU);
    private JRadioButton radio2 = new JRadioButton(UGLY);
    private JRadioButton radio3 = new JRadioButton(DEB);
    private JRadioButton radio4 = new JRadioButton(ADEB);

   private NewGUI() {
       super(TEST);
       this.setBounds(100, 100, 500, 200);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container = (JPanel) this.getContentPane();
        container.setLayout(new GridLayout(4,3,5,10));
        container.add(label1);
        container.add(input);

        container.add(label2);
      ButtonGroup group = new ButtonGroup();
       group.add(radio1);
       group.add(radio2);
        container.add(radio1);
       radio1.setSelected(true);
       container.add(radio2);


       button1.addActionListener(new ButtonEventListenerNext());
       container.add(button1);



       /*if ((radio1.isSelected())) {
           radio1.setSelected(true);
       } else {
           radio2.setSelected(true);
       }

       container.remove(radio1);
       container.remove(radio2);
       container.remove(label1);
       container.remove(input);
       container.remove(label2);

       ButtonGroup group2 = new ButtonGroup();
       group2.add(radio3);
       group2.add(radio4);
       container.add(radio3);
       radio1.setSelected(true);
       container.add(radio4);

       if ((radio3.isSelected())) {
           radio3.setSelected(true);
       } else {
           radio4.setSelected(true);
       }*/

       /*button2.addActionListener(new ButtonEventListenerRes());
       container.add(button2);*/
    }

    class ButtonEventListenerNext extends JFrame implements ActionListener  {
       public void actionPerformed(ActionEvent d) {
        next();
       }
    }

    void next() {
       container.remove(label1);
    }

    class ButtonEventListenerRes implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Поздравляю, " + input.getText() + ", вы ";
            message += ((radio3.isSelected()) ? BEAU : UGLY);
            message += ((radio1.isSelected()) ? DEB : INTEL);
            message += " !";
            JOptionPane.showMessageDialog(null, message, RESULT, JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        NewGUI test = new NewGUI();
        test.setVisible(true);
    }
}
