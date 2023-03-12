package ma.emsi.moneyconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import ma.emsi.moneyconverter.R;


import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        Spinner sp1,sp2;
        EditText ed1;
        Button b1;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.txtmontant);
        sp1 = findViewById(R.id.spde);
        sp2 = findViewById(R.id.spa);
        b1 = findViewById(R.id.btn1);

        String[] de = {"Dollar","Euro","Dirham"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,de);
        sp1.setAdapter(ad);

        String[] a = {"Dollar","Euro","Dirham"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,a);
        sp2.setAdapter(ad1);
        b1 = findViewById(R.id.btn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tot;

                Double amt = Double.parseDouble(ed1.getText().toString());

                if(sp1.getSelectedItem().toString() == "Dollar" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt * 0.94;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Dollar" && sp2.getSelectedItem().toString() == "Dirham")
                {
                    tot = amt * 10.34;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Dollar")
                {
                    tot = amt * 1.06;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Dirham")
                {
                    tot = amt * 11.01;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Dirham" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt * 0.091;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Dirham" && sp2.getSelectedItem().toString() == "Dollar")
                {
                    tot = amt * 0.097;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Dollar" && sp2.getSelectedItem().toString() == "Dollar")
                {
                    tot = amt * 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Euro")
                {
                    tot = amt * 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Dirham" && sp2.getSelectedItem().toString() == "Dirham")
                {
                    tot = amt * 1;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}