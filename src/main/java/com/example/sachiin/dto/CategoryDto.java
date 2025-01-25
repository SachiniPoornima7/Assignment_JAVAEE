package com.example.sachiin.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
    private String cid;
    private String cname;
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
}
