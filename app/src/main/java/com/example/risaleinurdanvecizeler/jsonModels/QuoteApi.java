package com.example.risaleinurdanvecizeler.jsonModels;

import com.example.risaleinurdanvecizeler.model.QuotesModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuoteApi {
     String URL = "https://quotes-service.herokuapp.com/";

    @GET("api/getQuotes")
    Call<List<QuotesModel>> getQuotes();
}
