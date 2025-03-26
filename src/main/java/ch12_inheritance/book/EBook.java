package ch12_inheritance.book;

public class EBook extends Book{
    private double filesize;
    private String format;

    public EBook(String title, String author, double filesize, String format) {
        super(title, author);
        this.filesize = filesize;
        this.format = format;
    }

    public double getFilesize() {
        return filesize;
    }

    public void setFilesize(double filesize) {
        this.filesize = filesize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    public void displayInfo() {
        System.out.println("제목 : " + getTitle());
        System.out.println("저자 : " + getAuthor());
        System.out.println("파일 크기 : " + getFilesize());
        System.out.println("파일 형식 : " + getFormat());
    }
}
