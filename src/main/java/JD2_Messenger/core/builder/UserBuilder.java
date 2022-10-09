package JD2_Messenger.core.builder;

import JD2_Messenger.entity.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserBuilder {
    String login;
    String password;
    String fio;
    LocalDate dateBirthday;
    LocalDateTime dateRegistration;
    Enum role;

    private UserBuilder() {
    }

    public static UserBuilder create(){
        return new UserBuilder();
    }

    public UserBuilder setLogin(String login) {
        this.login = login;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder setFio(String fio) {
        this.fio = fio;
        return this;
    }

    public UserBuilder setDateBirthday(LocalDate dateBirthday) {
        this.dateBirthday = dateBirthday;
        return this;
    }

    public UserBuilder setDateRegistration(LocalDateTime dateRegistration) {
       this.dateRegistration = dateRegistration;
       return this;
    }

    public UserBuilder setRole(Enum role) {
        this.role = role;
        return this;
    }

    public User build() {
        return new User(login,password,fio,dateBirthday,dateRegistration,role);
    }
}
