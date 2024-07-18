package prod.psgm.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String organization;
    private String course;
    private String role;
    private String birthday;
    private String urlPhoto;

}
