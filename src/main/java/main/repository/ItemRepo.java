package main.repository;

import main.repository.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface ItemRepo extends JpaRepository<Item,Integer> {
}
