// Hospital Management System - Upcasting

abstract class MedicalStaff {
    protected String name;
    protected String staffId;

    public MedicalStaff(String name, String staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    public void scheduleShift(String shift) {
        System.out.println(name + " (" + staffId + ") scheduled for " + shift + " shift.");
    }

    public void accessIDCard() {
        System.out.println(name + " (" + staffId + ") accessed with ID card.");
    }

    public void processPayroll() {
        System.out.println("Payroll processed for " + name + " (" + staffId + ").");
    }
}

// Doctor class
class Doctor extends MedicalStaff {
    public Doctor(String name, String staffId) {
        super(name, staffId);
    }

    public void diagnosePatient() {
        System.out.println("Dr. " + name + " is diagnosing a patient.");
    }

    public void prescribeMedicine() {
        System.out.println("Dr. " + name + " is prescribing medicine.");
    }

    public void performSurgery() {
        System.out.println("Dr. " + name + " is performing surgery.");
    }
}

// Nurse class
class Nurse extends MedicalStaff {
    public Nurse(String name, String staffId) {
        super(name, staffId);
    }

    public void administerMedicine() {
        System.out.println("Nurse " + name + " is administering medicine.");
    }

    public void monitorPatient() {
        System.out.println("Nurse " + name + " is monitoring a patient.");
    }

    public void assistProcedure() {
        System.out.println("Nurse " + name + " is assisting in a procedure.");
    }
}

// Technician class
class Technician extends MedicalStaff {
    public Technician(String name, String staffId) {
        super(name, staffId);
    }

    public void operateEquipment() {
        System.out.println("Technician " + name + " is operating equipment.");
    }

    public void runTests() {
        System.out.println("Technician " + name + " is running tests.");
    }

    public void maintainInstruments() {
        System.out.println("Technician " + name + " is maintaining instruments.");
    }
}

// Administrator class
class Administrator extends MedicalStaff {
    public Administrator(String name, String staffId) {
        super(name, staffId);
    }

    public void scheduleAppointment() {
        System.out.println("Administrator " + name + " is scheduling an appointment.");
    }

    public void manageRecords() {
        System.out.println("Administrator " + name + " is managing records.");
    }
}

// Demo class
public class HospitalManagementDemo {
    public static void main(String[] args) {
        MedicalStaff[] staff = new MedicalStaff[4];
        staff[0] = new Doctor("Amit", "D101");
        staff[1] = new Nurse("Priya", "N202");
        staff[2] = new Technician("Ravi", "T303");
        staff[3] = new Administrator("Sunita", "A404");

        // Upcasting: All treated as MedicalStaff for general operations
        for (MedicalStaff m : staff) {
            m.scheduleShift("Day");
            m.accessIDCard();
            m.processPayroll();
            System.out.println();
        }

        // Downcasting for role-specific actions (example)
        ((Doctor)staff[0]).diagnosePatient();
        ((Nurse)staff[1]).administerMedicine();
        ((Technician)staff[2]).operateEquipment();
        ((Administrator)staff[3]).scheduleAppointment();
    }
}