package Models;

public class GraphNode {
    String data;
    int distancia;
    boolean estaVisitado = false;
    GraphNode abajo;
    GraphNode arriba;
    GraphNode abajoIzquierda;
    GraphNode abajoDerecha;
    GraphNode ArribaIzquierda;
    GraphNode ArribaDerecha;
    boolean estaSeleccionado;
    
    public GraphNode(GraphNode node){
        this.data = node.getData();
        this.abajo = node.getAbajo();
        this.arriba = node.getArriba();
        this.abajoIzquierda = node.getAbajoIzquierda();
        this.abajoDerecha = node.getAbajoDerecha();
        this.ArribaIzquierda = node.getArribaIzquierda();
        this.ArribaDerecha = node.getArribaDerecha();
    }
    
    public GraphNode(String data, boolean isFixedGraphNode){
        this.data = data;
    }

    public GraphNode(String data) {
        this.data = data;
        this.abajo = new GraphNode("null", true);
        this.arriba = new GraphNode("null", true);
        this.abajoIzquierda = new GraphNode("null", true);
        this.abajoDerecha = new GraphNode("null", true);
        this.ArribaIzquierda = new GraphNode("null", true);
        this.ArribaDerecha = new GraphNode("null", true);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public GraphNode getAbajo() {
        return abajo;
    }

    public void setAbajo(GraphNode abajo) {
        this.abajo = abajo;
    }

    public GraphNode getArriba() {
        return arriba;
    }

    public void setArriba(GraphNode arriba) {
        this.arriba = arriba;
    }

    public GraphNode getAbajoIzquierda() {
        return abajoIzquierda;
    }

    public void setAbajoIzquierda(GraphNode abajoIzquierda) {
        this.abajoIzquierda = abajoIzquierda;
    }

    public GraphNode getAbajoDerecha() {
        return abajoDerecha;
    }

    public void setAbajoDerecha(GraphNode abajoDerecha) {
        this.abajoDerecha = abajoDerecha;
    }

    public GraphNode getArribaIzquierda() {
        return ArribaIzquierda;
    }

    public void setArribaIzquierda(GraphNode arribaIzquierda) {
        ArribaIzquierda = arribaIzquierda;
    }

    public GraphNode getArribaDerecha() {
        return ArribaDerecha;
    }

    public void setArribaDerecha(GraphNode arribaDerecha) {
        ArribaDerecha = arribaDerecha;
    }

    public boolean isSeleccionado() {
        return estaSeleccionado;
    }

    public void setEstaSeleccionado(boolean estaSeleccionado) {
        this.estaSeleccionado = estaSeleccionado;
    }

    public boolean isEstaVisitado() {
        return estaVisitado;
    }

    public void setEstaVisitado(boolean estaVisitado) {
        this.estaVisitado = estaVisitado;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}
