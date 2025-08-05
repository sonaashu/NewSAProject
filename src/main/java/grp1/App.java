import javax.swing.*;

public class HelloApp {
    public static void main(String[] args) {
        // Create a window
        JFrame frame = new JFrame("Simple App");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a button
        JButton button = new JButton("Click Me!");
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Hello, World!"));

        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
