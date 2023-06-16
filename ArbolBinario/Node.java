public int getDato() {   //se crea el get para acceder a los datos 
        return dato;  // se retorna el dato
    }
public void setDato(int dato) { // se crea el set para acceder a los datos
        this.dato = dato;  // se le asigna el dato a la clase
    }
//se crea el get y el set de Node para acceder a los datos de la clase
public Node getIzquierdo() {    
        return izquierdo; 
    }
public void setIzquierdo(Node izquierdo) { 
       this.izquierdo = izquierdo; 
    }
 // se crea el get y el set para poder acceder a los datos de la clase
 public Node getDerecho() {  
        return derecho; // se retorna el dato
    }
  public void setDerecho(Node derecho) {  
        this.derecho = derecho; 
    }
 public String toString(){  // toString ayueda a acceder los datos de la clase
        return "Aqui se presenta el preorden, inorden y el posorden   ";
    }
