package com.guardado.comunicacionf;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

import com.guardado.comunicacionf.utilidades.Utilidades;

/**
 * Created by nelso on 28/04/2018.
 */

//int id, String dui, String nombre, String apellido, int edad, String user, String pass
public class ConexionSQLiteHelper extends SQLiteOpenHelper {


    public ConexionSQLiteHelper(View.OnClickListener context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super((Context) context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_PERSONA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {
        db.execSQL("DROP TABLE IF EXISTS personas");
        onCreate(db);
    }
}
