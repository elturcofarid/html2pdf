package com.onlysystems.indicadores.modelo;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "registro")
public class RegistrosModel {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // o GenerationType.AUTO según tu base de datos
    private Long id;

    private int ticket ;
    private Timestamp creado;
    private Timestamp last_changed;
    private String fecha_cierre;
    private String cola;
    private String estado;
    private String ans;
    private String propietario ;
    private int tiempo_solucion ;
    private int tiempo_real_solucion ;
    private String estado_final ;
    private String actividad ;
    private int ticket_maestro ;
    private String cliente ;
    private String estado_pruebas ;
    private String estado_pruebas_clientes ;
    private String estado_incidente ;
    private String ans_analisado ;
    private int relacion_ticket ;
    private String motivo_devolucion ;
    private String ola_incidente ;
    private String resultado_pruebas_produccion ;
    private String tipoServicio;
    private boolean cumplido;
    private String proceso;
    private String desarrollador;
    private String tester;
    private String fecha_inicio;

    private int estimacion_desarrollo;
    private int     estimacion_pruebas;
    private int estimacion_total;
    private String fecha_real_entrega_des;
    private String fecha_real_entrega_pruebas;
    private String fecha_entrega_des;
    private String fecha_entrega_pruebas;
    private int bugs_alto;
    private int bugs_medio;
    private int bugs_bajo;
    private int bugs_reabiertos;
    private int ciclos;
    private int casos_prueba;


    public int getBugs_alto() {
        return bugs_alto;
    }

    public void setBugs_alto(int bugs_alto) {
        this.bugs_alto = bugs_alto;
    }

    public int getBugs_medio() {
        return bugs_medio;
    }

    public void setBugs_medio(int bugs_medio) {
        this.bugs_medio = bugs_medio;
    }

    public int getBugs_bajo() {
        return bugs_bajo;
    }

    public void setBugs_bajo(int bugs_bajo) {
        this.bugs_bajo = bugs_bajo;
    }

    public int getBugs_reabiertos() {
        return bugs_reabiertos;
    }

    public void setBugs_reabiertos(int bugs_reabiertos) {
        this.bugs_reabiertos = bugs_reabiertos;
    }

    public int getCiclos() {
        return ciclos;
    }

    public void setCiclos(int ciclos) {
        this.ciclos = ciclos;
    }

    public int getCasos_prueba() {
        return casos_prueba;
    }

    public void setCasos_prueba(int casos_prueba) {
        this.casos_prueba = casos_prueba;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getEstimacion_desarrollo() {
        return estimacion_desarrollo;
    }

    public void setEstimacion_desarrollo(int estimacion_desarrollo) {
        this.estimacion_desarrollo = estimacion_desarrollo;
    }

    public int getEstimacion_pruebas() {
        return estimacion_pruebas;
    }

    public void setEstimacion_pruebas(int estimacion_pruebas) {
        this.estimacion_pruebas = estimacion_pruebas;
    }

    public int getEstimacion_total() {
        return estimacion_total;
    }

    public void setEstimacion_total(int estimacion_total) {
        this.estimacion_total = estimacion_total;
    }

    public String getFecha_real_entrega_des() {
        return fecha_real_entrega_des;
    }

    public void setFecha_real_entrega_des(String fecha_real_entrega_des) {
        this.fecha_real_entrega_des = fecha_real_entrega_des;
    }

    public String getFecha_real_entrega_pruebas() {
        return fecha_real_entrega_pruebas;
    }

    public void setFecha_real_entrega_pruebas(String fecha_real_entrega_pruebas) {
        this.fecha_real_entrega_pruebas = fecha_real_entrega_pruebas;
    }

    public String getFecha_entrega_des() {
        return fecha_entrega_des;
    }

    public void setFecha_entrega_des(String fecha_entrega_des) {
        this.fecha_entrega_des = fecha_entrega_des;
    }

    public String getFecha_entrega_pruebas() {
        return fecha_entrega_pruebas;
    }

    public void setFecha_entrega_pruebas(String fecha_entrega_pruebas) {
        this.fecha_entrega_pruebas = fecha_entrega_pruebas;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getTester() {
        return tester;
    }

    public void setTester(String tester) {
        this.tester = tester;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public boolean isCumplido() {
        return cumplido;
    }

    public void setCumplido(boolean cumplido) {
        this.cumplido = cumplido;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public Timestamp getCreado() {
        return creado;
    }

    public void setCreado(Timestamp creado) {
        this.creado = creado;
    }

    public Timestamp getLast_changed() {
        return last_changed;
    }

    public void setLast_changed(Timestamp last_changed) {
        this.last_changed = last_changed;
    }

    public String getFecha_cierre() {
        return fecha_cierre;
    }

    public void setFecha_cierre(String fecha_cierre) {
        this.fecha_cierre = fecha_cierre;
    }

    public String getCola() {
        return cola;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getTiempo_solucion() {
        return tiempo_solucion;
    }

    public void setTiempo_solucion(int tiempo_solucion) {

        this.tiempo_solucion = tiempo_solucion;
    }

    public int getTiempo_real_solucion() {
        return tiempo_real_solucion;
    }

    public void setTiempo_real_solucion(int tiempo_real_solucion) {

        this.tiempo_real_solucion = tiempo_real_solucion;
    }

    public String getEstado_final() {
        return estado_final;
    }

    public void setEstado_final(String estado_final) {
        this.estado_final = estado_final;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public int getTicket_maestro() {
        return ticket_maestro;
    }

    public void setTicket_maestro(int ticket_maestro) {
        this.ticket_maestro = ticket_maestro;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEstado_pruebas() {
        return estado_pruebas;
    }

    public void setEstado_pruebas(String estado_pruebas) {
        this.estado_pruebas = estado_pruebas;
    }

    public String getEstado_pruebas_clientes() {
        return estado_pruebas_clientes;
    }

    public void setEstado_pruebas_clientes(String estado_pruebas_clientes) {
        this.estado_pruebas_clientes = estado_pruebas_clientes;
    }

    public String getEstado_incidente() {
        return estado_incidente;
    }

    public void setEstado_incidente(String estado_incidente) {
        this.estado_incidente = estado_incidente;
    }

    public String getAns_analisado() {
        return ans_analisado;
    }

    public void setAns_analisado(String ans_analisado) {
        this.ans_analisado = ans_analisado;
    }

    public int getRelacion_ticket() {
        return relacion_ticket;
    }

    public void setRelacion_ticket(int relacion_ticket) {
        this.relacion_ticket = relacion_ticket;
    }

    public String getMotivo_devolucion() {
        return motivo_devolucion;
    }

    public void setMotivo_devolucion(String motivo_devolucion) {
        this.motivo_devolucion = motivo_devolucion;
    }

    public String getOla_incidente() {
        return ola_incidente;
    }

    public void setOla_incidente(String ola_incidente) {
        this.ola_incidente = ola_incidente;
    }

    public String getResultado_pruebas_produccion() {
        return resultado_pruebas_produccion;
    }

    public void setResultado_pruebas_produccion(String resultado_pruebas_produccion) {
        this.resultado_pruebas_produccion = resultado_pruebas_produccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
