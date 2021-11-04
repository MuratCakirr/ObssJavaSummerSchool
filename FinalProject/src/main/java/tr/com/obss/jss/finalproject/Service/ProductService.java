package tr.com.obss.jss.finalproject.Service;

import tr.com.obss.jss.finalproject.Dto.ProductWithCategoryDto;
import tr.com.obss.jss.finalproject.Model.Product;
import tr.com.obss.jss.finalproject.Results.DataResult;
import tr.com.obss.jss.finalproject.Results.Result;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAllProduct();
    DataResult<List<Product>> getAllProductByPage(int pageNo, int pageSize);
    Result addProduct(Product product);

    Result deleteProductById(Long productId);

    Result updateProduct(String productName);

    DataResult<Product> getByProductName(String productName);

    DataResult<Product> getByProductNameAndCategory_Id(String productName,Long categoryId);

    DataResult<List<Product>> getByProductNameOrCategory_Id(String productName, Long categoryId);

    DataResult<List<Product>> getByCategory_IdIn(List<Long> categories);

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
}
