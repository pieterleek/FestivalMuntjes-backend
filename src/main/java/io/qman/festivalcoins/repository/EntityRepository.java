package io.qman.festivalcoins.repository;

public interface EntityRepository<E> {

    E get(String uid);

    void add(E e);

    void update(E e);

    void delete(E e);

    void delete(int id);

    E[] getAll();

}
