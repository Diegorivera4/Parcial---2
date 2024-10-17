package controlador;

import modelo.GradeType;
import vista.ViewGradeType;

import java.util.List;

public class GradeTypeController {
    private ViewGradeType view;

    public GradeTypeController(ViewGradeType view) {
        this.view = view;
    }

    public void insertNewGradeType(GradeType newGradeType) {
        GradeType.insertGradeType(newGradeType);
        view.mostrarMensaje("\nGradeType guardado correctamente!");
    }

    public void displayAllGradeType() {
        List<GradeType> gradeType = GradeType.getAllGradeType();
        view.displayListGradeType(gradeType);
    }
}

