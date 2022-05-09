
// contrato Autenticavel 
	// quem assina esse contato precisa implementar:
		// método setsenha
		// método autentica

public abstract interface Autenticavel {

	
	
	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
