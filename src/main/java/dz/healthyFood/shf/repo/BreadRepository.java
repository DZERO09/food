package dz.healthyFood.shf.repo;

import dz.healthyFood.shf.entity.food.Bread;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreadRepository extends CrudRepository<Bread, Long> {
    @Override
    boolean existsById(Long aLong);

    boolean existsByName(String name);

    Page<Bread> findAllByName(String name, Pageable pageable);
}
