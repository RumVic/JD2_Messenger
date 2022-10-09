package JD2_Messenger.storage.IStorage;

import JD2_Messenger.core.DTO.DTOUser;

import java.time.LocalDateTime;
import java.util.List;

public interface IEssenceStorage<TYPE>{

    List<TYPE> get();

    TYPE getById(int id);

    void  save(DTOUser dtoUser);

    LocalDateTime timeRegistration();

}
