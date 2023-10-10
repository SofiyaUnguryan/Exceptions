import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

public class Main {
    public final static String PATTERN = "[\\w]{7,20}+";

    public static void main(String[] args) {
        try {
            isInfoCorrect("abra","cadabra", "cadabra");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void isInfoCorrect (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches(PATTERN)) {
            throw new WrongLoginException("Неверный логин");
        }
        if (!password.matches(PATTERN)){
            throw new WrongPasswordException("Неверный пароль");
        }
        if (!confirmPassword.equals(password)){
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}