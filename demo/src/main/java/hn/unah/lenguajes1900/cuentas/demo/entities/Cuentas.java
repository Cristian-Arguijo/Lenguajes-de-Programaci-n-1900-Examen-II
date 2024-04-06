package hn.unah.lenguajes1900.cuentas.demo.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="cuentas")
public class Cuentas {

    @Id
    @Column(name="numeroCuenta")
    private String numeroCuenta;

    private double saldo;

    @Column(name="fechaApertura")
    private LocalDate fechaApertura;

    private boolean estado;
    
    private boolean sobregiro;

    
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="numeroCuenta", referencedColumnName="numeroCuenta")
    private List<Movimientos> movimientos;


    
}
