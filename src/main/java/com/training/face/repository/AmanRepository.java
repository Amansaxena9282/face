package com.training.face.repository;

import com.training.face.model.Aman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmanRepository extends JpaRepository<Aman, Long> {
}
