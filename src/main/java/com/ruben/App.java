package com.ruben;

public class App {

    public static void main (String[] args) {
        System.out.println("=== PRUEBA 1: CREAR NOTICIAS ===");
        Noticia n1 = new Noticia(20251001, 930, "Comienza el nuevo curso de FP en Valencia");
        Noticia n2 = new Noticia(20251003, 1745, "Alerta amarilla por lluvias en la costa");
        Noticia n3 = new Noticia(20251003, 1015, "El Valencia CF gana en Mestalla");
        Noticia n4 = new Noticia(20251005, 1820, "Suben los precios de la gasolina");
        Noticia n5 = new Noticia(20251007, 1230, "La Roja vuelve a llevarse la victoria ante Croacia");

        System.out.println(n1);
        System.out.println("¿n1 es del 1/10/2025? " + n1.igualFecha(1, 10, 2025));
        System.out.println("¿n1 es del 2/10/2025? " + n1.igualFecha(2, 10, 2025));
        System.out.println();

        System.out.println("=== PRUEBA 2: INSERTAR ===");
        Periodico periodico = new Periodico();
        periodico.insertar(n1);
        periodico.insertar(n2);
        periodico.insertar(n3);
        periodico.insertar(n4);
        periodico.insertar(n5);
        periodico.mostrar();

        System.out.println("=== PRUEBA 3: PRIMERA NOTICIA ===");
        Noticia primera = periodico.primeraNoticia(1, 10, 2025);
        System.out.println("Primera notícia del 1/10/2025: ");
        System.out.println(primera);

        Noticia ninguna = periodico.primeraNoticia(25, 12, 2025);
        if (ninguna == null) {
            System.out.println("No hay noticias del 25/12/2025");
            }
        System.out.println();

        System.out.println("=== PRUEBA 4: MÁS POPULARES ===");
        System.out.println("Periódico vacío: ");
        Periodico vacio = new Periodico();
        vacio.masPopulares();
        System.out.println();

        //Simulación de lecturas
        for (int i = 0; i < 3; i++) n1.incLecturas();
        for (int i = 0; i < 5; i++) n3.incLecturas();
        for (int i = 0; i < 5; i++) n5.incLecturas();

        System.out.println("Notícias más leídas: ");
        periodico.masPopulares();

        System.out.println("=== PRUEBA 5: BORRAR ANTERIORES ===");
        System.out.println("Borrando noticias anteriores al 4/10/2025...");
        periodico.borrarAnteriores(4, 10, 2025);
        periodico.mostrar();

    }
}
