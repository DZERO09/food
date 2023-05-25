package dz.healthyFood.shf.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass
public abstract class Generic {
    @Id//annotation
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    protected long id ;

    public Generic(long id) {
        this.id = id;
    }
}

