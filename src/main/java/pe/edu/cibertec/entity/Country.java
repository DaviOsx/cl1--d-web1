package pe.edu.cibertec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "country")
public class Country {

    @Id
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

    public Country() {
    }

    public Country(String code) {
        Code = code;
    }

    public Country(String code, String name, Integer continent, String region, BigDecimal surfaceArea, Integer indepYear, int population, BigDecimal lifeExpectancy, BigDecimal GNP, BigDecimal GNPOld, String localName, String governmentForm, String headOfState, int capital, Integer code2) {
        Code = code;
        Name = name;
        Continent = continent;
        Region = region;
        SurfaceArea = surfaceArea;
        IndepYear = indepYear;
        Population = population;
        LifeExpectancy = lifeExpectancy;
        this.GNP = GNP;
        this.GNPOld = GNPOld;
        LocalName = localName;
        GovernmentForm = governmentForm;
        HeadOfState = headOfState;
        Capital = capital;
        Code2 = code2;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Code='" + Code + '\'' +
                ", Name='" + Name + '\'' +
                ", Continent=" + Continent +
                ", Region='" + Region + '\'' +
                ", SurfaceArea=" + SurfaceArea +
                ", IndepYear=" + IndepYear +
                ", Population=" + Population +
                ", LifeExpectancy=" + LifeExpectancy +
                ", GNP=" + GNP +
                ", GNPOld=" + GNPOld +
                ", LocalName='" + LocalName + '\'' +
                ", GovernmentForm='" + GovernmentForm + '\'' +
                ", HeadOfState='" + HeadOfState + '\'' +
                ", Capital=" + Capital +
                ", Code2=" + Code2 +
                '}';
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getContinent() {
        return Continent;
    }

    public void setContinent(Integer continent) {
        Continent = continent;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public BigDecimal getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(BigDecimal surfaceArea) {
        SurfaceArea = surfaceArea;
    }

    public Integer getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(Integer indepYear) {
        IndepYear = indepYear;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public BigDecimal getLifeExpectancy() {
        return LifeExpectancy;
    }

    public void setLifeExpectancy(BigDecimal lifeExpectancy) {
        LifeExpectancy = lifeExpectancy;
    }

    public BigDecimal getGNP() {
        return GNP;
    }

    public void setGNP(BigDecimal GNP) {
        this.GNP = GNP;
    }

    public BigDecimal getGNPOld() {
        return GNPOld;
    }

    public void setGNPOld(BigDecimal GNPOld) {
        this.GNPOld = GNPOld;
    }

    public String getLocalName() {
        return LocalName;
    }

    public void setLocalName(String localName) {
        LocalName = localName;
    }

    public String getGovernmentForm() {
        return GovernmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        GovernmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return HeadOfState;
    }

    public void setHeadOfState(String headOfState) {
        HeadOfState = headOfState;
    }

    public int getCapital() {
        return Capital;
    }

    public void setCapital(int capital) {
        Capital = capital;
    }

    public Integer getCode2() {
        return Code2;
    }

    public void setCode2(Integer code2) {
        Code2 = code2;
    }
}
