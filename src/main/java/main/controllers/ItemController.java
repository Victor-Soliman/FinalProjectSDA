package main.controllers;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.ItemRequest;
import main.controllers.dto.ItemResponse;
import main.repository.entity.Item;
import main.services.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;


    @GetMapping(value = "all")
    public List<ItemResponse> findAll() {
        return itemService.findAll();
    }

    @PostMapping
    public ItemResponse save(@RequestBody ItemRequest itemRequest) {
        return itemService.save(itemRequest);
    }


}
