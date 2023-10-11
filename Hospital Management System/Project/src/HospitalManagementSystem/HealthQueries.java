package HospitalManagementSystem;


public class HealthQueries {
    private int Id;
    private String DiseasesName;
    private String Symptoms;

    public HealthQueries(int Id, String DiseasesName, String Symptoms) {
        this.Id = Id;
        this.DiseasesName = DiseasesName;
        this.Symptoms = Symptoms;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDiseasesName() {
        return DiseasesName;
    }

    public void setDiseasesName(String DiseasesName) {
        this.DiseasesName = DiseasesName;
    }

    public String getSymptoms() {
        return Symptoms;
    }

    public void setSymptoms(String Symptoms) {
        this.Symptoms = Symptoms;
    }
    
}
