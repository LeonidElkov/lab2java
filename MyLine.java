public class MyLine {
    private Point start;
    private Point end;

    public MyLine(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override public String toString() {
        return "Линия от " + start + " до " + end;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getEnd() {
        return end;
    }
}
