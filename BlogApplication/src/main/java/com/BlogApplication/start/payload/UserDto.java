package com.BlogApplication.start.payload;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
   private int id;
   
   @NotEmpty
   @Size(min = 6,message = "Username Must Be min 4 Character !!")
   private String name;
   @Email(message = "Email address is not valid !! ")
   private String email;
   @NotEmpty
   @Size(min = 7, max = 20,message="Password must be min of 7 char and max of 10 chars !! ")
   private String password;
   @NotEmpty
   private String about;
}
