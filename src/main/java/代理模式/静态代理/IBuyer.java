package 代理模式.静态代理;
/**
 * @Desc 购票统一接口
 * @Author chaozhou
 */
public interface IBuyer {
    /**
     * 购票登录接口
     * @param username 用户名
     * @param password 密码
     */
    void login(String username,String password);
    /*
    * 模拟购票
    * */
    void buyTickeet();
}
