package no.mesan.interop;

import scala.Tuple2;

public class JPerson {
    private String firstname;
    private String lastname;

    public JPerson(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    
    public String firstname() {
        return firstname;
    }
    public void firstname_$eq(String firstname) {
        this.firstname = firstname;
    }

    public Tuple2<String, String> navn() {
        return new Tuple2(firstname, lastname);
    }
}
