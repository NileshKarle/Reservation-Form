package servletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ReservationDetails")
public class ReservationDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");     
		 PrintWriter out=response.getWriter();
		 String title="Finished Reservation";
			String docType="<!doctype html public \"dtd html 4.0 "+"transitional//en\">\n";
			out.println(docType+
					"<html>\n" +
					"<head><title>"+title+"</title></head>\n"+
					"<body bgcolor=\"#645b91\">\n"+
					"<b>Dear </b>:"
					+request.getParameter("gender")+" "+request.getParameter("firstname")+"\n"+
					"<p>you have got a conformation mail on <b>"+request.getParameter("email")+
					"</b> and a message on </b>"+request.getParameter("phone")+
					"</b></p> Enjoy your "+request.getParameter("equipmentRequired")+" from "+
					request.getParameter("checkIn")+" to "+request.getParameter("checkOut")+"<br"+
					"</body></html>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
