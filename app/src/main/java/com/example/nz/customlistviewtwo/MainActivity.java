package com.example.nz.customlistviewtwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String [] countryName;
    int [] flags = {R.drawable.afghanistan, R.drawable.albania, R.drawable.algeria, R.drawable.andorra, R.drawable.angola,
    R.drawable.bahrain, R.drawable.bangladesh, R.drawable.belarus, R.drawable.belgium, R.drawable.cambodia, R.drawable.cameroon, R.drawable.canada};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        countryName = getResources().getStringArray(R.array.countryName);

        CustomAdapter customAdapter = new  CustomAdapter(this, countryName, flags);
        listView.setAdapter(customAdapter);


    }
}
