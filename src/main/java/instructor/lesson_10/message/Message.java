package instructor.lesson_10.message;

import java.util.Objects;

class Message {

    private String author;
    private String text;

    public Message(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(author, message.author) && Objects.equals(text, message.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, text);
    }

    @Override
    public String toString() {
        return "Message{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
