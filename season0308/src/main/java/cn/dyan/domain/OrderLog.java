package cn.dyan.domain;

import java.util.Date;

public class OrderLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_log.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_log.seller
     *
     * @mbg.generated
     */
    private String seller;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_log.buyer
     *
     * @mbg.generated
     */
    private String buyer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_log.created
     *
     * @mbg.generated
     */
    private Date created;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_log.id
     *
     * @return the value of tb_order_log.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_log.id
     *
     * @param id the value for tb_order_log.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_log.seller
     *
     * @return the value of tb_order_log.seller
     *
     * @mbg.generated
     */
    public String getSeller() {
        return seller;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_log.seller
     *
     * @param seller the value for tb_order_log.seller
     *
     * @mbg.generated
     */
    public void setSeller(String seller) {
        this.seller = seller;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_log.buyer
     *
     * @return the value of tb_order_log.buyer
     *
     * @mbg.generated
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_log.buyer
     *
     * @param buyer the value for tb_order_log.buyer
     *
     * @mbg.generated
     */
    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_log.created
     *
     * @return the value of tb_order_log.created
     *
     * @mbg.generated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_log.created
     *
     * @param created the value for tb_order_log.created
     *
     * @mbg.generated
     */
    public void setCreated(Date created) {
        this.created = created;
    }
}