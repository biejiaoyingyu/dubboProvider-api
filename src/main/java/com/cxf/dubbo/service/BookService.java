package com.cxf.dubbo.service;

import com.cxf.dubbo.entities.Book;

import java.util.List;

public interface BookService {
  Book getOneBook4Callback(Integer id);
  Book getOneBook(int i);
  List<Book> qryAllBook();

}
