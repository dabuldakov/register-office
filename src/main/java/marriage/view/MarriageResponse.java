package marriage.view;

import marriage.domain.MarriageCertificate;

import java.io.Serializable;

public class MarriageResponse implements Serializable {


    private String name;
    private String number;
    private MarriageCertificate marriageCertificate;


    public MarriageResponse(String name, String number, MarriageCertificate marriageCertificate) {
        this.name = name;
        this.number = number;
        this.marriageCertificate = marriageCertificate;
    }

    public MarriageResponse() {
    }

    public MarriageCertificate getMarriageCertificate() {
        return marriageCertificate;
    }

    public void setMarriageCertificate(MarriageCertificate marriageCertificate) {
        this.marriageCertificate = marriageCertificate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
