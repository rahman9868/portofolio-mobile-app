package example.com.chairul.projectuaschairulrahmant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class GridCoomingActivity extends Activity {
    GridView fotoGrid;
    int logos[] = {R.drawable.logo1,R.drawable.logo2,R.drawable.logo3,
            R.drawable.logo4,R.drawable.logo5,R.drawable.logo6,R.drawable.logo7,R.drawable.logo8};
    String synop[] = {"\nAvengers: Infinity War"+
            "\nGenre :Action"+"" +
            "\nDuration : 02:18",
            "\nTitle : Black Panther\n" +
                    "Genre :Action\n" +
                    "Duration : 02:05",
            "\nTitle : Deadpool\n" +
                    "Genre :Action\n" +
                    "Duration : 01:50",
            "\nTitle : Thor:Ragnarok\n" +
                    "Genre :Action\n" +
                    "Duration : 02:11",
            "\nTom Raider\n" +
                    "Genre :Action\n" +
                    "Duration : 02:11",
            "\nRampage\n" +
                    "Genre :Action\n" +
                    "Duration : 02:11",
            "\nSpiderman 2\n" +
                    "Genre :Action\n" +
                    "Duration : 02:11",
            "\na Quiet Place\n" +
                    "Genre :Action\n" +
                    "Duration : 02:11"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_cooming);
        fotoGrid = (GridView)findViewById(R.id.gridCooming);
        CustomAdapter customGridAdapter = new CustomAdapter(getApplicationContext(), logos, synop);
        fotoGrid.setAdapter(customGridAdapter);
        fotoGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(GridCoomingActivity.this,Output_GridComing.class);
                intent.putExtra("image", logos[position]);
                intent.putExtra("textsynop", synop[position]);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_grid_cooming, menu);
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
