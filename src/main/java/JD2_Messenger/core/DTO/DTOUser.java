package JD2_Messenger.core.DTO;

import java.time.LocalDate;

public class DTOUser {

    String login;
    String password;
    String fio;
    LocalDate dateBirthday;

    public DTOUser(String login, String password, String fio, LocalDate dateBirthday) {
        this.login = login;
        this.password = password;
        this.fio = fio;
        this.dateBirthday = dateBirthday;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFio() {
        return fio;
    }

    public LocalDate getDateBirthday() {
        return dateBirthday;
    }
}
