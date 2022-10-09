package JD2_Messenger.service.IService;

import JD2_Messenger.core.DTO.DTOUser;

import java.util.List;

public interface IEssenceService <TYPE>{

    List<TYPE> get();

    TYPE getById();

    void validate(DTOUser user);

}
