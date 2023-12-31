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
    public Node getRaiz() { //getters y setters de la raiz del arbol binario 
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
      public void inOrden(Node raiz){ 
        if (raiz != null){    // raiz 1= null significa que ya no hay nada que imprimir y se regresa a la raiz 3 y se imprime 2
            inOrden(raiz.izquierdo); //in orden 1 = null se regresa a la raiz 3 y se imprime 3
            System.out.println(raiz.dato);  // in orden 2 = null se regresa a la raiz 3 y se imprime 1
            inOrden(raiz.derecho); 
        }
    }
     public void posOrden(Node raiz){   // 5 3 1 2 8
        if (raiz != null){ // raiz 1= null significa que ya no hay nada que imprimir y se regresa a la raiz 3 y se imprime 2
            posOrden(raiz.izquierdo); //pos orden 1 = null se regresa a la raiz 3 y se imprime 2
            posOrden(raiz.derecho); // pos orden 2 = null se regresa a la raiz 3 y se imprime 3
            System.out.println(raiz.dato);
        }
    }
       public String toString(){
        return raiz.toString(); // return "Aqui se presenta el preorden, inorden y el posorden   ";
    }
        
    }
