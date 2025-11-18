package Item_22.Example_01;

/**
 * The constant interface patter is a poor use of interfaces!
 * Constant interface antipattern - do no use!
 */
public interface PhysicalConstant {
    //Avogadro's number (l/mol)
    static final double AVOGADROS_NUMBER = 6.022_140_857e23;

    //Boltzmann constant (J/K)
    static final double BOLTZMAN_CONSTANT = 1.380_648_52e-23;

    // Mass of the electron (kg)
    static final double ELECTRON_MASS = 9.109_383_56e-31;
}
