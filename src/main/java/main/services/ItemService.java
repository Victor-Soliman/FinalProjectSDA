package main.services;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.ItemRequest;
import main.controllers.dto.ItemResponse;
import main.mappers.ItemRequestItemMapper;
import main.mappers.ItemResponseMapper;
import main.repository.ItemRepo;
import main.repository.entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class ItemService {

    private final ItemRepo itemRepo;
    private final ItemResponseMapper itemResponseMapper;

    private final ItemRequestItemMapper itemRequestItemMapper;

    public List<ItemResponse> findAll() {
        return itemRepo.findAll()
                .stream()
                .map(itemResponseMapper::map)
                .collect(Collectors.toList());
    }


    public ItemResponse save(ItemRequest itemRequest) {
        Item item = itemRequestItemMapper.map(itemRequest);
        itemRepo.save(item);
        return itemResponseMapper.map(item);
    }

    public void delete(Integer id) {
        itemRepo.deleteById(id);
    }
}
