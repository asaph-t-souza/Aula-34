package com.t3.springrest.dto;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class StudentDto {

    private Long id;
    private String fullName;
    private String email;
    
}
