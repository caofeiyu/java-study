package pk1;

import java.util.Optional;

public record student(Integer id, String name, String email, Integer age) {
    public String concat(){
        return String.format("姓名是%s，年龄是%d",this.name,this.age);
    }
    //email转为大写
    public static String email(String email){
        return Optional.ofNullable(email).orElse("email is null.").toUpperCase();
    }
    //紧凑构造
    public student {
        if(id>1){
            System.out.println("#####");
        }
    }
    //定制构造
    public student(Integer id){
        this(id,null,null,null);
    }
}
