
package HospitalManagementSystem;

public class UserMedicine {
    int id;
    String name,power,sdate,edate,time;

    public UserMedicine(int id,String name, String power, String sdate, String edate, String time) {
        this.id=id;
        this.name = name;
        this.power = power;
        this.sdate = sdate;
        this.edate = edate;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getEdate() {
        return edate;
    }

    public void setEdate(String edate) {
        this.edate = edate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
}
