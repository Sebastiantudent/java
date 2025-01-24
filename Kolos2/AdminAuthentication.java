public class AdminAuthentication implements Authentication {
    String username;
    String password;

    public AdminAuthentication(String username, String password) {
        this.password = password;
        this.username = username;
    }
    @Override
    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            return true;
        }
        return false;
    }
    @Override
    public void logout() {
        System.out.println("Logged out Admin");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if (this.username.equals(username) && this.password.equals(oldPassword)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }
}
