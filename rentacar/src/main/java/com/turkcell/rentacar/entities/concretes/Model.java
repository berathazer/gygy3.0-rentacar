package com.turkcell.rentacar.entities.concretes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.turkcell.rentacar.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "models")
@SequenceGenerator(
        name = "base_sequence",
        sequenceName = "model_sequence",
        allocationSize = 1
)
public class Model extends BaseEntity {
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "brandId")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "fuelId")
    private Fuel fuel;

    @ManyToOne
    @JoinColumn(name = "transmissionId")
    private Transmission transmission;

    @OneToMany(mappedBy = "model")
    private List<Car> cars;

    @Column(name = "requiredFindexScore")
    private int requiredFindexScore;


}
