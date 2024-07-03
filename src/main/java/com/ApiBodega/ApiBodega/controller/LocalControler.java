package com.ApiBodega.ApiBodega.controller;

import com.ApiBodega.ApiBodega.entity.Local;
import com.ApiBodega.ApiBodega.error.LocalNotFoundException;
import com.ApiBodega.ApiBodega.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LocalControler {

    @Autowired
    LocalService localService;

    @GetMapping("/findLocalById/{id}")
    Local findLocalById(@RequestParam Long id) throws LocalNotFoundException {
        return localService.findLocalById(id);
    }

    @GetMapping("/findLocalByNameWithJPQL")
    Optional<Local> findLocalByNameWithJPQL(@RequestParam String name){
        return localService.findLocalByNameWithJPQL(name);
    }

    @GetMapping("/findByName/{name}")
        Optional<Local>findByName(@PathVariable String name){
        return localService.findLocalByName(name);
        }

    @GetMapping("/findByNameIgnoreCase/{name}")
    Optional<Local>findByNameIgnoreCase(@PathVariable String name){
        return localService.findLocalNameIgnoreCase(name);
    }

        @GetMapping("/findAllLocals")
    public List<Local> findAllLocal(){return localService.findAllLocals();}

    @PostMapping("/saveLocal")
    public Local saveLocal(@RequestBody Local local){return localService.saveLocal(local);}

        @PutMapping("/updateLocal/{id}")
    public Local updateLocal(@PathVariable Long id, @RequestBody Local local){
            return localService.updateLocal(id,local);
        }
    @DeleteMapping("/deleteLocal/{id}")
    public String deleteLocal(@PathVariable Long id){
        localService.deleteLocal(id);
        return "Succesfully deleted";

    }
}
