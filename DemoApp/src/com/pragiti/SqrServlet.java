package com.pragiti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqrServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int k = (int)req.getAttribute("k");
		
		k=k*k;
		
		PrintWriter obj= res.getWriter();
		obj.println("Square of addition result is " + k);
	}

}
