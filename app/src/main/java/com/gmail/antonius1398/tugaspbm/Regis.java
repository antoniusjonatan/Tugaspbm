package com.gmail.antonius1398.tugaspbm;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Regis extends AppCompatActivity {
    //pendeklarasian button
    Button btnsbm;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //akan di lempar ke activity_main4 sebagi layoutnya
        setContentView(R.layout.activity_main4);
       // sintak dibawah adalah id dari layout pada activity_main
        btnsbm = (Button) findViewById(R.id.btnsbm);
        //sintak di bawah adalah membuat fungsi btnsbm
        btnsbm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               // inten dibawah adalah funsi perpindahan dari Regis menuju clas Welcome
                Intent intent3 = new Intent(Regis.this, Welcome.class);
                Regis.this.startActivity(intent3);
                finish();
            }
        });
    }
}