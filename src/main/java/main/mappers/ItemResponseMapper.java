package main.mappers;

import main.controllers.dto.ItemResponse;
import main.repository.entity.Item;
import org.springframework.stereotype.Component;

@Component

public class ItemResponseMapper {
    public ItemResponse map(Item item) {
        return ItemResponse.builder()
                .id(item.getId())
                .name(item.getName())
                .age(item.getAge())
                .build();
    }
}
