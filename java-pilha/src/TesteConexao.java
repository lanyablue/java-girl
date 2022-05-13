
public class TesteConexao {

	public static void main(String[] args) {

		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("quebrou a conexao meu amor ");
		}
		
		
		
		
		
		//-------------------------------------------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex){
//			System.out.println("quebrou a conexao meu amor ");
//		} finally {
//			System.out.println("finally");
//			if(con != null) {
//				con.close();
//			}
//		}
		
	}
}
