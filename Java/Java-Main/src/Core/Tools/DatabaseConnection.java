package Core.Tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private final String strClassName = "com.mysql.jdbc.Driver";
    private String bddName = "univcergy22";
    private String bddLogin = "root";
    private String bddPassword = "root";
    private String bddIP = "localhost";
    private String bddPort = "3306";
    private String bddUrl = "jdbc:mysql://"+this.bddIP+":"+this.bddPort+"/"+this.bddName;

    public DatabaseConnection() {}
    public DatabaseConnection(String bddName, String bddLogin, String bddPassword, String bddIP, String bddPort) {
        this.bddName = bddName;
        this.bddLogin = bddLogin;
        this.bddPassword = bddPassword;
        this.bddIP = bddIP;
        this.bddPort = bddPort;
    }

    /**
     * Requète d'insertion dans une base de donnée
     * 
     * SystemPrint()
     * @throws java.sql.SQLException
     */
    public void datasInsert(String sqlQuery) throws SQLException {
        try {
            Class.forName(this.strClassName);
            Connection conn = DriverManager.getConnection(this.bddUrl, this.bddLogin, this.bddPassword);
            Statement stAddUser = (Statement) conn.createStatement();
            stAddUser.executeUpdate(sqlQuery);
            conn.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Driver non chargé !");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
        }
    }

    /**
     * Requète de lecture dans une base de donnée
     * 
     * datasSelect()
     */
    public void datasSelect() {
        try {
            Class.forName(this.strClassName);
            Connection conn = DriverManager.getConnection(this.bddUrl, this.bddLogin, this.bddPassword);
            Statement stUsers = (Statement) conn.createStatement();
            ResultSet rsUsers = stUsers.executeQuery("select * from Acces");
            while (rsUsers.next()) {
                System.out.print("Id[" + rsUsers.getInt(1) + "]"
                        + rsUsers.getString(2)
                        + "[" + rsUsers.getString("statut") + "] "
                        + rsUsers.getInt("age") + "\n");
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Driver non chargé !");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Autre erreur !");
            e.printStackTrace();
        }
    }

}