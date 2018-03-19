package com.example.daffa.project040917;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class main extends AppCompatActivity {

    //1 - declare
    RadioButton rbxrpl, rbxtkj, rbxirpl, rbxitkj, rbxiirpl, rbxiitkj;
    Button btvld, btclr, btsnd;
    TextView txhsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2 - menghubungkan id xml ke java
        rbxrpl = (RadioButton) findViewById(R.id.xrpl);
        rbxtkj = (RadioButton) findViewById(R.id.xtkj);
        rbxirpl = (RadioButton) findViewById(R.id.xirpl);
        rbxitkj = (RadioButton) findViewById(R.id.xitkj);
        rbxiirpl = (RadioButton) findViewById(R.id.xiirpl);
        rbxiitkj = (RadioButton) findViewById(R.id.xiitkj);
        btvld = (Button) findViewById(R.id.bvld);
        btvld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vldsrb();
            }
        });
        btclr = (Button) findViewById(R.id.bclr);
        btclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clrrb();
            }
        });
        btsnd = (Button) findViewById(R.id.bsnd);
        btsnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snddata();
            }
        });
        txhsl = (TextView) findViewById(R.id.hsl);

    }

    //   - membuat methode validasi radiobutton
    @SuppressLint("SetTextI18n")
    public void vldsrb() {

        if (rbxrpl.isChecked()) {
            Toast.makeText(main.this, "Anda memilih Kelas 10 jurusan RPL", Toast.LENGTH_SHORT).show();
            txhsl.setText("Kelas 10 Jurusan RPL");
        } else if (rbxtkj.isChecked()) {
            Toast.makeText(main.this, "Anda memilih Kelas 10 jurusan TKJ", Toast.LENGTH_SHORT).show();
            txhsl.setText("Kelas 10 Jurusan TKJ");
        } else if (rbxirpl.isChecked()) {
            Toast.makeText(main.this, "Anda memilih Kelas 11 jurusan RPL", Toast.LENGTH_SHORT).show();
            txhsl.setText("Kelas 11 Jurusan RPL");
        } else if (rbxitkj.isChecked()) {
            Toast.makeText(main.this, "Anda memilih Kelas 11 jurusan TKJ", Toast.LENGTH_SHORT).show();
            txhsl.setText("Kelas 11 Jurusan TKJ");
        } else if (rbxiirpl.isChecked()) {
            Toast.makeText(main.this, "Anda memilih Kelas 12 jurusan RPL", Toast.LENGTH_SHORT).show();
            txhsl.setText("Kelas 12 Jurusan RPL");
        } else if (rbxiitkj.isChecked()) {
            Toast.makeText(main.this, "Anda memilih Kelas 12 jurusan TKJ", Toast.LENGTH_SHORT).show();
            txhsl.setText("Kelas 12 Jurusan TKJ");
        } else {
            Toast.makeText(main.this, "Pilihan tidak boleh kosong!!!", Toast.LENGTH_SHORT).show();
            txhsl.setText("ERROR!!!");
        }
    }


    //   - membuat methode uncheck all radiobutton
    public void clrrb() {

        if (rbxrpl.isChecked() || rbxtkj.isChecked() || rbxirpl.isChecked() || rbxitkj.isChecked() || rbxiirpl.isChecked() || rbxiitkj.isChecked()) {
            rbxrpl.setChecked(false);
            rbxtkj.setChecked(false);
            rbxirpl.setChecked(false);
            rbxitkj.setChecked(false);
            rbxiirpl.setChecked(false);
            rbxiitkj.setChecked(false);
        }
    }


    //   - membuat methode kirim data ke activity data
    public void snddata() {

        if (!rbxtkj.isChecked() && !rbxrpl.isChecked() && !rbxitkj.isChecked() && !rbxirpl.isChecked() && !rbxiitkj.isChecked() && !rbxiirpl.isChecked()) {
            Toast.makeText(this, "Pilihan Anda tidak Boleh Kosong...!!!", Toast.LENGTH_SHORT).show();
        } else {
            vldsrb();
            Intent senddat = new Intent(getApplicationContext(), data.class);
            senddat.putExtra("dthsl", txhsl.getText().toString());
            startActivity(senddat);
        }
    }
}

