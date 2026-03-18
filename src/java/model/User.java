
package model;


public class User {
    private int userID;
    private String fullName;
    private String email;
    private String roleName;

    public User() {
    }

    public User(int userID, String fullName, String email, String roleName) {
        this.userID = userID;
        this.fullName = fullName;
        this.email = email;
        this.roleName = roleName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
}
