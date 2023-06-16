public class Arbol {
    public Node raiz;
    //constructor
    public Arbol(int dato){  //Crea un nuevo nodo con el valor proporcionado: Node nuevo = new Node(dato);.
        this.raiz=new Node(dato);  //Crea una referencia auxiliar aux y la inicializa con la raíz del árbol: Node aux = raiz;.
        public void agregarDato(int dato){
        Node nuevo = new Node(dato);
        Node aux = raiz; //Crea una referencia padre que inicialmente apunta a null.
        Node padre;
        while (true){
            padre = aux;
            if (dato<aux.dato){
                aux = aux.izquierdo;
                if (aux == null){
                    padre.izquierdo = nuevo;
                    return;
                }
            }else{
                aux = aux.derecho;
                if (aux == null){
                    padre.derecho = nuevo;
                    return;
                }
            }
        }
    }
    public Node getRaiz() {
        return raiz;
    }

    public void setRaiz(Node raiz) {
        this.raiz = raiz;
    }
     public void preOrden(Node raiz){
        if (raiz != null){ // raiz 1= null significa que ya no hay nada que imprimir y se regresa a la raiz 3 y se imprime 2
            System.out.println(raiz.dato); // pre orden 1 = null se regresa a la raiz 3 y se imprime 1
            preOrden(raiz.izquierdo);
            preOrden(raiz.derecho);
        }
    } 
      public void inOrden(Node raiz){  // raiz 1= null significa que ya no hay nada que imprimir y se regresa a la raiz 3 y se imprime 2
        if (raiz != null){ 
            inOrden(raiz.izquierdo); 
            System.out.println(raiz.dato); 
            inOrden(raiz.derecho);
        }
    }
     public void posOrden(Node raiz){  
        if (raiz != null){ 
            posOrden(raiz.izquierdo); 
            posOrden(raiz.derecho); 
            System.out.println(raiz.dato);
        }
    }
       public String toString(){
        return raiz.toString(); // return "Aqui se presenta el preorden, inorden y el posorden   ";
    }
        
    }
