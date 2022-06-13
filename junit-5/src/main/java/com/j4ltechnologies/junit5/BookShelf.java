package com.j4ltechnologies.junit5;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Classe BookShelfSpec, créée le 13/06/2022 à 17:20
 *
 * @author Joachim Zadi
 * @version 1.0 du 13/06/2022
 */
public class BookShelf {

    private final List<String> books = new ArrayList<>();

    public List<String> books() {
//        return Collections.emptyList();
//        return books;
        return Collections.unmodifiableList(books);
    }

    public void add(String... titres) {
//        books.add(titre);
        //refactoring
        books.addAll(Arrays.asList(titres));
    }

    public List<String> arrange() {
//        return null;
//        books.sort(Comparator.naturalOrder());
//        return books;
        return books.stream().sorted().collect(Collectors.toList());
    }
}
