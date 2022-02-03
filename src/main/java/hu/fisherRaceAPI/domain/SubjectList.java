package hu.fisherRaceAPI.domain;

public class SubjectList {
    private int SUBJECT_ID;
    private String SubjectName;

    public SubjectList() {
    }

    public SubjectList(int SUBJECT_ID, String SubjectName) {
        this.SUBJECT_ID = SUBJECT_ID;
        this.SubjectName = SubjectName;
    }

    public int getSUBJECT_ID() {
        return SUBJECT_ID;
    }

    public void setSUBJECT_ID(int SUBJECT_ID) {
        this.SUBJECT_ID = SUBJECT_ID;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }
}
