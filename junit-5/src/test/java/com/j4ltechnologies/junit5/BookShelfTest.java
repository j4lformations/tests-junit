package com.j4ltechnologies.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe EtagereDuLivreTest, cr��e le 13/06/2022 � 17:25
 *
 * @author Joachim Zadi
 * @version 1.0 du 13/06/2022
 */
@DisplayName("<== Classe BookShelfTest ==>")
class BookShelfTest {

    public BookShelfTest(TestInfo info) {
        System.out.println(info.getDisplayName());
    }

    private BookShelf shelf;

    @BeforeEach
    void init() {
        shelf = new BookShelf();
    }

    @Test
    @DisplayName("est vide lorsqu'aucun livre n'y est ajouté")
    void etagere_vide_quand_aucun_livre_ajoute(TestInfo info) {
        //System.out.println(info.getDisplayName());
        //BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(), () -> "L'étagère doit etre vide");
    }

    @Test
    @DisplayName("etagere contient 2 livres quand 2 livres sont ajoutes")
    void etagere_contient_2_livres_quand_2_livres_ajoutes(TestInfo info) {
        //System.out.println(info.getDisplayName());
        //BookShelf shelf = new BookShelf();
        shelf.add("Effective Java");
        shelf.add("Complete code");
        List<String> books = shelf.books();
        assertEquals(2, books.size(), () -> "L'étagère doit contenir 2 livres");
    }

    @Test
    @DisplayName("Étagère de livres vide lorsque l'ajout est appelé sans livres")
    void etagere_de_livres_vide_lorsque_l_ajout_est_appele_sans_livres(TestInfo info) {
        //System.out.println(info.getDisplayName());
        //BookShelf shelf = new BookShelf();
        shelf.add();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(), () -> "L'étagère doit etre vide");
    }


    @Test
    @DisplayName("BookShelf ne peut pas modifier la collection de livres renvoyée par la méthode books")
    void booksReturnedFromBookShelfIsImmutableForClient(TestInfo info) {
        //System.out.println(info.getDisplayName());
        //BookShelf shelf = new BookShelf();
        shelf.add("Effective Java", "Code Complete");
        List<String> books = shelf.books();
        try {
            books.add("The Mythical Man-Month");
            fail(() -> "Should not be able to add book to books");
        } catch (Exception e) {
            assertTrue(e instanceof UnsupportedOperationException, () -> "Should throw UnsupportedOperationException.");
        }
    }

    @Test
    void bookshelfArrangedByBookTitle() {
        BookShelf shelf = new BookShelf();
        shelf.add("Effective Java", "Code Complete", "The Mythical Man-Month");
        List<String> books = shelf.arrange();
        assertEquals(Arrays.asList("Code Complete", "Effective Java", "The Mythical Man-Month"), books, () -> "Books in a bookshelf should be arranged lexicographically by book title");
    }

    @Test
    void booksInBookShelfAreInInsertionOrderAfterCallingArrange() {
        BookShelf shelf = new BookShelf();
        shelf.add("Effective Java", "Code Complete", "The Mythical Man-Month");
        shelf.arrange();
        List<String> books = shelf.books();
        assertEquals(Arrays.asList("Effective Java", "Code Complete", "The Mythical Man-Month"), books, () -> "Books in bookshelf are in insertion order");
    }
}