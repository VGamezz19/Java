package principal;

import personal.Nurse;
import java.util.Scanner;
import patients.Patient;
import personal.Doctor;
import zones.Department;

/**
 *
 * @author MiguelAngel
 */
public class Application {

    static private Clinic[] clinics = new Clinic[4];
    static private Integer comptaClinics = 0;
    static private Clinic clinicActual = null;
    static private Integer tipusElement = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        Integer opcio = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Gestió de clíniques");
            System.out.println("\n2. Gestió dels doctors");
            System.out.println("\n3. Gestió dels infermers");
            System.out.println("\n4. Gestió de pacients");
            System.out.println("\n5. Gestió de departaments");
            opcio = teclado.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    menuClinic();
                    break;
                case 2:
                    if (clinicActual != null) {
                        tipusElement = 1;
                        menuElement();
                    } else {
                        System.out.println("\nPrimer s'ha de fixar la clínica al menú Gestió de clíniques");
                    }
                    break;
                case 3:
                    if (clinicActual != null) {
                        tipusElement = 2;
                        menuElement();
                    } else {
                        System.out.println("\nPrimer s'ha de fixar la clínica al menú Gestió de clíniques");
                    }
                    break;
                case 4:
                    if (clinicActual != null) {
                        tipusElement = 3;
                        menuElement();
                    } else {
                        System.out.println("\nPrimer s'ha de fixar la clínica al menú Gestió de clíniques");
                    }
                    break;
                case 5:
                    if (clinicActual != null) {
                        tipusElement = 4;
                        menuDepartments();
                    } else {
                        System.out.println("\nPrimer s'ha de fixar la clínica al menú Gestió de clíniques");
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    public static void menuClinic() {
        Integer opcio = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            Integer indexSel = -1;
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Fixa Clínica");
            System.out.println("\n3. Modificació");
            System.out.println("\n4. Afegir un registre");
            System.out.println("\n5. Llista de clíniques");
            opcio = teclado.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    clinics[comptaClinics] = Clinic.addClinic();
                    comptaClinics++;
                    break;
                case 2:
                    indexSel = selectClinic();
                    if (indexSel >= 0) {
                        clinicActual = clinics[indexSel];
                    } else {
                        System.out.println("\nNo existeix aquesta clínica");
                    }
                    break;
                case 3:
                    indexSel = selectClinic();
                    if (indexSel >= 0) {
                        clinics[indexSel].updateClinic();
                    } else {
                        System.out.println("\nNo existeix aquesta clínica");
                    }
                    break;
                case 4:
                    indexSel = selectClinic();
                    if (indexSel >= 0) {
                        clinics[indexSel].addTrack();
                    } else {
                        System.out.println("\nNo existeix aquesta clínica");
                    }
                    break;
                case 5:
                    for (int i = 0; i < comptaClinics; i++) {
                        clinics[i].showClinic();
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    public static void menuElement() {
        Integer opcio = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificació");
            System.out.println("\n3. Llista");
            opcio = teclado.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    switch (tipusElement) {
                        case 1:
                            clinicActual.addDoctor();
                            break;
                        case 2:
                            clinicActual.addNurse();
                            break;
                        case 3:
                            clinicActual.addPatient();
                            break;
                    }
                    break;
                case 2:
                    Integer indexSel = clinicActual.selectElement(tipusElement);
                    if (indexSel >= 0) {
                        clinicActual.getElements()[indexSel].updateElement();
                    } else {
                        System.out.println("\nNo existeix aquest element");
                    }
                    break;
                case 3:
                    for (int i = 0; i < clinicActual.getComptaElements(); i++) {
                        if (clinicActual.getElements()[i] instanceof Doctor && tipusElement == 1) {
                            clinicActual.getElements()[i].showElement();
                        }
                        if (clinicActual.getElements()[i] instanceof Nurse && tipusElement == 2) {
                            clinicActual.getElements()[i].showElement();
                        }
                        if (clinicActual.getElements()[i] instanceof Patient && tipusElement == 3) {
                            clinicActual.getElements()[i].showElement();
                        }
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    public static void menuDepartments() {
        Integer opcio = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Afegir doctor");
            System.out.println("\n3. Afegir infermer");
            System.out.println("\n4. Afegir pacient");
            System.out.println("\n5. Llista de departaments");
            opcio = teclado.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    clinicActual.addDepartment();
                    break;
                case 2:
                    clinicActual.addElementDepartment(1);
                    break;
                case 3:
                    clinicActual.addElementDepartment(2);
                    break;
                case 4:
                    clinicActual.addElementDepartment(3);
                    break;
                case 5:
                    for (int i = 0; i < clinicActual.getComptaElements(); i++) {
                        if (clinicActual.getElements()[i] instanceof Department) {
                            clinicActual.getElements()[i].showElement();
                        }

                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    public static Integer selectClinic() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nCodi de clínica?:");
        Integer codeSel = teclado.nextInt();
        Integer indexSel = -1;
        for (int i = 0; i < comptaClinics; i++) {
            if (clinics[i].getCode() == codeSel) {
                indexSel = i;
                break;
            }
        }
        return indexSel;
    }

}
