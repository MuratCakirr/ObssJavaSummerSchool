package tr.com.obss.jss.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Specialty extends BaseEntity {

    private String name;

    @Column(length = 500)
    private String description;

}
