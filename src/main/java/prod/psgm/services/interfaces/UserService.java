package prod.psgm.services.interfaces;

import prod.psgm.dtos.UserDTO;

import java.util.List;
import java.util.UUID;

public interface UserService {
    void addUser(UserDTO userDTO);
    List<UserDTO> getAllTutors();
    void deleteUser(UUID id);
    void deleteAllUsers();
}
