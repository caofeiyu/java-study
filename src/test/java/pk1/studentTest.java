package pk1;

import org.junit.Test;

public class studentTest {
    @Test
    public void name() {
        student l = new student(1001,"cfy","12231231",20);
        Integer id = l.id();
        String name = l.name();
        String email = l.email("cfy@165.com");
        System.out.println(l);
        System.out.println(id+name+"    "+email);
        student q = new student(1002,"cfy","111131231",26);
    }

    @Test
    public void test02() {
        student q = new student(1002,"cfy","cfy@163.com",26);
        String concat = q.concat();
        System.out.println(concat);
    }

    @Test
    public void test03() {
        String email = student.email("cfy@165.com");
        System.out.println(email);
        student s = new student(1111);
        System.out.println(s);
    }
}