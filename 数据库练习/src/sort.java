public class sort {
    private int sid;
    private String sname;
    private double sprice;
    private String sdesc;
    public sort(int sid, String sname, double sprice, String sdesc) {
        this.sid = sid;
        this.sname = sname;
        this.sprice = sprice;
        this.sdesc = sdesc;
    }
    public sort(){}
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public double getSprice() {
        return sprice;
    }
    public void setSprice(double sprice) {
        this.sprice = sprice;
    }
    public String getSdesc() {
        return sdesc;
    }
    public void setSdesc(String sdesc) {
        this.sdesc = sdesc;
    }
    @Override
    public String toString() {
        return "Sort [sid=" + sid + ", sname=" + sname + ", sprice=" + sprice + ", sdesc=" + sdesc + "]";
    }


}