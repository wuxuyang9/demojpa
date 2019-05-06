package com.example.demo.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetEasyUIData<T> {
    private T rows;
    private Long total;
}
