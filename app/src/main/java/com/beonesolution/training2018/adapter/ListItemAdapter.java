package com.beonesolution.training2018.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.beonesolution.training2018.R;
import com.beonesolution.training2018.model.ListItemModel;
import com.beonesolution.training2018.model.ListItemValueModel;

import java.util.List;

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.DataObjectHolder>
{
    private ListItemModel dsListItem;
    private ListItemClickListener listItemClickListener;

    // Constructor
    public ListItemAdapter(ListItemModel dsListItem){
        this.dsListItem = dsListItem;
    }

    public class DataObjectHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        // Variable item dalam item_listitem.xml
        private TextView tvItemCode;
        private TextView tvItemGroup;
        private TextView tvItemName;
        private TextView tvQty;

        public DataObjectHolder(View itemView)
        {
            super(itemView);
            // Binding tiap item dengan view nya
            tvItemCode = itemView.findViewById(R.id.tvItemCode);
            tvItemGroup = itemView.findViewById(R.id.tvItemGroup);
            tvItemName = itemView.findViewById(R.id.tvItemName);
            tvQty = itemView.findViewById(R.id.tvQty);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v)
        {
            listItemClickListener.onItemClick(getPosition(), v);
        }
    }

    public void setOnClickListener(ListItemClickListener myListener){
        listItemClickListener = myListener;
    }

    public interface ListItemClickListener{
        void onItemClick(int position, View v);
    }

    @Override
    public ListItemAdapter.DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        // Connect ke item_listitem.xml
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_listitem, parent, false);
        return new DataObjectHolder(view);
    }

    @Override
    public void onBindViewHolder(ListItemAdapter.DataObjectHolder holder, int position)
    {
        // Connect tiap item di item_listitem.xml dengan modelnya
        holder.tvItemCode.setText(dsListItem.getValue().get(position).getItemCode());
        holder.tvItemGroup.setText(dsListItem.getValue().get(position).getItemsGroupCode().toString());
        holder.tvItemName.setText(dsListItem.getValue().get(position).getItemName());
        holder.tvQty.setText(dsListItem.getValue().get(position).getQuantityOnStock().toString());
    }

    @Override
    public int getItemCount()
    {
        return dsListItem.getValue().size();
    }

    // Public Methods untuk dapetin data / model nya
    // Optional
    public List<ListItemValueModel> getListItemValue(int position) { return dsListItem.getValue(); }
    public String getItemCode(int position) { return  dsListItem.getValue().get(position).getItemCode(); }
    public int getItemGroup(int position) { return  dsListItem.getValue().get(position).getItemsGroupCode(); }
    public String getItemName(int position) { return  dsListItem.getValue().get(position).getItemName(); }
    public Double getItemQty(int position) { return  dsListItem.getValue().get(position).getQuantityOnStock(); }
}