package com.putya.retrofitcrud.remote;

import com.putya.retrofitcrud.model.PersonItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ProductService {

    @GET("person/get/")
    Call<List<PersonItem>> getProduct();

    @FormUrlEncoded
    @POST("person/add")
    Call<PersonItem> addProduct(@Field("name") String name,
                                @Field("price") String price,
                                @Field("desc") String desc);


    @FormUrlEncoded
    @PUT("person/update/")
    Call<PersonItem> updateProduct(@Field("id") int id,
                                   @Field("name") String name,
                                   @Field("price") String price,
                                   @Field("desc") String desc);

    @FormUrlEncoded
    @HTTP(method = "DELETE", path = ("person/delete/"), hasBody = true)
    Call<PersonItem> deleteProduct(@Field("id") int id);

}
