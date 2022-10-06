public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        database.addArtist(new Artist(1L, "Will", 20, "Fantasy Artist"));
        database.addArtist(new Artist(2L, "Tom", 18, "Demon Artist"));
        database.addArtist(new Artist(3L, "Wunderhorn", 19, "Furry Artist"));
        database.addArtist(new Artist(4L, "Andrew", 19, "Java Artist"));
//        database.deleteById("artists", 1);
//        database.deleteById("artists", 2);
//        database.deleteById("artists", 3);
//        database.deleteById("artists", 4);
        database.findById("artists", 2);
        database.findById("artists", 3);
//        database.clearTable("artists");
    }
}
