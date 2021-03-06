package Main;

public class BinaryTree {
	  Node root;
	  
	  
	  
	  
	  //Agregar elemento
	  private Node addRecursive(Node current, int value) {
		    if (current == null) {
		        return new Node(value);
		    }

		    if (value < current.value) {
		        current.left = addRecursive(current.left, value);
		    } else if (value > current.value) {
		        current.right = addRecursive(current.right, value);
		    } else {
		        // value already exists
		        return current;
		    }

		    return current;
		}
	  
	  
	  public void add(int value) {
		    root = addRecursive(root, value);
		}
	  
	  
	  
	  
	 //Buscar elemento
	  private boolean containsNodeRecursive(Node current, int value) {
		    if (current == null) {
		        return false;
		    } 
		    if (value == current.value) {
		        return true;
		    } 
		    return value < current.value
		      ? containsNodeRecursive(current.left, value)
		      : containsNodeRecursive(current.right, value);
		}
	  
	  public boolean containsNode(int value) {
		    return containsNodeRecursive(root, value);
		}
	  
	  
	  
	  //Borrar elemento
	  private Node deleteRecursive(Node current, int value) {
		    if (current == null) {
		        return null;
		    }

		    if (value == current.value) {
		        // Node to delete found
		        // ... code to delete the node will go here
		    } 
		    if (value < current.value) {
		        current.left = deleteRecursive(current.left, value);
		        return current;
		    }
		    current.right = deleteRecursive(current.right, value);
		    return current;
		}
	  
	  public void delete(int value) {
		    root = deleteRecursive(root, value);
		}
	  
	  
}
