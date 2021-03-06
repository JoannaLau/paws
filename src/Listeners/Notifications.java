package Listeners;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Accreditor;
import Models.Notification;
import Utilities.AccreditorUtil;
import Utilities.NotificationUtil;

/**
 * Servlet implementation class NotificationsLoader
 */
@WebServlet("/Notifications")
public class Notifications extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Notifications() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Notification> all = new ArrayList<Notification>();
		ArrayList<Notification> awards = new ArrayList<Notification>();
		ArrayList<Notification> expirations = new ArrayList<Notification>();
		ArrayList<Notification> unconfirmedSurveys = new ArrayList<Notification>();
		NotificationUtil notifUtil = new NotificationUtil();
		all = notifUtil.getAllNotifications();
		awards = notifUtil.getAwardNotifications();
		expirations = notifUtil.getExpirationNotifications();
		unconfirmedSurveys = notifUtil.getUnconfirmedNotifications();
		request.setAttribute("all", all);
		request.setAttribute("awards", awards);
		request.setAttribute("expirations", expirations);
		request.setAttribute("unconfirmedSurveys", unconfirmedSurveys);
		RequestDispatcher rd = request.getRequestDispatcher("notifications.jsp");
		rd.forward(request, response);
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
