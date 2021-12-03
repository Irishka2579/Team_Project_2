package com.company.TeamProject2.Task5;

public class Registration {
    private String email;
    private String userName;
    private String password;


    public String getEmail() {
        if (email.contains("yahoo")) {
            return email;
        }else {
        return "wrong address";
    }}

        public void setEmail (String email){
            this.email = email;
        }

        public String getUserName () {
            return userName;
        }

        public void setUserName (String userName){
            this.userName = userName;
        }

        public String getPassword () {
        if(password!=userName && password.length()>6){
            return password;
        }else{
            return "wrong password";
        }}

        public void setPassword (String password){
            this.password = password;
        }
    }

    class  Tester {
        public static void main(String[] args) {
            Registration obj = new Registration();
            obj.setUserName("George");
            System.out.println(obj.getUserName());
            obj.setEmail("geo@yahoo.com");
            System.out.println(obj.getEmail());
            obj.setPassword("letMein");
            System.out.println(obj.getPassword());


            
            
        }
    }




