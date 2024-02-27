package Repository.Query;

public interface Query {
    String insertUser = "INSERT INTO User (username, email, mobileNum) VALUES (?, ?, ?);";
    String getUserEmail = "select * from user where email = ?;";
}
