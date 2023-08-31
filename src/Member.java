package src;

import java.util.ArrayList;
import java.util.List;

class Member {
    private String name;
    private String cpf;
    private int age;
    private int maxBooksForReservation;
    private List<Book> reservedBooks;

    public Member(String name, String cpf, int age, int maxBooksForReservation) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
        this.maxBooksForReservation = maxBooksForReservation;
        this.reservedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getMaxBooksForReservation() {
        return maxBooksForReservation;
    }
    public void setMaxBooksForReservation(int maxBooksForReservation) {
        this.maxBooksForReservation = maxBooksForReservation;
    }
/*
    public List<Book> getReservedBooks() {
        return reservedBooks;
    }
    public void reserveBook(Book book) {
        if (reservedBooks.size() < maxBooksForReservation) {
            reservedBooks.add(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Cannot reserve more books. Maximum limit reached.");
        }
    }
*/
}

class UndergraduateStudent extends Member {
    public UndergraduateStudent(String name, String cpf, int age) {
        super(name, cpf, age, 3); // Maximum of 3 books can be reserved by an undergraduate student
    }
}

class GraduateStudent extends Member {
    public GraduateStudent(String name, String cpf, int age) {
        super(name, cpf, age, 5); // Maximum of 5 books can be reserved by a graduate student
    }
}

class Professor extends Member {
    public Professor(String name, String cpf, int age) {
        super(name, cpf, age, 10); // Maximum of 10 books can be reserved by a professor
    }
}
