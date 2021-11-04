package tr.com.obss.jss.finalproject.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotNull
    @Size(max = 30)
    private String productName;

    @NotNull
    private double unitPrice;

    @NotNull
    private short unitsInStock;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn()
    @JsonBackReference
    private Category category;

}
