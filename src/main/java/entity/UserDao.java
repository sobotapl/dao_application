package entity;

public class UserDao {

    //tworzenie uzytkownika
    private static final String CREATE_USER_QUERY =
            "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";

    //pobieranie wszystkich użytkowników.
    private static final String READ_USER_QUERY =
            "SELECT * FROM users";

    //zmiana danych,
    private static final String UDATE_USER_QUERY =
            "UPDATE users SET usrname =?, email =?, password =? WHERE id =?";

    //pobieranie po id,
    private static final String ALL_USER_QUERY =
            "SELECT * FROM users";

    //usuwanie po id,
    private static final String DELETE_USER_QUERY =
            "DELETE FROM users WHERE id =?";

}
