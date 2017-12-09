package Listeners;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.SchoolProgram;
import Utilities.InstitutionsUtil;

/**
 * Servlet implementation class ViewSurveyTypesFromYear
 */
@WebServlet("/ViewSurveyTypesFromYear")
public class ViewSurveyTypesFromYear extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewSurveyTypesFromYear() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int year = Integer.parseInt(request.getParameter("year"));
		String surveyType = request.getParameter("surveyType");
		
		
		InstitutionsUtil instUtil = new InstitutionsUtil();
		ArrayList<SchoolProgram> spList = instUtil.getSurveyTypeForYear(year, surveyType);
		request.setAttribute("spList", spList);
		request.setAttribute("year", year);
		
		request.setAttribute("surveyType", surveyType);
		
		RequestDispatcher rd = request.getRequestDispatcher("surveyTypesInYear.jsp");
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
