
/**
 *  Clase para probar el resto de clases
 *  
 */
public class TestPedido
{
    private Pedido pedido1; 
    private Pedido pedido2; 

    /**
     * Constructor  
     */
    public TestPedido()    {
        // crear pedido1
        
	   
	   
	   

        // crear pedido2
        

    }

    /**
     * Muestra la información de los dos pedidos (ver enunciado)
     */
    public void mostrarPedidos() {
        System.out.println("Pedido 1");
        System.out.println("----------------------------");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println("FECHA PEDIDO: 4/9/2019");
        System.out.println("NOMBRE: Juan Soto ");
        System.out.println("DIRECCIÓN: Avda. Pio XII");
        System.out.println("CIUDAD: Pamplona ");
        System.out.println("PROVINCIA: Navarra");
        System.out.println("\n");
        System.out.println("**** Artículos en el pedido ****");
        System.out.println("\n");
        System.out.println("Rotulador fosforescente |  6,70€ unidad |  20 unidades");
        System.out.println("Memoria USB 64GB|  14,80€ unidad |  10 unidades");
        System.out.println("\n");
        System.out.println("**** A pagar ****");
        System.out.println("\n");
        System.out.println("IMPORTE SIN IVA:   282,00€");
        System.out.println("IVA:   59,22€");
        System.out.println("IMPORTE TOTAL:   341,22€");

        
        System.out.println("Pedido 2");
        System.out.println("----------------------------");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println("FECHA PEDIDO: 8/10/2019");
        System.out.println("NOMBRE: Elisa Nuin ");
        System.out.println("DIRECCIÓN: C/ Río Alzania 7");
        System.out.println("CIUDAD: Pamplona ");
        System.out.println("PROVINCIA: Navarra");
        System.out.println("\n");
        System.out.println("**** Artículos en el pedido ****");
        System.out.println("\n");
        System.out.println("Sacapuntas manual |  16,64€ unidad |  8 unidades");
        System.out.println("Corrector tippex |  5,99€ unidad |  20 unidades");
        System.out.println("\n");
        System.out.println("**** A pagar ****");
        System.out.println("\n");
        System.out.println("IMPORTE SIN IVA:   252,92€");
        System.out.println("IVA:   53,11€");
        System.out.println("IMPORTE TOTAL:   306,03€");
        System.out.println("\n");
        System.out.println("El pedido 1 se ha realizado antes que el pedido 2");
    }
}
