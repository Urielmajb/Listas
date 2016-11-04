package mamg.ejemplo.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView mListView;
    List<String> dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.lista);
        dataSource = getElements();
      //  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, dataSource);
       CustomApdapter adapter = new CustomApdapter(this, dataSource);
        mListView.setAdapter(adapter);
    }

    private List<String> getElements(){
        List<String> list = new ArrayList<>();
        for (int i=0; i<100; i++){
            list.add("Elemento " + (i+1));
        }
        return  list;
    }
}
