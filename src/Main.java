import controlador.*;
import db.connection;
import modelo.Course;
import modelo.Enrollment;
import modelo.Student;
import modelo.GradeType;
import modelo.Teacher;
import vista.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a nuestro sistema academico!");

        // Inicializar vistas
        ViewStudent viewStudent = new ViewStudent();
        ViewTeacher viewTeacher = new ViewTeacher();
        ViewCourse viewCourse = new ViewCourse();
        ViewEnrollment viewEnrollment = new ViewEnrollment();
        ViewGradeType viewGradeType = new ViewGradeType();

        // Inicializar controladores
        StudentController studentController = new StudentController(viewStudent);
        TeacherController teacherController = new TeacherController(viewTeacher);
        CourseController courseController = new CourseController(viewCourse);
        EnrollmentController enrollmentController = new EnrollmentController(viewEnrollment);
        GradeTypeController gradeTypeController = new GradeTypeController(viewGradeType);

        // Inicializar objeto estudiante
        Student newStudent = new Student(12345, "Daniel", "daniel@gmail.com");
        Student newStudent1 = new Student(4321, "Juanito", "juanito@gmail.com");
        // Guardar estudiante en la base de datos
        studentController.insertNewStudent(newStudent);
        // Mostrar datos en las vistas
        studentController.displayAllStudents();

        Teacher newTeacher = new Teacher(1235, "Pablo", "Ciencias Sociales");
        teacherController.insertNewTeacher(newTeacher);
        teacherController.displayAllTeachers();

        Course newCourse = new Course(1234, "Historia", "...", true, newTeacher.getId());
        courseController.insertNewCourse(newCourse);
        courseController.displayAllCourses();


        Enrollment newEnrollment = new Enrollment(1234, newStudent.getId(), newCourse.getId());
        enrollmentController.insertNewEnrollment((newEnrollment));
        enrollmentController.displayAllEnrollments();

        GradeType newGradeType = new GradeType(1234, "grade1", 1.0);
        gradeTypeController.insertNewGradeType(newGradeType);
        gradeTypeController.displayAllGradeType();



    }
}