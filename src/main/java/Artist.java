public class Artist {
    static Long id;
    static String name;
    static int age;
    static String type;

    public Artist(Long id, String name, int age, String type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public static Long getId() {
        return id;
    }

    public static void setId(Long id) {
        Artist.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Artist.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Artist.age = age;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Artist.type = type;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
}
