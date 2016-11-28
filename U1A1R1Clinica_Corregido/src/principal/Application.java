package principal;

import personal.Nurse;
import java.util.Scanner;

/**
 *
 * @author MiguelAngel
 */
public class Application {

    static private Clinic[] clinics = new Clinic[4];
    static private Integer comptaClinics = 0;
    static private Clinic clinicActual = null;

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
                        menuDoctors();
                    } else {
                        System.out.println("\nPrimer s'ha de fixar la clínica al menú Gestió de clíniques");
                    }
                    break;
                case 3:
                    if (clinicActual != null) {
                        menuNurses();
                    } else {
                        System.out.println("\nPrimer s'ha de fixar la clínica al menú Gestió de clíniques");
                    }
                    break;
                case 4:
                    if (clinicActual != null) {
                        menuPatients();
                    } else {
                        System.out.println("\nPrimer s'ha de fixar la clínica al menú Gestió de clíniques");
                    }
                    break;
                case 5:
                    if (clinicActual != null) {
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

    /*
    TODO
    */
    public static void menuDoctors() {
        Integer opcio = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificació");
            System.out.println("\n3. Llista de doctors");
            opcio = teclado.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    clinicActual.addDoctor();
                    break;
                case 2:
                    Integer indexSel = clinicActual.selectDoctor();
                    if (indexSel >= 0) {
                        clinicActual.getDoctors()[indexSel].updateDoctor();
                    } else {
                        System.out.println("\nNo existeix aquest doctor");
                    }
                    break;
                case 3:
                    for (int i = 0; i < clinicActual.getComptaDoctors(); i++) {
                        clinicActual.getDoctors()[i].showDoctor();
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    /*
    TODO
    */
    public static void menuNurses() {
        Integer opcio = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificació");
            System.out.println("\n3. Llista d'infermers");
            opcio = teclado.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    clinicActual.addNurse();
                    break;
                case 2:
                    Integer indexSel = clinicActual.selectNurse();
                    if (indexSel >= 0) {
                        clinicActual.getNurses()[indexSel].updateNurse();
                    } else {
                        System.out.println("\nNo existeix aquest infermer");
                    }
                    break;
                case 3:
                    for (int i = 0; i < clinicActual.getComptaNurses(); i++) {
                        clinicActual.getNurses()[i].showNurse();
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }
    
    

    /*
    TODO
    */
    public static void menuPatients() {
        Integer opcio = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificació");
            System.out.println("\n3. Llista de pacients");
            opcio = teclado.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    clinicActual.addPatient();
                    break;
                case 2:
                    Integer indexSel = clinicActual.selectPatient();
                    if (indexSel >= 0) {
                        clinicActual.getPatients()[indexSel].updatePatient();
                    } else {
                        System.out.println("\nNo existeix aquesta pacient");
                    }
                    break;
                case 3:
                    for (int i = 0; i < clinicActual.getComptaPatients(); i++) {
                        clinicActual.getPatients()[i].showPatient();
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    
    /*
    TODO
    */
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
                    clinicActual.addDoctorDepartment();
                    break;
                case 3:
                    clinicActual.addNurseDepartment();
                    break;
                case 4:
                    clinicActual.addPatientDepartment();
                    break;
                case 5:
                    for (int i = 0; i < clinicActual.getComptaDepartments(); i++) {
                        clinicActual.getDepartments()[i].showDepartment();
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
