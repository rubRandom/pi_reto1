package com.ruben;

import java.util.ArrayList;

public class Periodico {

    private static final int MAX_NOTICIAS = 1000;

    private ArrayList <Noticia> noticias;
    private int numNoticias;

    public Periodico() {
        noticias = new ArrayList<>(MAX_NOTICIAS);
        numNoticias = 0;
    }

    //Inserta una notivcia si cabe; si no, no hace nada
    public void insertar(Noticia n) {
        if (numNoticias < MAX_NOTICIAS) {
            noticias.add(n);
            numNoticias++;
        }
    }

    //Devuelve la primera noticia de la fecha dada, o null si no hay ninguna
    public Noticia primeraNoticia(int d, int m, int a) {
        for (int i = 0; i < numNoticias; i++) {
            if (noticias.get(i).igualFecha(d, m, a)) {
                return noticias.get(i);

            }
        }
        return null;
    }

    // Muestra las noticias más leídas (todas si hay empate)
    public void masPopulares() {
        if (numNoticias == 0) {
            System.out.println("No hay noticias en el periódico");
            return;
        }

        int max = 0;
        for (Noticia n : noticias) {
            if (n.getLecturas() > max) {
                max = n.getLecturas();
            }
        }

        for (Noticia n : noticias) {
            if (n.getLecturas() == max) {
                System.out.println(n);
            }
        }
    }

    //Elimina las noticias anteriores a la fecha dada
    public void borrarAnteriores(int d, int m, int a) {
        int fechaLimite = (( a * 10000) + (m *100) + d);

        for (int i = numNoticias - 1; i >= 0; i--) {
            if (noticias.get(i).getFecha() < fechaLimite) {
                noticias.remove(i);
                numNoticias--;
            }
        }
    }

    //Muestra todas las noticias
    public void mostrar() {
        if (numNoticias == 0) {
            System.out.println("No hay noticvias en el periódico,");
            return;
        }
        for (Noticia n : noticias) {
            System.out.println(n);
        }
    }
}
