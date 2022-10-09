package JD2_Messenger.storage;

import JD2_Messenger.core.DTO.DTOUser;
import JD2_Messenger.core.builder.UserBuilder;
import JD2_Messenger.entity.User;
import JD2_Messenger.storage.IStorage.IUserStorage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserStorage implements IUserStorage {

    private List<User> storage = new ArrayList<>();

    private LocalDateTime timeRegistration;

    private static final UserStorage instance = new UserStorage();

    @Override
    public List get() {
        return null;
    }

    @Override
    public Object getById(int id) {
        return null;
    }

    @Override
    public LocalDateTime timeRegistration() {
        return timeRegistration = LocalDateTime.now();
    }

    @Override
    public void save(DTOUser dtoUser) {
        storage.add(UserBuilder.create()
                .setLogin(dtoUser.getLogin())
                .setPassword(dtoUser.getPassword())
                .setFio(dtoUser.getFio())
                .setDateBirthday(dtoUser.getDateBirthday())
                .setDateRegistration(timeRegistration())
                .build());
    }

    public static UserStorage getInstance(){
        return instance;
    }
}
