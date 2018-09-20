package com.beonesolution.training2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.beonesolution.training2018.adapter.ListItemAdapter;
import com.beonesolution.training2018.data.remote.ApiUtils;
import com.beonesolution.training2018.data.remote.SAPService;
import com.beonesolution.training2018.model.ListItemModel;
import com.beonesolution.training2018.model.ListItemValueModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView rvListItem; // Recyclerviewnya
    private ListItemAdapter listItemAdapter; // Controllernya
    private ListItemModel listItem; // Modelnya
    private SAPService sapService;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindItem();
        loadData();
    }

    private void bindItem(){
        sapService = ApiUtils.getSAPService(MainActivity.this);
        rvListItem = findViewById(R.id.rvListItem);
        // Definisikan jenis layout dari recyclerviewnya
        RecyclerView.LayoutManager listItemLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        // Set jenis layoutnya
        rvListItem.setLayoutManager(listItemLayoutManager);
    }

    private void loadData(){
        sapService.getListItem().enqueue(new Callback<ListItemModel>()
        {
            @Override
            public void onResponse(Call<ListItemModel> call, Response<ListItemModel> response)
            {
                if (response.isSuccessful()){
                    // Definisikan model kosong
                    listItem = new ListItemModel();
                    // Set response ke listitem
                    listItem.setValue(response.body().getValue());
                    // Definisikan List Item Adapternya
                    listItemAdapter = new ListItemAdapter(listItem);
                    // Set adapternya ke recyclerview nya
                    rvListItem.setAdapter(listItemAdapter);
                    // Add Click Listener ke item nya
                    listItemAdapter.setOnClickListener(new ListItemAdapter.ListItemClickListener()
                    {
                        @Override
                        public void onItemClick(int position, View v)
                        {
                            // Ambil itemcode, itemgroup, itemname
                            String itemCode = listItem.getValue().get(position).getItemCode();
                            String itemName = listItem.getValue().get(position).getItemName();
                            int itemGroup = listItem.getValue().get(position).getItemsGroupCode();

                            // Buka form detail sesuai itemcodenya
                            Intent intent = new Intent();
                            // Put Extra: pass variables ke activity lain
                            intent.putExtra("ITEMCODE", itemCode);
                            intent.putExtra("ITEMNAME", itemName);
                            intent.putExtra("ITEMGROUP", itemGroup);
                            intent.setClass(MainActivity.this, ItemDetailActivity.class);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    Toast.makeText(MainActivity.this, "Error: " + response.code() + " " + response.errorBody(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ListItemModel> call, Throwable t)
            {
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
