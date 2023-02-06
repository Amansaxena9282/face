package com.training.face.service;
import com.training.face.model.Aman;

import java.util.List;
public interface AmanService {

    public List<Aman> getall ();
    public Aman addAman (Aman aman);
    public Aman updateAman (Aman aman);
    public String deleteAman(Aman aman);

    abstract String deleteAman(Long id);

    List<Aman> getAll();
}
