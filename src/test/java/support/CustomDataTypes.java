package support;

import io.cucumber.java.DataTableType;
import objects.User;
import java.util.Map;

public class CustomDataTypes {

    @DataTableType
    public User userCred(Map<String, String> cred) {
        return new User(cred.get("username"), cred.get("password"));
    }
}
