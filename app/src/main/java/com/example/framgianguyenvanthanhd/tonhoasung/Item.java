package com.example.framgianguyenvanthanhd.tonhoasung;

/**
 * Created by admin on 7/21/2018.
 */

public class Item {
    private int mItemNum;
    private String mDescription;
    private int mQuantityShipper;
    private String mTax;
    private String mUnitPrice;
    private String mExtended;

    public Item(int itemNum, String description, int quantityShipper, String tax, String unitPrice, String extended) {
        mItemNum = itemNum;
        mDescription = description;
        mQuantityShipper = quantityShipper;
        mTax = tax;
        mUnitPrice = unitPrice;
        mExtended = extended;
    }

    public int getItemNum() {
        return mItemNum;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getQuantityShipper() {
        return mQuantityShipper;
    }

    public String getTax() {
        return mTax;
    }

    public String getUnitPrice() {
        return mUnitPrice;
    }

    public String getExtended() {
        return mExtended;
    }
}
