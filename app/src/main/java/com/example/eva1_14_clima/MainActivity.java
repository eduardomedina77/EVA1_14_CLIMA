package com.example.eva1_14_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Weather[] weathers = {
      new Weather("Chihuhua", 20, "LLuvia ligera", R.drawable.light_rain),
            new Weather("Cd. Juaéz", 10, "Nublado", R.drawable.cloudy),
            new Weather("Camargo", 14, "Vientos moderados", R.drawable.atmospher),
            new Weather("Parral", 22.5, "Soleado", R.drawable.sunny),
            new Weather("Jimenez", 34, "Soleado", R.drawable.sunny),
            new Weather("Cuauhtemoc", 22, "LLuvioso", R.drawable.rainy),
            new Weather("Aldama", 10.7, "LLuvias Intensas", R.drawable.thunderstorm),
            new Weather("Casas Grandes", 36, "Vientos Moderados", R.drawable.atmospher),
            new Weather("Ojinaga", 12, "LLuvioso", R.drawable.rainy),
            new Weather("Creel", 29, "Tornados", R.drawable.tornado),
            new Weather("Batopilas", 8, "Nevadas intensas", R.drawable.snow),

    };
    ListView lstVwWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwWeather = findViewById(R.id.lstVwWeather);
        lstVwWeather.setAdapter(new WeatherAdapter(
                this, R.layout.layout_weather,
                weathers
        ));
    }
}