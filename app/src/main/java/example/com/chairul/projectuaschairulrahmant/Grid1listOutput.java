package example.com.chairul.projectuaschairulrahmant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Grid1listOutput extends Activity {
    ImageView selectImage;
    TextView selectText;
    Button btnBuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid1list_output);
        selectImage = (ImageView)findViewById(R.id.selectFoto);
        selectText = (TextView)findViewById(R.id.selectText);
        final Intent intent = getIntent();
        selectImage.setImageResource(intent.getIntExtra("image", 0));
        final String temp = (String)intent.getSerializableExtra("textjudul");
        selectText.setText(temp);
        btnBuy = (Button)findViewById(R.id.btnBuy);
        btnBuy.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Grid1listOutput.this,PesanTiketActivity.class);
                intent1.putExtra("judul",temp);
                startActivity(intent1);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_grid1list_output, menu);
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
