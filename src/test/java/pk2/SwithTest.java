package pk2;

import org.junit.Test;
import pk1.Line;
import pk1.student;



public class SwithTest {
    @Test
    public  void test01(){
        int w = 71;
        String m;//表示结果
        switch (w){
            case 1 -> m = "ok";
            case 2,3,4,5,6,7 -> m = "no";
            default -> throw  new RuntimeException("无效");
        }
        System.out.println(m);
    }
    @Test
    public  void test02(){
        int w = 71;
        String m = switch (w){
            case 1: yield "aaa";
            case 2: yield "era";
            case 6: yield "a";
            default:yield "ccc";
        };
        System.out.println(m);
    }
    @Test
    public  void test03(){
        int w = 1;
        String m = switch (w){
            case 1 ->{
                System.out.println("qqqq");
                yield "cfy";
            }
            default-> {yield "ccc";}
        };
        System.out.println(m);
    }
    @Test
    public  void test04(){
        student s = new student(1001,null,null,null);
        Line l = new Line(1,2);
        Object w = l;
        switch (w){
            case Line(int x,int y) ->{
                System.out.println(x+y);
            }
            case student(Integer id, String name, String email, Integer age) ->{
                System.out.println(id);
            }
            default -> System.out.println("a");
        }

    }
    @Test
    public  void test05(){
        String s1 = """
	        hello
	        hi
            lisi
        """;

    }
}
