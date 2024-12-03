package services;

import models.User;

public class UserService {
    private List<User> users;

    public UserService() {
        // Load users from JSON or database
    }

    public boolean authenticate(String username, String password) { /* Implementation */ }
    public void registerUser(User user) { /* Implementation */ }
}
