import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class LanceRequete extends HttpServlet {
	String username;
	String password;
	String url;
	String requete ="";
	String nom;
	int nbre;
	ArrayList<String> log=new ArrayList<>();

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
				"<div class=\"card-header\">" +
				"<h4 class=\"my-0 font-weight-normal text-align-center\">Logs</h4>" +
				"</div>" +
				"<div class=\"card-body\">"+
				"<div class=\"table-responsive\">" +
				"<table class=\"table table-striped table-sm table-hover\"><tbody>");

	}

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	addHtmlHeader(out);


	// ---- configure START
	username = "lo17xxx";
	password = "dblo17";
	// The URL that will connect to TECFA's MySQL server
        // Syntax: jdbc:TYPE:machine:port/DB_NAME
        url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
	// dans certaines configurations locales il faut d�finir l'url par :
	// url = "jdbc:postgresql://tuxa.sme.utc
	// ---- configure END

	String requete;
	addLog(out);
	requete = request.getParameter("requete");
	requete = Application.run(requete);
	ArrayList<String> log=Application.getLog();
	Collections.reverse(log);
	for (String l : log){
		out.println("<tr><td>"+l+"</td></tr>");
	}
	out.println("</tbody></table>"+"</div>"+"</div>\n" +
			"\t</div> \n" +
			"\t</div>");
	out.println("<div class=\"col-md-7 mt-2\"><div class=\"card mb-4 shadow-sm text-center\">\n" +
				"      <div class=\"card-header\">\n" +
				"        <h4 class=\"my-0 font-weight-normal text-align-center\">Résultats</h4>\n" +
				"      </div>\n" +
				"      <div class=\"card-body\">\n" +
				"        <div class=\"table-responsive\">\n" +
				"        <table class=\"table table-striped table-sm text-center table-hover\">"
	);
	if (requete != null) {
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
				out.print("<td>"+s+"</td>");
				}
				out.print("</tr>");

			}
		// Close resources
		stmt.close();
		con.close();
		}
		// print out decent erreur messages
		catch(SQLException ex) {
			System.err.println("==> SQLException: ");
			while (ex != null) {
				System.out.println("Message:   " + ex.getMessage ());
				System.out.println("SQLState:  " + ex.getSQLState ());
				System.out.println("ErrorCode: " + ex.getErrorCode ());
				ex = ex.getNextException();
				System.out.println("");
			}
		}

	}
	addHtmlFooter(out);
	}



}
