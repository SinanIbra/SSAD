package LAB13.Facade.start;

public class WebApp {
    public static void main(String[] args) {
        AuthenticationService authenticationService = new AuthenticationService();
        Session session = new Session();


        User user1 = authenticationService.signUp("john_doe", "password123");

        User user2 = authenticationService.login("jane_doe", "password456");
        if (user2 != null) {
            session.start(user2);
        }


        if (session.isValid()) {
            System.out.println("User " + user2.getUsername() + " is logged in.");
            session.end();
        }

        if (user2.verifyCredentials()) {
            authenticationService.resetPassword(user2, "newpassword789");
        }
    }
}
