package tr.com.obss.jss.finalproject.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tr.com.obss.jss.finalproject.Dto.ProductWithCategoryDto;
import tr.com.obss.jss.finalproject.Model.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    Product getByProductName(String productName);

    Product deleteProductById(Long productId);

    Product getByProductNameAndCategory_Id(String productName,Long categoryId);

    List<Product> getByProductNameOrCategory_Id(String productName, Long categoryId);

    List<Product> getByCategory_IdIn(List<Long> categories);

    List<Product> getByProductNameContains(String productName);

    List<Product> getByProductNameStartsWith(String productName);

    @Query("SELECT new tr.com.obss.jss.finalproject.Dto.ProductWithCategoryDto(p.id, p.productName, c.categoryName) From Category c Inner join c.products p")
    List<ProductWithCategoryDto> getProductWithCategoryDetails();
}
