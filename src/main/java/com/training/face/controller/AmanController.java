package com.training.face.controller;
import com.training.face.model.Aman;
import com.training.face.service.AmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AmanController {
    @Autowired
    private AmanService amanService;

    @GetMapping("/getAll")
    public List<Aman>getAll() {
        return amanService.getAll();
    }
    @PostMapping("/save")
    public Aman addUser(@RequestBody Aman aman){
        return amanService.addAman(aman);
    }

    @PutMapping("/edit")
    public Aman editAman(@RequestBody Aman aman){
        return amanService.updateAman(aman);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAman(@PathVariable Long id){
        return amanService.deleteAman(id);
    }
}
