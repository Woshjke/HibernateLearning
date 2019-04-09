package ru.javabegin.training.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.javabegin.training.hibernate.entity.Book;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class BookHelper {
    private SessionFactory sessionFactory;

    public BookHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Book> getBookList() {
        Session session = sessionFactory.openSession();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root<Book> root = criteriaQuery.from(Book.class);
        criteriaQuery.select(root);


        Query query = session.createQuery(criteriaQuery);
        List<Book> bookList = query.getResultList();
        session.close();

        return bookList;
    }

    public void addBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        session.close();
    }
}
