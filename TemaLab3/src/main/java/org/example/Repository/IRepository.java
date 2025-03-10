package org.example.Repository;

import org.example.Domain.Entity;

public interface IRepository <E extends Entity<ID>, ID>{
    void Add(E e);
    void Update(E e);
    void Remove(ID id);
    E GetById(ID id);
    Iterable<E> findAll();
}
