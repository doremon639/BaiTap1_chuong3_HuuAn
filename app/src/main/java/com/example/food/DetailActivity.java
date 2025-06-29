package com.example.food;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView tvName, tvDescription, tvPrice;
    ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvName = findViewById(R.id.tvName);
        tvDescription = findViewById(R.id.tvDescription);
        tvPrice = findViewById(R.id.tvPrice);
        ivImage = findViewById(R.id.ivImage);

        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("description");
        int price = getIntent().getIntExtra("price", 0);
        int image = getIntent().getIntExtra("image", R.drawable.ic_launcher_background);

        tvName.setText(name);
        tvDescription.setText(description);
        tvPrice.setText("Giá: " + price + " VND");
        ivImage.setImageResource(image);
    }
}
