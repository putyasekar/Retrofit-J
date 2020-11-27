package com.putya.retrofitcrud.remote;

public class APIUtils {

    private APIUtils() {
    }

    public static final String API_URL =
            "http://192.168.44.109/restCI/index.php/";

    public static ProductService getProductService() {
        return RetrofitClient.getClient(API_URL)
                .create(ProductService.class);
    }
}
