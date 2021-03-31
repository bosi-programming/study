public class SistemaInterno {
	public int senha = 2222;
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(senha);
		if (autenticou) {
			System.out.println("Entra no sistema");
		} else {
			System.out.println("Nao foi");
		}
	}
}
