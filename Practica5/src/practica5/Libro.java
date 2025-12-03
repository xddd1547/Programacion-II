/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author Liz
 */
import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String isbn;
    private List<Pagina> paginas;

    public Libro(String titulo, String isbn, String[] cont) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<Pagina>();
        for (int i = 0; i < cont.length; i++) {
            this.paginas.add(new Pagina(i + 1, cont[i]));
        }
    }

    public String getTitulo() { 
        return titulo; 
    }

    public String getIsbn() {
        return isbn; 
    }

    public void leer() {
        System.out.println("Libro = " + titulo);
        System.out.println("ISBN = " + isbn);
        for (Pagina p : paginas) {
            p.mostrarPagina();
        }
    }
}