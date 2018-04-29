package com.guardado.comunicacionf.utilidades;

/**
 * Created by nelso on 28/04/2018.
 */

public class Utilidades {
    //Constantes

    public static  final  String TABLA_PERSONAS ="personas";
    public static  final  String ID ="id";
    public static  final  String DUI ="dui";
    public static  final  String NOMBRE ="nombre";
    public static  final  String APELLIDO="apellido";
    public static  final  String EDAD ="edad";
    public static  final  String USER ="user";
    public static  final  String PASS ="pass";
    public static final String CREAR_TABLA_PERSONA = "CREATE TABLE "+TABLA_PERSONAS+"("+ID +" INTEGER, "+DUI+" TEX," +
            NOMBRE+" TEX,"+APELLIDO+" TEX,"+EDAD+" int,"+USER+" TEXT, "+PASS+" TEXT)";

}
