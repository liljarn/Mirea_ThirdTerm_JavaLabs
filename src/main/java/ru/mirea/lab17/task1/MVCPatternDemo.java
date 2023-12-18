package ru.mirea.lab17.task1;

public class MVCPatternDemo {
    private static Student retrieveFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }

    public static void main(String[] args) {
        Student model = retrieveFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        System.out.println("_____after changes_____");
        controller.setStudentName("IvanZolo2004");
        controller.setStudentRollNo("zxc666");

        controller.updateView();
    }
}
