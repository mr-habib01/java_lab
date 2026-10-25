import java.sql.*;

public class ShowStudent {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:ucanaccess://DUD_RAKIB.accdb"
            );

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM Student");

            while (rs.next()) {
                System.out.println("Name: " + rs.getString("Name"));
                System.out.println("Email: " + rs.getString("Email"));
                System.out.println("Phone: " + rs.getString("Phone"));
                System.out.println("--------------------");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}