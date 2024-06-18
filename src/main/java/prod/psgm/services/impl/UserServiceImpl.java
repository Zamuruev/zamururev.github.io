package prod.psgm.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prod.psgm.dtos.UserDTO;
import prod.psgm.models.User;
import prod.psgm.repositories.UserRepository;
import prod.psgm.services.interfaces.UserSerivce;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserSerivce {

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
}
