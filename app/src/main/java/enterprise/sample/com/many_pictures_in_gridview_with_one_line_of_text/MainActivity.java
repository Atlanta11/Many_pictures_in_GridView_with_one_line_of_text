package enterprise.sample.com.many_pictures_in_gridview_with_one_line_of_text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


public class MainActivity extends AppCompatActivity {


    private GridviewAdapter mAdapter;
    private ArrayList<String> listCountry;
    private ArrayList<Integer> listFlag;

    private GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prepareList();

        // prepared arraylist and passed it to the Adapter class
        mAdapter = new GridviewAdapter(this,listCountry, listFlag);

        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);

        // Implement On Item click listener
        gridView.setOnItemClickListener(new OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                Toast.makeText(MainActivity.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void prepareList()
    {
        listCountry = new ArrayList<String>();

        listCountry.add("Bruinbrood: 3");
        listCountry.add("Volkorenbrood: 4");
        listCountry.add("Witbrood: 3");
        listCountry.add("Roggebrood: 0");
        listCountry.add("Granenbrood: 3");
        listCountry.add("Aantal: 2");
        listCountry.add("Aantal: 3");
        listCountry.add("Aantal: 6");
        listCountry.add("Aantal: 4");
        listCountry.add("Aantal: 0");

        listFlag = new ArrayList<Integer>();
        listFlag.add(R.drawable.untitled);
        listFlag.add(R.drawable.untitled);
        listFlag.add(R.drawable.untitled);
        listFlag.add(R.drawable.untitled);
        listFlag.add(R.drawable.untitled);
        listFlag.add(R.drawable.untitled);
        listFlag.add(R.drawable.untitled);
        listFlag.add(R.drawable.untitled);
        listFlag.add(R.drawable.untitled);
        listFlag.add(R.drawable.untitled);
    }
}
