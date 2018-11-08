package example.com.chairul.projectuaschairulrahmant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;


public class PesanTiketActivity extends Activity {
    String studio,food,jam,hari,kursi,judul;
    int hrgFood,hrgTiket,total;
    EditText editJudul;
    CheckBox cek1,cek2,cek3;
    RadioButton rd1,rd2,rd3;
    Spinner spn1,spn2,spn3;
    Button btnBuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_tiket);
        final Intent intent1 = getIntent();
        judul = (String)intent1.getSerializableExtra("judul");
        editJudul = (EditText)findViewById(R.id.edtJudul);
        editJudul.setText(judul);
        rd1 =(RadioButton)findViewById(R.id.rd1);
        rd2 = (RadioButton)findViewById(R.id.rd2);
        rd3 = (RadioButton)findViewById(R.id.rd3);
        spn1 = (Spinner)findViewById(R.id.spn1);
        spn2 = (Spinner)findViewById(R.id.spn2);
        spn3 = (Spinner)findViewById(R.id.spn3);
        cek1 = (CheckBox)findViewById(R.id.chk1);
        cek2 = (CheckBox)findViewById(R.id.chk2);
        cek3 = (CheckBox)findViewById(R.id.chk3);
        btnBuy = (Button)findViewById(R.id.btn1);
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            prosesSpinner();
            prosesCheckBox();
            prosesRadio();
                hrgTiket =50000;
                total = hrgTiket + hrgFood;
                //Toast.makeText(getApplicationContext(),"Judul : "+judul+"\nStudio : "+studio+
                  //      "\nJam : "+jam+"\nHari : "+hari+"\nKursi : "+kursi+"\nFood : "+food+"\nHarga Tiket : "+hrgTiket+"\nTotal : "+total,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(PesanTiketActivity.this,DetailTiket.class);
                intent.putExtra("hasil"
                        ,"Judul       : "+judul+
                        "\nStudio      : "+studio+
                        "\nJam         : "+jam+"" +
                        "\nHari        : "+hari+
                        "\nKursi       : "+kursi+"" +
                        "\nFood        : "+food+
                        "\nHarga Tiket : "+hrgTiket+"" +
                        "\nTotal       : "+total);
                startActivity(intent);
            }


        });

    }

    private void prosesRadio() {

        if(rd1.isChecked()){
            studio = rd1.getText().toString();
        }else if(rd2.isChecked()){
            studio =rd2.getText().toString();
        }else if(rd3.isChecked()){
            studio = rd3.getText().toString();
        }

    }

    private void prosesCheckBox() {
    if(cek1.isChecked() && cek2.isChecked() && cek3.isChecked()){
        food = "Sandwich, Kentang, Keripik";
        hrgFood = 30000;
    }else if(cek1.isChecked() && cek2.isChecked() && !cek3.isChecked()){
            food = "Sandwich, Kentang";
        hrgFood = 20000;
    }else if(cek1.isChecked() && !cek2.isChecked() && cek3.isChecked()){
            food = "Sandwich, Keripik";
        hrgFood = 20000;
    }else if(!cek1.isChecked() && cek2.isChecked() && cek3.isChecked()){
        food = "Kentang, Keripik";
        hrgFood = 20000;
    }else if(cek1.isChecked() && !cek2.isChecked() && !cek3.isChecked()){
            food = "Sandwich";
        hrgFood = 10000;
    }else if(!cek1.isChecked() && !cek2.isChecked() && cek3.isChecked()){
            food = "Keripik";
        hrgFood = 10000;
    }else if(!cek1.isChecked() && cek2.isChecked() && !cek3.isChecked()){
        food = "Kentang";
        hrgFood = 10000;
    }else{
        food = "-";
        hrgFood = 0;
    }
    }

    private void prosesSpinner() {
        //judul = editJudul.getText().toString();
        jam = spn1.getSelectedItem().toString();
        hari = spn2.getSelectedItem().toString();
        kursi = spn3.getSelectedItem().toString();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pesan_tiket, menu);
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
