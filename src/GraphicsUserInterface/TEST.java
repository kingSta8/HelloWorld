package GraphicsUserInterface;

import javax.swing.*;
import java.awt.event.*;

public class TEST {
    private JFrame frame1;
    private JPanel panel1;
    private JPanel panel2;

    private static final String TEST = "Тест 'Познай себя'";
    private static final String NEXT = "Далее";
    private static final String RESULT = "Результат";
    private static final String ENTER_YOUR_NAME = "Введите ваше имя:";
    private static final String WHAT = "Какой вы?";
    private static final String BEAU = "красивый ";
    private static final String UGLY = "некрасивый ";
    private static final String WHO = "Кто вы?";
    private static final String DEB = "дебил";
    private static final String ADEB = "не дебил";
    private static final String INTEL = "интеллектуал";

    private JTextField input = new JTextField("", 5);
    private JLabel label1 = new JLabel(ENTER_YOUR_NAME);
    private JLabel label2 = new JLabel(WHAT);
    private JRadioButton radio1 = new JRadioButton(BEAU);
    private JRadioButton radio2 = new JRadioButton(UGLY);
    private JLabel label3 = new JLabel(WHO);
    private JRadioButton radio3 = new JRadioButton(DEB);
    private JRadioButton radio4 = new JRadioButton(ADEB);

    public static void main(String[] args) {
        TEST test = new TEST();
        test.go();
    }

    private void go() {
        frame1 = new JFrame(TEST);
        frame1.setSize(500, 200);
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button1 = new JButton(NEXT);
        button1.addActionListener(new ButtonListenerNext());

        panel1 = new JPanel();
        panel1.add(label1);
        panel1.add(input);
        panel1.add(label2);
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        panel1.add(radio1);
        radio1.setSelected(true);
        panel1.add(radio2);
        panel1.add(button1);

        frame1.add(panel1);
        frame1.setVisible(true);
    }

    class ButtonListenerNext implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            go2();
        }
    }

    private void go2() {
        panel1.revalidate();
        frame1.remove(panel1);

        JButton button2 = new JButton(RESULT);
        button2.addActionListener(new ButtonListenerRes());

        panel2 = new JPanel();
        panel2.add(label3);
        ButtonGroup group = new ButtonGroup();
        group.add(radio3);
        group.add(radio4);
        panel2.add(radio3);
        radio3.setSelected(true);
        panel2.add(radio4);
        panel2.add(button2);

        frame1.add(panel2);
        frame1.repaint();
    }

    class ButtonListenerRes implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            go3();
        }
    }

    private void go3() {
        String message = "";
        message += "Поздравляю, " + input.getText() + ", вы ";
        message += ((radio1.isSelected()) ? BEAU : UGLY);
        message += ((radio3.isSelected()) ? DEB : INTEL);
        message += " !";
        JOptionPane.showMessageDialog(null, message, RESULT, JOptionPane.PLAIN_MESSAGE);
    }
}
