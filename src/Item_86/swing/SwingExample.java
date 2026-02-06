package Item_86.swing;

import javax.swing.*;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (05.02.2026)
 */
public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        JButton button = new JButton("Click me!");

        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Hello, Swing!"));

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
