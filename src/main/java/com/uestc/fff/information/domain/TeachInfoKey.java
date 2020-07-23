package com.uestc.fff.information.domain;

public class TeachInfoKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teach.Tid
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    private String tid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teach.Cid
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    private String cid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teach.Tid
     *
     * @return the value of teach.Tid
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    public String getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teach.Tid
     *
     * @param tid the value for teach.Tid
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teach.Cid
     *
     * @return the value of teach.Cid
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teach.Cid
     *
     * @param cid the value for teach.Cid
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teach
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TeachInfoKey other = (TeachInfoKey) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teach
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        return result;
    }
}