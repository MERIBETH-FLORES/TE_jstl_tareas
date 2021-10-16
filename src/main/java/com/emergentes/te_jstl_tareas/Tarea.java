package com.emergentes.te_jstl_tareas;

public class Tarea {
    private int id;
    private String tarea;
    private String prioridad;
    public Tarea() {
        id=0;
        tarea="";
        prioridad="";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
}