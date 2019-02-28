package com.wisermark.userinterface;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;


import static android.content.Intent.*;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    TextView quantityTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quantityTV = findViewById(R.id.quantity_text_view);
    }
    public void increase(View view){
        quantity++;
        quantityTV.setText("" + quantity);
    }
    public void decrease (View view){
        quantity--;
        quantityTV.setText("" + quantity);
    }

    public void submitOrder(View view){

            Intent i =new Intent( this, Coffee2.class);
            startActivity(i);
        /*
        Intent emailIntent = new Intent(ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for Coffee");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Number of coffee:" + quantity);
        startActivity(emailIntent.createChooser(emailIntent, "Send Email"));
        */
    }
}
