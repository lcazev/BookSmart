package classes;

import java.util.ArrayList;

public class Pedido extends Atividade { 
   // Pedido precisa herdar tamb�m Usu�rio? 
   //Pedido deve ter os dados de quem o fez.
	
	ArrayList<String> pedidos;
	
	public Pedido() {
		// os dados do usu�rio precisam ser passados ao fazer um pedido?
		// o que efetivamente precisa ser informado ao se fazer um pedido?
	}
	
	public void pedeLivro(String titulo) {
		this.pedidos.add(titulo);
	}
}
