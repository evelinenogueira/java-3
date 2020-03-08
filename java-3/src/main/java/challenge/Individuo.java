package challenge;

import java.util.Date;


public class Individuo {


    private String nationality;
    private String club;
    private String fullName;
    private float eurReleaseClause;
    private float eurWage;
    private Date birthDate;
    private int age;

//    public Individuo (String nationality, String club, String fullName, float eurReleaseClause, float eurWage, Date birthDate, int age) {
//
//        this.setNationality(nationality);
//        this.setClub(club);
//        this.setFullName(fullName);
//        this.setEurReleaseClause(this.eurReleaseClause);
//        this.setEurWage(this.eurWage);
//        this.setBirthDate(this.birthDate);
//        this.setAge(this.age);
//
//    }

    public String getNationality() {
        return nationality;
    }

    public String getClub() {
        return club;
    }

    public String getFullName() {
        return fullName;
    }

    public float getEurReleaseClause() {
        return eurReleaseClause;
    }

    public float getEurWage() {
        return eurWage;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEurReleaseClause(float eurReleaseClause) { this.eurReleaseClause = eurReleaseClause;}

    public void setEurWage(float eurWage) { this.eurWage = eurWage; }

    public void setBirthDate(Date birthDate) { this.birthDate = birthDate;}

    public void setAge(int age) { this.age = age;}

}

