package JD2_Messenger.contoller.servlet.api;


import JD2_Messenger.core.DTO.DTOUser;
import JD2_Messenger.service.IService.IUserService;
import JD2_Messenger.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "UserServletRegistration", urlPatterns = "/user")
public class UserServletRegistration extends HttpServlet {

    private IUserService service = UserService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        req.getRequestDispatcher("views/UserServletRegistration.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            DTOUser dtoUser = new DTOUser(
                    req.getParameter("login"),
                    req.getParameter("password"),
                    req.getParameter("fio"),
                    LocalDate.parse(req.getParameter("birthday"), DateTimeFormatter.ISO_LOCAL_DATE)
            );
            service.validate(dtoUser);
        }catch (NumberFormatException e){}




    }


}
