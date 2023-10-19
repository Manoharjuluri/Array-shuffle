package manoharproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problems {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6};

        Collections.shuffle(Arrays.asList(array));

        System.out.println(Arrays.asList(array));
    }
}
