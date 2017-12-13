package Listeners;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utilities.AccreditorUtil;
import Utilities.BoardMembersLocalUtil;
import Utilities.BoardMembersUtil;
import Models.Accreditor;
import Models.BoardMember;

/**
 * Servlet implementation class BoardMembers
 */
@WebServlet("/BoardMembers")
public class BoardMembers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardMembers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BoardMembersUtil bmUtil = new BoardMembersUtil();
		BoardMembersLocalUtil bmlUtil = new BoardMembersLocalUtil();
		ArrayList<BoardMember> bm = new ArrayList<BoardMember>();
		
		if(bmUtil.getDB()!=null)
		{
			bm = bmUtil.getBoardMembers();
			request.setAttribute("boardMembers", bm);
			request.setAttribute("connection", true);
			request.setAttribute("changeCount", bmlUtil.getCountBoardMemberChanges());
			RequestDispatcher rd = request.getRequestDispatcher("boardMembers.jsp");
			rd.forward(request, response);
			
		}
		else
		{
			bm = bmlUtil.getBoardMembers();
			request.setAttribute("boardMembers", bm);
			request.setAttribute("connection", false);
			RequestDispatcher rd = request.getRequestDispatcher("boardMembers.jsp");
			rd.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}