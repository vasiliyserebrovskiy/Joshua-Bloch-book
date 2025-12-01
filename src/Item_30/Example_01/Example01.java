package Item_30.Example_01;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (01.12.2025)
 */
public class Example01 {
    //Uses raw types - unacceptable! (Item 26)
    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }
    /** We have here rwo warnings
     * 1 Unchecked call to 'HashSet(Collection<? extends E>)' as a member of raw type 'java.util.HashSet'
     * 2 Unchecked call to 'addAll(Collection<? extends E>)' as a member of raw type 'java.util.Set'
     */
}
