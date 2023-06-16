
public class Main {
    public static void main(String[] args) { //Creación de la clase Main

          Arbol arbol = new Arbol (5) //Creacion del objeto Arbol que inicializa con un valor de 5
          arbol.raiz.izquierdo =new Node (3); // Se crea un objeto Node que tiene como valor 3, del atributo izquierdo, el objeto raiz y la instancia arbol
          arbol.raiz.derecho= new Node (8); // Se crea un objeto Node que tiene como valor 8, del atributo derecho, el objeto raiz y la instancia arbol 
          
         arbol.raiz.izquierdo.izquierdo = new Node(1); // Se creaa un objeto Node que tiene como valor 1, del atributo izquierdo, del objeto izquierdo
                                                        //del objeto raiz y de la instancia arbol 
          arbol.raiz.izquierdo.izquierdo.derecho=new Node(2); //Se crea un objeto Node que tiene como valor , del atributo derecho, del objeto izquierdo
                                                            //del objeto raiz y de la instancia arbol
         
        
    }
