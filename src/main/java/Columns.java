public class Columns {

    private int id_user;
    private String name;

    public Columns() {
    }

    Columns(int id_user, String name) {
        this.id_user = id_user;
        this.name = name;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id_user + " " + this.name;
    }
}
