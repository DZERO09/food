package dz.healthyFood.shf.entity.utility;




import dz.healthyFood.shf.entity.Generic;
import dz.healthyFood.shf.entity.food.Bread;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UploadMedia extends Generic {

    @Column(name = "original_path")
    private String originalFilePath;
    @Column(name = "created_by")
    private String owner;


    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;
    @Column(name = "size_file", nullable = false)
    private Long size ;


    @ManyToOne(cascade = CascadeType.REMOVE)/*(fetch = FetchType.EAGER)*/
    @JoinColumn(name = "bread_id")
    private Bread bread ;


}
