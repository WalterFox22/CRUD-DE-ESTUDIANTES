import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class from1 {
    public JPanel panel1;
    public JLabel CRUD;
    public JTextField ingresoCedula;
    public JLabel CEDULA;
    public JButton buscar;


    public from1() {
        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula = ingresoCedula.getText();

                String url = "jdbc:mysql://localhost:3306/estudiates2024";
                String user = "root";
                String password = "123456";

                String sql = "SELECT * FROM estudiantes WHERE cedula = ?";
                try (Connection connection = ){

                }
            }
        });
    }
}
