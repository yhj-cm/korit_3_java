package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
class User {
    private String password;
    private String email;
    private String name;
    private String age;
}
public class JSON2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        //사용할 변수 선언 -> Json 데이터는 자료형이 String입니다.
        String userJson = null;

        User user1 =  new User("9876","a@test.com","김일","20");
        System.out.println(gson.toJson(user1));
        //객체 그대로 출력하면
        System.out.println("Java 객체형태로 출력 : " + user1);




    }
}

