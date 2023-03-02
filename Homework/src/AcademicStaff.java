public abstract class AcademicStaff implements Staff{
    private String emri;
    private String mbiemri;
    private int mosha;
    public AcademicStaff(String emri, String mbiemri,int mosha){
        this.emri=emri;
        this.mbiemri=mbiemri;
        this.mosha=mosha;
    }

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

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    @Override
    public String toString() {
        return emri+" "+mbiemri+" Mosha:"+mosha;
    }
}
