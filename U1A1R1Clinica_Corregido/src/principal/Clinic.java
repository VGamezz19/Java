
package principal;

import personal.Nurse;
import patients.Patient;
import zones.Department;
import java.util.Scanner;
import operations.Track;
import personal.Doctor;

/**
 *
 * @author MiguelAngel
 */
public class Clinic {

    static private Integer comptaCode = 1; //El proper code a assignar
    private Integer code;
    private String name;
    private String address;
    private Doctor[] doctors = new Doctor[10];
    private Integer comptaDoctors = 0;
    private Nurse[] nurses = new Nurse[100];
    private Integer comptaNurses = 0;
    private Patient[] patients = new Patient[20];
    private Integer comptaPatients = 0;
    private Department[] departments = new Department[10];
    private Integer comptaDepartments = 0;
    private Track[] tracks = new Track[100];
    private Integer comptaTracks = 0;

    /*
    TODO
    */
    public Clinic(String name, String address) {
        this.code = Clinic.getComptaCode();
        setComptaCode();
        this.name = name;
        this.address = address;
    }

    public static Integer getComptaCode() {
        return comptaCode;
    }

    public static void setComptaCode() {
        Clinic.comptaCode++;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }

    public Integer getComptaDoctors() {
        return comptaDoctors;
    }

    public void setComptaDoctors(Integer comptaDoctors) {
        this.comptaDoctors = comptaDoctors;
    }

    public Nurse[] getNurses() {
        return nurses;
    }

    public void setNurses(Nurse[] nurses) {
        this.nurses = nurses;
    }

    public Integer getComptaNurses() {
        return comptaNurses;
    }

    public void setComptaNurses(Integer comptaNurses) {
        this.comptaNurses = comptaNurses;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }

    public Integer getComptaPatients() {
        return comptaPatients;
    }

    public void setComptaPatients(Integer comptaPatients) {
        this.comptaPatients = comptaPatients;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public Integer getComptaDepartments() {
        return comptaDepartments;
    }

    public void setComptaDepartments(Integer comptaDepartments) {
        this.comptaDepartments = comptaDepartments;
    }

    public Track[] getTracks() {
        return tracks;
    }

    public void setTracks(Track[] tracks) {
        this.tracks = tracks;
    }

    public Integer getComptaTracks() {
        return comptaTracks;
    }

    public void setComptaTracks(Integer comptaTracks) {
        this.comptaTracks = comptaTracks;
    }

    /*
    TODO
    */    
    public static Clinic addClinic() {
        Scanner teclado = new Scanner(System.in);
        String nameClinic;
        String addressClinic;
        System.out.println("Nom de la clínica:");
        nameClinic = teclado.next();
        System.out.println("Adreça de la clínica:");
        addressClinic = teclado.next();
        return new Clinic(nameClinic, addressClinic);
    }

    /*
    TODO
    */
    public void updateClinic() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nNom de la clínica: " + this.getName());
        System.out.println("\nEntra el nou nom:");
        this.setName(teclado.next());
        System.out.println("\nAddreça de la clínica: " + this.getAddress());
        System.out.println("\nEntra la nova adreça:");
        this.setAddress(teclado.next());
    }

    public void showClinic() {
        System.out.println("\nLes dades de la clínica amb codi " + this.getCode() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("\nAddreça:" + this.getAddress());
    }

    /*
     Doctors
     */
    /*
    TODO
    */    
    public void addDoctor() {
        doctors[comptaDoctors] = Doctor.addDoctor();
        comptaDoctors++;
    }

    public Integer selectDoctor() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nNif del doctor?:");
        String nifSel = teclado.next();
        Integer indexSel = -1;
        for (int i = 0; i < comptaDoctors; i++) {
            if (doctors[i].getNif().equals(nifSel)) {
                indexSel = i;
                break;
            }
        }
        return indexSel;
    }

    /*
     Nurses
     */
    /*
    TODO
    */
    public void addNurse() {
        nurses[comptaNurses] = Nurse.addNurse();
        comptaNurses++;
    }

    public Integer selectNurse() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nNif de l'infermer?:");
        String nifSel = teclado.next();
        Integer indexSel = -1;
        for (int i = 0; i < comptaNurses; i++) {
            if (nurses[i].getNif().equals(nifSel)) {
                indexSel = i;
                break;
            }
        }
        return indexSel;
    }

    /*
     Patients
     */
    /*
    TODO
    */
    public void addPatient() {
        patients[comptaPatients] = Patient.addPatient();
        comptaPatients++;
    }

    public Integer selectPatient() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nCodi de pacient?:");
        String codeSel = teclado.next();
        Integer indexSel = -1;
        for (int i = 0; i < comptaPatients; i++) {
            if (patients[i].getCode().equals(codeSel)) {
                indexSel = i;
                break;
            }
        }
        return indexSel;
    }

    /*
     Departments
     */
    /*
    TODO
    */
    public void addDepartment() {
        departments[comptaDepartments] = Department.addDepartment();
        comptaDepartments++;
    }

    public Integer selectDepartment() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nCodi de departament?:");
        String codeSel = teclado.next();
        Integer indexSel = -1;
        for (int i = 0; i < comptaDepartments; i++) {
            if (departments[i].getCode().equals(codeSel)) {
                indexSel = i;
                break;
            }
        }
        return indexSel;
    }

    public void addDoctorDepartment() {
        Department departmentsel = null;
        Integer indexSelDepartment = this.selectDepartment();
        if (indexSelDepartment >= 0) {
            departmentsel = this.getDepartments()[indexSelDepartment];
        } else {
            System.out.println("\nNo existeix aquest departament");
        }
        Integer indexSel = this.selectDoctor();
        if (indexSel >= 0) {
            departmentsel.addDoctorDepartment(this.getDoctors()[indexSel]);
        } else {
            System.out.println("\nNo existeix aquest doctor");
        }
    }

    public void addNurseDepartment() {
        Department departmentsel = null;
        Integer indexSelDepartment = this.selectDepartment();
        if (indexSelDepartment >= 0) {
            departmentsel = this.getDepartments()[indexSelDepartment];
        } else {
            System.out.println("\nNo existeix aquest departament");
        }
        Integer indexSel = this.selectNurse();
        if (indexSel >= 0) {
            departmentsel.addNurseDepartment(this.getNurses()[indexSel]);
        } else {
            System.out.println("\nNo existeix aquest infermer");
        }
    }

    public void addPatientDepartment() {
        Department departmentsel = null;
        Integer indexSelDepartment = this.selectDepartment();
        if (indexSelDepartment >= 0) {
            departmentsel = this.getDepartments()[indexSelDepartment];
        } else {
            System.out.println("\nNo existeix aquest departament");
        }
        Integer indexSel = this.selectPatient();
        if (indexSel >= 0) {
            departmentsel.addPatientDepartment(this.getPatients()[indexSel]);
        } else {
            System.out.println("\nNo existeix aquest pacient");
        }
    }
    
    /*
    TODO
    */
    public void addTrack(){
        tracks[comptaTracks] = Track.addTrack();
        comptaTracks++;
    }
}
