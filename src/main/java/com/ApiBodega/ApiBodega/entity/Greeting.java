package com.ApiBodega.ApiBodega.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {
    private long id;
    private String content;
}
