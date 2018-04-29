package com.guardado.comunicacionf;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by nelso on 28/04/2018.
 */

//int id, String dui, String nombre, String apellido, int edad, String user, String pass
public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    final String CREAR_TABLA_PERSONA = "CREATE TABLE personas(id INTEGER, dui TEX," +
            "nombre TEX,apellido TEX,edad int, nombre user, nombre pass)";
    public ConexionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA_PERSONA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {
        db.execSQL("DROP TABLE IF EXISTS personas");
        onCreate(db);
    }
}
