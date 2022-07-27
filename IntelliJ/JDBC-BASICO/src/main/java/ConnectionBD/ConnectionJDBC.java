package ConnectionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) {

        String urlConnection = "jdbc:mysql://localhost/digital_inovation_one";


        try(Connection conn = DriverManager.getConnection(urlConnection,"ro0ot","Izx@9h18") ) {
            System.out.println("Sucesso!");
        } catch (Exception e) {
            System.out.println("Falha");
        }

//        try {
//            conn = DriverManager.getConnection(urlConnection,"root","Izx@9h18");
//            System.out.println("Sucesso!");
//        } catch (SQLException e) {
//            System.out.println("Falha");
//            throw new RuntimeException(e);
//        }
    }
}
