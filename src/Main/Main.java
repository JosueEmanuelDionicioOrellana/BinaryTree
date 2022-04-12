package Main;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		BinaryTree bt = new BinaryTree();
		
		boolean informacion = true;
		
		//Agregamos elementos
		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);

		//Buscar
	    informacion = (bt.containsNode(9));
	    informacion = (bt.containsNode(4));
	    informacion = (bt.containsNode(3));

	    //primera validacion
	    System.out.println(informacion);
	    
	    
	    //eliminar
	   
	    bt.delete(9);
	    
	    informacion = (bt.containsNode(9));
	    //Segunda validacion
	    System.out.println(informacion);
	}

}
