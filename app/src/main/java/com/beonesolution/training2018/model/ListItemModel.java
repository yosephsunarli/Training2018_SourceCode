package com.beonesolution.training2018.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListItemModel {

    @SerializedName("odata.metadata")
    @Expose
    private String odataMetadata;
    @SerializedName("value")
    @Expose
    private List<ListItemValueModel> value = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public ListItemModel() {
    }

    /**
     *
     * @param value
     * @param odataMetadata
     */
    public ListItemModel(String odataMetadata, List<ListItemValueModel> value) {
        super();
        this.odataMetadata = odataMetadata;
        this.value = value;
    }

    public String getOdataMetadata() {
        return odataMetadata;
    }

    public void setOdataMetadata(String odataMetadata) {
        this.odataMetadata = odataMetadata;
    }

    public List<ListItemValueModel> getValue() {
        return value;
    }

    public void setValue(List<ListItemValueModel> value) {
        this.value = value;
    }
}