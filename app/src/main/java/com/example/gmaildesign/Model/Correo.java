package com.example.gmaildesign.Model;

public class Correo {

    public Correo(String nombre, String asunto, String mensaje, String fecha, int imagen) {
        this.nombre = nombre;
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.imagen = imagen;
    }

    private String nombre;
    private String asunto;
    private String mensaje;
    private String fecha;
    private int imagen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

}
