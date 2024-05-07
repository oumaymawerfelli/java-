import java.util.Objects;

public class Employe {
    private int id;
    private String firstName;
    private String lastName;
    private String departmentName;
    private int grade;

    // Constructeur sans paramètre
    public Employe() {
    }

    // Constructeur avec tous les paramètres
    public Employe(int id, String firstName, String lastName, String departmentName, int grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
        this.grade = grade;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Redéfinition de la méthode equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employe employee = (Employe) obj;
        return id == employee.id && Objects.equals(firstName, employee.firstName);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
