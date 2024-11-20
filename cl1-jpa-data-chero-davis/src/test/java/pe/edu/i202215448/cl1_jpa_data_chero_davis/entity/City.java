package pe.edu.i202215448.cl1_jpa_data_chero_davis.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int   ID;
    private String   Name;
    private String  CountryCode;
    private String  District;
    private int  Population;


}
