
package principal;

import java.util.Scanner;

/**
 *
 * @author MiguelAngel
 */
public class Clinic {

    static private Integer comptaCode = 1; //Contador de la clase 
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

    
   public Clinic( String name, String address) {
       
        this.code = Clinic.getComptaCode(); //Estaamos asignando un numero XD
        this.name = name;
        this.address = address;
    } 

    /*
    TODO Constructor
    Paràmetres: nom i adreça
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre
    - assignar al codi el comptaCodi actual i incrementar el comptaCodi en 1
    */    
    
    /*
    TODO Mètodes accessors    
    */
    
    public static Clinic addClinic() {
        
        Scanner teclado = new Scanner (System.in);
        String nomClinica;
        String adrecaClinica;
        System.out.println("nom de la clinica");
        nomClinica=teclado.next();
        System.out.println("adreça de la clinica");
        adrecaClinica= teclado.next();
        
        return new Clinic(nomClinica,adrecaClinica);
       
        /*
        TODO
        Paràmetres: sense
        Accions:
        - demanar les dades per consola per crear una nova clínica (són les dades simples que demana el constructor)
        Retorneu: la clínica creada
         */ 
    }

    
    public void updateClinic() {
        
      Scanner teclado = new Scanner (System.in);
      String nomClinica;
      String adrecaClinica;
      System.out.println ("\nNom de la clinica: " + this.getName());
      System.out.println("\nNom de la adreça: " + this.getAddress());
      System.out.println ("Nuevo nombre de la clinica");
      nomClinica=teclado.next();
      System.out.println ("Nuevo direccion");
      adrecaClinica=teclado.next();
      
      setAddress(adrecaClinica);
      setName(nomClinica);
      
      System.out.println("\nClinica Actualizada! " + this.getCode() + " " + this.getName() + " " + this.getAddress() );
      
      

      
      
        
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades simples (no taules) per consola i modifiqueu la propietat
        Nota: penseu que estem modificant l'objecte actual ...
    Retorneu: no hi ha retorn
    */     
    }

    public void showClinic() {
        System.out.println("\nLes dades de la clínica amb codi " + this.getCode() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("\nAddreça:" + this.getAddress());
    }

    /*
     Doctors
     */
   
    public void addDoctor() {
        
        this.doctors[this.comptaDoctors] = Doctor.addDoctor(); //si podemos ver el codigo de addDoctor
                                                                //click derecho, navigator, go to source
        this.comptaDoctors ++;
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - afegeix un nou doctor a la llista de doctors d'aquesta clínica (l'objecte actual)
        Nota: penseu que el nou doctor és una tasca de la classe Doctor
    Retorneu: no hi ha retorn
    */  
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

    public void addNurse() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - afegeix un nou infermer a la llista d'infermers d'aquesta clínica (l'objecte actual)
        Nota: penseu que el nou infermer és una tasca de la classe Infermer
    Retorneu: no hi ha retorn
    */
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

    public void addPatient() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - afegeix un nou pacient a la llista de pacients d'aquesta clínica (l'objecte actual)
        Nota: penseu que el nou pacient és una tasca de la classe Patient
    Retorneu: no hi ha retorn
    */
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

    public void addDepartment() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - afegeix un nou departament a la llista de departaments d'aquesta clínica (l'objecte actual)
        Nota: penseu que el nou departament és una tasca de la classe Department
    Retorneu: no hi ha retorn
    */
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
    

    public void addTrack(){
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - afegeix un nou registre (track) a la llista de registres d'aquesta clínica (l'objecte actual)
        Nota: penseu que un nou registre és una tasca de la classe Track
    Retorneu: no hi ha retorn
    */
    }

    public static Integer getComptaCode() {
        return comptaCode;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public Integer getComptaDoctors() {
        return comptaDoctors;
    }

    public Nurse[] getNurses() {
        return nurses;
    }

    public Integer getComptaNurses() {
        return comptaNurses;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public Integer getComptaPatients() {
        return comptaPatients;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public Integer getComptaDepartments() {
        return comptaDepartments;
    }

    public Track[] getTracks() {
        return tracks;
    }

    public Integer getComptaTracks() {
        return comptaTracks;
    }

    public static void setComptaCode() {
        Clinic.comptaCode++;  //para usarlo como un contandor 
                              // cadavez que creemos una clinic, generara un codigo nuevo.
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }

    public void setComptaDoctors(Integer comptaDoctors) {
        this.comptaDoctors = comptaDoctors;
    }

    public void setNurses(Nurse[] nurses) {
        this.nurses = nurses;
    }

    public void setComptaNurses(Integer comptaNurses) {
        this.comptaNurses = comptaNurses;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }

    public void setComptaPatients(Integer comptaPatients) {
        this.comptaPatients = comptaPatients;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public void setComptaDepartments(Integer comptaDepartments) {
        this.comptaDepartments = comptaDepartments;
    }

    public void setTracks(Track[] tracks) {
        this.tracks = tracks;
    }

    public void setComptaTracks(Integer comptaTracks) {
        this.comptaTracks = comptaTracks;
    }
    
    
    
}
