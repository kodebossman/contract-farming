package com.cb.contractfarming.items.api;

import com.cb.contractfarming.common.ApiResponse;
import com.cb.contractfarming.common.CrudApi;
import com.cb.contractfarming.common.PaginationResult;
import com.cb.contractfarming.config.TypeMapper;
import com.cb.contractfarming.items.Item;
import com.cb.contractfarming.items.ItemsDTO;
import com.cb.contractfarming.items.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/item")

public class ItemAPI implements CrudApi<ItemsDTO> {

    private final ItemService itemService;
    private  final TypeMapper typeMapper;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ApiResponse<ItemsDTO> register( @Valid @RequestBody ItemsDTO itemsDTO){
        log.info("New Registration of Items "+itemsDTO);
        final Item item = itemService.register(typeMapper.map(itemsDTO));
        return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(item));
    }

    @Override
    public ApiResponse<ItemsDTO> create(ItemsDTO farmerDto) {
        return null;
    }

    @Override
    public ApiResponse<ItemsDTO> update(ItemsDTO itemsDTO) {
        return null;
    }

    @Override
    public ApiResponse<ItemsDTO> delete(ItemsDTO itemsDTO) {
        return null;
    }

    @Override
    public ApiResponse<PaginationResult<ItemsDTO>> findAll(String search, Integer page, Integer size, String sortBy) {
        return null;
    }

    @Override
    public ApiResponse<ItemsDTO> find(Long id) {
        return null;
    }
}
