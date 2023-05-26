package review10;

public class FacebookUser {

    private String name;

    private String userName;

    private String password;

    private String DOB;

    public FacebookUser(String name, String userName, String password, String DOB){
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.DOB = DOB;
    }

    void login(String userName, String password) {

        if(this.userName.equals(userName) && this.password.equals(password)) {
            System.out.println("Logged in");
        }
    }

    public String getDOB() {
        return DOB;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
