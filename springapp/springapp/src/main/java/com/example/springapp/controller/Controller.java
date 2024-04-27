package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.DSgarden;
import com.example.springapp.repository.Repo;
@RestController
public class Controller {
    @Autowired
    Repo repo;
    @GetMapping("/dsgarden")
    public List<DSgarden> getAllDSgarden()
    {
        List<DSgarden> dsgarden =repo.findAll();
        return dsgarden;
    }
    @GetMapping("/dsgarden/{id}")
    public DSgarden getDSgarden(@PathVariable int id)
    {
        DSgarden dsgarden = repo.findById(id).get();
        return dsgarden;
    }
    @PostMapping("/dsgarden/add")
    public void createDSgarden(@RequestBody DSgarden dsgarden)
    {
        repo.save(dsgarden);
    }
    @PutMapping("/dsgarden/update/{id}")
    public void updateDSgarden(@PathVariable int id)
    {
        DSgarden dsgarden = repo.findById(id).get();
        dsgarden.setName("Tomato plant");
        dsgarden.setPh_number(904578100);
        dsgarden.setAddress("Kovaipudhur,Coimbatore");
        repo.save(dsgarden);
    }
    @DeleteMapping("/dsgarden/delete/{id}")
    public void deleteDSgarden(@PathVariable int id)
    {
        DSgarden dsgarden = repo.findById(id).get();
        repo.delete(dsgarden);
    }
}