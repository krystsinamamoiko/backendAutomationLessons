import org.testng.Assert;
import org.testng.annotations.*;

public class PersonTest {

    private Person person;

    @BeforeClass
    public void initPerson() {
        person = new Person("Петя", "Иванов", 25);
        System.out.println("@BeforeClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod");
    }

    @Test
    public void testPersonFirstName() {
        System.out.println(person.getFirstName());
        System.out.println("!!!!testPersonFirstName");
        Assert.assertNotNull(person);
        Assert.assertEquals(person.getFirstName(), "Петя");
        Person personNew = new Person("Петя", "Иванов", 25);
        Assert.assertEquals(personNew, person);
    }

    @DataProvider(name = "testData")
    public Object[][] getData() {
        return new Object[][] {
            {"user1", "password1"},
            {"user2", "password2"}
        };
    }

    @Test(dataProvider = "testData")
    //@Parameters({"email", "password"})
    public void loginTest(String email, @Optional(value = "a1111111") String password) {
        System.out.println(String.format(" Залогинился пользователь с email %s и паролем %s", email, password));
    }

    @Test
    public void testPersonLastName() {
        System.out.println(person.getLastName());
        System.out.println("testPeronLastName");
    }

    @Test
    public void testPersonAge() {
        System.out.println(person.getAge());
        System.out.println("testPeronAge");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod");
    }

    @AfterClass
    public void deInitPerson() {
        person = null;
        System.out.println("@AfterClass");
    }
}
