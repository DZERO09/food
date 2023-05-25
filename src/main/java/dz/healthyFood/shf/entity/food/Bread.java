package dz.healthyFood.shf.entity.food;

import dz.healthyFood.shf.entity.Generic;
import dz.healthyFood.shf.entity.rowMatiriel.RowMaterial;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bread extends Generic {
    @Column
    private String name ;
    @Column
    private String description ;
    @OneToMany
    private List<RowMaterial> rowMaterialList ;

    @Column(name = "price")
    private BigDecimal price ;
}
