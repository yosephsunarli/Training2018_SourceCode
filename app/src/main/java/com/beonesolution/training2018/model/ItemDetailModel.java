package com.beonesolution.training2018.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemDetailModel {

    @SerializedName("odata.metadata")
    @Expose
    private String odataMetadata;
    @SerializedName("ItemCode")
    @Expose
    private String itemCode;
    @SerializedName("ItemName")
    @Expose
    private String itemName;
    @SerializedName("ItemsGroupCode")
    @Expose
    private Integer itemsGroupCode;
    @SerializedName("ItemWarehouseInfoCollection")
    @Expose
    private List<ItemWarehouseInfoCollection> itemWarehouseInfoCollection = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public ItemDetailModel() {
    }

    /**
     *
     * @param itemsGroupCode
     * @param itemName
     * @param odataMetadata
     * @param itemWarehouseInfoCollection
     * @param itemCode
     */
    public ItemDetailModel(String odataMetadata, String itemCode, String itemName, Integer itemsGroupCode, List<ItemWarehouseInfoCollection> itemWarehouseInfoCollection) {
        super();
        this.odataMetadata = odataMetadata;
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemsGroupCode = itemsGroupCode;
        this.itemWarehouseInfoCollection = itemWarehouseInfoCollection;
    }

    public String getOdataMetadata() {
        return odataMetadata;
    }

    public void setOdataMetadata(String odataMetadata) {
        this.odataMetadata = odataMetadata;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemsGroupCode() {
        return itemsGroupCode;
    }

    public void setItemsGroupCode(Integer itemsGroupCode) {
        this.itemsGroupCode = itemsGroupCode;
    }

    public List<ItemWarehouseInfoCollection> getItemWarehouseInfoCollection() {
        return itemWarehouseInfoCollection;
    }

    public void setItemWarehouseInfoCollection(List<ItemWarehouseInfoCollection> itemWarehouseInfoCollection) {
        this.itemWarehouseInfoCollection = itemWarehouseInfoCollection;
    }

    public void setValue(List<ItemWarehouseInfoCollection> itemWarehouseInfoCollection) {
        this.itemWarehouseInfoCollection = itemWarehouseInfoCollection;
    }
}