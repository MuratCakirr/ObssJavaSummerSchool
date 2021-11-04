package tr.com.obss.jss.finalproject.Model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotNull
    @Size(max = 30)
    private String name;

    @NotBlank
    @NotNull
    @Size(max = 30)
    private String username;

    @NotBlank
    @NotNull
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @NotNull
    @Size(max = 120)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

}
