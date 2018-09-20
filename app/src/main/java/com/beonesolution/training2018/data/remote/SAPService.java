package com.beonesolution.training2018.data.remote;

/**
 * Created by user21 on 9/18/2018.
 */

import com.beonesolution.training2018.model.ItemDetailModel;
import com.beonesolution.training2018.model.ListItemModel;
import com.beonesolution.training2018.model.LoginDataModel;
import com.beonesolution.training2018.model.LoginResponseModel;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface SAPService
{
    // POST https://localhost:50000/b1s/v1/Login
    // @POST = HTTP Method
    // Login = Endpoint dari url
    // Call<LoginResponseModel> = return response dari API
    // postLogin = definisikan Nama Method
    // @Body LoginDataModel post = data JSON yang mau dikirim
    @POST("Login")
    Call<LoginResponseModel> postLogin(@Body LoginDataModel post);

    // GET https://localhost:50000/b1s/v1/Items?$select=ItemCode,ItemName,ItemsGroupCode,QuantityOnStock&$top=10
    @GET("Items?$select=ItemCode,ItemName,ItemsGroupCode,QuantityOnStock&$top=10")
    Call<ListItemModel> getListItem();

    // GET https://localhost:50000/b1s/v1/Items('ITEMCODE')?$select=ItemCode,ItemName,ItemsGroupCode
    @GET("Items('{ItemCode}')?$select=ItemCode,ItemName,ItemsGroupCode,ItemWarehouseInfoCollection")
    Call<ItemDetailModel> getDetailItem(@Path("ItemCode") String itemCode);
}
