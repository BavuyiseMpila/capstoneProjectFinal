package ac.za.mycput.service.Interface;

import ac.za.mycput.dto.UserDto;
import ac.za.mycput.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
