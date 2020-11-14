package Infor;

import java.util.Date;

public class Venta {
    private Cliente cliente;
    private Impresora impresora;
    private Date fecha;

    public Venta(Cliente cliente, Impresora impresora, Date fecha) {
        this.cliente = cliente;
        this.impresora = impresora;
        this.fecha = fecha;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
