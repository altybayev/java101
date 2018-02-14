public class Contact {
    private String name;
    private String email;
    private String phoneNumber;

    Contact() {
        System.out.println("Новый контакт создан");
    }

    Contact(String name, String email, String phoneNumber) {
        setName(name);
        setEmail(email);
        this.phoneNumber = phoneNumber;
    }

    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Phone number:" + this.phoneNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        if (email.equals("")) {
            System.out.println("Ошибка: электронный адрес не может быть пустым");
            this.email = "email@domain.com";

            return;
        }

        this.email = email;
    }
}
