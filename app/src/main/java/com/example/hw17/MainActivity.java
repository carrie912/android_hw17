package com.example.hw17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private ListView listView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        textView = (TextView) findViewById(R.id.TextView);

        listView = (ListView) findViewById(R.id.ListView);

        ArrayAdapter<CharSequence> arrAdap

                = ArrayAdapter.createFromResource(MainActivity.this,

                R.array.region_list,

                android.R.layout.simple_list_item_single_choice);


        listView.setAdapter(arrAdap);

        listView.setSelector(R.color.colorLightGreen);

        listView.setSelection(2);


        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        listView.setOnItemClickListener(ListViewOnClickListener);

    }

    private AdapterView.OnItemClickListener ListViewOnClickListener

            = new AdapterView.OnItemClickListener()
    {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id)
        {

            // TODO Auto-generated method stub


            textView.setText("你選擇了: " + ((TextView) view).getText());

        }
    };

}
