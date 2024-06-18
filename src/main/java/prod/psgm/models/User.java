package prod.psgm.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String middleName;
    @Column
    private String lastName;
    @Column(/*unique = true, nullable = false*/)
    private String email;
    @Column(/*nullable = false*/)
    private String password;
    @Column(unique = true)
    private String phoneNumber;
    @Column(/*nullable = false*/)
    private String organization;
    @Column
    private String course;
    @Column(nullable = false)
    private String role;
    @Column
    private String birthday;
    @Column
    private String urlPhoto;

}
