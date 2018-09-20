package com.beonesolution.training2018.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.beonesolution.training2018.R;
import com.beonesolution.training2018.model.ItemDetailModel;
import com.beonesolution.training2018.model.ItemWarehouseInfoCollection;
import com.beonesolution.training2018.model.ListItemModel;
import com.beonesolution.training2018.model.ListItemValueModel;

import java.util.List;

public class ItemDetailAdapter extends RecyclerView.Adapter<ItemDetailAdapter.DataObjectHolder>
{
    private ItemDetailModel dsItemDetail;
    private ItemDetailClickListener itemDetailClickListener;

    // Constructor
    public ItemDetailAdapter(ItemDetailModel dsItemDetail){
        this.dsItemDetail = dsItemDetail;
    }

    public class DataObjectHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        // Variable item dalam item_listitem.xml
        private TextView tvWhsCode;
        private TextView tvQty;

        public DataObjectHolder(View itemView)
        {
            super(itemView);
            // Binding tiap item dengan view nya
            tvWhsCode = itemView.findViewById(R.id.tvWhsCode);
            tvQty = itemView.findViewById(R.id.tvQty);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v)
        {
            itemDetailClickListener.onItemClick(getPosition(), v);
        }
    }

    public void setOnClickListener(ItemDetailClickListener myListener){
        itemDetailClickListener = myListener;
    }

    public interface ItemDetailClickListener{
        void onItemClick(int position, View v);
    }

    @Override
    public ItemDetailAdapter.DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        // Connect ke item_listitem.xml
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_warehouse, parent, false);
        return new DataObjectHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemDetailAdapter.DataObjectHolder holder, int position)
    {
        // Connect tiap item di item_listitem.xml dengan modelnya
        holder.tvWhsCode.setText(dsItemDetail.getItemWarehouseInfoCollection().get(position).getWarehouseCode());
        holder.tvQty.setText(dsItemDetail.getItemWarehouseInfoCollection().get(position).getInStock().toString());
    }

    @Override
    public int getItemCount()
    {
        return dsItemDetail.getItemWarehouseInfoCollection().size();
    }

    // Public Methods untuk dapetin data / model nya
    // Optional
    public List<ItemWarehouseInfoCollection> getItemWarehouseInfoCollection(int position) { return dsItemDetail.getItemWarehouseInfoCollection(); }
    public String getItemCode(int position) { return  dsItemDetail.getItemWarehouseInfoCollection().get(position).getWarehouseCode(); }
    public Double getItemQty(int position) { return  dsItemDetail.getItemWarehouseInfoCollection().get(position).getInStock(); }
}