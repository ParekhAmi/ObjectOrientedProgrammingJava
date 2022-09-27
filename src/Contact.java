
//--------------------------Compiletime Polymorphism----------------

public class Contact {

    private String name, email;
    private PhoneNumber phonenumber;

    public Contact(String n, PhoneNumber p, String e) {
        this.name = n;
        this.phonenumber = p;
        this.email = e;
    }

    public Contact(String nm, PhoneNumber ph) {
        this.name = nm;
        this.phonenumber = ph;
    }

    public Contact(String nm, String em) {
        this.name = nm;
        this.email = em;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phonenumber=" + phonenumber +
                ", email='" + email + '\'' +
                '}';
    }

}
