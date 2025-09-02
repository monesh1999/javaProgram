package DailyTaskOops;

public class Login {
    
    private String username;
    private String password;

    
    public void setUsername(String username) {
        this.username = username;
    }

  
    public String getUsername() {
        return username;
    }

   
    public void setPassword(String password) {
        this.password = password;
    }

    
    public boolean validatePassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    
    public static void main(String[] args) {
        Login login = new Login();

        login.setUsername("admin");
        login.setPassword("secret123");

        System.out.println("Username: " + login.getUsername());
        
        
        if (login.validatePassword("secret123")) {
            System.out.println("Password matched. Access granted!");
        } else {
            System.out.println("Invalid password. Access denied!");
        }
    }
}
