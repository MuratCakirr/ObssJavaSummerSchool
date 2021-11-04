package tr.com.obss.jss.petclinic.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@Entity
public class Admin extends Person{

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Role> roles;
}
