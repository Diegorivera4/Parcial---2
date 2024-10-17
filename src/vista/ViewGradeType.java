package vista;

import interfaces.IMostrarMensaje;
import modelo.GradeType;

import java.util.List;

public class ViewGradeType implements IMostrarMensaje {
    public void displayListGradeType(List<GradeType> gradeType) {
        System.out.println(" == Lista de GradeType == ");
        for (GradeType gradeType1 : gradeType) {
            System.out.println("Id gradeType: " + gradeType1.getId() + ", name: " + gradeType1.getName() + ", weight: " + gradeType1.getWeight());
        }
    }
}