package main.controllers;

import lombok.RequiredArgsConstructor;
import main.repository.entity.Item;
import main.services.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;


    @GetMapping(value = "all")
    public List<Item> findAll() {
        return itemService.findAll();
    }


}
