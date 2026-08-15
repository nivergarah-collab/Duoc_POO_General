package clase_02.Guia1_1_4.Caso01;

public class Prestamo {
    private String student;
    private Libro libro;
    private String start_date;
    private String end_date;
    private String status;

    public Prestamo(String student, Libro libro, String start_date, String end_date) {
        this.student = student;
        this.libro = libro;
        this.start_date = start_date;
        this.end_date = end_date;

        if (libro.canRetire()) {
            libro.setStock(-1);
            this.status = "Ongoing";
        } else {
            this.status = "Not done";
        }
    }

    public String getStudent() {
        return student;
    }

    public Libro getBook() {
        return libro;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        String infoPrestamo = "Student: " + student +
                "\nBook: " + libro.getName() + " de " + libro.getAuthor() +
                "\nDate: " + start_date + "  to: " + end_date +
                "\nStatus: " + status;
        return infoPrestamo;
    }
}
