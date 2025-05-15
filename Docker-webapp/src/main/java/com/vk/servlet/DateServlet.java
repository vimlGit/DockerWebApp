package com.vk.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.xml.crypto.Data;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/dateurl")
public class DateServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter
		PrintWriter pw = res.getWriter();
		//set response type
		res.setContentType("text/html");
		
		//business logic
		Date date = new Date();
		//response
		pw.println("<h1> Date and Time::"+date+"</h1>");
		
		//close the stream
		pw.close();
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}

}
