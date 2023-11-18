package by.academy.HomeWork;

public class Book {
    private String nickname;
    private String author;
    private int age;
    private int puges;
    public Book() {
        super();
    }

    public Book(String nickname, String author, int age, int puges) {
        this.nickname = nickname;
        this.author = author;
        this.age = age;
        this.puges = puges;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
}
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPuges() {
        return puges;
    }

    public void setPuges(int puges) {
        this.puges = puges;
    }

    @Override
    public String toString() {
        return "Book{" +
                "название -'" + nickname + '\'' +
                ", автор=" + author +
                ", дата выхода первой части="  + age +
                ", колличество страниц ='" + puges + '\'' +
                '}';
    }
}

