package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Column;

import org.springframework.stereotype.Repository;

@Repository
public class ColumnRepository {

    private List<Column> initialColumns() {
        List<Column> columns = new ArrayList<Column>();
        columns.add(new Column(1L, "To do", 1));
        columns.add(new Column(2L, "Doing", 2));
        columns.add(new Column(3L, "Done", 3));
        columns.sort((Column c1, Column c2) -> c1.getOrder() - c2.getOrder());
        return columns;
    }

    private List<Column> columns = initialColumns();

    public List<Column> findAll() {
        return columns;
    }

}
