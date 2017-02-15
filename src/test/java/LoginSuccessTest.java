import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class LoginSuccessTest {


    @Test
    public void loginwithLDAP() {
        Login login = new Login();
        boolean flag1 = login.checkUsername("somkiat");
        boolean flag2 = login.isExistingInDatabase("somkiat", "password");

        assertTrue( "fsdfsdf", flag1 );
        assertTrue( "sdsdsd", flag2 );
    }

}
