package id.sch.smktelkom_mlg.www.operatormatematika;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnJumlah, btnKurang, btnKali, btnBagi;
    TextView textAwal, textOperator, texthasil;
    EditText editAwal, editKedua, editHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnJumlah = findViewById(R.id.btnJumlah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        textAwal = findViewById(R.id.textawal);
        textOperator = findViewById(R.id.textOperator);
        texthasil = findViewById(R.id.texthasil);
        editAwal = findViewById(R.id.editAwal);
        editKedua = findViewById(R.id.editKedua);
        editHasil = findViewById(R.id.editHasil);
        btnJumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpenjumlahan();
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpengurangan();
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorperkalian();
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpembagian();
            }
        });
    }

    private void operatorpenjumlahan() {
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int pejumlahan = angkaawal + angkakedua;
        editHasil.setText(pejumlahan + "");

    }

    private void operatorpengurangan() {
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int pengurangan = angkaawal - angkakedua;
        editHasil.setText(pengurangan + "");
    }

    private void operatorperkalian() {
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int perkalian = angkaawal * angkakedua;
        editHasil.setText(perkalian + "");
    }

    private void operatorpembagian() {
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int pembagian = angkaawal / angkakedua;
        editHasil.setText(pembagian + "");

    }
}

