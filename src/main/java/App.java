import service.PersonService;

public class App {

    private final static PersonService personService = new PersonService();

    public static void main(String... args) {

        var res = personService.findPersonByAge(25);
        System.out.println(res.getName());
    }
}
