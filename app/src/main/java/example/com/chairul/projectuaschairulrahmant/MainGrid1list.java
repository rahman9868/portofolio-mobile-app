package example.com.chairul.projectuaschairulrahmant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class MainGrid1list extends Activity {
    GridView filmGridlist;
    String[] judul ={ "Death Race", "Pacific Rim Uprising",
            "Jumanji", "Mazerunner", "I Kill Giants","Insidious Last Key ","Ready Player One","Deadpool","Samson","Fifty Dhades Darker"   };
    int logo[] = {R.drawable.pilem1,R.drawable.pilem2,R.drawable.pilem3,
            R.drawable.pilem4,R.drawable.pilem5,R.drawable.pilem6,R.drawable.pilem7,R.drawable.pilem8,R.drawable.pilem9,
            R.drawable.pilem10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid1list);
        filmGridlist= (GridView)findViewById(R.id.filmGridlist);
        CustomGrid1List customGrid1List = new CustomGrid1List(getApplicationContext(),logo, judul);
        filmGridlist.setAdapter(customGrid1List);
        filmGridlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainGrid1list.this,Grid1listOutput.class);
                intent.putExtra("image", logo[position]);
                intent.putExtra("textjudul", judul[position]);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_grid1list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
