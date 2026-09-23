package com.estructuras.pila;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {


    private class Nodo {
        T dato;
        Nodo siguiente;

        Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo tope;     
    private int tamanio;   

    public Pila() {
        tope = null;
        tamanio = 0;
    }

    
    public int size() {
        return tamanio;
    }

    public void agregar(T elem) {
        Nodo nuevo = new Nodo(elem);
        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }

    public T quitar() {
        if (tope == null) {
            throw new RuntimeException("La pila está vacía");
        }
        T dato = tope.dato;
        tope = tope.siguiente;
        tamanio--;
        return dato;
    }

    public void mostrar() {
        if (tope == null) {
            System.out.println("Pila vacía");
            return;
        }
        Nodo aux = tope;
        System.out.println("---- Pila (tope arriba) ----");
        while (aux != null) {
            System.out.println("| " + aux.dato + " |");
            aux = aux.siguiente;
        }
        System.out.println("----------------------------");
    }

    public List<T> obtenerElementos() {
        List<T> lista = new ArrayList<>();
        Nodo aux = tope;
        while (aux != null) {
            lista.add(aux.dato);
            aux = aux.siguiente;
        }
        return lista;
    }
}
