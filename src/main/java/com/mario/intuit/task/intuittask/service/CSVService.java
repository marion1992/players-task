package com.mario.intuit.task.intuittask.service;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CSVService<T> {

    private final Class<T> classType;

    public CSVService(Class<T> classType) {
        this.classType = classType;
    }

    public List<T> getData(String filePath) throws FileNotFoundException {
        CsvToBean<T> csvToBean = new CsvToBeanBuilder<T>(new FileReader(filePath))
                .withType(classType)
                .build();
        return csvToBean.parse();
    }
}
