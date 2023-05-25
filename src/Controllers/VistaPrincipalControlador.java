
package Controllers;

import Models.Graph;
import Models.GraphNode;
import Views.VistaPrincipal;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;

public class VistaPrincipalControlador implements ActionListener{
    private VistaPrincipal vistaPrincipal = new VistaPrincipal();
    private Border blackline = BorderFactory.createLineBorder(Color.black);
    private GraphNode c1 = new GraphNode("twitter.1");
    private GraphNode c2 = new GraphNode("twitter.2");
    private GraphNode c3 = new GraphNode("twitter.3");
    private GraphNode c4 = new GraphNode("twitter.4");
    private GraphNode c5 = new GraphNode("twitter.5");
    private GraphNode c6 = new GraphNode("twitter.6");
    private GraphNode c7 = new GraphNode("twitter.7");
    private GraphNode c8 = new GraphNode("twitter.8");
    private GraphNode c9 = new GraphNode("twitter.9");
    private GraphNode c10 = new GraphNode("twitter.10");
    private GraphNode c11 = new GraphNode("blanco.11");
    private GraphNode c12 = new GraphNode("blanco.12");
    private GraphNode c13 = new GraphNode("blanco.13");
    private GraphNode c14 = new GraphNode("blanco.14");
    private GraphNode c15 = new GraphNode("blanco.15");
    private GraphNode c16 = new GraphNode("blanco.16");
    private GraphNode c17 = new GraphNode("blanco.17");
    private GraphNode c18 = new GraphNode("blanco.18");
    private GraphNode c19 = new GraphNode("blanco.19");
    private GraphNode c20 = new GraphNode("blanco.20");
    private GraphNode c21 = new GraphNode("blanco.21");
    private GraphNode c22 = new GraphNode("blanco.22");
    private GraphNode c23 = new GraphNode("blanco.23");
    private GraphNode c24 = new GraphNode("blanco.24");
    private GraphNode c25 = new GraphNode("blanco.25");
    private GraphNode c26 = new GraphNode("blanco.26");
    private GraphNode c27 = new GraphNode("blanco.27");
    private GraphNode c28 = new GraphNode("blanco.28");
    private GraphNode c29 = new GraphNode("blanco.29");
    private GraphNode c30 = new GraphNode("blanco.30");
    private GraphNode c31 = new GraphNode("blanco.31");
    private GraphNode c32 = new GraphNode("blanco.32");
    private GraphNode c33 = new GraphNode("blanco.33");
    private GraphNode c34 = new GraphNode("blanco.34");
    private GraphNode c35 = new GraphNode("blanco.35");
    private GraphNode c36 = new GraphNode("blanco.36");
    private GraphNode c37 = new GraphNode("blanco.37");
    private GraphNode c38 = new GraphNode("blanco.38");
    private GraphNode c39 = new GraphNode("blanco.39");
    private GraphNode c40 = new GraphNode("blanco.40");
    private GraphNode c41 = new GraphNode("blanco.41");
    private GraphNode c42 = new GraphNode("blanco.42");
    private GraphNode c43 = new GraphNode("blanco.43");
    private GraphNode c44 = new GraphNode("blanco.44");
    private GraphNode c45 = new GraphNode("blanco.45");
    private GraphNode c46 = new GraphNode("blanco.46");
    private GraphNode c47 = new GraphNode("blanco.47");
    private GraphNode c48 = new GraphNode("blanco.48");
    private GraphNode c49 = new GraphNode("blanco.49");
    private GraphNode c50 = new GraphNode("blanco.50");
    private GraphNode c51 = new GraphNode("blanco.51");
    private GraphNode c52 = new GraphNode("blanco.52");
    private GraphNode c53 = new GraphNode("blanco.53");
    private GraphNode c54 = new GraphNode("blanco.54");
    private GraphNode c55 = new GraphNode("youtube.55");
    private GraphNode c56 = new GraphNode("youtube.56");
    private GraphNode c57 = new GraphNode("youtube.57");
    private GraphNode c58 = new GraphNode("youtube.58");
    private GraphNode c59 = new GraphNode("youtube.59");
    private GraphNode c60 = new GraphNode("youtube.60");
    private GraphNode c61 = new GraphNode("youtube.61");
    private GraphNode c62 = new GraphNode("youtube.62");
    private GraphNode c63 = new GraphNode("youtube.63");
    private GraphNode c64 = new GraphNode("youtube.64");
    private GraphNode d1 = new GraphNode("blanco.65");
    private GraphNode d2 = new GraphNode("blanco.66");
    private GraphNode d3 = new GraphNode("blanco.67");

    ImageIcon imagenTwitter = new ImageIcon("src/Imagenes/TwitterHexagon.png");
    Icon iconoTwitter = new ImageIcon(imagenTwitter.getImage().getScaledInstance(vistaPrincipal.Hexagon1.getWidth(), vistaPrincipal.Hexagon1.getHeight(), Image.SCALE_SMOOTH));
    ImageIcon imagenYoutube = new ImageIcon("src/Imagenes/YoutubeHexagon.png");
    Icon iconoYoutube = new ImageIcon(imagenYoutube.getImage().getScaledInstance(vistaPrincipal.Hexagon1.getWidth(), vistaPrincipal.Hexagon1.getHeight(), Image.SCALE_SMOOTH));
    ImageIcon imagenHexagono = new ImageIcon("src/Imagenes/EmptyHexagon.png");
    Icon iconoHexagono = new ImageIcon(imagenHexagono.getImage().getScaledInstance(vistaPrincipal.Hexagon1.getWidth(), vistaPrincipal.Hexagon1.getHeight(), Image.SCALE_SMOOTH));
    private boolean estaSeleccionado;
    private boolean movimiento50;
    String dificultad = new String();
    List<JButton> listaBotones = new LinkedList<>();
    List<GraphNode> listaNodos = new LinkedList<>();

    public VistaPrincipalControlador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        vistaPrincipal.jLabel1.setVisible(false);
        estaSeleccionado = false;                     
        inicializarGrafo();
        incializarListaNodos();
        inicializarListaBotones();
        inicializarListeners();
        movimiento50 = false;
        dificultad = "dificil";
        pintarTablero(new GraphNode(""));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Iterator<GraphNode> graphNodeIterator = listaNodos.iterator();
        Iterator<JButton> jButtonIterator = listaBotones.iterator();
        while(graphNodeIterator.hasNext() && jButtonIterator.hasNext()){
            JButton boton = jButtonIterator.next();
            GraphNode nodo = graphNodeIterator.next();
            if(e.getSource() == boton){
                moverFichas(nodo);
                if(nodo.getData().startsWith("twitter")) colocarBordes(boton);
            }
        }
    }
    
    private void colocarBordes(JButton boton){
        if(!estaSeleccionado){
                //boton.setBorder(blackline);
                estaSeleccionado = true;
            }else{
                boton.setBorder(null);
                estaSeleccionado = false;
            }
    }
    
    private void moverFichas(GraphNode nodoActual){
        if(!estaSeleccionado && nodoActual.getData().startsWith("twitter")){
            nodoActual.setEstaSeleccionado(true);
        }
        else if(nodoActual.getData().startsWith("blanco") && estaSeleccionado){
            pintarTablero(nodoActual);
        }    
    }
    
    private void pintarTablero(GraphNode nodo){
        Iterator<GraphNode> graphNodeIterator = listaNodos.iterator();
        Iterator<JButton> jButtonIterator = listaBotones.iterator();
        while(graphNodeIterator.hasNext() && jButtonIterator.hasNext()){
            pintarHexagono(graphNodeIterator.next(), jButtonIterator.next(), nodo);
        }
    }
    
    private void pintarHexagono(GraphNode nodoActual, JButton boton, GraphNode nodo){
        if(!nodoActual.isSeleccionado()){
            if(nodoActual.getData().startsWith("twitter")) boton.setIcon(iconoTwitter);
            else if(nodoActual.getData().startsWith("youtube")) boton.setIcon(iconoYoutube);
            else boton.setIcon(iconoHexagono);
        }else if((validarMovimiento(nodoActual, nodo) || (validarSalto(nodoActual, nodo)))){
            intercambiarValores(nodoActual, nodo);
            nodoActual.setEstaSeleccionado(false);
            pintarTablero(nodo);
            condicionesVictoria();
            recorrerGrafo();
            condicionesVictoria();
        }else nodoActual.setEstaSeleccionado(false);
    }

    private void checarNodos50(){
        if(d1.getData().startsWith("youtube")){
            if(!c8.getData().startsWith("twitter")){
                c8.setData("youtube.8");
                d1.setData("empty");
            }else c8.setData("twitter.8");          
           
        }if(d2.getData().startsWith("youtube")){
            if(!c2.getData().startsWith("twitter")){
                c2.setData("youtube.2");
                d2.setData("empty");
            }else c2.setData("twitter.2");
           
        }if(d3.getData().startsWith("youtube")){
            if(!c5.getData().startsWith("twitter")){
                c5.setData("youtube.5");
                d3.setData("empty");
            }else c5.setData("twitter.5");
            
        }
    }

    private void condicionesVictoria(){
        if(condicionVictoriaYoutube()){
            vistaPrincipal.jLabel1.setVisible(true);
        } else if (condicionVictoriaTwitter()) {
            vistaPrincipal.jLabel1.setVisible(true);
        }
    }
    
    private boolean validarSalto(GraphNode nodoActual, GraphNode nodo){
        String[] cadenas1 = {"1", "2", "3", "4", "5", "6"};
        String[] cadenas2 = {"a", "b", "c", "d", "e", "f"};
        boolean esSaltoValido = false;
        recoleccion(nodoActual, cadenas1);
        recoleccion(nodo, cadenas2);
        if(condicionSalto(cadenas1, cadenas2)) esSaltoValido = true;
        return esSaltoValido;
    }

    public void recoleccion(GraphNode nodoActual, String[] cadenas1) {
        if(nodoActual.getAbajo().getData().startsWith("youtube") || nodoActual.getAbajo().getData().startsWith("twitter")){
            cadenas1[0] = nodoActual.getAbajo().getData();
        }
        if(nodoActual.getAbajoIzquierda().getData().startsWith("youtube") || nodoActual.getAbajoIzquierda().getData().startsWith("twitter")){
            cadenas1[1] = nodoActual.getAbajoIzquierda().getData();
        }
        if(nodoActual.getAbajoDerecha().getData().startsWith("youtube") || nodoActual.getAbajoDerecha().getData().startsWith("twitter")){
            cadenas1[2] = nodoActual.getAbajoDerecha().getData();
        }
        if(nodoActual.getArriba().getData().startsWith("youtube") || nodoActual.getArriba().getData().startsWith("twitter")){
            cadenas1[3] = nodoActual.getArriba().getData();
        }
        if(nodoActual.getArribaIzquierda().getData().startsWith("youtube") || nodoActual.getArribaIzquierda().getData().startsWith("twitter")){
            cadenas1[4] = nodoActual.getArribaIzquierda().getData();
        }
        if(nodoActual.getArribaDerecha().getData().startsWith("youtube") || nodoActual.getArribaDerecha().getData().startsWith("twitter")){
            cadenas1[5] = nodoActual.getArribaDerecha().getData();
        }
    }

    private void inicializarListeners(){
        Iterator<JButton> jButtonIterator = listaBotones.iterator();
        while(jButtonIterator.hasNext()){
            jButtonIterator.next().addActionListener(this);
        }
    }
    
    public void recorrerGrafo(){
        int contador = 0;
        int limite = 0;
        GraphNode nodoDefinitivo = null;
        Queue<GraphNode> queue = new LinkedList();
        Map<Integer, GraphNode> mapa = new TreeMap<>();
        List<GraphNode> lista = new LinkedList<>();
        Iterator<GraphNode> iterator;
        queue.add(c1);
        if(!c1.isEstaVisitado()){
            while(!queue.isEmpty()) {
                GraphNode presentNode = (GraphNode) queue.remove();
                if(presentNode.getData().startsWith("youtube") && determinarMovimiento(presentNode) != null) {
                    lista.addAll(determinarMovimiento(presentNode));
                    iterator = lista.iterator();
                    GraphNode nodo = null;
                    limite += 2;
                    while(contador < limite){
                        if(contador == limite - 2) {
                            nodo = iterator.next();
                            break;
                        }
                        iterator.next();
                        contador++;
                    }
                    contador = 0;
                    mapa.put(nodo.getDistancia(), nodo);
                }

                if (presentNode.getAbajo() != null && !presentNode.getAbajo().isEstaVisitado()) {
                    if(!presentNode.getAbajo().getData().equals("null")) queue.add(presentNode.getAbajo());
                    presentNode.getAbajo().setEstaVisitado(true);
                }
                if (presentNode.getAbajoIzquierda() != null && !presentNode.getAbajoIzquierda().isEstaVisitado()) {
                    if(!presentNode.getAbajoIzquierda().getData().equals("null")) queue.add(presentNode.getAbajoIzquierda());
                    presentNode.getAbajoIzquierda().setEstaVisitado(true);
                }
                if (presentNode.getAbajoDerecha() != null && !presentNode.getAbajoDerecha().isEstaVisitado()) {
                    if(!presentNode.getAbajoDerecha().getData().equals("null")) queue.add(presentNode.getAbajoDerecha());
                    presentNode.getAbajoDerecha().setEstaVisitado(true);
                }
                if (presentNode.getArriba() != null && !presentNode.getArriba().isEstaVisitado()) {
                    if(!presentNode.getArriba().getData().equals("null")) queue.add(presentNode.getArriba());
                    presentNode.getArriba().setEstaVisitado(true);
                }
                if (presentNode.getArribaIzquierda() != null && !presentNode.getArribaIzquierda().isEstaVisitado()) {
                    if(!presentNode.getArribaIzquierda().getData().equals("null")) queue.add(presentNode.getArribaIzquierda());
                    presentNode.getArribaIzquierda().setEstaVisitado(true);
                }
                if (presentNode.getArribaDerecha() != null && !presentNode.getArribaDerecha().isEstaVisitado()) {
                    if(!presentNode.getArribaDerecha().getData().equals("null")) queue.add(presentNode.getArribaDerecha());
                    presentNode.getArribaDerecha().setEstaVisitado(true);
                }
                if(!presentNode.isEstaVisitado()) presentNode.setEstaVisitado(true);
            }
        }else{
            while(!queue.isEmpty()) {
                GraphNode presentNode = (GraphNode) queue.remove();

                if(presentNode.getData().startsWith("youtube") && determinarMovimiento(presentNode) != null) {
                    lista.addAll(determinarMovimiento(presentNode));
                    iterator = lista.iterator();
                    GraphNode nodo = null;
                    limite += 2;
                    while(contador < limite){
                        if(contador == limite - 2) {
                            nodo = iterator.next();
                            break;
                        }
                        iterator.next();
                        contador++;
                    }
                    contador = 0;
                    mapa.put(nodo.getDistancia(), nodo);
                }

                if (presentNode.getAbajo() != null && presentNode.getAbajo().isEstaVisitado()) {
                    if(!presentNode.getAbajo().getData().equals("null")) queue.add(presentNode.getAbajo());
                    presentNode.getAbajo().setEstaVisitado(false);
                }
                if (presentNode.getAbajoIzquierda() != null && presentNode.getAbajoIzquierda().isEstaVisitado()) {
                    if(!presentNode.getAbajoIzquierda().getData().equals("null")) queue.add(presentNode.getAbajoIzquierda());
                    presentNode.getAbajoIzquierda().setEstaVisitado(false);
                }
                if (presentNode.getAbajoDerecha() != null && presentNode.getAbajoDerecha().isEstaVisitado()) {
                    if(!presentNode.getAbajoDerecha().getData().equals("null")) queue.add(presentNode.getAbajoDerecha());
                    presentNode.getAbajoDerecha().setEstaVisitado(false);
                }
                if (presentNode.getArriba() != null && presentNode.getArriba().isEstaVisitado()) {
                    if(!presentNode.getArriba().getData().equals("null")) queue.add(presentNode.getArriba());
                    presentNode.getArriba().setEstaVisitado(false);
                }
                if (presentNode.getArribaIzquierda() != null && presentNode.getArribaIzquierda().isEstaVisitado()) {
                    if(!presentNode.getArribaIzquierda().getData().equals("null")) queue.add(presentNode.getArribaIzquierda());
                    presentNode.getArribaIzquierda().setEstaVisitado(false);
                }
                if (presentNode.getArribaDerecha() != null && presentNode.getArribaDerecha().isEstaVisitado()) {
                    if(!presentNode.getArribaDerecha().getData().equals("null")) queue.add(presentNode.getArribaDerecha());
                    presentNode.getArribaDerecha().setEstaVisitado(false);
                }
                if(presentNode.isEstaVisitado()) presentNode.setEstaVisitado(false);
            }
        }
        GenerarMovimientoEnemigo(mapa, lista);
    }

    private void GenerarMovimientoEnemigo(Map<Integer, GraphNode> mapa, List<GraphNode> lista) {
        GraphNode nodoDefinitivo;
        Iterator<GraphNode> iterator;
        nodoDefinitivo = determinarNodo(mapa);
        iterator = lista.iterator();
        while(iterator.hasNext()){
            GraphNode nodoIdentico = iterator.next();
            if(nodoIdentico.getData().equals(nodoDefinitivo.getData())){
                GraphNode nodoActual = iterator.next();
                intercambiarValores(nodoActual, nodoDefinitivo);
                checarNodos50();
                pintarTablero(new GraphNode(""));
                break;
            }
            iterator.next();
        }
    }

    public GraphNode determinarNodo(Map<Integer, GraphNode> mapa){
        Object[] llaves = mapa.keySet().toArray();
        return seleccionarNodoAleatorio(llaves, mapa);
    }
    
    public GraphNode seleccionarNodoAleatorio(Object[] llaves, Map<Integer, GraphNode> mapa){
        int i = 0;
        GraphNode nodo = null;
        while(i < 10){
            if(llaves.length == i + 1){
                int numeroAleatorio = (int) (Math.random() * (i) + 0);
                 nodo = mapa.get(llaves[numeroAleatorio]);
            }
            i++;
        }
        return nodo;
    }

    public List<GraphNode> determinarMovimiento(GraphNode nodoActual){
        Map<Integer, GraphNode> mapa = new TreeMap<>();
        if(nodoActual.getArribaIzquierda().getData().startsWith("blanco")){
            mapa.put(nodoActual.getArribaIzquierda().getDistancia(), nodoActual.getArribaIzquierda());
        }else if((nodoActual.getArribaIzquierda().getData().startsWith("youtube") || nodoActual.getArribaIzquierda().getData().startsWith("twitter")) && nodoActual.getArribaIzquierda().getArribaIzquierda().getData().startsWith("blanco")){
            mapa.put(nodoActual.getArribaIzquierda().getArribaIzquierda().getDistancia(), nodoActual.getArribaIzquierda().getArribaIzquierda());
        }

        if(nodoActual.getAbajoIzquierda().getData().startsWith("blanco")){
            mapa.put(nodoActual.getAbajoIzquierda().getDistancia(), nodoActual.getAbajoIzquierda());
        }else if((nodoActual.getAbajoIzquierda().getData().startsWith("youtube") || nodoActual.getAbajoIzquierda().getData().startsWith("twitter")) && nodoActual.getAbajoIzquierda().getAbajoIzquierda().getData().startsWith("blanco")){
            mapa.put(nodoActual.getAbajoIzquierda().getAbajoIzquierda().getDistancia(), nodoActual.getAbajoIzquierda().getAbajoIzquierda());
        }

        if(nodoActual.getArriba().getData().startsWith("blanco") && (Integer.parseInt(nodoActual.getArriba().getData().substring(nodoActual.getArriba().getData().indexOf(".") + 1)) > 8)){
            mapa.put(nodoActual.getArriba().getDistancia(), nodoActual.getArriba());
        }else if((nodoActual.getArriba().getData().startsWith("youtube") || nodoActual.getArriba().getData().startsWith("twitter")) && nodoActual.getArriba().getArriba().getData().startsWith("blanco") && (Integer.parseInt(nodoActual.getArriba().getArriba().getData().substring(nodoActual.getArriba().getArriba().getData().indexOf(".") + 1)) > 10)){
            mapa.put(nodoActual.getArriba().getArriba().getDistancia(), nodoActual.getArriba().getArriba());
        }

        if(nodoActual.getArribaDerecha().getData().startsWith("blanco") && !dificultad.equals("dificil")){
            mapa.put(nodoActual.getArribaDerecha().getDistancia(), nodoActual.getArribaDerecha());
        }


        if(nodoActual.getAbajo().getData().startsWith("blanco") && (Integer.parseInt(nodoActual.getAbajo().getData().substring(nodoActual.getAbajo().getData().indexOf(".") + 1)) > 8)){
            mapa.put(nodoActual.getAbajo().getDistancia(), nodoActual.getAbajo());
        }else if((nodoActual.getAbajo().getData().startsWith("youtube") || nodoActual.getAbajo().getData().startsWith("twitter")) && nodoActual.getAbajo().getAbajo().getData().startsWith("blanco") && (Integer.parseInt(nodoActual.getAbajo().getAbajo().getData().substring(nodoActual.getAbajo().getAbajo().getData().indexOf(".") + 1)) > 10)){
            mapa.put(nodoActual.getAbajo().getAbajo().getDistancia(), nodoActual.getAbajo().getAbajo());
        }

        if(nodoActual.getAbajoDerecha().getData().startsWith("blanco") && !dificultad.equals("dificil")){
            mapa.put(nodoActual.getAbajoDerecha().getDistancia(), nodoActual.getAbajoDerecha());
        }


        if(!mapa.isEmpty()) {
            List<GraphNode> lista = new LinkedList<>();
            lista.add(analizarMovimientos(mapa));
            lista.add(nodoActual);
            return lista;
        }else return null;
    }

    public GraphNode analizarMovimientos(Map<Integer, GraphNode> mapa){
        int numeroAleatorio = (int) (Math.random() * 100 + 1);
        Object[] distancias = mapa.keySet().toArray();
        return obtenerMejorMovivimiento(mapa, numeroAleatorio, distancias);
    }

    private GraphNode obtenerMejorMovivimiento(Map<Integer, GraphNode> mapa, int numeroAleatorio, Object[] distancias) {
        GraphNode mejorNodo = null;
        if(distancias.length == 1) mejorNodo = mapa.get(distancias[0]);
        if(distancias.length == 2){
            if(dificultad.equals("facil")){
                if(numeroAleatorio < 75) mejorNodo = mapa.get(distancias[0]);
                else mejorNodo = mapa.get(distancias[1]);
            }else if(dificultad.equals("intermedio")) {
                if (numeroAleatorio < 20) mejorNodo = mapa.get(distancias[0]);
                else mejorNodo = mapa.get(distancias[1]);
            }else if(dificultad.equals("dificil")) {
                if (numeroAleatorio < 5) mejorNodo = mapa.get(distancias[0]);
                else mejorNodo = mapa.get(distancias[1]);
            }
        }
        if(distancias.length == 3){
            if(dificultad.equals("facil")){
                if(numeroAleatorio < 50) mejorNodo = mapa.get(distancias[0]);
                else if(numeroAleatorio >= 50 && numeroAleatorio < 80) mejorNodo = mapa.get(distancias[1]);
                else mejorNodo = mapa.get(distancias[2]);
            }else if(dificultad.equals("intermedio")) {
                if (numeroAleatorio < 20) mejorNodo = mapa.get(distancias[0]);
                else if(numeroAleatorio >= 20 && numeroAleatorio < 50) mejorNodo = mapa.get(distancias[1]);
                else mejorNodo = mapa.get(distancias[2]);
            }else if(dificultad.equals("dificil")) {
                if (numeroAleatorio < 8) mejorNodo =  mapa.get(distancias[0]);
                else if(numeroAleatorio >= 8 && numeroAleatorio < 15) mejorNodo = mapa.get(distancias[1]);
                else mejorNodo = mapa.get(distancias[2]);
            }
        }
        if(distancias.length == 4){
            if(dificultad.equals("facil")){
                if(numeroAleatorio < 40) mejorNodo = mapa.get(distancias[0]);
                else if(numeroAleatorio >= 40 && numeroAleatorio < 70) mejorNodo = mapa.get(distancias[1]);
                else if(numeroAleatorio >= 70 && numeroAleatorio < 90) mejorNodo = mapa.get(distancias[2]);
                else mejorNodo = mapa.get(distancias[3]);
            }else if(dificultad.equals("intermedio")) {
                if(numeroAleatorio < 15) mejorNodo = mapa.get(distancias[0]);
                else if(numeroAleatorio >= 15 && numeroAleatorio < 40) mejorNodo = mapa.get(distancias[1]);
                else if(numeroAleatorio >= 40 && numeroAleatorio < 65) mejorNodo = mapa.get(distancias[2]);
                else mejorNodo = mapa.get(distancias[3]);
            }else if(dificultad.equals("dificil")) {
                if(numeroAleatorio < 3) mejorNodo = mapa.get(distancias[0]);
                else if(numeroAleatorio >= 3 && numeroAleatorio < 10) mejorNodo = mapa.get(distancias[1]);
                else if(numeroAleatorio >= 10 && numeroAleatorio < 18) mejorNodo = mapa.get(distancias[2]);
                else mejorNodo = mapa.get(distancias[3]);
            }
        }
        if(distancias.length == 5){
            if(dificultad.equals("facil")){
                if(numeroAleatorio < 30) mejorNodo = mapa.get(distancias[0]);
                else if(numeroAleatorio >= 30 && numeroAleatorio < 55) mejorNodo = mapa.get(distancias[1]);
                else if(numeroAleatorio >= 55 && numeroAleatorio < 75) mejorNodo = mapa.get(distancias[2]);
                else if(numeroAleatorio >= 75 && numeroAleatorio < 90) mejorNodo = mapa.get(distancias[3]);
                else mejorNodo = mapa.get(distancias[4]);
            }else if(dificultad.equals("intermedio")) {
                if(numeroAleatorio < 10) mejorNodo = mapa.get(distancias[0]);
                else if(numeroAleatorio >= 10 && numeroAleatorio < 20) mejorNodo = mapa.get(distancias[1]);
                else if(numeroAleatorio >= 30 && numeroAleatorio < 40) mejorNodo = mapa.get(distancias[2]);
                else if(numeroAleatorio >= 40 && numeroAleatorio < 50) mejorNodo = mapa.get(distancias[3]);
                else mejorNodo = mapa.get(distancias[4]);
            }else if(dificultad.equals("dificil")) {
                if(numeroAleatorio < 5) mejorNodo = mapa.get(distancias[0]);
                else if(numeroAleatorio >= 5 && numeroAleatorio < 10) mejorNodo = mapa.get(distancias[1]);
                else if(numeroAleatorio >= 10 && numeroAleatorio < 20) mejorNodo = mapa.get(distancias[2]);
                else if(numeroAleatorio >= 20 && numeroAleatorio < 30) mejorNodo = mapa.get(distancias[3]);
                else mejorNodo = mapa.get(distancias[4]);
            }
        }
        if(distancias.length == 6){
            if(dificultad.equals("facil")){
                if(numeroAleatorio < 30) mejorNodo = mapa.get(distancias[0]);
                else if(numeroAleatorio >= 30 && numeroAleatorio < 50) mejorNodo = mapa.get(distancias[1]);
                else if(numeroAleatorio >= 50 && numeroAleatorio < 70) mejorNodo = mapa.get(distancias[2]);
                else if(numeroAleatorio >= 70 && numeroAleatorio < 85) mejorNodo = mapa.get(distancias[3]);
                else if(numeroAleatorio >= 85 && numeroAleatorio < 95) mejorNodo = mapa.get(distancias[4]);
                else mejorNodo = mapa.get(distancias[5]);
            }else if(dificultad.equals("intermedio")) {
                if(numeroAleatorio < 8) mejorNodo = mapa.get(distancias[0]);
                else if(numeroAleatorio >= 8 && numeroAleatorio < 16) mejorNodo = mapa.get(distancias[1]);
                else if(numeroAleatorio >= 16 && numeroAleatorio < 25) mejorNodo = mapa.get(distancias[2]);
                else if(numeroAleatorio >= 25 && numeroAleatorio < 32) mejorNodo = mapa.get(distancias[3]);
                else if(numeroAleatorio >= 32 && numeroAleatorio < 40) mejorNodo = mapa.get(distancias[4]);
                else mejorNodo = mapa.get(distancias[5]);
            }else if(dificultad.equals("dificil")) {
                if(numeroAleatorio < 5) mejorNodo = mapa.get(distancias[0]);
                else if(numeroAleatorio >= 5 && numeroAleatorio < 15) mejorNodo = mapa.get(distancias[1]);
                else if(numeroAleatorio >= 15 && numeroAleatorio < 25) mejorNodo = mapa.get(distancias[2]);
                else if(numeroAleatorio >= 25 && numeroAleatorio < 35) mejorNodo = mapa.get(distancias[3]);
                else if(numeroAleatorio >= 35 && numeroAleatorio < 45) mejorNodo = mapa.get(distancias[4]);
                else mejorNodo = mapa.get(distancias[5]);
            }
        }
        return mejorNodo;
    }

    public boolean validarMovimiento(GraphNode nodoActual, GraphNode nodo){
        return nodoActual.getAbajo().getData().equals(nodo.getData())
                || nodoActual.getAbajoIzquierda().getData().equals(nodo.getData())
                || nodoActual.getAbajoDerecha().getData().equals(nodo.getData())
                || nodoActual.getArriba().getData().equals(nodo.getData())
                || nodoActual.getArribaDerecha().getData().equals(nodo.getData())
                || nodoActual.getArribaIzquierda().getData().equals(nodo.getData());
    }

    public boolean condicionSalto(String[] cadenas1, String[] cadenas2){
        return cadenas2[0].equals(cadenas1[3])
                || cadenas2[1].equals(cadenas1[5])
                || cadenas2[2].equals(cadenas1[4])
                || cadenas1[0].equals(cadenas2[3])
                || cadenas1[1].equals(cadenas2[5])
                || cadenas1[2].equals(cadenas2[4]);
    }

    public void intercambiarValores(GraphNode nodoActual, GraphNode nodo){
        int index = nodo.getData().indexOf('.');
        String numero1 = String.valueOf(nodo.getData().substring(index));

        if(nodoActual.getData().startsWith("twitter"))nodo.setData("twitter" + numero1);
        else nodo.setData("youtube" + numero1);

        index = nodoActual.getData().indexOf('.');
        String numero2 = String.valueOf(nodoActual.getData().substring(index));
        nodoActual.setData("blanco" + numero2);
    }

    public boolean condicionVictoriaTwitter(){
        Iterator<GraphNode> graphNodeIterator = listaNodos.iterator();
        int i = 55;
        int camposRellenados = 0;
        boolean atLeastOneTwitter = false;
        while(graphNodeIterator.hasNext()){
            GraphNode nodo = graphNodeIterator.next();
            if(nodo.getData().endsWith(String.valueOf(i))){
                i++;
                if(!nodo.getData().startsWith("blanco")){
                    if(nodo.getData().startsWith("twitter")) atLeastOneTwitter = true;
                    camposRellenados++;
                }
            }
        }
        return (camposRellenados == 10 && atLeastOneTwitter);
    }

    public boolean condicionVictoriaYoutube(){
        Iterator<GraphNode> graphNodeIterator = listaNodos.iterator();
        int i = 1;
        int camposRellenados = 0;
        boolean atLeastOneYoutube = false;
        while(graphNodeIterator.hasNext()){
            GraphNode nodo = graphNodeIterator.next();
            if(nodo.getData().endsWith(String.valueOf(i))){
                if(i <= 10) i++;
                if(!nodo.getData().startsWith("blanco")){
                    if(nodo.getData().startsWith("youtube")) atLeastOneYoutube = true;
                    camposRellenados++;
                }
            }
        }
        return (camposRellenados == 10 && atLeastOneYoutube);
    }

    public void inicializarListaBotones(){
        listaBotones.add(vistaPrincipal.Hexagon1);
        listaBotones.add(vistaPrincipal.Hexagon2);
        listaBotones.add(vistaPrincipal.Hexagon3);
        listaBotones.add(vistaPrincipal.Hexagon4);
        listaBotones.add(vistaPrincipal.Hexagon5);
        listaBotones.add(vistaPrincipal.Hexagon6);
        listaBotones.add(vistaPrincipal.Hexagon7);
        listaBotones.add(vistaPrincipal.Hexagon8);
        listaBotones.add(vistaPrincipal.Hexagon9);
        listaBotones.add(vistaPrincipal.Hexagon10);
        listaBotones.add(vistaPrincipal.Hexagon11);
        listaBotones.add(vistaPrincipal.Hexagon12);
        listaBotones.add(vistaPrincipal.Hexagon13);
        listaBotones.add(vistaPrincipal.Hexagon14);
        listaBotones.add(vistaPrincipal.Hexagon15);
        listaBotones.add(vistaPrincipal.Hexagon16);
        listaBotones.add(vistaPrincipal.Hexagon17);
        listaBotones.add(vistaPrincipal.Hexagon18);
        listaBotones.add(vistaPrincipal.Hexagon19);
        listaBotones.add(vistaPrincipal.Hexagon20);
        listaBotones.add(vistaPrincipal.Hexagon21);
        listaBotones.add(vistaPrincipal.Hexagon22);
        listaBotones.add(vistaPrincipal.Hexagon23);
        listaBotones.add(vistaPrincipal.Hexagon24);
        listaBotones.add(vistaPrincipal.Hexagon25);
        listaBotones.add(vistaPrincipal.Hexagon26);
        listaBotones.add(vistaPrincipal.Hexagon27);
        listaBotones.add(vistaPrincipal.Hexagon28);
        listaBotones.add(vistaPrincipal.Hexagon29);
        listaBotones.add(vistaPrincipal.Hexagon30);
        listaBotones.add(vistaPrincipal.Hexagon31);
        listaBotones.add(vistaPrincipal.Hexagon32);
        listaBotones.add(vistaPrincipal.Hexagon33);
        listaBotones.add(vistaPrincipal.Hexagon34);
        listaBotones.add(vistaPrincipal.Hexagon35);
        listaBotones.add(vistaPrincipal.Hexagon36);
        listaBotones.add(vistaPrincipal.Hexagon37);
        listaBotones.add(vistaPrincipal.Hexagon38);
        listaBotones.add(vistaPrincipal.Hexagon39);
        listaBotones.add(vistaPrincipal.Hexagon40);
        listaBotones.add(vistaPrincipal.Hexagon41);
        listaBotones.add(vistaPrincipal.Hexagon42);
        listaBotones.add(vistaPrincipal.Hexagon43);
        listaBotones.add(vistaPrincipal.Hexagon44);
        listaBotones.add(vistaPrincipal.Hexagon45);
        listaBotones.add(vistaPrincipal.Hexagon46);
        listaBotones.add(vistaPrincipal.Hexagon47);
        listaBotones.add(vistaPrincipal.Hexagon48);
        listaBotones.add(vistaPrincipal.Hexagon49);
        listaBotones.add(vistaPrincipal.Hexagon50);
        listaBotones.add(vistaPrincipal.Hexagon51);
        listaBotones.add(vistaPrincipal.Hexagon52);
        listaBotones.add(vistaPrincipal.Hexagon53);
        listaBotones.add(vistaPrincipal.Hexagon54);
        listaBotones.add(vistaPrincipal.Hexagon55);
        listaBotones.add(vistaPrincipal.Hexagon56);
        listaBotones.add(vistaPrincipal.Hexagon57);
        listaBotones.add(vistaPrincipal.Hexagon58);
        listaBotones.add(vistaPrincipal.Hexagon59);
        listaBotones.add(vistaPrincipal.Hexagon60);
        listaBotones.add(vistaPrincipal.Hexagon61);
        listaBotones.add(vistaPrincipal.Hexagon62);
        listaBotones.add(vistaPrincipal.Hexagon63);
        listaBotones.add(vistaPrincipal.Hexagon64);
    }

    public void incializarListaNodos(){
        listaNodos.add(c1);
        listaNodos.add(c2);
        listaNodos.add(c3);
        listaNodos.add(c4);
        listaNodos.add(c5);
        listaNodos.add(c6);
        listaNodos.add(c7);
        listaNodos.add(c8);
        listaNodos.add(c9);
        listaNodos.add(c10);
        listaNodos.add(c11);
        listaNodos.add(c12);
        listaNodos.add(c13);
        listaNodos.add(c14);
        listaNodos.add(c15);
        listaNodos.add(c16);
        listaNodos.add(c17);
        listaNodos.add(c18);
        listaNodos.add(c19);
        listaNodos.add(c20);
        listaNodos.add(c21);
        listaNodos.add(c22);
        listaNodos.add(c23);
        listaNodos.add(c24);
        listaNodos.add(c25);
        listaNodos.add(c26);
        listaNodos.add(c27);
        listaNodos.add(c28);
        listaNodos.add(c29);
        listaNodos.add(c30);
        listaNodos.add(c31);
        listaNodos.add(c32);
        listaNodos.add(c33);
        listaNodos.add(c34);
        listaNodos.add(c35);
        listaNodos.add(c36);
        listaNodos.add(c37);
        listaNodos.add(c38);
        listaNodos.add(c39);
        listaNodos.add(c40);
        listaNodos.add(c41);
        listaNodos.add(c42);
        listaNodos.add(c43);
        listaNodos.add(c44);
        listaNodos.add(c45);
        listaNodos.add(c46);
        listaNodos.add(c47);
        listaNodos.add(c48);
        listaNodos.add(c49);
        listaNodos.add(c50);
        listaNodos.add(c51);
        listaNodos.add(c52);
        listaNodos.add(c53);
        listaNodos.add(c54);
        listaNodos.add(c55);
        listaNodos.add(c56);
        listaNodos.add(c57);
        listaNodos.add(c58);
        listaNodos.add(c59);
        listaNodos.add(c60);
        listaNodos.add(c61);
        listaNodos.add(c62);
        listaNodos.add(c63);
        listaNodos.add(c64);
    }

    private void inicializarGrafo(){
        d1.setDistancia(54);
        d2.setDistancia(53);
        d3.setDistancia(52);

        c1.setArriba(c2);
        c1.setArribaDerecha(c3);
        c1.setAbajoDerecha(c4);
        c1.setAbajo(c5);
        c1.setAbajoIzquierda(c6);
        c1.setArribaIzquierda(c7);
        c1.setDistancia(46);

        c2.setAbajo(c1);
        c2.setAbajoDerecha(c3);
        c2.setAbajoIzquierda(c7);
        c2.setArribaDerecha(c10);
        c2.setArribaIzquierda(d2);
        c2.setDistancia(45);

        c3.setArribaIzquierda(c2);
        c3.setAbajoIzquierda(c1);
        c3.setAbajo(c4);
        c3.setArriba(c10);
        c3.setArribaDerecha(c12);
        c3.setAbajoDerecha(c13);
        c3.setDistancia(44);

        c4.setArriba(c3);
        c4.setArribaIzquierda(c1);
        c4.setAbajoIzquierda(c5);
        c4.setAbajo(c9);
        c4.setArribaDerecha(c13);
        c4.setAbajoDerecha(c14);
        c4.setDistancia(44);

        c5.setArribaIzquierda(c6);
        c5.setArriba(c1);
        c5.setArribaDerecha(c4);
        c5.setAbajoDerecha(c9);
        c5.setAbajoIzquierda(d3);
        c5.setDistancia(45);

        c6.setArriba(c7);
        c6.setArribaDerecha(c1);
        c6.setAbajoDerecha(c5);
        c6.setArribaIzquierda(c8);
        c6.setDistancia(47);

        c7.setArribaDerecha(c2);
        c7.setAbajoDerecha(c1);
        c7.setAbajo(c6);
        c7.setAbajoIzquierda(c8);
        c7.setArribaIzquierda(d1);
        c7.setDistancia(48);

        c8.setArribaDerecha(c7);
        c8.setAbajoDerecha(c6);
        c8.setDistancia(50);

        c9.setArribaIzquierda(c5);
        c9.setArriba(c4);
        c9.setArribaDerecha(c14);
        c9.setAbajoDerecha(c15);
        c9.setDistancia(43);

        c10.setAbajoIzquierda(c2);
        c10.setAbajo(c3);
        c10.setArribaDerecha(c11);
        c10.setAbajoDerecha(c12);
        c10.setDistancia(43);

        c11.setAbajoIzquierda(c10);
        c11.setAbajo(c12);
        c11.setAbajoDerecha(c20);
        c11.setArribaDerecha(c21);
        c11.setDistancia(39);

        c12.setArriba(c11);
        c12.setArribaIzquierda(c10);
        c12.setAbajoIzquierda(c3);
        c12.setAbajo(c13);
        c12.setAbajoDerecha(c19);
        c12.setArribaDerecha(c20);
        c12.setDistancia(40);

        c13.setArriba(c12);
        c13.setArribaIzquierda(c3);
        c13.setAbajoIzquierda(c4);
        c13.setAbajo(c14);
        c13.setAbajoDerecha(c18);
        c13.setArribaDerecha(c19);
        c13.setDistancia(41);

        c14.setArriba(c13);
        c14.setArribaIzquierda(c4);
        c14.setAbajoIzquierda(c9);
        c14.setAbajo(c15);
        c14.setAbajoDerecha(c17);
        c14.setArribaDerecha(c18);
        c14.setDistancia(40);

        c15.setArribaIzquierda(c9);
        c15.setArriba(c14);
        c15.setAbajoDerecha(c16);
        c15.setArribaDerecha(c17);
        c15.setDistancia(39);

        c16.setArribaIzquierda(c15);
        c16.setArriba(c17);
        c16.setArribaDerecha(c27);
        c16.setAbajoDerecha(c28);
        c16.setDistancia(34);

        c17.setAbajo(c16);
        c17.setAbajoIzquierda(c15);
        c17.setArribaIzquierda(c14);
        c17.setArriba(c18);
        c17.setArribaDerecha(c26);
        c17.setAbajoDerecha(c27);
        c17.setDistancia(35);

        c18.setAbajo(c17);
        c18.setAbajoIzquierda(c14);
        c18.setArribaIzquierda(c13);
        c18.setArriba(c19);
        c18.setArribaDerecha(c25);
        c18.setAbajoDerecha(c26);
        c18.setDistancia(37);

        c19.setAbajo(c18);
        c19.setAbajoIzquierda(c13);
        c19.setArribaIzquierda(c12);
        c19.setArriba(c20);
        c19.setArribaDerecha(c24);
        c19.setAbajoDerecha(c25);
        c19.setDistancia(37);

        c20.setAbajo(c19);
        c20.setAbajoIzquierda(c12);
        c20.setArribaIzquierda(c11);
        c20.setArriba(c21);
        c20.setArribaDerecha(c23);
        c20.setAbajoDerecha(c24);
        c20.setDistancia(35);

        c21.setAbajo(c20);
        c21.setAbajoIzquierda(c11);
        c21.setArribaDerecha(c22);
        c21.setAbajoDerecha(c23);
        c21.setDistancia(34);

        c22.setAbajoIzquierda(c21);
        c22.setAbajo(c23);
        c22.setAbajoDerecha(c35);
        c22.setArribaDerecha(c36);
        c22.setDistancia(29);

        c23.setArriba(c22);
        c23.setArribaIzquierda(c21);
        c23.setAbajoIzquierda(c20);
        c23.setAbajo(c24);
        c23.setAbajoDerecha(c34);
        c23.setArribaDerecha(c35);
        c23.setDistancia(30);

        c24.setArriba(c23);
        c24.setArribaIzquierda(c20);
        c24.setAbajoIzquierda(c19);
        c24.setAbajo(c25);
        c24.setAbajoDerecha(c33);
        c24.setArribaDerecha(c34);
        c24.setDistancia(31);

        c25.setArriba(c24);
        c25.setArribaIzquierda(c19);
        c25.setAbajoIzquierda(c18);
        c25.setAbajo(c26);
        c25.setAbajoDerecha(c32);
        c25.setArribaDerecha(c33);
        c25.setDistancia(32);

        c26.setArriba(c25);
        c26.setArribaIzquierda(c18);
        c26.setAbajoIzquierda(c17);
        c26.setAbajo(c27);
        c26.setAbajoDerecha(c31);
        c26.setArribaDerecha(c32);
        c26.setDistancia(31);

        c27.setArriba(c26);
        c27.setArribaIzquierda(c17);
        c27.setAbajoIzquierda(c16);
        c27.setAbajo(c28);
        c27.setAbajoDerecha(c30);
        c27.setArribaDerecha(c31);
        c27.setDistancia(30);

        c28.setArriba(c27);
        c28.setArribaIzquierda(c16);
        c28.setAbajoDerecha(c29);
        c28.setArribaDerecha(c30);
        c28.setDistancia(29);

        c29.setArribaIzquierda(c28);
        c29.setArriba(c30);
        c29.setArribaDerecha(c43);
        c29.setDistancia(23);

        c30.setAbajo(c29);
        c30.setAbajoIzquierda(c28);
        c30.setArribaIzquierda(c27);
        c30.setArriba(c31);
        c30.setArribaDerecha(c42);
        c30.setAbajoDerecha(c43);
        c30.setDistancia(24);

        c31.setAbajo(c30);
        c31.setAbajoIzquierda(c27);
        c31.setArribaIzquierda(c26);
        c31.setArriba(c32);
        c31.setArribaDerecha(c41);
        c31.setAbajoDerecha(c42);
        c31.setDistancia(26);

        c32.setAbajo(c31);
        c32.setAbajoIzquierda(c26);
        c32.setArribaIzquierda(c25);
        c32.setArriba(c33);
        c32.setArribaDerecha(c40);
        c32.setAbajoDerecha(c41);
        c32.setDistancia(28);

        c33.setAbajo(c32);
        c33.setAbajoIzquierda(c25);
        c33.setArribaIzquierda(c24);
        c33.setArriba(c34);
        c33.setArribaDerecha(c39);
        c33.setAbajoDerecha(c40);
        c33.setDistancia(28);

        c34.setAbajo(c33);
        c34.setAbajoIzquierda(c24);
        c34.setArribaIzquierda(c23);
        c34.setArriba(c35);
        c34.setArribaDerecha(c38);
        c34.setAbajoDerecha(c39);
        c34.setDistancia(26);

        c35.setAbajo(c34);
        c35.setAbajoIzquierda(c23);
        c35.setArribaIzquierda(c22);
        c35.setArriba(c36);
        c35.setArribaDerecha(c37);
        c35.setAbajoDerecha(c38);
        c35.setDistancia(24);

        c36.setAbajo(c35);
        c36.setAbajoIzquierda(c22);
        c36.setAbajoDerecha(c37);
        c36.setDistancia(23);

        c37.setArribaIzquierda(c36);
        c37.setAbajoIzquierda(c35);
        c37.setAbajo(c38);
        c37.setAbajoDerecha(c49);
        c37.setDistancia(18);

        c38.setArriba(c37);
        c38.setArribaIzquierda(c35);
        c38.setAbajoIzquierda(c34);
        c38.setAbajo(c39);
        c38.setAbajoDerecha(c48);
        c38.setArribaDerecha(c49);
        c38.setDistancia(19);

        c39.setArriba(c38);
        c39.setArribaIzquierda(c34);
        c39.setAbajoIzquierda(c33);
        c39.setAbajo(c40);
        c39.setAbajoDerecha(c47);
        c39.setArribaDerecha(c48);
        c39.setDistancia(20);

        c40.setArriba(c39);
        c40.setArribaIzquierda(c33);
        c40.setAbajoIzquierda(c32);
        c40.setAbajo(c41);
        c40.setAbajoDerecha(c46);
        c40.setArribaDerecha(c47);
        c40.setDistancia(22);

        c41.setArriba(c40);
        c41.setArribaIzquierda(c32);
        c41.setAbajoIzquierda(c31);
        c41.setAbajo(c42);
        c41.setAbajoDerecha(c45);
        c41.setArribaDerecha(c46);
        c41.setDistancia(20);

        c42.setArriba(c41);
        c42.setArribaIzquierda(c31);
        c42.setAbajoIzquierda(c30);
        c42.setAbajo(c43);
        c42.setAbajoDerecha(c44);
        c42.setArribaDerecha(c45);
        c42.setDistancia(19);

        c43.setAbajoIzquierda(c29);
        c43.setArribaIzquierda(c30);
        c43.setArriba(c42);
        c43.setArribaDerecha(c44);
        c43.setDistancia(18);

        c44.setAbajoIzquierda(c43);
        c44.setArribaIzquierda(c42);
        c44.setArriba(c45);
        c44.setArribaDerecha(c54);
        c44.setDistancia(14);

        c45.setAbajo(c44);
        c45.setAbajoIzquierda(c42);
        c45.setArribaIzquierda(c41);
        c45.setArriba(c46);
        c45.setAbajoDerecha(c54);
        c45.setArribaDerecha(c53);
        c45.setDistancia(15);

        c46.setAbajo(c45);
        c46.setAbajoIzquierda(c41);
        c46.setArribaIzquierda(c40);
        c46.setArriba(c47);
        c46.setAbajoDerecha(c53);
        c46.setArribaDerecha(c52);
        c46.setDistancia(17);

        c47.setAbajo(c46);
        c47.setAbajoIzquierda(c40);
        c47.setArribaIzquierda(c39);
        c47.setArriba(c48);
        c47.setAbajoDerecha(c52);
        c47.setArribaDerecha(c51);
        c47.setDistancia(47);

        c48.setAbajo(c47);
        c48.setAbajoIzquierda(c39);
        c48.setArribaIzquierda(c38);
        c48.setArriba(c49);
        c48.setAbajoDerecha(c51);
        c48.setArribaDerecha(c50);
        c48.setDistancia(15);

        c49.setAbajo(c48);
        c49.setAbajoIzquierda(c38);
        c49.setArribaIzquierda(c37);
        c49.setAbajoDerecha(c50);
        c49.setDistancia(14);

        c50.setAbajo(c51);
        c50.setAbajoIzquierda(c48);
        c50.setArribaIzquierda(c49);
        c50.setAbajoDerecha(c58);
        c50.setDistancia(10);

        c51.setArriba(c50);
        c51.setArribaIzquierda(c48);
        c51.setAbajoIzquierda(c47);
        c51.setAbajo(c52);
        c51.setAbajoDerecha(c57);
        c51.setArribaDerecha(c58);
        c51.setDistancia(11);

        c52.setArriba(c51);
        c52.setArribaIzquierda(c47);
        c52.setAbajoIzquierda(c46);
        c52.setAbajo(c53);
        c52.setAbajoDerecha(c56);
        c52.setArribaDerecha(c57);
        c52.setDistancia(13);

        c53.setArriba(c52);
        c53.setArribaIzquierda(c46);
        c53.setAbajoIzquierda(c45);
        c53.setAbajo(c54);
        c53.setAbajoDerecha(c55);
        c53.setArribaDerecha(c56);
        c53.setDistancia(11);

        c54.setArriba(c53);
        c54.setArribaIzquierda(c45);
        c54.setAbajoIzquierda(c44);
        c54.setArribaDerecha(c55);
        c54.setDistancia(10);

        c55.setArriba(c56);
        c55.setArribaIzquierda(c53);
        c55.setAbajoIzquierda(c54);
        c55.setArribaDerecha(c61);
        c55.setDistancia(7);

        c56.setAbajo(c55);
        c56.setAbajoIzquierda(c53);
        c56.setArribaIzquierda(c52);
        c56.setArriba(c57);
        c56.setAbajoDerecha(c61);
        c56.setArribaDerecha(c60);
        c56.setDistancia(9);

        c57.setAbajo(c56);
        c57.setAbajoIzquierda(c52);
        c57.setArribaIzquierda(c51);
        c57.setArriba(c58);
        c57.setAbajoDerecha(c60);
        c57.setArribaDerecha(c59);
        c57.setDistancia(9);

        c58.setAbajo(c57);
        c58.setAbajoIzquierda(c51);
        c58.setArribaIzquierda(c50);
        c58.setAbajoDerecha(c59);
        c58.setDistancia(7);

        c59.setAbajo(c60);
        c59.setAbajoIzquierda(c57);
        c59.setArribaIzquierda(c58);
        c59.setAbajoDerecha(c63);
        c59.setDistancia(4);

        c60.setArriba(c59);
        c60.setArribaIzquierda(c57);
        c60.setAbajoIzquierda(c56);
        c60.setAbajo(c61);
        c60.setAbajoDerecha(c62);
        c60.setArribaDerecha(c63);
        c60.setDistancia(6);

        c61.setArriba(c60);
        c61.setArribaIzquierda(c56);
        c61.setAbajoIzquierda(c55);
        c61.setArribaDerecha(c62);
        c61.setDistancia(4);

        c62.setAbajoIzquierda(c61);
        c62.setArribaIzquierda(c60);
        c62.setArriba(c63);
        c62.setArribaDerecha(c64);
        c62.setDistancia(2);

        c63.setAbajo(c62);
        c63.setAbajoIzquierda(c60);
        c63.setArribaIzquierda(c59);
        c63.setAbajoDerecha(c64);
        c63.setDistancia(2);

        c64.setArribaIzquierda(c63);
        c64.setAbajoIzquierda(c62);
        c64.setDistancia(1);
    }
}
