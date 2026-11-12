import java.util.*;

class Student {
    int id;
    String nume;
    String prenume;

    public Student(int id, String nume, String prenume) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return id + ". " + nume + " " + prenume;
    }
}

class Disciplina {
    int id;
    String nume;

    public Disciplina(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return id + ". " + nume;
    }
}

class Nota {
    int idStudent;
    int idDisciplina;
    int valoare;

    public Nota(int idStudent, int idDisciplina, int valoare) {
        this.idStudent = idStudent;
        this.idDisciplina = idDisciplina;
        this.valoare = valoare;
    }

    @Override
    public String toString() {
        return "Student: " + idStudent + ", Disciplina: " + idDisciplina + ", Nota: " + valoare;
    }
}

public class PCLP {
    static List<Student> studenti = new ArrayList<>();
    static List<Disciplina> discipline = new ArrayList<>();
    static List<Nota> note = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1. Adauga student");
            System.out.println("2. Adauga disciplina");
            System.out.println("3. Adauga nota");
            System.out.println("4. Afiseaza studenti");
            System.out.println("5. Afiseaza discipline");
            System.out.println("6. Afiseaza note");
            System.out.println("7. Iesire");
            System.out.print("Alege: ");

            int opt = sc.nextInt();
            sc.nextLine();

            switch(opt) {
                case 1:
                    System.out.print("Nume student: ");
                    String nume = sc.nextLine();
                    System.out.print("Prenume student: ");
                    String prenume = sc.nextLine();
                    studenti.add(new Student(studenti.size()+1, nume, prenume));
                    break;

                case 2:
                    System.out.print("Nume disciplina: ");
                    String numeDisc = sc.nextLine();
                    discipline.add(new Disciplina(discipline.size()+1, numeDisc));
                    break;

                case 3:
                    System.out.print("ID student: ");
                    int idStud = sc.nextInt();
                    System.out.print("ID disciplina: ");
                    int idDisc = sc.nextInt();
                    System.out.print("Nota: ");
                    int nota = sc.nextInt();
                    note.add(new Nota(idStud, idDisc, nota));
                    break;

                case 4:
                    System.out.println("\nStudenti:");
                    for(Student s : studenti) System.out.println(s);
                    break;

                case 5:
                    System.out.println("\nDiscipline:");
                    for(Disciplina d : discipline) System.out.println(d);
                    break;

                case 6:
                    System.out.println("\nNote:");
                    for(Nota n : note) System.out.println(n);
                    break;

                case 7:
                    System.out.println("La revedere!");
                    System.exit(0);

                default:
                    System.out.println("Optiune invalida!");
            }
        }
    }
}

