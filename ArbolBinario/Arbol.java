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
    }
