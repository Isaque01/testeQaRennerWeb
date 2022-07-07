package pages;


import elementos.ElementosTestes;


public class LoginPage {

	MetodosdeTeste page = new MetodosdeTeste();
	ElementosTestes elementos = new ElementosTestes();
	

	public void login() {
		page.escrever(elementos.getEmailaddress(), "isaqueantunes@hotmail.com");
		page.escrever(elementos.getPassword(), "123456");
		page.clicar(elementos.getBotaoSignIn());
	}

}
