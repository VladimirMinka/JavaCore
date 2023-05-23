package HW.comment;

public class Comment {
    private int days;
    private String comments;

    public Comment(int days, String comments) {
        this.days = days;
        this.comments = comments;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
