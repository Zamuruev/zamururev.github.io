package prod.psgm.services.interfaces;

import prod.psgm.dtos.UserDTO;

import java.util.List;

public interface UserSerivce {

    void addUser(UserDTO userDTO);
    List<UserDTO> getAllTutors();
}
