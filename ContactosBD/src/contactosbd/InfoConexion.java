package contactosbd;

public class InfoConexion {

    String url = "jdbc:mysql://localhost/directorio";
    String username="cbn";
    String password="cbn2016";

    public InfoConexion() {
    }
    
    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
