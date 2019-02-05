package com.uxpsystems.assignment.dao;

import java.io.Serializable;
import java.util.List;

public interface UserDaoInterface<T, Id extends Serializable> {

    //Crud operations
    void persist(T entity);

    void update(T entity);

    T findById(Id id);

    void delete(T entity);

    List<T> getAllUsers();

    void deleteAll();

}
