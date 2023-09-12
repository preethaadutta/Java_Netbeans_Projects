package loginbean.model;
import loginbean.dao.loginDAO;
import loginbean.web.loginservlet;
/**
 *
 * @author HP
 */
public class loginB 
{
    private String name;
    private String pwd;
    public String getName() 
    {
        return name;
    }
    public String getPwd() 
    {
        return pwd;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setPwd(String pwd) 
    {
        this.pwd = pwd;
    } 
}
