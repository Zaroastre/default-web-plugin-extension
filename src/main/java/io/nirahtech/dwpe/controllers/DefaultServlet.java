package io.nirahtech.dwpe.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.nirahtech.dwpe.DefaultPlugin;
import io.nirahtech.waphs.ApiHttpServlet;
import io.nirahtech.waphs.Extension;

@Extension
public class DefaultServlet extends ApiHttpServlet {
	
	private String path = "/an/url/to/write/in/browser";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println("{ \"default\": \"" + DefaultPlugin.class.getSimpleName() + "\"}");
	}
	
	@Override
	public String getPath() {
		return path;
	}

}