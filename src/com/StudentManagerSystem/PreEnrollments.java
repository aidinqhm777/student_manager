
package com.StudentManagerSystem;

public class PreEnrollments {

    int score = -1;
    int studentUniID = -1;
    int subjectID = -1;
    int semester;
    String proffesorName;
    Status status = null;

    public enum Status {
        FAILED, ABSENCE_FAIL, PASSED, REMOVED
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {

        if (score <= 100 && score >= 0)
            this.score = score;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
