package com.training.face.service;

import com.training.face.model.Aman;
import com.training.face.repository.AmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AmanServiceImpl  implements  AmanService{
    @Autowired
    private AmanRepository amanRepository;
    @Override
    public List<Aman> getall() {
        return amanRepository.findAll();
    }

    @Override
    public Aman addAman(Aman aman) {
        return amanRepository.save(aman);
    }

    @Override
    public Aman updateAman(Aman aman) {
        Aman aman1=amanRepository.getById(aman.getId());
        if(aman.getName()!=null)
            aman1.setName(aman.getName());
        if (aman.getMobile()!=null)
            aman1.setMobile(aman.getMobile());

        return amanRepository.save(aman1);
    }

    @Override
    public String deleteAman(Aman aman) {
        return null;
    }

    @Override
    public String deleteAman(Long id) {
        amanRepository.deleteById(id);
        return "amanId:"+id+" Deleted Successfully";
    }

    @Override
    public List<Aman> getAll() {
        return null;
    }
}
