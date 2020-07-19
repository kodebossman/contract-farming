package com.cb.contractfarming.products.api;

import com.cb.contractfarming.common.ApiResponse;
import com.cb.contractfarming.common.CrudApi;
import com.cb.contractfarming.common.PaginationResult;
import com.cb.contractfarming.config.TypeMapper;
import com.cb.contractfarming.products.Product;
import com.cb.contractfarming.products.ProductDto;
import com.cb.contractfarming.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class productAPI implements                CrudApi<ProductDto> {
    private final ProductService productService;
    private final TypeMapper typeMapper;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ApiResponse register(@Valid @RequestBody ProductDto productDto){
        log.info("New Registration of Product "+productDto);
        final Product product = productService.register(typeMapper.map(productDto));
        return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(product));

}
    @Override
    public ApiResponse<ProductDto> create(ProductDto productDto) {
        return null;
    }

    @Override
    public ApiResponse<ProductDto> update(ProductDto productDto) {
        return null;
    }

    @Override
    public ApiResponse<ProductDto> delete(ProductDto productDto) {
        return null;
    }

    @Override
    public ApiResponse<PaginationResult<ProductDto>> findAll(String search, Integer page, Integer size, String sortBy) {
        return null;
    }

    @Override
    public ApiResponse<ProductDto> find(Long id) {
        return null;
    }
}
