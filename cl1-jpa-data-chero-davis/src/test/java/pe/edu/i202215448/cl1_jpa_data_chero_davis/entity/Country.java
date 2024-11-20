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

public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Code;
    private String Name;
    private  Integer Continent;
    private String Region;
    private BigDecimal SurfaceArea;
    private  Integer   IndepYear;
    private  int Population;
    private BigDecimal     LifeExpectancy;
    private BigDecimal GNP;
    private BigDecimal       GNPOld;
    private String LocalName;
    private String      GovernmentForm;
    private String HeadOfState;
    private  int      Capital;
    private  Integer Code2;


}
