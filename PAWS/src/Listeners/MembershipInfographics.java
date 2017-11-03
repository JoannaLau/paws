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
import Models.ProgramInfographic;
import Utilities.InfographicsUtil;
import Utilities.InstitutionsUtil;

/**
 * Servlet implementation class MembershipInfographics
 */
@WebServlet("/MembershipInfographics")
public class MembershipInfographics extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MembershipInfographics() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

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
			
			Infographic inf = new Infographic(n, ins.getInstitutionCountByLevelAndYear(1, n, "Active"),ins.getInstitutionCountByLevelAndYear(2, n, "Active"),ins.getInstitutionCountByLevelAndYear(3, n, "Active"),ins.getInstitutionCountByLevelAndYear(4, n, "Active"),ins.getInstitutionCountByLevelAndYear(5, n, "Active"),ins.getInstitutionCountByLevelAndYear(6, n, "Active"),ins.getInstitutionCountByLevelAndYear(7, n, "Active"));
			
			infList.add(inf);
			
		}
		
		
		
		ArrayList<ProgramInfographic> proInfList = new ArrayList<ProgramInfographic>();
	
		n=0;
	
		for(n=startYear; n<=endYear; n++){
			
			
			ProgramInfographic p = new ProgramInfographic(n, ins.getInstitutionPragramCount(4, n, "Active"), ins.getInstitutionPragramCount(5, n, "Active"));
			
			proInfList.add(p);
			
		}
		
		
		request.setAttribute("programsCountList", proInfList);
		request.setAttribute("membersCountList", infList);
		RequestDispatcher rd = request.getRequestDispatcher("membershipInfographics.jsp");
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
