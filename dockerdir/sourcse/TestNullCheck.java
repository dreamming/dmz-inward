package net.frontnode.openapi;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmz on 2016/10/28.
 */
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }
}
public class TestNullCheck {
    public static void main(String[] args) {
//        Person person = null;
//        System.out.println(null == person.getName());
        new Person().setName(null);

        List<String> temp = new ArrayList<>();
        for (String str : temp) {
            System.out.println(str);
        }
        Integer integer = null;
        System.out.println(Integer.valueOf(200).equals(integer));

        System.out.println(BigDecimal.valueOf(1.001));

    }
}
