package service;

import java.util.List;

public interface CRUDInterface <T>{
    void add(T t);
    void edit(T t, int id);
    void dislay(int id);
    List<T> getAll();
}
