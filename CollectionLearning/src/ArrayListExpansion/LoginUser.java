package ArrayListExpansion;

public class LoginUser {
    private String username;
    private String password;
    private String idno;
    private String phone;

    public LoginUser() {
    }

    public LoginUser(String username, String password, String idno, String phone) {
        this.username = username;
        this.password = password;
        this.idno = idno;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
