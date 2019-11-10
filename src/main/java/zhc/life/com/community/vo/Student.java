package zhc.life.com.community.vo;

public class Student {
    String name;
    Integer score;
    Integer id;
    Integer uid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", score=").append(score);
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append('}');
        return sb.toString();
    }
}
