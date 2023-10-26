package br.ulbra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnFt1, btnFt2;

    ImageView imgfoto;
    TextView txtFt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgfoto = (ImageView) findViewById(R.id.imgfoto);
        btnFt1 = (Button) findViewById(R.id.btnFt1);
        btnFt2 = (Button) findViewById(R.id.btnFt2);
        txtFt = (TextView) findViewById(R.id.txtFt);

        btnFt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgfoto.setImageResource(R.drawable.blzkk);
                txtFt.setText("Blz");
            }
        });
        btnFt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgfoto.setImageResource(R.drawable.joiakk);
                txtFt.setText("Joia");
            }
        });
    }
}