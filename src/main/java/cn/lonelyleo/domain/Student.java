package cn.lonelyleo.domain;

public class Student {
    private String Sno;
    private String Sname;
    private String Ssex;
    private int Sage;
    private String Sdept;

    public Student() {
    }

    public Student(String sno, String sname, String ssex, int sage, String sdept) {
        Sno = sno;
        Sname = sname;
        Ssex = ssex;
        Sage = sage;
        Sdept = sdept;
    }

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSsex() {
        return Ssex;
    }

    public void setSsex(String ssex) {
        Ssex = ssex;
    }

    public int getSage() {
        return Sage;
    }

    public void setSage(int sage) {
        Sage = sage;
    }

    public String getSdept() {
        return Sdept;
    }

    public void setSdept(String sdept) {
        Sdept = sdept;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "Sno='" + Sno + '\'' +
                ", Sname='" + Sname + '\'' +
                ", Ssex='" + Ssex + '\'' +
                ", Sage=" + Sage +
                ", Sdept='" + Sdept + '\'' +
                '}';
    }
}
