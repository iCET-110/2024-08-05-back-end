package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String address;
    private Integer age;
}
