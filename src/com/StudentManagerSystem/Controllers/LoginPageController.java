package com.StudentManagerSystem.Controllers;

public class LoginPageController {

    private Input input;

    private String Password;

    public class Input {

        String username;
        String password;
        int userType = -1;

        public Input(String username, String password, int userType) {
            this.username = username;
            this.password = password;
            this.userType = userType;
        }

        int getUsername() {
            return Integer.parseInt(username);
        }
    }

    public boolean login(Input input) {
        getPassword(input.username, input.userType); //load data and get the password
        return (this.Password.equals(input.password));
    }

    void getPassword(String username, int userType){
        //TODO search by userType and set the password
        setPassword("");
    }

    private void setPassword(String password) {
        Password = password;
    }
}
