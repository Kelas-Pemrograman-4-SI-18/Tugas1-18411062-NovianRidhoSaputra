package com.ridho.prj1; 
    
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNama, edtNpm, edtkelamin, notelp, prodi;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtNamadanNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtkelamin = (EditText) findViewById(R.id.edtkelamin);
        notelp = (EditText) findViewById(R.id.notelp);
        prodi = (EditText) findViewById(R.id.prodi);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNama = edtNama.getText().toString();
                String strNpm = edtNpm.getText().toString();
                String strkelamin = edtkelamin.getText().toString();
                String strtelp = notelp.getText().toString();
                String strprodi = prodi.getText().toString();

                txtTampil.setText(strNama + "\n" + strNpm + "\n" + strkelamin + "\n" + strtelp + "\n" + strprodi);

            }
        });
    }
}