package JD2_Messenger.service;
import JD2_Messenger.core.DTO.DTOUser;
import JD2_Messenger.core.builder.UserBuilder;
import JD2_Messenger.entity.User;
import JD2_Messenger.service.IService.IUserService;
import JD2_Messenger.storage.IStorage.IUserStorage;
import JD2_Messenger.storage.UserStorage;

import java.util.Date;
import java.util.List;

public class UserService implements IUserService {

    private static final UserService instance = new UserService();

    IUserStorage storage = UserStorage.getInstance();

    @Override
    public List get() {
        return null;
    }

    @Override
    public Object getById() {
        return null;
    }

    @Override
    public void validate(DTOUser dtoUser) {
        if (dtoUser.getLogin().isBlank() || dtoUser.getLogin() == null) {
            throw new IllegalArgumentException("You send incorrect login");
        }
        if (dtoUser.getPassword().isBlank() || dtoUser.getPassword() == null) {
            throw new IllegalArgumentException("you send incorrect password");
        }
        if (dtoUser.getFio().isEmpty() || dtoUser.getFio() == null) {
            throw new IllegalArgumentException("You send incorrect fio");
        }
        storage.save(dtoUser);
        /**/
    }

    public static UserService getInstance(){
        return instance;
    }

    private void checkUniqueness (){

    }

}

