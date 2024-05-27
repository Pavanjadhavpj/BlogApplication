package com.BlogApplication.start.Service;
import java.util.List;
import com.BlogApplication.start.Entities.User;
import com.BlogApplication.start.payload.UserDto;

public interface UserService {
  public UserDto createUser(UserDto userDto);
  public UserDto updateUser(UserDto userDto,Integer userId);
  public UserDto getUserById(Integer userId);
  public List<User> getAllUser();
  public void delete(Integer userId);
}
