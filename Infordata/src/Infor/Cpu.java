package Infor;

import Interfaces.IReseteable;

import java.util.Date;

public class Cpu extends Tecnologico implements IReseteable {
    private int memoriaPrincipal;

    public Cpu(String codigo, String modelo, String paisOrigen, Date fecaFabricacion, Empresa fabricante, int memoriaPrincipal){
        super(codigo, modelo, paisOrigen, fecaFabricacion, fabricante);

        this.memoriaPrincipal = memoriaPrincipal;
    }

    public int getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "memoriaPrincipal=" + memoriaPrincipal +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", fabricante=" + fabricante +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void reset() {
        System.out.println("RESETEANDO PC...");
    }
}
