package cn.dyan.domain;

import java.util.Date;

public class Email {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_email.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_email.seller
     *
     * @mbg.generated
     */
    private String seller;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_email.subject
     *
     * @mbg.generated
     */
    private String subject;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_email.created
     *
     * @mbg.generated
     */
    private Date created;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_email.id
     *
     * @return the value of tb_email.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_email.id
     *
     * @param id the value for tb_email.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_email.seller
     *
     * @return the value of tb_email.seller
     *
     * @mbg.generated
     */
    public String getSeller() {
        return seller;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_email.seller
     *
     * @param seller the value for tb_email.seller
     *
     * @mbg.generated
     */
    public void setSeller(String seller) {
        this.seller = seller;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_email.subject
     *
     * @return the value of tb_email.subject
     *
     * @mbg.generated
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_email.subject
     *
     * @param subject the value for tb_email.subject
     *
     * @mbg.generated
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_email.created
     *
     * @return the value of tb_email.created
     *
     * @mbg.generated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_email.created
     *
     * @param created the value for tb_email.created
     *
     * @mbg.generated
     */
    public void setCreated(Date created) {
        this.created = created;
    }
}