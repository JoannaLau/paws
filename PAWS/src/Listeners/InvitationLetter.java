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
import Models.Institution;
import Models.Program;
import Utilities.AccreditorUtil;
import Utilities.InstitutionsUtil;
import Utilities.ProgramUtil;

/**
 * Servlet implementation class InvitationLetter
 */
@WebServlet("/InvitationLetter")
public class InvitationLetter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvitationLetter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Accreditor> accreditors = new ArrayList<Accreditor>();
		AccreditorUtil accUtil = new AccreditorUtil();
		accreditors = accUtil.getAccreditorsNameID();
		System.out.print("ito size " + accreditors.size());
		request.setAttribute("accreditors", accreditors);
		
		ArrayList<Institution> inst = new ArrayList<Institution>();
		InstitutionsUtil instUtil = new InstitutionsUtil();
		inst = instUtil.getInstitutionsNameID();
		request.setAttribute("institutions", inst);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("invitationLetter.jsp");
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
