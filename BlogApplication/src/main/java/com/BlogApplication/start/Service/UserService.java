package com.BlogApplication.start.Service;
import java.util.List;

import org.springframework.stereotype.Service;
import com.BlogApplication.start.payload.UserDto;

public interface UserService {
  public UserDto createUser(UserDto userDto);
  public UserDto updateUser(UserDto userDto,Integer userId);
  public UserDto getUserById(Integer userId);
  public List<UserDto> getAllUser();
  public void deleteUser(Integer userId);
}
