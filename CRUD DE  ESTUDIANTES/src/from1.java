import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

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

                String url = "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10720936";
                String usuario = "sql10720936";
                String password = "TQeMDi1ru2";
                Connection conn = null;
                PreparedStatement pstmt = null;

                String sql = "SELECT * FROM estudiantes WHERE cedula = ?";
                try (Connection connection = DriverManager.getConnection(url,usuario,password)){
                    pstmt = connection.prepareStatement(sql);


                    pstmt = conn.prepareStatement(sql);

                    //SETEAMOS LOS VALORES DE LA SENTENCIA PREVIA
                    pstmt.setInt(1, 9);   // SE LE ASIGNA EL VALOR QUE SE DESEA CAMBIAR DE LA PRIMERA CONDICION SET b1=?
                    pstmt.setString(2, "0094098135");  // SE LE COLOCA LE CEDULA DEL QUE SE DESEA CAMBIAR

                    //IMPRIMER EL ENUNCIADO
                    System.out.println(sql);
                    int result = pstmt.executeUpdate();
                    System.out.println("se modificaron: " + result + "filas");


                } catch (SQLException ex) {
                    // throw new RuntimeException(ex);
                    System.out.println(ex.getMessage());

                }
            }
        });
    }
}
