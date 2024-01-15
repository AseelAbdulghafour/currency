package com.aseel.andriodrecycle.currencyNew;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aseel.andriodrecycle.DataCurrency;
import com.aseel.andriodrecycle.R;

import java.util.ArrayList;

public class addaptCurrency extends RecyclerView.Adapter<addaptCurrency.CurrencyViewHolder> {
    ArrayList<DataCurrency> currencyList;

    public addaptCurrency(ArrayList<DataCurrency> currencyList){

        this.currencyList = currencyList;
    }
    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1, parent,false);
        return new CurrencyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyViewHolder holder, int position) {

        holder.nameTextView.setText(currencyList.get(position).getName());
        holder.codetextView2.setText(currencyList.get(position).getCode());
        holder.exchangeTextView.setText(String.valueOf(currencyList.get(position).getExchange()));
    }

    @Override
    public int getItemCount() {
        return currencyList.size();
    }

    public static class CurrencyViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView codetextView2;
        TextView exchangeTextView;

        public CurrencyViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTextView = itemView.findViewById(R.id.CurrencytextView);
            codetextView2 = itemView.findViewById(R.id.CodetextView2);
            exchangeTextView = itemView.findViewById(R.id.ExchangeTextView);


        }
    }


}