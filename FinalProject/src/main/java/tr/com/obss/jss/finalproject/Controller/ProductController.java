package tr.com.obss.jss.finalproject.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import tr.com.obss.jss.finalproject.Dto.ProductWithCategoryDto;
import tr.com.obss.jss.finalproject.Model.Product;
import tr.com.obss.jss.finalproject.Results.DataResult;
import tr.com.obss.jss.finalproject.Results.Result;
import tr.com.obss.jss.finalproject.Results.SuccessDataResult;
import tr.com.obss.jss.finalproject.Service.ProductService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/product")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public Result addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("/get")
    public DataResult<List<Product>> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName) {
        return productService.getByProductName(productName);
    }

    @GetMapping("/getByProductNameAndCategory_Id")
    public DataResult<Product> getByProductNameAndCategory_Id(@RequestParam String productName,@RequestParam Long categoryId){
        return productService.getByProductNameAndCategory_Id(productName,categoryId);
    }

    @GetMapping("/getByProductNameOrCategory_Id")
    public DataResult<List<Product>> getByProductNameOrCategory_Id(@RequestParam String productName,@RequestParam Long categoryId) {
        return productService.getByProductNameOrCategory_Id(productName,categoryId);
    }

    @GetMapping("/getByCategory_IdIn")
    public DataResult<List<Product>> getByCategory_IdIn(@RequestParam List<Long> categories_id) {
        return productService.getByCategory_IdIn(categories_id);
    }

    @GetMapping("/getByProductNameContains")
    public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName) {
        return productService.getByProductNameContains(productName);
    }

    @GetMapping("/getByProductNameStartsWith")
    public DataResult<List<Product>> getByProductNameStartsWith(@RequestParam String productName) {
        return productService.getByProductNameStartsWith(productName);
    }

    @GetMapping("/getAllProductByPage")
    public DataResult<List<Product>> getAllProductByPage(int pageNo, int pageSize) {
        return productService.getAllProductByPage(pageNo,pageSize);
    }

    @GetMapping("/getProductWithCategoryDetails")
    public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
        return productService.getProductWithCategoryDetails();
    }
}
