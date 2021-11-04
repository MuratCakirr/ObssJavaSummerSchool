package tr.com.obss.jss.petclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@Entity
public class Vet extends Person{

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Specialty> specialties;
}
