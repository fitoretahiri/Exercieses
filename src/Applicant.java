package algorithms.src;

import algorithms.src.server.IGetId;

public class Applicant implements IGetId {
    private String emri;
    private  String mbiemri;
    private  int id;

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void thisIsATest() {
        System.out.println("This is a test!!");
    }

    public void thisIsAClassMethod(){
        System.out.println("This is method of class!");
    }
}
