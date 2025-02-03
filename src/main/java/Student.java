public record Student(int rollno, String name, String address) {

    @Override
    public String toString() {
        return "Student [Roll No: " + rollno + ", Name: " + name + ", Address: " + address + "]";
    }
}

