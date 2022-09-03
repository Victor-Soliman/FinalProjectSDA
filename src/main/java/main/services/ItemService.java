package main.services;

import lombok.RequiredArgsConstructor;
import main.repository.ItemRepo;
import main.repository.entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ItemService {

    private final ItemRepo itemRepo;

    public List<Item> findAll() {
        return itemRepo.findAll();
    }


}
