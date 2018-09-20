package com.beonesolution.training2018.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemWarehouseInfoCollection {

    @SerializedName("MinimalStock")
    @Expose
    private Double minimalStock;
    @SerializedName("MaximalStock")
    @Expose
    private Double maximalStock;
    @SerializedName("MinimalOrder")
    @Expose
    private Double minimalOrder;
    @SerializedName("StandardAveragePrice")
    @Expose
    private Double standardAveragePrice;
    @SerializedName("Locked")
    @Expose
    private String locked;
    @SerializedName("InventoryAccount")
    @Expose
    private Object inventoryAccount;
    @SerializedName("CostAccount")
    @Expose
    private Object costAccount;
    @SerializedName("TransferAccount")
    @Expose
    private Object transferAccount;
    @SerializedName("RevenuesAccount")
    @Expose
    private Object revenuesAccount;
    @SerializedName("VarienceAccount")
    @Expose
    private Object varienceAccount;
    @SerializedName("DecreasingAccount")
    @Expose
    private Object decreasingAccount;
    @SerializedName("IncreasingAccount")
    @Expose
    private Object increasingAccount;
    @SerializedName("ReturningAccount")
    @Expose
    private Object returningAccount;
    @SerializedName("ExpensesAccount")
    @Expose
    private Object expensesAccount;
    @SerializedName("EURevenuesAccount")
    @Expose
    private Object eURevenuesAccount;
    @SerializedName("EUExpensesAccount")
    @Expose
    private Object eUExpensesAccount;
    @SerializedName("ForeignRevenueAcc")
    @Expose
    private Object foreignRevenueAcc;
    @SerializedName("ForeignExpensAcc")
    @Expose
    private Object foreignExpensAcc;
    @SerializedName("ExemptIncomeAcc")
    @Expose
    private Object exemptIncomeAcc;
    @SerializedName("PriceDifferenceAcc")
    @Expose
    private Object priceDifferenceAcc;
    @SerializedName("WarehouseCode")
    @Expose
    private String warehouseCode;
    @SerializedName("InStock")
    @Expose
    private Double inStock;
    @SerializedName("Committed")
    @Expose
    private Double committed;
    @SerializedName("Ordered")
    @Expose
    private Double ordered;
    @SerializedName("CountedQuantity")
    @Expose
    private Double countedQuantity;
    @SerializedName("WasCounted")
    @Expose
    private String wasCounted;
    @SerializedName("UserSignature")
    @Expose
    private Double userSignature;
    @SerializedName("Counted")
    @Expose
    private Double counted;
    @SerializedName("ExpenseClearingAct")
    @Expose
    private Object expenseClearingAct;
    @SerializedName("PurchaseCreditAcc")
    @Expose
    private Object purchaseCreditAcc;
    @SerializedName("EUPurchaseCreditAcc")
    @Expose
    private Object eUPurchaseCreditAcc;
    @SerializedName("ForeignPurchaseCreditAcc")
    @Expose
    private Object foreignPurchaseCreditAcc;
    @SerializedName("SalesCreditAcc")
    @Expose
    private Object salesCreditAcc;
    @SerializedName("SalesCreditEUAcc")
    @Expose
    private Object salesCreditEUAcc;
    @SerializedName("ExemptedCredits")
    @Expose
    private Object exemptedCredits;
    @SerializedName("SalesCreditForeignAcc")
    @Expose
    private Object salesCreditForeignAcc;
    @SerializedName("ExpenseOffsettingAccount")
    @Expose
    private Object expenseOffsettingAccount;
    @SerializedName("WipAccount")
    @Expose
    private Object wipAccount;
    @SerializedName("ExchangeRateDifferencesAcct")
    @Expose
    private Object exchangeRateDifferencesAcct;
    @SerializedName("GoodsClearingAcct")
    @Expose
    private Object goodsClearingAcct;
    @SerializedName("NegativeInventoryAdjustmentAccount")
    @Expose
    private Object negativeInventoryAdjustmentAccount;
    @SerializedName("CostInflationOffsetAccount")
    @Expose
    private Object costInflationOffsetAccount;
    @SerializedName("GLDecreaseAcct")
    @Expose
    private Object gLDecreaseAcct;
    @SerializedName("GLIncreaseAcct")
    @Expose
    private Object gLIncreaseAcct;
    @SerializedName("PAReturnAcct")
    @Expose
    private Object pAReturnAcct;
    @SerializedName("PurchaseAcct")
    @Expose
    private Object purchaseAcct;
    @SerializedName("PurchaseOffsetAcct")
    @Expose
    private Object purchaseOffsetAcct;
    @SerializedName("ShippedGoodsAccount")
    @Expose
    private Object shippedGoodsAccount;
    @SerializedName("StockInflationOffsetAccount")
    @Expose
    private Object stockInflationOffsetAccount;
    @SerializedName("StockInflationAdjustAccount")
    @Expose
    private Object stockInflationAdjustAccount;
    @SerializedName("VATInRevenueAccount")
    @Expose
    private Object vATInRevenueAccount;
    @SerializedName("WipVarianceAccount")
    @Expose
    private Object wipVarianceAccount;
    @SerializedName("CostInflationAccount")
    @Expose
    private Object costInflationAccount;
    @SerializedName("WHIncomingCenvatAccount")
    @Expose
    private Object wHIncomingCenvatAccount;
    @SerializedName("WHOutgoingCenvatAccount")
    @Expose
    private Object wHOutgoingCenvatAccount;
    @SerializedName("StockInTransitAccount")
    @Expose
    private Object stockInTransitAccount;
    @SerializedName("WipOffsetProfitAndLossAccount")
    @Expose
    private Object wipOffsetProfitAndLossAccount;
    @SerializedName("InventoryOffsetProfitAndLossAccount")
    @Expose
    private Object inventoryOffsetProfitAndLossAccount;
    @SerializedName("DefaultBin")
    @Expose
    private Object defaultBin;
    @SerializedName("DefaultBinEnforced")
    @Expose
    private String defaultBinEnforced;
    @SerializedName("PurchaseBalanceAccount")
    @Expose
    private Object purchaseBalanceAccount;
    @SerializedName("U_RecAdjSuppAcct")
    @Expose
    private Object uRecAdjSuppAcct;
    @SerializedName("U_TechAcctMC")
    @Expose
    private Object uTechAcctMC;
    @SerializedName("U_SettCstsBT")
    @Expose
    private String uSettCstsBT;
    @SerializedName("U_AcctCstsBT")
    @Expose
    private Object uAcctCstsBT;
    @SerializedName("U_CostsAcct")
    @Expose
    private Object uCostsAcct;
    @SerializedName("ItemCycleCounts")
    @Expose
    private List<Object> itemCycleCounts = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public ItemWarehouseInfoCollection() {
    }

    /**
     *
     * @param uAcctCstsBT
     * @param minimalOrder
     * @param shippedGoodsAccount
     * @param wHIncomingCenvatAccount
     * @param priceDifferenceAcc
     * @param salesCreditEUAcc
     * @param pAReturnAcct
     * @param purchaseOffsetAcct
     * @param uRecAdjSuppAcct
     * @param maximalStock
     * @param inventoryOffsetProfitAndLossAccount
     * @param eURevenuesAccount
     * @param vATInRevenueAccount
     * @param decreasingAccount
     * @param uCostsAcct
     * @param eUExpensesAccount
     * @param returningAccount
     * @param wHOutgoingCenvatAccount
     * @param gLDecreaseAcct
     * @param foreignExpensAcc
     * @param stockInflationAdjustAccount
     * @param varienceAccount
     * @param expensesAccount
     * @param defaultBinEnforced
     * @param committed
     * @param exchangeRateDifferencesAcct
     * @param minimalStock
     * @param wipAccount
     * @param negativeInventoryAdjustmentAccount
     * @param defaultBin
     * @param locked
     * @param costAccount
     * @param uSettCstsBT
     * @param costInflationAccount
     * @param exemptIncomeAcc
     * @param purchaseAcct
     * @param increasingAccount
     * @param goodsClearingAcct
     * @param foreignRevenueAcc
     * @param expenseOffsettingAccount
     * @param stockInTransitAccount
     * @param costInflationOffsetAccount
     * @param uTechAcctMC
     * @param warehouseCode
     * @param transferAccount
     * @param purchaseCreditAcc
     * @param wipVarianceAccount
     * @param revenuesAccount
     * @param itemCycleCounts
     * @param wipOffsetProfitAndLossAccount
     * @param stockInflationOffsetAccount
     * @param salesCreditAcc
     * @param wasCounted
     * @param exemptedCredits
     * @param gLIncreaseAcct
     * @param countedQuantity
     * @param inventoryAccount
     * @param eUPurchaseCreditAcc
     * @param counted
     * @param expenseClearingAct
     * @param ordered
     * @param purchaseBalanceAccount
     * @param userSignature
     * @param salesCreditForeignAcc
     * @param inStock
     * @param standardAveragePrice
     * @param foreignPurchaseCreditAcc
     */
    public ItemWarehouseInfoCollection(Double minimalStock, Double maximalStock, Double minimalOrder, Double standardAveragePrice, String locked, Object inventoryAccount, Object costAccount, Object transferAccount, Object revenuesAccount, Object varienceAccount, Object decreasingAccount, Object increasingAccount, Object returningAccount, Object expensesAccount, Object eURevenuesAccount, Object eUExpensesAccount, Object foreignRevenueAcc, Object foreignExpensAcc, Object exemptIncomeAcc, Object priceDifferenceAcc, String warehouseCode, Double inStock, Double committed, Double ordered, Double countedQuantity, String wasCounted, Double userSignature, Double counted, Object expenseClearingAct, Object purchaseCreditAcc, Object eUPurchaseCreditAcc, Object foreignPurchaseCreditAcc, Object salesCreditAcc, Object salesCreditEUAcc, Object exemptedCredits, Object salesCreditForeignAcc, Object expenseOffsettingAccount, Object wipAccount, Object exchangeRateDifferencesAcct, Object goodsClearingAcct, Object negativeInventoryAdjustmentAccount, Object costInflationOffsetAccount, Object gLDecreaseAcct, Object gLIncreaseAcct, Object pAReturnAcct, Object purchaseAcct, Object purchaseOffsetAcct, Object shippedGoodsAccount, Object stockInflationOffsetAccount, Object stockInflationAdjustAccount, Object vATInRevenueAccount, Object wipVarianceAccount, Object costInflationAccount, Object wHIncomingCenvatAccount, Object wHOutgoingCenvatAccount, Object stockInTransitAccount, Object wipOffsetProfitAndLossAccount, Object inventoryOffsetProfitAndLossAccount, Object defaultBin, String defaultBinEnforced, Object purchaseBalanceAccount, Object uRecAdjSuppAcct, Object uTechAcctMC, String uSettCstsBT, Object uAcctCstsBT, Object uCostsAcct, List<Object> itemCycleCounts) {
        super();
        this.minimalStock = minimalStock;
        this.maximalStock = maximalStock;
        this.minimalOrder = minimalOrder;
        this.standardAveragePrice = standardAveragePrice;
        this.locked = locked;
        this.inventoryAccount = inventoryAccount;
        this.costAccount = costAccount;
        this.transferAccount = transferAccount;
        this.revenuesAccount = revenuesAccount;
        this.varienceAccount = varienceAccount;
        this.decreasingAccount = decreasingAccount;
        this.increasingAccount = increasingAccount;
        this.returningAccount = returningAccount;
        this.expensesAccount = expensesAccount;
        this.eURevenuesAccount = eURevenuesAccount;
        this.eUExpensesAccount = eUExpensesAccount;
        this.foreignRevenueAcc = foreignRevenueAcc;
        this.foreignExpensAcc = foreignExpensAcc;
        this.exemptIncomeAcc = exemptIncomeAcc;
        this.priceDifferenceAcc = priceDifferenceAcc;
        this.warehouseCode = warehouseCode;
        this.inStock = inStock;
        this.committed = committed;
        this.ordered = ordered;
        this.countedQuantity = countedQuantity;
        this.wasCounted = wasCounted;
        this.userSignature = userSignature;
        this.counted = counted;
        this.expenseClearingAct = expenseClearingAct;
        this.purchaseCreditAcc = purchaseCreditAcc;
        this.eUPurchaseCreditAcc = eUPurchaseCreditAcc;
        this.foreignPurchaseCreditAcc = foreignPurchaseCreditAcc;
        this.salesCreditAcc = salesCreditAcc;
        this.salesCreditEUAcc = salesCreditEUAcc;
        this.exemptedCredits = exemptedCredits;
        this.salesCreditForeignAcc = salesCreditForeignAcc;
        this.expenseOffsettingAccount = expenseOffsettingAccount;
        this.wipAccount = wipAccount;
        this.exchangeRateDifferencesAcct = exchangeRateDifferencesAcct;
        this.goodsClearingAcct = goodsClearingAcct;
        this.negativeInventoryAdjustmentAccount = negativeInventoryAdjustmentAccount;
        this.costInflationOffsetAccount = costInflationOffsetAccount;
        this.gLDecreaseAcct = gLDecreaseAcct;
        this.gLIncreaseAcct = gLIncreaseAcct;
        this.pAReturnAcct = pAReturnAcct;
        this.purchaseAcct = purchaseAcct;
        this.purchaseOffsetAcct = purchaseOffsetAcct;
        this.shippedGoodsAccount = shippedGoodsAccount;
        this.stockInflationOffsetAccount = stockInflationOffsetAccount;
        this.stockInflationAdjustAccount = stockInflationAdjustAccount;
        this.vATInRevenueAccount = vATInRevenueAccount;
        this.wipVarianceAccount = wipVarianceAccount;
        this.costInflationAccount = costInflationAccount;
        this.wHIncomingCenvatAccount = wHIncomingCenvatAccount;
        this.wHOutgoingCenvatAccount = wHOutgoingCenvatAccount;
        this.stockInTransitAccount = stockInTransitAccount;
        this.wipOffsetProfitAndLossAccount = wipOffsetProfitAndLossAccount;
        this.inventoryOffsetProfitAndLossAccount = inventoryOffsetProfitAndLossAccount;
        this.defaultBin = defaultBin;
        this.defaultBinEnforced = defaultBinEnforced;
        this.purchaseBalanceAccount = purchaseBalanceAccount;
        this.uRecAdjSuppAcct = uRecAdjSuppAcct;
        this.uTechAcctMC = uTechAcctMC;
        this.uSettCstsBT = uSettCstsBT;
        this.uAcctCstsBT = uAcctCstsBT;
        this.uCostsAcct = uCostsAcct;
        this.itemCycleCounts = itemCycleCounts;
    }

    public Double getMinimalStock() {
        return minimalStock;
    }

    public void setMinimalStock(Double minimalStock) {
        this.minimalStock = minimalStock;
    }

    public Double getMaximalStock() {
        return maximalStock;
    }

    public void setMaximalStock(Double maximalStock) {
        this.maximalStock = maximalStock;
    }

    public Double getMinimalOrder() {
        return minimalOrder;
    }

    public void setMinimalOrder(Double minimalOrder) {
        this.minimalOrder = minimalOrder;
    }

    public Double getStandardAveragePrice() {
        return standardAveragePrice;
    }

    public void setStandardAveragePrice(Double standardAveragePrice) {
        this.standardAveragePrice = standardAveragePrice;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public Object getInventoryAccount() {
        return inventoryAccount;
    }

    public void setInventoryAccount(Object inventoryAccount) {
        this.inventoryAccount = inventoryAccount;
    }

    public Object getCostAccount() {
        return costAccount;
    }

    public void setCostAccount(Object costAccount) {
        this.costAccount = costAccount;
    }

    public Object getTransferAccount() {
        return transferAccount;
    }

    public void setTransferAccount(Object transferAccount) {
        this.transferAccount = transferAccount;
    }

    public Object getRevenuesAccount() {
        return revenuesAccount;
    }

    public void setRevenuesAccount(Object revenuesAccount) {
        this.revenuesAccount = revenuesAccount;
    }

    public Object getVarienceAccount() {
        return varienceAccount;
    }

    public void setVarienceAccount(Object varienceAccount) {
        this.varienceAccount = varienceAccount;
    }

    public Object getDecreasingAccount() {
        return decreasingAccount;
    }

    public void setDecreasingAccount(Object decreasingAccount) {
        this.decreasingAccount = decreasingAccount;
    }

    public Object getIncreasingAccount() {
        return increasingAccount;
    }

    public void setIncreasingAccount(Object increasingAccount) {
        this.increasingAccount = increasingAccount;
    }

    public Object getReturningAccount() {
        return returningAccount;
    }

    public void setReturningAccount(Object returningAccount) {
        this.returningAccount = returningAccount;
    }

    public Object getExpensesAccount() {
        return expensesAccount;
    }

    public void setExpensesAccount(Object expensesAccount) {
        this.expensesAccount = expensesAccount;
    }

    public Object getEURevenuesAccount() {
        return eURevenuesAccount;
    }

    public void setEURevenuesAccount(Object eURevenuesAccount) {
        this.eURevenuesAccount = eURevenuesAccount;
    }

    public Object getEUExpensesAccount() {
        return eUExpensesAccount;
    }

    public void setEUExpensesAccount(Object eUExpensesAccount) {
        this.eUExpensesAccount = eUExpensesAccount;
    }

    public Object getForeignRevenueAcc() {
        return foreignRevenueAcc;
    }

    public void setForeignRevenueAcc(Object foreignRevenueAcc) {
        this.foreignRevenueAcc = foreignRevenueAcc;
    }

    public Object getForeignExpensAcc() {
        return foreignExpensAcc;
    }

    public void setForeignExpensAcc(Object foreignExpensAcc) {
        this.foreignExpensAcc = foreignExpensAcc;
    }

    public Object getExemptIncomeAcc() {
        return exemptIncomeAcc;
    }

    public void setExemptIncomeAcc(Object exemptIncomeAcc) {
        this.exemptIncomeAcc = exemptIncomeAcc;
    }

    public Object getPriceDifferenceAcc() {
        return priceDifferenceAcc;
    }

    public void setPriceDifferenceAcc(Object priceDifferenceAcc) {
        this.priceDifferenceAcc = priceDifferenceAcc;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public Double getInStock() {
        return inStock;
    }

    public void setInStock(Double inStock) {
        this.inStock = inStock;
    }

    public Double getCommitted() {
        return committed;
    }

    public void setCommitted(Double committed) {
        this.committed = committed;
    }

    public Double getOrdered() {
        return ordered;
    }

    public void setOrdered(Double ordered) {
        this.ordered = ordered;
    }

    public Double getCountedQuantity() {
        return countedQuantity;
    }

    public void setCountedQuantity(Double countedQuantity) {
        this.countedQuantity = countedQuantity;
    }

    public String getWasCounted() {
        return wasCounted;
    }

    public void setWasCounted(String wasCounted) {
        this.wasCounted = wasCounted;
    }

    public Double getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(Double userSignature) {
        this.userSignature = userSignature;
    }

    public Double getCounted() {
        return counted;
    }

    public void setCounted(Double counted) {
        this.counted = counted;
    }

    public Object getExpenseClearingAct() {
        return expenseClearingAct;
    }

    public void setExpenseClearingAct(Object expenseClearingAct) {
        this.expenseClearingAct = expenseClearingAct;
    }

    public Object getPurchaseCreditAcc() {
        return purchaseCreditAcc;
    }

    public void setPurchaseCreditAcc(Object purchaseCreditAcc) {
        this.purchaseCreditAcc = purchaseCreditAcc;
    }

    public Object getEUPurchaseCreditAcc() {
        return eUPurchaseCreditAcc;
    }

    public void setEUPurchaseCreditAcc(Object eUPurchaseCreditAcc) {
        this.eUPurchaseCreditAcc = eUPurchaseCreditAcc;
    }

    public Object getForeignPurchaseCreditAcc() {
        return foreignPurchaseCreditAcc;
    }

    public void setForeignPurchaseCreditAcc(Object foreignPurchaseCreditAcc) {
        this.foreignPurchaseCreditAcc = foreignPurchaseCreditAcc;
    }

    public Object getSalesCreditAcc() {
        return salesCreditAcc;
    }

    public void setSalesCreditAcc(Object salesCreditAcc) {
        this.salesCreditAcc = salesCreditAcc;
    }

    public Object getSalesCreditEUAcc() {
        return salesCreditEUAcc;
    }

    public void setSalesCreditEUAcc(Object salesCreditEUAcc) {
        this.salesCreditEUAcc = salesCreditEUAcc;
    }

    public Object getExemptedCredits() {
        return exemptedCredits;
    }

    public void setExemptedCredits(Object exemptedCredits) {
        this.exemptedCredits = exemptedCredits;
    }

    public Object getSalesCreditForeignAcc() {
        return salesCreditForeignAcc;
    }

    public void setSalesCreditForeignAcc(Object salesCreditForeignAcc) {
        this.salesCreditForeignAcc = salesCreditForeignAcc;
    }

    public Object getExpenseOffsettingAccount() {
        return expenseOffsettingAccount;
    }

    public void setExpenseOffsettingAccount(Object expenseOffsettingAccount) {
        this.expenseOffsettingAccount = expenseOffsettingAccount;
    }

    public Object getWipAccount() {
        return wipAccount;
    }

    public void setWipAccount(Object wipAccount) {
        this.wipAccount = wipAccount;
    }

    public Object getExchangeRateDifferencesAcct() {
        return exchangeRateDifferencesAcct;
    }

    public void setExchangeRateDifferencesAcct(Object exchangeRateDifferencesAcct) {
        this.exchangeRateDifferencesAcct = exchangeRateDifferencesAcct;
    }

    public Object getGoodsClearingAcct() {
        return goodsClearingAcct;
    }

    public void setGoodsClearingAcct(Object goodsClearingAcct) {
        this.goodsClearingAcct = goodsClearingAcct;
    }

    public Object getNegativeInventoryAdjustmentAccount() {
        return negativeInventoryAdjustmentAccount;
    }

    public void setNegativeInventoryAdjustmentAccount(Object negativeInventoryAdjustmentAccount) {
        this.negativeInventoryAdjustmentAccount = negativeInventoryAdjustmentAccount;
    }

    public Object getCostInflationOffsetAccount() {
        return costInflationOffsetAccount;
    }

    public void setCostInflationOffsetAccount(Object costInflationOffsetAccount) {
        this.costInflationOffsetAccount = costInflationOffsetAccount;
    }

    public Object getGLDecreaseAcct() {
        return gLDecreaseAcct;
    }

    public void setGLDecreaseAcct(Object gLDecreaseAcct) {
        this.gLDecreaseAcct = gLDecreaseAcct;
    }

    public Object getGLIncreaseAcct() {
        return gLIncreaseAcct;
    }

    public void setGLIncreaseAcct(Object gLIncreaseAcct) {
        this.gLIncreaseAcct = gLIncreaseAcct;
    }

    public Object getPAReturnAcct() {
        return pAReturnAcct;
    }

    public void setPAReturnAcct(Object pAReturnAcct) {
        this.pAReturnAcct = pAReturnAcct;
    }

    public Object getPurchaseAcct() {
        return purchaseAcct;
    }

    public void setPurchaseAcct(Object purchaseAcct) {
        this.purchaseAcct = purchaseAcct;
    }

    public Object getPurchaseOffsetAcct() {
        return purchaseOffsetAcct;
    }

    public void setPurchaseOffsetAcct(Object purchaseOffsetAcct) {
        this.purchaseOffsetAcct = purchaseOffsetAcct;
    }

    public Object getShippedGoodsAccount() {
        return shippedGoodsAccount;
    }

    public void setShippedGoodsAccount(Object shippedGoodsAccount) {
        this.shippedGoodsAccount = shippedGoodsAccount;
    }

    public Object getStockInflationOffsetAccount() {
        return stockInflationOffsetAccount;
    }

    public void setStockInflationOffsetAccount(Object stockInflationOffsetAccount) {
        this.stockInflationOffsetAccount = stockInflationOffsetAccount;
    }

    public Object getStockInflationAdjustAccount() {
        return stockInflationAdjustAccount;
    }

    public void setStockInflationAdjustAccount(Object stockInflationAdjustAccount) {
        this.stockInflationAdjustAccount = stockInflationAdjustAccount;
    }

    public Object getVATInRevenueAccount() {
        return vATInRevenueAccount;
    }

    public void setVATInRevenueAccount(Object vATInRevenueAccount) {
        this.vATInRevenueAccount = vATInRevenueAccount;
    }

    public Object getWipVarianceAccount() {
        return wipVarianceAccount;
    }

    public void setWipVarianceAccount(Object wipVarianceAccount) {
        this.wipVarianceAccount = wipVarianceAccount;
    }

    public Object getCostInflationAccount() {
        return costInflationAccount;
    }

    public void setCostInflationAccount(Object costInflationAccount) {
        this.costInflationAccount = costInflationAccount;
    }

    public Object getWHIncomingCenvatAccount() {
        return wHIncomingCenvatAccount;
    }

    public void setWHIncomingCenvatAccount(Object wHIncomingCenvatAccount) {
        this.wHIncomingCenvatAccount = wHIncomingCenvatAccount;
    }

    public Object getWHOutgoingCenvatAccount() {
        return wHOutgoingCenvatAccount;
    }

    public void setWHOutgoingCenvatAccount(Object wHOutgoingCenvatAccount) {
        this.wHOutgoingCenvatAccount = wHOutgoingCenvatAccount;
    }

    public Object getStockInTransitAccount() {
        return stockInTransitAccount;
    }

    public void setStockInTransitAccount(Object stockInTransitAccount) {
        this.stockInTransitAccount = stockInTransitAccount;
    }

    public Object getWipOffsetProfitAndLossAccount() {
        return wipOffsetProfitAndLossAccount;
    }

    public void setWipOffsetProfitAndLossAccount(Object wipOffsetProfitAndLossAccount) {
        this.wipOffsetProfitAndLossAccount = wipOffsetProfitAndLossAccount;
    }

    public Object getInventoryOffsetProfitAndLossAccount() {
        return inventoryOffsetProfitAndLossAccount;
    }

    public void setInventoryOffsetProfitAndLossAccount(Object inventoryOffsetProfitAndLossAccount) {
        this.inventoryOffsetProfitAndLossAccount = inventoryOffsetProfitAndLossAccount;
    }

    public Object getDefaultBin() {
        return defaultBin;
    }

    public void setDefaultBin(Object defaultBin) {
        this.defaultBin = defaultBin;
    }

    public String getDefaultBinEnforced() {
        return defaultBinEnforced;
    }

    public void setDefaultBinEnforced(String defaultBinEnforced) {
        this.defaultBinEnforced = defaultBinEnforced;
    }

    public Object getPurchaseBalanceAccount() {
        return purchaseBalanceAccount;
    }

    public void setPurchaseBalanceAccount(Object purchaseBalanceAccount) {
        this.purchaseBalanceAccount = purchaseBalanceAccount;
    }

    public Object getURecAdjSuppAcct() {
        return uRecAdjSuppAcct;
    }

    public void setURecAdjSuppAcct(Object uRecAdjSuppAcct) {
        this.uRecAdjSuppAcct = uRecAdjSuppAcct;
    }

    public Object getUTechAcctMC() {
        return uTechAcctMC;
    }

    public void setUTechAcctMC(Object uTechAcctMC) {
        this.uTechAcctMC = uTechAcctMC;
    }

    public String getUSettCstsBT() {
        return uSettCstsBT;
    }

    public void setUSettCstsBT(String uSettCstsBT) {
        this.uSettCstsBT = uSettCstsBT;
    }

    public Object getUAcctCstsBT() {
        return uAcctCstsBT;
    }

    public void setUAcctCstsBT(Object uAcctCstsBT) {
        this.uAcctCstsBT = uAcctCstsBT;
    }

    public Object getUCostsAcct() {
        return uCostsAcct;
    }

    public void setUCostsAcct(Object uCostsAcct) {
        this.uCostsAcct = uCostsAcct;
    }

    public List<Object> getItemCycleCounts() {
        return itemCycleCounts;
    }

    public void setItemCycleCounts(List<Object> itemCycleCounts) {
        this.itemCycleCounts = itemCycleCounts;
    }

}