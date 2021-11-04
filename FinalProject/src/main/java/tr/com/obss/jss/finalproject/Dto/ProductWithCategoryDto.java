package tr.com.obss.jss.finalproject.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDto{
    private Long id;
    private String productName;
    private String categoryName;
}
