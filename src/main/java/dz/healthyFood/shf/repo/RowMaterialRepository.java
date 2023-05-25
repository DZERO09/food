package dz.healthyFood.shf.repo;

import dz.healthyFood.shf.entity.rowMatiriel.RowMaterial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RowMaterialRepository extends CrudRepository<RowMaterial, Long> {

    boolean existsByName(String name);
}
