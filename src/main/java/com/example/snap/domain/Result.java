package com.example.snap.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
public class Result<T> {
    private int code = HttpStatus.OK.value();
    private String message = "success";
    private T result;
}
