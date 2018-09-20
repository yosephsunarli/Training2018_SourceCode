package com.beonesolution.training2018.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListItemValueModel {

    @SerializedName("ItemCode")
    @Expose
    private String itemCode;
    @SerializedName("ItemName")
    @Expose
    private String itemName;
    @SerializedName("ItemsGroupCode")
    @Expose
    private Integer itemsGroupCode;
    @SerializedName("QuantityOnStock")
    @Expose
    private Double quantityOnStock;

    /**
     * No args constructor for use in serialization
     *
     */
    public ListItemValueModel() {
    }

    /**
     *
     * @param quantityOnStock
     * @param itemsGroupCode
     * @param itemName
     * @param itemCode
     */
    public ListItemValueModel(String itemCode, String itemName, Integer itemsGroupCode, Double quantityOnStock) {
        super();
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemsGroupCode = itemsGroupCode;
        this.quantityOnStock = quantityOnStock;
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

    public Double getQuantityOnStock() {
        return quantityOnStock;
    }

    public void setQuantityOnStock(Double quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
    }

}