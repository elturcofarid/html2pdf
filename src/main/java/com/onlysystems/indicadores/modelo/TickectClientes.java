package com.onlysystems.indicadores.modelo;

public class TickectClientes {

    private String cliente;
    private int tickets;
    private int cumplido;
    private int inCumplido;

    public TickectClientes(String cliente, int tickets) {
        this.cliente = cliente;
        this.tickets = tickets;
    }

    public TickectClientes(){

    }

    public TickectClientes(String cliente, int tickets, int cumplido, int inCumplido) {
        this.cliente = cliente;
        this.tickets = tickets;
        this.cumplido = cumplido;
        this.inCumplido = inCumplido;
    }

    public int getInCumplido() {
        return inCumplido;
    }

    public void setInCumplido(int inCumplido) {
        this.inCumplido = inCumplido;
    }

    public int getCumplido() {
        return cumplido;
    }

    public void setCumplido(int cumplido) {
        this.cumplido = cumplido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }
}
