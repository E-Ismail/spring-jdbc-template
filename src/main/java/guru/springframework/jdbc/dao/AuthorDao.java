package guru.springframework.jdbc.dao;

import guru.springframework.jdbc.domain.Author;

/**
 * @author E.I.
 * {@code @Date}  10/10/2022
 */
public interface AuthorDao {

    Author getById(Long id);

    Author findAuthorByName(String firstName, String lastName);

    Author saveNewAuthor(Author author);

    Author updateAuthor(Author author);

    void deleteAuthorById(Long id);
}
