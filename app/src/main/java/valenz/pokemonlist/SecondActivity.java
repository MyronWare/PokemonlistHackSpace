package valenz.pokemonlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private EditText txt11;
    private EditText txt12;
    private EditText txt21;
    private EditText txt22;
    private EditText txt31;
    private EditText txt32;
    private EditText txt41;
    private EditText txt42;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt11 = (EditText)findViewById(R.id.txt11);
        txt12 = (EditText)findViewById(R.id.txt12);

        txt21 = (EditText)findViewById(R.id.txt21);
        txt22 = (EditText)findViewById(R.id.txt22);

        txt31 = (EditText)findViewById(R.id.txt31);
        txt32 = (EditText)findViewById(R.id.txt32);

        txt41 = (EditText)findViewById(R.id.txt41);
        txt42 = (EditText)findViewById(R.id.txt42);


        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt11.getText().toString().equals("bullbasaur")&& (txt12.getText().toString().equals("planta"))){
                    //Ingreso al sistema
                    startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
                }
                else{
                    Toast.makeText(SecondActivity.this, "Ingrese Pokemon o tipo correcto", Toast.LENGTH_SHORT).show();
                }
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt21.getText().toString().equals("charmander")&& (txt22.getText().toString().equals("fuego"))){
                    //Ingreso al sistema
                    startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
                }
                else{
                    Toast.makeText(SecondActivity.this, "Ingrese Pokemon o tipo correcto", Toast.LENGTH_SHORT).show();
                }
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt31.getText().toString().equals("pikachu")&& (txt32.getText().toString().equals("electrico"))){
                    //Ingreso al sistema
                    startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
                }
                else{
                    Toast.makeText(SecondActivity.this, "Ingrese Pokemon o tipo correcto", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt41.getText().toString().equals("squirtle")&& (txt42.getText().toString().equals("agua"))){
                    //Ingreso al sistema
                    startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
                }
                else{
                    Toast.makeText(SecondActivity.this, "Ingrese Pokemon o tipo correcto", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}
