package ejemploCinco.ParteDos;

import ejemploCinco.ParteUno.Empleado;
import ejemploCinco.ParteUno.Gerente;

public class Main {
    public static void main(String[] args) {

    Empleado empleado = new Empleado();
    Empleado gerente = new Gerente(); // Polimorfismo

    empleado.trabajar(); // Muestra: El empleado está trabajando.
    gerente.trabajar(); // Muestra: El gerente está gestionando el equipo.
    }
 }   