import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person();
        person.setName("Jim");
        person.setOfficeAreaCode("028");
        person.setOfficeNumber("1234567");
    }

    @Test
    public void should_get_name() throws Exception {
        assertThat(person.getName(), is("Jim"));
    }

    @Test
    public void should_get_telephone_number() throws Exception {
        assertThat(person.getTelephoneNumber(), is("(028) 1234567"));
    }
}
