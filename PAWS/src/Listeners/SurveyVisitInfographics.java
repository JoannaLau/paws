package Listeners;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Infographic;
import Utilities.InfographicsUtil;

/**
 * Servlet implementation class SurveyVisitInfographics
 */
@WebServlet("/SurveyVisitInfographics")
public class SurveyVisitInfographics extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SurveyVisitInfographics() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		
		InfographicsUtil ins = new InfographicsUtil();
		


		int endYear = 0;
		int startYear = 0;

		
		

		
		System.out.println(request.getParameter("yearStartSelect"));
		
		
		if(request.getParameter("yearStartSelect")!=null) {
		startYear = Integer.parseInt(request.getParameter("yearStartSelect"));
		endYear=  Integer.parseInt(request.getParameter("yearEndSelect"));
		}
		
		else {
			endYear = Calendar.getInstance().get(Calendar.YEAR);
			startYear = endYear-5;
		}
	
		ArrayList<Infographic> infList = new ArrayList<Infographic>();
	
		
		
		int n;
		
		for(n=startYear; n<=endYear; n++){
			
			Infographic inf = new Infographic(n, ins.getSurveyVisitCount(1, n), ins.getSurveyVisitCount(2, n), ins.getSurveyVisitCount(3, n), ins.getSurveyVisitCount(4, n), ins.getSurveyVisitCount(5, n), ins.getSurveyVisitCount(6, n), ins.getSurveyVisitCount(7, n) );
			
			infList.add(inf);
			
			
		}
		
		request.setAttribute("surveyCountList", infList);
		RequestDispatcher rd = request.getRequestDispatcher("surveyVisitInfographics.jsp");
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
