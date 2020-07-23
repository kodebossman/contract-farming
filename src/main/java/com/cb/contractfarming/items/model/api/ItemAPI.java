package com.cb.contractfarming.items.model.api;

import com.cb.contractfarming.common.ApiResponse;
import com.cb.contractfarming.common.CrudApi;
import com.cb.contractfarming.common.PaginationResult;
import com.cb.contractfarming.config.TypeMapper;
import com.cb.contractfarming.items.model.Item;
import com.cb.contractfarming.items.model.ItemDTO;
import com.cb.contractfarming.items.model.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/item")

public class ItemAPI implements CrudApi<ItemDTO> {

    private final ItemService itemService;
    private  final TypeMapper typeMapper;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ApiResponse<ItemDTO> register( @Valid @RequestBody ItemDTO itemDTO){
        log.info("New Registration of Items "+itemDTO);
        final Item item = itemService.register(typeMapper.map(itemDTO));
        return new ApiResponse<>(HttpStatus.OK.value(), typeMapper.map(item));
    }

    @Override
    public ApiResponse<ItemDTO> create(ItemDTO farmerDto) {
        return null;
    }

    @Override
    public ApiResponse<ItemDTO> update(ItemDTO itemsDTO) {
        return null;
    }

    @Override
    public ApiResponse<ItemDTO> delete(ItemDTO itemsDTO) {
        return null;
    }

    @Override
    public ApiResponse<PaginationResult<ItemDTO>> findAll(String search, Integer page, Integer size, String sortBy) {
        return null;
    }

    @Override
    public ApiResponse<ItemDTO> find(Long id) {
        return null;
    }
}

