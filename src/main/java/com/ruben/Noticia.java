package com.ruben;

public class Noticia {
    private int fecha;
    private int hora;
    private String texto;
    private int lecturas;

    public Noticia(int fecha, int hora, String texto) {
        this.fecha = fecha;
        this.hora = hora;
        this.texto = texto;
        this.lecturas = 0;
    }

    // Devolver la fecha en el formato aaammdd
    public int getFecha() {
        return fecha;
    }

    //Devolver el número de lecturas
    public int getLecturas() {
        return lecturas;
    }

    public void incLecturas() {
        lecturas++;
    }

    //Comprobar si una fecha dad por d, m a es igual a la fehca de la noticia
    public boolean igualFecha(int d, int m, int a) {
        int fechaDada = ((a * 10000) + (m * 100) + d);
        return fecha == fechaDada;
    }

    //Devuelve un String con la información de la noticia
    @Override
    public String toString() {
        String s = "";
        s += fecha % 100 + "/" + (fecha / 100) % 100 + "/" + (fecha / 10000) + " - ";
        s += (hora / 100) + ":" + (hora % 100) + "\n";
        s += texto + "\n";
        s += "Leída " + lecturas + " veces\n";
        return s;
    }
}
