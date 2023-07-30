package User;

// To take data from the patient and store it, in doubly linkedList
class PNode { // Patient Node
    Patient patient;
    PNode next, pre; // Objects of PNode itself.

    public PNode(Patient patient) {
        this.patient = patient;
        next = null;
        pre = null;
    }
}
public class PatientList {

    PNode head, tail;  // OF LINKED LIST

    public PatientList() {
    }

    public PatientList(PNode head, PNode tail) {
        // Initialising with null values.
        head = null;
        tail = null;
    }

    // To insert Patients
    public void Insert(Patient patient) {
        PNode node = new PNode(patient);

        if(head==null || tail == null) {
            head = node;
            tail = node;
        }
        else {
            head.next = node;
            node.pre = head;
            head = node;
        }
    }

    // To search for particular patient using ID. Return type is Patient itself
    public Patient searchByID(String ID) {
        PNode temp = head;
        while (temp!=null) {

            if (temp.patient.getId().equals(ID)){
                return temp.patient;
            }

            temp = temp.pre;
        }
        return null;
    }

    public Patient searchByName(String Name) {
        PNode temp = head;
        while (temp!=null) {

            if (temp.patient.getName().equals(Name)){
                return temp.patient;
            }

            temp = temp.pre;
        }
        return null;
    }

    public Patient searchByContact(String Contact) {
        PNode temp = head;
        while (temp!=null) {

            if (temp.patient.getContact().equals(Contact)){
                return temp.patient;
            }

            temp = temp.pre;
        }
        return null;
    }
}
