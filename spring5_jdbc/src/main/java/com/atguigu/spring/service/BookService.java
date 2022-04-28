package com.atguigu.spring.service;

import com.atguigu.spring.dao.BookDao;
import com.atguigu.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Davy
 */

@Service
public class BookService {
    //注入DAO
    @Autowired
    private BookDao bookDao;

    //添加书
    public void addBook(Book book){
        bookDao.add(book);
    }

    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    public void deleteBook(String id){
        bookDao.delete(id);
    }

    public int findCount(){
        return bookDao.selectCount();
    }

    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }

    public List<Book> findAll(){
        return bookDao.findAllBook();
    }

    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }

    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }

    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDeleteBook(batchArgs);
    }
}
