public class Person {

    private String name;
    private String officeAreaCode;
    private String officeNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return "(" + officeAreaCode + ") " + officeNumber;
    }
}

