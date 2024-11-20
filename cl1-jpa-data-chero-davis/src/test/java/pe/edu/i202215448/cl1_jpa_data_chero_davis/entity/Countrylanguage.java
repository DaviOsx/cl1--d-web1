package pe.edu.i202215448.cl1_jpa_data_chero_davis.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Countrylanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String CountryCode;
    private String Language;
    private  Integer IsOfficial;
    private BigDecimal Percentage;


}
