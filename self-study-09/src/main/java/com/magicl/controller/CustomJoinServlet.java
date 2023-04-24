package com.magicl.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.magic.dao.EmployeesDAO;
import com.magic.dto.EmployeesVO;

/**
 * Servlet implementation class CustomJoinServlet
 */
@WebServlet("/custom.do")
public class CustomJoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		EmployeesVO emp=(EmployeesVO) session.getAttribute("loginUser");
		Integer result=(Integer) session.getAttribute("result");
		if(emp != null && result == 2) {
			String url = "customjoin.jsp";
			
			RequestDispatcher rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
		} else {
			response.sendRedirect("login.do"); 
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		EmployeesVO member = new EmployeesVO();
		member.setId(request.getParameter("id"));
		member.setPass(request.getParameter("pwd"));
		member.setName(request.getParameter("name"));
		member.setLev(request.getParameter("lev"));
		member.setGender(Integer.parseInt(request.getParameter("gender")));
		member.setPhone(request.getParameter("phone"));
		
		EmployeesDAO memberDAO = EmployeesDAO.getInstance();
		memberDAO.insertMember(member);
		
		request.setAttribute("member", member);
		request.setAttribute("message", "회원등록에 성공했습니다.");
		String url = "joinsuccess.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
}
