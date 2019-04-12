package com.gmail.antonius1398.tugaspbm;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   //pendeklarasian edittext dan button
    EditText username, password;
    Button btnLogin,btnreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //akan di lempar ke activity_main sebagi layoutnya
        setContentView(R.layout.activity_main);
        //sintak dibawah adalah id dari masing masing layout pada activity_main
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnreg = (Button)findViewById(R.id.btnreg);
        //sintak di bawah adalah membuat fungsi btn login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();
                //sintak di bawah adalah pengisian untuk id adan password pada halaman login
                if (usernameKey.equals("Antonius") && passwordKey.equals("165410095")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();
                    //inten dibawah adalah funsi perpindahan dari Main_activiti menuju clas Welcome
                    Intent intent = new Intent(MainActivity.this, Welcome.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau Password Anda salah!")
                            .setNegativeButton("Retry", null).create().show();
                }
            }

        });
       // sintak di bawah adalah membuat fungsi btnreg
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inten dibawah adalah funsi perpindahan dari Main_activiti menuju clas regis
               Intent intent2 = new Intent(MainActivity.this, Regis.class);
               MainActivity.this.startActivity(intent2);
               finish();
            }
        });

    }
}
