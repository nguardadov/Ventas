package com.guardado.comunicacionf.entidades;

/**
 * Created by nelso on 28/04/2018.
 */

public class Persona {

    private int id;
    private String dui;
    private String nombre;
    private String apellido;
    private int edad;
    private String user;
    private String pass;

    public Persona() {
    }

    public Persona(int id, String dui, String nombre, String apellido, int edad, String user, String pass) {
        this.id = id;
        this.dui = dui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.user = user;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
