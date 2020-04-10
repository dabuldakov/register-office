package marriage.view;

import java.io.Serializable;
import java.time.LocalDate;

public class MarriageRequest implements Serializable {

    private String husbandSurname;
    private String husbandGivenname;
    private String husbandPatronimyc;
    private LocalDate husbandBirthDate;
    private String husbandPassportSeria;
    private String husbandPassportNumber;
    private LocalDate husbandIssueDate;
    private String wifeSurname;
    private String wifeGivenname;
    private String wifePatronimyc;
    private LocalDate wifeBirthDate;
    private String wifePassportSeria;
    private String wifePassportNumber;
    private LocalDate wifeIssueDate;

    private String marriageCertificateNumber;
    private LocalDate marriageCertificateDate;

    public MarriageRequest(String certNumber) {
        this.marriageCertificateNumber = certNumber;
    }

    public MarriageRequest() {
    }

    public String getHusbandSurname() {
        return husbandSurname;
    }

    public void setHusbandSurname(String husbandSurname) {
        this.husbandSurname = husbandSurname;
    }

    public String getHusbandGivenname() {
        return husbandGivenname;
    }

    public void setHusbandGivenname(String husbandGivenname) {
        this.husbandGivenname = husbandGivenname;
    }

    public String getHusbandPatronimyc() {
        return husbandPatronimyc;
    }

    public void setHusbandPatronimyc(String husbandPatronimyc) {
        this.husbandPatronimyc = husbandPatronimyc;
    }

    public LocalDate getHusbandBirthDate() {
        return husbandBirthDate;
    }

    public void setHusbandBirthDate(LocalDate husbandBirthDate) {
        this.husbandBirthDate = husbandBirthDate;
    }

    public String getHusbandPassportSeria() {
        return husbandPassportSeria;
    }

    public void setHusbandPassportSeria(String husbandPassportSeria) {
        this.husbandPassportSeria = husbandPassportSeria;
    }

    public String getHusbandPassportNumber() {
        return husbandPassportNumber;
    }

    public void setHusbandPassportNumber(String husbandPassportNumber) {
        this.husbandPassportNumber = husbandPassportNumber;
    }

    public LocalDate getHusbandIssueDate() {
        return husbandIssueDate;
    }

    public void setHusbandIssueDate(LocalDate husbandIssueDate) {
        this.husbandIssueDate = husbandIssueDate;
    }

    public String getWifeSurname() {
        return wifeSurname;
    }

    public void setWifeSurname(String wifeSurname) {
        this.wifeSurname = wifeSurname;
    }

    public String getWifeGivenname() {
        return wifeGivenname;
    }

    public void setWifeGivenname(String wifeGivenname) {
        this.wifeGivenname = wifeGivenname;
    }

    public String getWifePatronimyc() {
        return wifePatronimyc;
    }

    public void setWifePatronimyc(String wifePatronimyc) {
        this.wifePatronimyc = wifePatronimyc;
    }

    public LocalDate getWifeBirthDate() {
        return wifeBirthDate;
    }

    public void setWifeBirthDate(LocalDate wifeBirthDate) {
        this.wifeBirthDate = wifeBirthDate;
    }

    public String getWifePassportSeria() {
        return wifePassportSeria;
    }

    public void setWifePassportSeria(String wifePassportSeria) {
        this.wifePassportSeria = wifePassportSeria;
    }

    public String getWifePassportNumber() {
        return wifePassportNumber;
    }

    public void setWifePassportNumber(String wifePassportNumber) {
        this.wifePassportNumber = wifePassportNumber;
    }

    public LocalDate getWifeIssueDate() {
        return wifeIssueDate;
    }

    public void setWifeIssueDate(LocalDate wifeIssueDate) {
        this.wifeIssueDate = wifeIssueDate;
    }

    public String getMarriageCertificateNumber() {
        return marriageCertificateNumber;
    }

    public void setMarriageCertificateNumber(String marriageCertificateNumber) {
        this.marriageCertificateNumber = marriageCertificateNumber;
    }

    public LocalDate getMarriageCertificateDate() {
        return marriageCertificateDate;
    }

    public void setMarriageCertificateDate(LocalDate marriageCertificateDate) {
        this.marriageCertificateDate = marriageCertificateDate;
    }
}
