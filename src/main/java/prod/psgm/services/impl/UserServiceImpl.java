package prod.psgm.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prod.psgm.dtos.UserDTO;
import prod.psgm.models.User;
import prod.psgm.repositories.UserRepository;
import prod.psgm.services.interfaces.UserService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addUser(UserDTO userDTO) {
        userRepository.saveAndFlush(modelMapper.map(userDTO, User.class));
    }

    @Override
    public List<UserDTO> getAllTutors() {
        return userRepository.findAllByRole("ROLE_TUTOR").stream().map((user) -> modelMapper.map(user, UserDTO.class)).collect(Collectors.toList());
    }

    @Override
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }




}
