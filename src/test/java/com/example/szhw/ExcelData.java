package com.example.szhw;

public class ExcelData {
    private String systemName;
    private String listCode;
    private String itemName;
    private String parameter;
    private String unit;
    private double quantity;
    private double unitPrice;
    private String brand;
    private String specification;
    private String modelNumber;
    private String labourOrMaterial;
    private String materialOrLabour;
    private String itemType;
    private String taxType;
    private double taxRate;

    @Override
    public String toString() {
        return "ExcelData{" +
                "systemName='" + systemName + '\'' +
                ", listCode='" + listCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", parameter='" + parameter + '\'' +
                ", unit='" + unit + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", brand='" + brand + '\'' +
                ", specification='" + specification + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", labourOrMaterial='" + labourOrMaterial + '\'' +
                ", materialOrLabour='" + materialOrLabour + '\'' +
                ", itemType='" + itemType + '\'' +
                ", taxType='" + taxType + '\'' +
                ", taxRate=" + taxRate +
                '}';
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getListCode() {
        return listCode;
    }

    public void setListCode(String listCode) {
        this.listCode = listCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getLabourOrMaterial() {
        return labourOrMaterial;
    }

    public void setLabourOrMaterial(String labourOrMaterial) {
        this.labourOrMaterial = labourOrMaterial;
    }

    public String getMaterialOrLabour() {
        return materialOrLabour;
    }

    public void setMaterialOrLabour(String materialOrLabour) {
        this.materialOrLabour = materialOrLabour;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}
