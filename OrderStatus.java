package entities.enums;

//Declaração da enumeração OrderStatus.
public enum OrderStatus {
	
 // Possíveis status de um pedido.
 
	PENDING_PAYMENT, // Pedido aguardando pagamento.
	PROCESSING, // Pedido em processamento.
	SHIPPED, // Pedido enviado.
	DELIVERED; // Pedido entregue.
}	