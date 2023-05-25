package dz.healthyFood.shf.dao;

import dz.healthyFood.shf.repo.BreadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BreadDao {
    @Autowired
    private BreadRepository breadRepository;



}
