package com.example.risaleinurdanvecizeler.model;

import java.util.List;

import lombok.Data;

@Data
public class QuotesModel {
    private String quote;
    private String source;
    private List<String> category;
}
