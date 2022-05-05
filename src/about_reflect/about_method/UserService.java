package about_reflect.about_method;

public class UserService {
    /**
     *
     * @param name              用户名
     * @param password          密码
     * @return                  登录成功或者失败
     */
    public boolean login(String name,String password){
        if(name.equals("libowen")&&password.equals("123456")){
            return true;
        }else {
            return false;
        }
    }
    public void logout(){
        System.out.println("退出成功");
    }
}
