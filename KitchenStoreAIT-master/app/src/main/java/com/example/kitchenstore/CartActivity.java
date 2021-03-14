package com.example.kitchenstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidmads.library.qrgenearator.QRGEncoder;

public class CartActivity extends AppCompatActivity {
private RecyclerView cart_rv;
private Button btn_pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        btn_pay=findViewById(R.id.btn_pay);
        cart_rv=findViewById(R.id.cart_rv);
        cart_rv.setNestedScrollingEnabled(false);
        cart_rv.setLayoutManager(new LinearLayoutManager(this));
        cart_rv.setAdapter(new RvAdapter(this,2,null,RvAdapter.cartList.size()));
        btn_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CartActivity.this,QRCodeActivity.class);
                startActivity(intent);


            }
        });
       // QRGEncoder
                //https://www.geeksforgeeks.org/how-to-generate-qr-code-in-android/

    }
}