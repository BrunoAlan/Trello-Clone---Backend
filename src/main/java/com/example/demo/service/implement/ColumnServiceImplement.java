package com.example.demo.service.implement;

import java.util.List;

import com.example.demo.model.Column;
import com.example.demo.repository.ColumnRepository;
import com.example.demo.service.ColumnService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColumnServiceImplement implements ColumnService {

    @Autowired
    private ColumnRepository columnRepository;

    @Override
    public List<Column> findAll() {
        return columnRepository.findAll();
    }

    @Override
    public Column save(Column column) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Column findOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Column update(Column column) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Long delete(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

}
