package Service;

import Repository.IUserRepository;
import Repository.UserRepository;

import java.sql.Connection;
import java.util.Scanner;

public class LoginService {
    private Connection connection;
    private Scanner scanner;

    private IUserRepository userRepository;
    public LoginService(Connection connection, Scanner scanner){
        this.connection = connection;
        this.scanner = scanner;
        userRepository = new UserRepository(connection);
    }

    public void login(){
        System.out.println("Enter Your Email");
        scanner.nextLine();
        String email = scanner.next();
        boolean update = userRepository.getUserEmail(email);
        if(update){
            System.out.println("Successfully logged In");
        }else{
            System.out.println("Email doesn't exist");
        }


    }
}
