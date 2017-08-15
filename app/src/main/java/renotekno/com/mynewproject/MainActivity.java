package renotekno.com.mynewproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button tombolActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // referensikan button pada layout xml
        tombolActivity2 = (Button) findViewById(R.id.tombolActivity2);

        // tambah click listener
        tombolActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mulai Activity baru
                Intent intent = new Intent(MainActivity.this, ActivityKe2.class);
                startActivity(intent);
            }
        });
    }
}
