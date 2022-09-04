package main.controllers.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@Builder

public class ItemResponse {


    private Integer id;


    private String name;


    private Integer age;
}
