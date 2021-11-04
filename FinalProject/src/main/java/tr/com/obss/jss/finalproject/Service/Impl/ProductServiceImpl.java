package tr.com.obss.jss.finalproject.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tr.com.obss.jss.finalproject.DAO.ProductRepository;
import tr.com.obss.jss.finalproject.Dto.ProductWithCategoryDto;
import tr.com.obss.jss.finalproject.Model.Product;
import tr.com.obss.jss.finalproject.Results.DataResult;
import tr.com.obss.jss.finalproject.Results.Result;
import tr.com.obss.jss.finalproject.Results.SuccessDataResult;
import tr.com.obss.jss.finalproject.Results.SuccessResult;
import tr.com.obss.jss.finalproject.Service.ProductService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public DataResult<List<Product>> getAllProduct() {
        return new SuccessDataResult<List<Product>>(productRepository.findAll(),"Product listed");
    }

    @Override
    public DataResult<List<Product>> getAllProductByPage(int pageNo, int pageSize) {

        Pageable pageable = PageRequest.of(pageNo-1, pageSize);

        return new SuccessDataResult<List<Product>>(productRepository.findAll(pageable).getContent());
    }

    @Override
    public Result addProduct(Product product) {
        this.productRepository.save(product);
        return new SuccessResult("Product added");
    }

    @Override
    public Result deleteProductById(Long productId) {
        productRepository.deleteProductById(productId);
        return new SuccessResult("Product deleted");
    }

    @Override
    public Result updateProduct(String productName) {
        Product product = productRepository.getByProductName(productName);
        product.setProductName(product.getProductName());
        product.setCategory(product.getCategory());
        product.setUnitPrice(product.getUnitPrice());
        product.setUnitsInStock(product.getUnitsInStock());
        return new SuccessResult("Product updated");
    }

//    @Override
//    public Result updateProduct(Product product) {
//        productRepository.
//    }

    @Override
    public DataResult<Product> getByProductName(String productName) {
        return new SuccessDataResult<Product>(productRepository.getByProductName(productName), "Product listed");
    }

    @Override
    public DataResult<Product> getByProductNameAndCategory_Id(String productName, Long categoryId) {
        return new SuccessDataResult<Product>(productRepository.getByProductNameAndCategory_Id(productName,categoryId), "Product listed");
    }

    @Override
    public DataResult<List<Product>> getByProductNameOrCategory_Id(String productName, Long categoryId) {
        return new SuccessDataResult<List<Product>>(productRepository.getByProductNameOrCategory_Id(productName,categoryId), "Product listed");
    }

    @Override
    public DataResult<List<Product>> getByCategory_IdIn(List<Long> categories_id) {
        return new SuccessDataResult<List<Product>>(productRepository.getByCategory_IdIn(categories_id), "Product listed");
    }

    @Override
    public DataResult<List<Product>> getByProductNameContains(String productName) {
        return new SuccessDataResult<List<Product>>(productRepository.getByProductNameContains(productName), "Product listed");
    }

    @Override
    public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
        return new SuccessDataResult<List<Product>>(productRepository.getByProductNameStartsWith(productName), "Product listed");
    }

    @Override
    public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
        return new SuccessDataResult<List<ProductWithCategoryDto>>(productRepository.getProductWithCategoryDetails(),"Product listed");
    }
}
