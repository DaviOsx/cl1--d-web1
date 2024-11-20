package pe.edu.cibertec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;


@Entity
public class countrylanguage {
    @Id
    private String CountryCode;
    private String Language;
    private  Integer IsOfficial;
    private BigDecimal Percentage;


    public countrylanguage() {
    }



    public countrylanguage(String countryCode, String language, Integer isOfficial, BigDecimal percentage) {
        CountryCode = countryCode;
        Language = language;
        IsOfficial = isOfficial;
        Percentage = percentage;
    }

    @Override
    public String toString() {
        return "countrylanguage{" +
                "CountryCode='" + CountryCode + '\'' +
                ", Language='" + Language + '\'' +
                ", IsOfficial=" + IsOfficial +
                ", Percentage=" + Percentage +
                '}';
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public Integer getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(Integer isOfficial) {
        IsOfficial = isOfficial;
    }

    public BigDecimal getPercentage() {
        return Percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        Percentage = percentage;
    }
}
