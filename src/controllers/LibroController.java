package controllers;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Book;

public class LibroController {

    public Set<Book> procesarConTreeSet(List<Book> libros) {
        return new TreeSet<>(libros);
    }

}
