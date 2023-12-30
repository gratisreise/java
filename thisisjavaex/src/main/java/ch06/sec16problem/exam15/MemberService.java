package ch06.sec16problem.exam15;

public class MemberService {
    String id;
    String password;

    boolean login(String id, String password){
        if (id.equals("hong") && password.equals("12345")){
            return true;
        }
        return false;
    }
    void logout(String id){
        System.out.println(id + "님이 로그아웃되었습니다.");
    }

}
