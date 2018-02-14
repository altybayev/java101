public class HelloWorld {

    public static void main(String args[]) {

        // 1st contact
        Contact myContact = new Contact("Sanzhar", "s.altybayev@gmail.com", "+7 778 111 5323");
        myContact.print();

        // divider
        System.out.println("----------");

        myContact.setName("Sultan");
        myContact.setEmail("sultan@mail.kz");
        myContact.print();
    }

}
