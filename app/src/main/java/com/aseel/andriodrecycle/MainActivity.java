package com.aseel.andriodrecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.aseel.andriodrecycle.currencyNew.addaptCurrency;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView currencyRecycleView;

    ArrayList<DataCurrency> currencyRecycle= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currencyRecycleView = findViewById(R.id.currencyRecycleView);
        currencyRecycleView.setLayoutManager(new LinearLayoutManager(this));
        addaptCurrency adaptCurrency = new  addaptCurrency(currencyRecycle);
        currencyRecycleView.setAdapter(adaptCurrency);
        theCurrencyList();
    }
    private void theCurrencyList() {

        currencyRecycle.add(new DataCurrency("Us Dollar","USD",0.31));
        currencyRecycle.add(new DataCurrency("Chines Yuan","CNY",0.043));
        currencyRecycle.add(new DataCurrency("Russian Rale","RUB",0.0035));

    }
}