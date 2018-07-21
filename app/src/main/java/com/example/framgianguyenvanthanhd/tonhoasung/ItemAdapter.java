package com.example.framgianguyenvanthanhd.tonhoasung;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 7/21/2018.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemHolder> {
    private List<Item> mItems;

    public ItemAdapter(List<Item> items){
        mItems = items;
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
            holder.num.setText(mItems.get(position).getItemNum()+"");
            holder.des.setText(mItems.get(position).getDescription());
            holder.quan.setText(mItems.get(position).getQuantityShipper()+"");
            holder.unit.setText(mItems.get(position).getUnitPrice());
            holder.extended.setText(mItems.get(position).getExtended());
            holder.tax.setText(mItems.get(position).getTax());
    }

    @Override
    public int getItemCount() {
        return mItems != null ? mItems.size() : 0;
    }

    class ItemHolder extends RecyclerView.ViewHolder {
        TextView num;
        TextView des;
        TextView quan;
        TextView tax;
        TextView unit;
        TextView extended;

        public ItemHolder(View itemView) {
            super(itemView);
            num = itemView.findViewById(R.id.tv_item_number_value);
            des = itemView.findViewById(R.id.tv_item_description_value);
            quan = itemView.findViewById(R.id.tv_item_quantity_shipper_value);
            unit = itemView.findViewById(R.id.tv_item_unit_price_value);
            tax = itemView.findViewById(R.id.tv_item_tax_value);
            extended = itemView.findViewById(R.id.tv_item_extended_amount_value);
        }
    }
}
