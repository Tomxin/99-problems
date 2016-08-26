package com.shekhargulati.ninetynine_problems._01_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <b>(**) Eliminate consecutive duplicates of list elements</b>
 * <p>If a list contains repeated elements they should be replaced with a single copy of the element.
 * The order of the elements should not be changed.</p>
 * <p>
 * <pre>
 *     compress(Arrays.asList(a,a,a,a,b,c,c,a,a,d,e,e,e,e))
 *     [a,b,c,d,e]
 * </pre>
 */
public class P08 {

    public static <T> List<T> compress(List<T> list) {
        Objects.requireNonNull(list, "Please make sure list is not null");
        List<T> result = new ArrayList<>();
        T lastElement = null;
        for (T e : list) {
            // todo there were a logic bug,when add a element to result list.
            // run the code whth the comment's elemets get the result [a, b, c, a, d, e]
            if (!Objects.equals(lastElement, e)) {
                result.add(e);
            }
            lastElement = e;
        }
        return result;
    }

}
