package main.repository.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank
    @Column(name = "name")
    private String name;

    @Min(10) // haibernate valideaza inainte se se screi query-ul in baza de date, valuarea trebuie sa fie minim 10
    @Column(name = "age")
    private Integer age;


}
