package Item_26.Example_03;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (24.11.2025)
 */
public class ExampleApp {
    public static void main(String[] args) {
        /**
         * Bad Example
         */

        Map requestParams = getRequestParameters(); // raw Map

        String userId = (String) requestParams.get("userId");  // Can be not a String !
        Integer count = (Integer) requestParams.get("count");  // Can be a String!
    }

    /**
     * Good example
     */

    Map<String, String> requestParams = getRequestParameters();
    // Now it is guaranteed that the values are strings.

    String userId = requestParams.get("userId");
    String countStr = requestParams.get("count");


    // Plug
    private static Map getRequestParameters() {
        return null;
    }
}
