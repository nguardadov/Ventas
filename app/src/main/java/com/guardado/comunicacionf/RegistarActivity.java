package com.guardado.comunicacionf;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.guardado.comunicacionf.utilidades.Utilidades;

public class RegistarActivity extends AppCompatActivity {

    TextView id;
    TextView dui;
    TextView nombre;
    TextView apellido;
    TextView edad;
    TextView user;
    TextView pass;
    TextView registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registar);
        dui = findViewById(R.id.txt_dui);
        nombre = findViewById(R.id.txt_nombre);
        apellido = findViewById(R.id.txt_apellido);
        edad = findViewById(R.id.txt_edad);
        user = findViewById(R.id.txt_UsernameR);
        pass = findViewById(R.id.txt_UsernameR);
        registrar = findViewById(R.id.txt_Registrar_p);
        id = findViewById(R.id.txt_id);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"bd_ventas",null,1);
                SQLiteDatabase db = conn.getWritableDatabase();

                ContentValues values = new ContentValues();
                values.put(Utilidades.ID,Integer.parseInt(id.getText().toString()));
                values.put(Utilidades.DUI,dui.getText().toString());
                values.put(Utilidades.NOMBRE,nombre.getText().toString());
                values.put(Utilidades.APELLIDO,apellido.getText().toString());
                values.put(Utilidades.EDAD,Integer.parseInt(edad.getText().toString()));
                values.put(Utilidades.USER,user.getText().toString());
                values.put(Utilidades.PASS,pass.getText().toString());

                Long idResultante = db.insert(Utilidades.TABLA_PERSONAS,Utilidades.ID,values);
                Toast.makeText(getApplicationContext(),"iD REGITRO: "+idResultante,Toast.LENGTH_SHORT);
            }
        });

    }
}
