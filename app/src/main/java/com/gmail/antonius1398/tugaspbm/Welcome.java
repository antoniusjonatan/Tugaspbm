package com.gmail.antonius1398.tugaspbm;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {
    ListView list;
    String[] maintitle ={
            "Nurul","Mistahul Ulum",
            "Thomas","Zakie",
            "Leo","Anjas",
            "Intan","Tito",
                   };
    //code di atas iyalah pendeklarasian nama nama pada list
    String[] subtitle ={
            "Nurul13@gmail.com","Tsgaming@gmail.com",
            "Thomscat@gmail.com","Zakieal@gmail.com",
            "Leonardus@yahoo.co.id","AnjasP32@gmail.com",
            "Intancans@gamil.com","Imanueltito@gmail.com",
                   };
    //code di atas iyalah pendeklarasian nama nama email pada list
    Integer[] imgid={
            R.drawable.foto1,
            R.drawable.foto2,
            R.drawable.foto3,
            R.drawable.foto4,
            R.drawable.foto5,
            R.drawable.foto6,
            R.drawable.foto7,
            R.drawable.foto8   ,
    };
    //code di atas iyalah pendeklarasian gambar pada list

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //akan di lempar ke activity_main4 sebagi layoutnya
        setContentView(R.layout.activity_main3);
        //sintak di bawah iyalah memangiil clas adapter untuk memanggil fungsi maintetke,subtitle dan imgid
        Adapter adapter=new Adapter (this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 1) {
                    // code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast. LENGTH_SHORT).show();
                }                      else if(position == 2) {
                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }                   else if(position == 3) {
                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }                   else if(position == 4) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();

                }
            }           });
    }
}