package com.recordcollection.services;

import java.util.List;

/**
 * Created by Ioannis Matzakos on 22/03/2019.
 */

public interface CRUDService<T> {
    List<?> listAll();

    T getById(Integer id);

    T saveOrUpdate(T domainObject);

    void delete(Integer id);
}
