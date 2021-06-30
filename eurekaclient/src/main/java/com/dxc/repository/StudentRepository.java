package com.dxc.repository;

import com.dxc.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student>  findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
