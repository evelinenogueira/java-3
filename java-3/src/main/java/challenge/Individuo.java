package challenge;

import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Individuo {



    private String nationality;
    private String club;
    private String fullName;
    private double eurReleaseClause;
    private double eurWage;
    private Date birthDate;
    private int age;

    public Individuo (String nationality, String club, String fullName, String eurReleaseClause, String eurWage, String birthDate, String age)
    {
        setNationality(nationality);
        setClub(club);
        setFullName(fullName);
        setEurReleaseClause(eurReleaseClause);
        setEurWage(eurWage);
        setBirthDate(birthDate);
        setAge(age);

    }


    public String getNationality() {
        return nationality;
    }

    public String getClub() {
        return club;
    }

    public String getFullName() {
        return fullName;
    }

    public double getEurReleaseClause() {
        return eurReleaseClause;
    }

    public double getEurWage() {
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

    public void setEurReleaseClause(String eurReleaseClause) {

        NumberFormat nf = NumberFormat.getInstance();
        double number = nf.parse(this.eurReleaseClause).doubleValue();
    }

    public void setEurWage(String eurWage) {
        this.eurWage = Double.parseDouble(eurWage);
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = new SimpleDateFormat ("yyyy-MM-dd").parse(birthDate, new ParsePosition(5));
    }

    public void setAge(String age) {
        this.age = Integer.parseInt(age);
    }

}
