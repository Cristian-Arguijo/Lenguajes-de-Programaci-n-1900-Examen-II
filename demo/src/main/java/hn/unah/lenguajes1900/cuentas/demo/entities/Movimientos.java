package hn.unah.lenguajes1900.cuentas.demo.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "movimientos")
public class Movimientos {

    @Id
    @Column(name = "idMovimiento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMovimiento;

    @Column(name = "numeroCuenta")
    private Cuentas Cuenta;

    @Column(name = "tipoMovimiento")
    private String tipoMovimiento;

    private double monto;

    private LocalDate fechamovimiento;

}
