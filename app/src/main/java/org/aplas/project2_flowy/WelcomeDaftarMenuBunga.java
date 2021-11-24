package org.aplas.project2_flowy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class WelcomeDaftarMenuBunga extends AppCompatActivity {
    ImageView mainImageView;
    TextView txtJudul, txtDeskripsi;

    String data1, data2, data3;
    int myImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_daftar_menu_bunga);

        mainImageView = findViewById(R.id.mainImageView);
        txtJudul = findViewById(R.id.txtJudul);
        txtDeskripsi = findViewById(R.id.txtDeskripsi);

        getData();
        setData();

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
//        menulist.setLayoutManager(gridLayoutManager);
//        menulist.setAdapter(adapter);


    }

    private void getData() {
        txtJudul.setText(data1);
        txtDeskripsi.setText(data2);
        mainImageView.setImageResource(myImage);
    }

    private void setData() {
        if (getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2") &&
                getIntent().hasExtra("data3")){

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            data3 = getIntent().getStringExtra("data3");
            myImage = getIntent().getIntExtra("myImage",1);

        }else{
            Toast.makeText(this, "No Data.", Toast.LENGTH_SHORT).show();
        }
    }
}