
package tags;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.*;
public class mytagjava  extends TagSupport 
{
    public int number;
    //setter method
    public void setNumber(int number)
    {
        this.number=number;
    }
    @Override
    public int doStartTag() throws JspException 
    {
        try
        {
            JspWriter out=pageContext.getOut();
            /*int length=Integer.parseInt(request.getParameter("unumber"));*/
            /*out.println("<h2>Area of the square is: </h2>"+length*length);*/
            out.println("<h2>Area of the square is: </h2>"+number*number);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return SKIP_BODY ;
    }
}
