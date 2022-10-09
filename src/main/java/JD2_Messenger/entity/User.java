package JD2_Messenger.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class User {
    String login;
    String password;
    String fio;
    LocalDate dateBirthday;
    LocalDateTime dateRegistration;
    Enum role;

    public User(String login, String password, String fio, LocalDate dateBirthday, LocalDateTime dateRegistration, Enum role) {
        this.login = login;
        this.password = password;
        this.fio = fio;
        this.dateBirthday = dateBirthday;
        this.dateRegistration = dateRegistration;
        this.role = role;
    }
}
