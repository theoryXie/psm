package whu.web.psm.pojo;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.pwd
     *
     * @mbggenerated
     */
    private String pwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.icon
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.motto
     *
     * @mbggenerated
     */
    private String motto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.score
     *
     * @mbggenerated
     */
    private Double score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.credit
     *
     * @mbggenerated
     */
    private Double credit;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.pwd
     *
     * @return the value of user.pwd
     *
     * @mbggenerated
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.pwd
     *
     * @param pwd the value for user.pwd
     *
     * @mbggenerated
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.icon
     *
     * @return the value of user.icon
     *
     * @mbggenerated
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.icon
     *
     * @param icon the value for user.icon
     *
     * @mbggenerated
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.motto
     *
     * @return the value of user.motto
     *
     * @mbggenerated
     */
    public String getMotto() {
        return motto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.motto
     *
     * @param motto the value for user.motto
     *
     * @mbggenerated
     */
    public void setMotto(String motto) {
        this.motto = motto == null ? null : motto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.score
     *
     * @return the value of user.score
     *
     * @mbggenerated
     */
    public Double getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.score
     *
     * @param score the value for user.score
     *
     * @mbggenerated
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.credit
     *
     * @return the value of user.credit
     *
     * @mbggenerated
     */
    public Double getCredit() {
        return credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.credit
     *
     * @param credit the value for user.credit
     *
     * @mbggenerated
     */
    public void setCredit(Double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "User{" +
                "phone='" + phone + '\'' +
                ", pwd='" + pwd + '\'' +
                ", icon='" + icon + '\'' +
                ", motto='" + motto + '\'' +
                ", score=" + score +
                ", credit=" + credit +
                '}';
    }
}