package com.ApiBodega.ApiBodega.service;

import com.ApiBodega.ApiBodega.entity.Local;
import com.ApiBodega.ApiBodega.error.LocalNotFoundException;

import java.util.List;
import java.util.Optional;

public interface LocalService {
    List<Local>findAllLocals();
    Local saveLocal(Local local);
    Local updateLocal(Long id, Local local);
    void deleteLocal(Long id);
    Optional <Local> findLocalByNameWithJPQL(String name);
    Optional<Local> findLocalByName(String name);
    Optional<Local> findLocalNameIgnoreCase(String name);
    Local findLocalById(Long id) throws LocalNotFoundException;
}
