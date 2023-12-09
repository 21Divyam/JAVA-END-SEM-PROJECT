public class Player {
    private int id;
    private String name;
    private char token;

    public Player(int id, String name, char token) {
        this.id = id;
        this.name = name;
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getToken() {
        return token;
    }
}