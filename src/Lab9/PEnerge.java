package Lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PEnerge extends JFrame {

    JTextField h;

    public PEnerge() {

        super("Вираховування потенціальної енергії води");
        super.setBounds(700, 300, 450, 300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cont = super.getContentPane();
        cont.setLayout(new GridLayout(3, 2, 5, 5));

        JLabel hr = new JLabel("Введіть велечину h= ");
        h = new JTextField(2);
        cont.add(hr);
        cont.add(h);


        JButton butt = new JButton("Порахувати");

        cont.add(butt);

        butt.addActionListener(new Button_());
    }

    class Button_ implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double height = Double.parseDouble(h.getText());
                double result = height * 9.8 * 1000.0;
                JOptionPane.showMessageDialog(null, "Результат: " + result + " Дж");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Введіть коректне число.");
            }
        }
    }
}


