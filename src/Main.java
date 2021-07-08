import java.sql.Connection;

import db.DB;

public class Main {

	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();
		DB.closeConnection();
		
		// autoIngrement e notNull 1 true 0 false;
		ScriptDB scpt = new ScriptDB();
		scpt.setNome("codigo");
		scpt.setTipo("INT");
		
		
		
		System.out.println(scpt.CriarScript(scpt.getNome(), scpt.getTipo(), 1, 1));
		
		
	}

}
