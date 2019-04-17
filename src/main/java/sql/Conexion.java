package sql;
import java.sql.*;
import model.*;

public class Conexion {


    public void createDB(){

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "");
            Statement statement = con.createStatement();

            String query = "CREATE DATABASE IF NOT EXISTS torneo_de_frescas";
            statement.execute(query);

            query = ""
                    + "CREATE TABLE IF NOT EXISTS torneo_de_frescas.ganadores("
                    + "id INT AUTO_INCREMENT,"
                    + "name varchar(40),"
                    + "tipo varchar(40),"
                    + "CONSTRAINT pk_id PRIMARY KEY (id));";
            statement.execute(query);
            con.close();

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void insertarGanador(Human humano){

        try {
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/torneo_de_frescas","root","");
            String query = "INSERT INTO ganadores (nombre, tipo) VALUES (null,?,?);";
            PreparedStatement myStatement2 = con.prepareStatement(query);


            myStatement2.setString(1,humano.getName());
            myStatement2.setString(2, humano.getClass().getSimpleName());
            myStatement2.execute();
            con.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

}
