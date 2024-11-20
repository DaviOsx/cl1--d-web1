package pe.edu.cibertec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "city")
public class city {
    @Id
   private int   ID;
   private String   Name;
    private String  CountryCode;
    private String  District;
    private int  Population;



    public city() {
    }

    public city(int ID) {
        this.ID = ID;
    }

    public city(int population, String district, String countryCode, String name, int ID) {
        Population = population;
        District = district;
        CountryCode = countryCode;
        Name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "city{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                ", District='" + District + '\'' +
                ", Population=" + Population +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }
}
