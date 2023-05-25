package dz.healthyFood.shf.entity.rowMatiriel;

import dz.healthyFood.shf.entity.Generic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RowMaterial extends Generic {
    @Column
    private String name ;
    @Column
    private String description ;
}
