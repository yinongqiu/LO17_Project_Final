import Normalisation.Lexique;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class LanceRequete extends HttpServlet {
	private static String username = "lo17xxx";
	private static String password = "dblo17";
	private static String url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
	String nom;
	int nbre;

	private void addHtmlHeader(PrintWriter out){
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\">\n" +
				"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
				"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
				"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n" +
				"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\t\n" +
				"<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n" +
				"");
		out.println("</head>");
		out.println("<body>");
	}

	private void addHtmlFooter(PrintWriter out){
		out.println(
				"</table>"+
				"</div>" +
				"</div>"+
				"</div>");
		out.println("</body>");
		out.println("</html>");
	}


	public void addLog(PrintWriter out){
		out.println("<div class=\"d-flex flex-column flex-md-row w-100 justify-content-around\">" +
				"<div class=\"col-md-5 mt-2\">" +
				"<div class=\"card mb-4 shadow-sm text-center\">" +
				"<div class=\"card-header d-flex flex-row justify-content-center\">" +
				"<h4 class=\"my-0 font-weight-normal text-align-center\">Logs</h4>" +
				"<form action=\"LanceRequete\"><button type=\"submit\" name=\"clear\" value=\"true\" class=\"btn btn-lg btn-light ml-auto\"><i class=\"fas fa-trash\"></i></button></form>"+
				"</div>" +
				"<div class=\"card-body\">"+
				"<div class=\"table-responsive\">" +
				"<table class=\"table table-striped table-sm table-hover\"><tbody>");

	}

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
	ArrayList<Integer> param=Application.getParam();
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	addHtmlHeader(out);
	addLog(out);
	int par;
	String clear;

	try{
		if (request.getParameter("requete")!=null){
			Application.setRequete(request.getParameter("requete"));
			Application.initParam();
		}
	}
	catch (Exception e){}
	try{
		par= Integer.parseInt(request.getParameter("option"));
		Application.addToParam(par);
	}
	catch (Exception e){}
		try{
			clear= request.getParameter("clear");
			if (clear.equals("true")){
				Application.clearLog();
			}
		}
		catch (Exception e){}
	String requete=Application.getRequete();
	requete = Application.run(requete,param);
	ArrayList<String> log=Application.getLog();

	for (String l : log){
		out.println("<tr><td>"+l+"</td></tr>");
	}
	out.println("</tbody></table>"+"</div>"+"</div>\n" +
			"</div> \n" +
			"</div>");
	out.println("<div class=\"col-md-7 mt-2\"><div class=\"card mb-4 shadow-sm text-center\">\n" +
				"      <div class=\"card-header\">" +
				"        <h4 class=\"my-0 font-weight-normal text-align-center\">Résultats</h4>\n" +
				"      </div>" +
				"      <div class=\"card-body\">" +
				"        <div class=\"table-responsive\">" +
				"        <table class=\"table table-striped table-sm text-center table-hover\">"
	);
	processRequest(requete,out);
	addHtmlFooter(out);
	}

	private void processRequest(String requete, PrintWriter out){
		if (requete != null && !requete.isEmpty()) {
			// INSTALL/load the Driver (Vendor specific Code)
			try {
				Class.forName("org.postgresql.Driver");
			} catch(ClassNotFoundException e) {
				System.err.print("ClassNotFoundException: ");
				System.err.println(e.getMessage());
			}
			try {
				Connection con;
				Statement stmt;
				// Establish Connection to the database at URL with usename and password
				con = DriverManager.getConnection(url, username, password);
				stmt = con.createStatement();
				// Send the query and bind to the result set
				ResultSet rs = stmt.executeQuery(requete);
				ResultSetMetaData rsmd=rs.getMetaData();
				nbre=rsmd.getColumnCount();
				ArrayList<String> columnNames = new ArrayList<>();
				out.println("<thead class=\"thead-dark\"><tr>");
				for (int i = 1; i <= nbre; i++) {
					out.println("<th>"+rsmd.getColumnName(i)+"</th>");
				}
				out.println("</tr></thead>");
				while (rs.next()) {
					out.print("<tr>");
					for (int i=1; i<=nbre;i++){
						nom = rsmd.getColumnName(i);
						String s = rs.getString(nom);
						if (nom.equals("fichier")){
							out.print("<td><a href=\"/LO17_TomcatServer_war_exploded/OLD_BULLETINS_LO17/"+s+"\">"+s+"</a></td>");
						}
						else{
							out.print("<td>"+s+"</td>");
						}
					}
					out.print("</tr>");

				}
				// Close resources
				stmt.close();
				con.close();
			}
			// print out decent erreur messages
			catch(SQLException ex) {
				out.println("==> SQLException: ");
				while (ex != null) {
					out.println("Message:   " + ex.getMessage ());
					out.println("SQLState:  " + ex.getSQLState ());
					out.println("ErrorCode: " + ex.getErrorCode ());
					ex = ex.getNextException();
					out.println("");
				}
			}

		}
		else{
			ArrayList optionList= Lexique.getOptionList();
			if (Lexique.getAmbigWord()==null){
				return;
			}
			printOptionList(out);


		}
	}

	private void printOptionList(PrintWriter out){
		ArrayList<String> optionList=Lexique.getOptionList();
		String ambigWord=Lexique.getAmbigWord();
		out.println("<form action=\"LanceRequete\">" +
				"<div class=\"alert alert-warning alert-dismissible fade show\" role=\"alert\">\n" +
				"<strong>  On a trouvé quelques mots similaires de mot \""+ambigWord+"\" pour vous. Veuillez choisir un mot de la liste ci-dessous.</strong>\n" +
				"<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n" +
				"<span aria-hidden=\"true\">&times;</span>\n" +
				"</button>\n" +
				"</div>\n" +
				"<div class=\"btn-group-vertical w-100 px-3\" role=\"group\" aria-label=\"Basic example\">\n"
		);
		out.println("<button type=\"submit\" class=\"btn btn-dark\" name=option value=\"0\">"+ambigWord+"</button>");
		int i=1;
		for (String s:optionList
			 ) {
			out.println("<button type=\"submit\" class=\"btn btn-secondary\" name=option value=\""+i+"\">"+s+"</button>\n");
			i++;
		}
		out.println("</div>\n" +
				"</form>\n"
		);
		Lexique.initAmbigWord();
		Lexique.initOptionList();

	}


}
