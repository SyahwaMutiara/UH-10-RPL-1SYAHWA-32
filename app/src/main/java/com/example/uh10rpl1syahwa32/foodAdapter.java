package com.example.uh10rpl1syahwa32;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private ArrayList<food> dataList;

    public FoodAdapter(ArrayList<food> dataList) {
        this.dataList = dataList;
    }

    @Override
    public FoodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_view, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FoodViewHolder holder, int position) {
        holder.txtFood.setText(dataList.get(position).getFood());

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {
        private TextView txtFood;

        public FoodViewHolder(View itemView) {
            super(itemView);
            txtFood = (TextView) itemView.findViewById(R.id.txt_nama_food);


        }
    }
}