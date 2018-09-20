package com.beonesolution.training2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.beonesolution.training2018.adapter.ItemDetailAdapter;
import com.beonesolution.training2018.data.remote.ApiUtils;
import com.beonesolution.training2018.data.remote.SAPService;
import com.beonesolution.training2018.model.ItemDetailModel;
import com.beonesolution.training2018.model.ListItemModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ItemDetailActivity extends AppCompatActivity
{
    private TextView tvItemName;
    private TextView tvItemGroup;
    private RecyclerView rvWarehouse;
    private ItemDetailAdapter itemDetailAdapter; // Controllernya
    private ItemDetailModel itemDetail; // Modelnya
    private SAPService sapService;

    private String itemCode;
    private String itemName;
    private int itemGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        bindItem();
        bindData();
    }

    private  void bindItem(){
        tvItemName = findViewById(R.id.tvItemName);
        tvItemGroup = findViewById(R.id.tvItemGroup);
        rvWarehouse = findViewById(R.id.rvWarehouse);
        sapService = ApiUtils.getSAPService(ItemDetailActivity.this);
        RecyclerView.LayoutManager listItemLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvWarehouse.setLayoutManager(listItemLayoutManager);
    }

    private void bindData(){
        // Get params from intent
        itemCode = getIntent().getStringExtra("ITEMCODE");
        itemName = getIntent().getStringExtra("ITEMNAME");
        itemGroup = getIntent().getIntExtra("ITEMGROUP", 0);

        // Set toolbar title
        getSupportActionBar().setTitle(itemCode);

        // Set data
        tvItemName.setText(itemName);
        tvItemGroup.setText(itemGroup + ""); // cast to string

        // Load data
        loadData(itemCode);
    }

    private void loadData(String itemCode){
        sapService.getDetailItem(itemCode).enqueue(new Callback<ItemDetailModel>()
        {
            @Override
            public void onResponse(Call<ItemDetailModel> call, Response<ItemDetailModel> response)
            {
                if (response.isSuccessful()){
                    itemDetail = new ItemDetailModel();
                    itemDetail.setValue(response.body().getItemWarehouseInfoCollection());
                    itemDetailAdapter = new ItemDetailAdapter(itemDetail);
                    rvWarehouse.setAdapter(itemDetailAdapter);
                }
                else{
                    Log.d("ERROR", "onResponse: " + response.errorBody());
                    Toast.makeText(ItemDetailActivity.this, "Error: " + response.code() + " " + response.errorBody(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ItemDetailModel> call, Throwable t)
            {
                Log.d("ERROR", "onResponse: " + t.getMessage());
                Toast.makeText(ItemDetailActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
