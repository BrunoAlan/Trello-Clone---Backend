package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Column;

public interface ColumnService {

    public List<Column> findAll();

    public Column save(Column column);

    public Column findOne(Long id);

    public Column update(Column column);

    public Long delete(Long id);

}
