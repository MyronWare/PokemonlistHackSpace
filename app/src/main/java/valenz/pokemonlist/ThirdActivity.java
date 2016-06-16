package valenz.pokemonlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

public class ThirdActivity extends AppCompatActivity {

    Spinner Fuego;
    Spinner Agua;
    Spinner Planta;
    Spinner Electrico;
    Spinner Tierra;

    String [] pokeFuego = {"Seleccionar Pokemon Fuego","Magmar","Charizard","Chimchar"};
    String [] pokeAgua = {"Seleccionar Pokemon Agua","Buyzel","Gyarados","Lapras"};
    String [] pokePlanta = {"Seleccionar Pokemon Planta","Chikorita","grovyle","celebi"};
    String [] pokeElectrico = {"Seleccionar Pokemon Electrico","Raychu", "Electabuzz","Jolteon"};
    String [] pokeTierra = {"Seleccionar Pokemon Tierra","Dugtrio","Marowak","Rhydon"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Fuego = (Spinner)findViewById(R.id.fuegospin);
        Agua  = (Spinner)findViewById(R.id.aguaspin);
        Planta = (Spinner)findViewById(R.id.plantaspin);
        Electrico = (Spinner)findViewById(R.id.electricospin);
        Tierra = (Spinner)findViewById(R.id.tierraspin);

        ArrayAdapter<String> fuegoadapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,pokeFuego);
        Fuego.setAdapter(fuegoadapter);

        ArrayAdapter<String> aguaadapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,pokeAgua);
        Agua.setAdapter(aguaadapter);

        ArrayAdapter<String> plantaadapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,pokePlanta);
        Planta.setAdapter(plantaadapter);

        ArrayAdapter<String> electricoadapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,pokeElectrico);
        Electrico.setAdapter(electricoadapter);

        ArrayAdapter<String> tierraadapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,pokeTierra);
        Tierra.setAdapter(tierraadapter);

        /****************************************************/

        Fuego.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        break;
                    case 1:
                        Intent magmar =new Intent(ThirdActivity.this,Magmar.class);
                        startActivity(magmar);
                        break;
                    case 2:
                        Intent charizard = new Intent(ThirdActivity.this, Charizard.class);
                        startActivity(charizard);
                        break;
                    case 3:
                        Intent chimchar = new Intent(ThirdActivity.this, Chimchar.class);
                        startActivity(chimchar);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Agua.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        break;
                    case 1:
                        Intent buyzel = new Intent(ThirdActivity.this,Buyzel.class);
                        startActivity(buyzel);
                        break;
                    case 2:
                        Intent gyarados = new Intent(ThirdActivity.this,Gyarados.class);
                        startActivity(gyarados);
                        break;
                    case 3:
                        Intent lapras = new Intent(ThirdActivity.this, Lapras.class);
                        startActivity(lapras);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Planta.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        break;
                    case 1:
                        Intent chikorita = new Intent(ThirdActivity.this,Chikorita.class);
                        startActivity(chikorita);
                        break;
                    case 2:
                        Intent grovyle = new Intent(ThirdActivity.this,Grovyle.class);
                        startActivity(grovyle);
                        break;
                    case 3:
                        Intent celebi = new Intent(ThirdActivity.this, Celebi.class);
                        startActivity(celebi);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Electrico.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        Intent raychu = new Intent(ThirdActivity.this, Raychu.class);
                        startActivity(raychu);
                        break;
                    case 2:
                        Intent electabuzz = new Intent(ThirdActivity.this, Electabuzz.class);
                        startActivity(electabuzz);
                        break;
                    case 3:
                        Intent jolteon = new Intent(ThirdActivity.this, Jolteon.class);
                        startActivity(jolteon);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Tierra.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        break;
                    case 1:
                        Intent dugtrio = new Intent(ThirdActivity.this, Dugtrio.class);
                        startActivity(dugtrio);
                        break;
                    case 2:
                        Intent marowak = new Intent(ThirdActivity.this, Marowak.class);
                        startActivity(marowak);
                        break;
                    case 3:
                        Intent rhydon = new Intent(ThirdActivity.this, Rhydon.class);
                        startActivity(rhydon);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
