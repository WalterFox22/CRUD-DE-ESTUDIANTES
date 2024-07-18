import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CRUD DE ESTUDIANTES");
        frame.setContentPane(new from1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2600, 200);
        frame.pack();
        frame.setVisible(true);
    }
}