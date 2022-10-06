import java.sql.*;
public class Database {
    String username = "root";
    String password = "1111";
    public static final  String connectionUrl = "jdbc:mysql://localhost:3306/artworks";

    public void addArtist(Artist artist){
        try (Connection conn = DriverManager.getConnection(connectionUrl, username, password)){
            Statement statement = conn.createStatement();
            int rows = statement.executeUpdate("REPLACE INTO artists(id, name, age, type) VALUES (" +Artist.getId()+", "+ "'" + Artist.getName()+ "'" + ", "+Artist.getAge()+", "+ "'"+ Artist.getType()+ "'"+ " )"
            );
//            System.out.println("Added: " + rows);

        } catch (Exception ex) {
            System.out.println("FAILED");
            System.out.println(ex);
        }
    }

    public void deleteById(String rootTable, int id){

        try (Connection conn = DriverManager.getConnection(connectionUrl, username, password)){
            Statement statement = conn.createStatement();
            int rows = statement.executeUpdate("DELETE FROM "+rootTable+" WHERE id = "+ id +""
            );
//            System.out.println("Removed: " + rows);

        } catch (Exception ex) {
            System.out.println("FAILED TO REMOVE");
            System.out.println(ex);
        }
    }

    public void findById(String rootTable, int id){

        try (Connection conn = DriverManager.getConnection(connectionUrl, username, password)){
            Statement statement = conn.createStatement();
            String script = "SELECT * FROM "+rootTable+ " WHERE id = " + id +"";
            ResultSet rs = statement.executeQuery(script);

            while (rs.next()){
                Artist artist = new Artist(Artist.getId(), Artist.getName(), Artist.getAge(), Artist.getType());
                artist.setId(rs.getLong(1));
                artist.setName(rs.getString(2));
                artist.setAge(rs.getInt(3));
                artist.setType(rs.getString(4));
                System.out.println(artist);
            }


        } catch (Exception ex) {
            System.out.println("FAILED TO SELECT");
            System.out.println(ex);
        }
    }

    public void clearTable(String rootTable){
        try (Connection conn = DriverManager.getConnection(connectionUrl, username, password)) {
            Statement statement = conn.createStatement();
            int rows = statement.executeUpdate("DELETE FROM " +rootTable+"");
        } catch (Exception ex) {
            System.out.println("FAILED TO CLEAR");
            System.out.println(ex);
        }
    }
}
