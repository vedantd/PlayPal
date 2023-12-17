package com.vedantd.playpal.repository;

import com.vedantd.playpal.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SportRepository extends JpaRepository<Sport, Long> {
    List<Sport> findByIsPopular(boolean isPopular);
    List<Sport> findByNameContaining(String name);


}