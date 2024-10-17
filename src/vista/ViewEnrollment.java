package vista;

import interfaces.IMostrarMensaje;
import modelo.Enrollment;
import modelo.Student;

import java.util.List;

public class ViewEnrollment implements IMostrarMensaje {
    public void displayListEnrollments(List<Enrollment> enrollments) {
        System.out.println(" == Lista de enrollments == ");
        for (Enrollment enrollment : enrollments) {
            System.out.println("Id enrollment: " + enrollment.getId() + ", Id estudiante: " + enrollment.getStudentId() + ", Correo: " + enrollment.getCourseId());
        }
    }
}

