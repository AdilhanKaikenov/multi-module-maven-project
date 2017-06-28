package com.epam.adk.web.servlet;

import com.epam.adk.ejb.dao.MessageDao;
import com.epam.adk.ejb.persistance.Message;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TODO: Comment
 * <p>
 * Created on 6/28/2017.
 *
 * @author Kaikenov Adilkhan
 */
public class Servlet extends HttpServlet {

    @EJB
    private MessageDao messageDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("In the Servlet doGet() method: ");

        Message message = new Message();
        message.setText("Hello World!");

        Message msg = messageDao.submit(message);
        System.out.println("ID: " + msg.getId());

        request.getRequestDispatcher("/WEB-INF/welcome.jsp").forward(request, response);
    }
}
