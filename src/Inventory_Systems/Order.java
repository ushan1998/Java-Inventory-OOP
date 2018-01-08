/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory_Systems;

import java.sql.PreparedStatement;
import java.util.Date;

/**
 *
 * @author Thimedu Alwis
 */
public class Order {
    
    private int orderID;
    private double creditLimit;
    private String duedays;
    private double discount;
    private double payDueDays;
    private String creditCheck;
    private String paymentOverdue;
    private String depositPaid;
    private String paymentMethod;
    private int canChargeCredit;
    private int termsAgreed;
    private int accountOnHold;
    private int restrictMailling;
    private String accountOpened;
    private String lastCreditReview;
    private String nextCreditReview;
    private String applicationDate;
    private String dateRecieved;
    private double tax;
    private double subTotal;
    private double total;
    private String productCode;
    
    Connection conn= new Connection();

    /**
     * @return the orderID
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the creditLimit
     */
    public double getCreditLimit() {
        return creditLimit;
    }

    /**
     * @param creditLimit the creditLimit to set
     */
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    /**
     * @return the duedays
     */
    public String getDuedays() {
        return duedays;
    }

    /**
     * @param duedays the duedays to set
     */
    public void setDuedays(String duedays) {
        this.duedays = duedays;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the payDueDays
     */
    public double getPayDueDays() {
        return payDueDays;
    }

    /**
     * @param payDueDays the payDueDays to set
     */
    public void setPayDueDays(double payDueDays) {
        this.payDueDays = payDueDays;
    }

    /**
     * @return the creditCheck
     */
    public String getCreditCheck() {
        return creditCheck;
    }

    /**
     * @param creditCheck the creditCheck to set
     */
    public void setCreditCheck(String creditCheck) {
        this.creditCheck = creditCheck;
    }

    /**
     * @return the paymentOverdue
     */
    public String getPaymentOverdue() {
        return paymentOverdue;
    }

    /**
     * @param paymentOverdue the paymentOverdue to set
     */
    public void setPaymentOverdue(String paymentOverdue) {
        this.paymentOverdue = paymentOverdue;
    }

    /**
     * @return the depositPaid
     */
    public String getDepositPaid() {
        return depositPaid;
    }

    /**
     * @param depositPaid the depositPaid to set
     */
    public void setDepositPaid(String depositPaid) {
        this.depositPaid = depositPaid;
    }

    /**
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the canChargeCredit
     */
    public int isCanChargeCredit() {
        return canChargeCredit;
    }

    /**
     * @param canChargeCredit the canChargeCredit to set
     */
    public void setCanChargeCredit(int canChargeCredit) {
        this.canChargeCredit = canChargeCredit;
    }

    /**
     * @return the termsAgreed
     */
    public int isTermsAgreed() {
        return termsAgreed;
    }

    /**
     * @param termsAgreed the termsAgreed to set
     */
    public void setTermsAgreed(int termsAgreed) {
        this.termsAgreed = termsAgreed;
    }

    /**
     * @return the accountOnHold
     */
    public int isAccountOnHold() {
        return accountOnHold;
    }

    /**
     * @param accountOnHold the accountOnHold to set
     */
    public void setAccountOnHold(int accountOnHold) {
        this.accountOnHold = accountOnHold;
    }

    /**
     * @return the restrictMailling
     */
    public int isRestrictMailling() {
        return restrictMailling;
    }

    /**
     * @param restrictMailling the restrictMailling to set
     */
    public void setRestrictMailling(int restrictMailling) {
        this.restrictMailling = restrictMailling;
    }

    /**
     * @return the accountOpened
     */
    public String getAccountOpened() {
        return accountOpened;
    }

    /**
     * @param accountOpened the accountOpened to set
     */
    public void setAccountOpened(String accountOpened) {
        this.accountOpened = accountOpened;
    }

    /**
     * @return the lastCreditReview
     */
    public String getLastCreditReview() {
        return lastCreditReview;
    }

    /**
     * @param lastCreditReview the lastCreditReview to set
     */
    public void setLastCreditReview(String lastCreditReview) {
        this.lastCreditReview = lastCreditReview;
    }

    /**
     * @return the nextCreditReview
     */
    public String getNextCreditReview() {
        return nextCreditReview;
    }

    /**
     * @param nextCreditReview the nextCreditReview to set
     */
    public void setNextCreditReview(String nextCreditReview) {
        this.nextCreditReview = nextCreditReview;
    }

    /**
     * @return the applicationDate
     */
    public String getApplicationDate() {
        return applicationDate;
    }

    /**
     * @param applicationDate the applicationDate to set
     */
    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    /**
     * @return the dateRecieved
     */
    public String getDateRecieved() {
        return dateRecieved;
    }

    /**
     * @param dateRecieved the dateRecieved to set
     */
    public void setDateRecieved(String dateRecieved) {
        this.dateRecieved = dateRecieved;
    }

    /**
     * @return the tax
     */
    public double getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(double tax) {
        this.tax = tax;
    }

    /**
     * @return the subTotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the productCode
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * @param productCode the productCode to set
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    
    
    public boolean saveOrder(Order order)
    {
        try{
           String query = "INSERT INTO `tblorders`(`creditLimit`, `dueDays`, `discount`, `payDueDays`, `creditCheck`, `paymentOverdue`, `depositPaid`, `paymentMethod`,"
                   + " `canChargeCredit`, `termsAgreed`, `accountOnHold`, `restrictMailling`, `accountOpened`, `lastcreditReview`, `nextcreditReview`, `applicationDate`, `dateRecieved`,"
                   + " `tax`, `subToal`, `total`, `productCode`) VALUES('"+order.creditLimit+"','"+order.duedays+"','"+order.discount+"','"+order.payDueDays+"','"+order.creditCheck+"',"
                   + "'"+order.paymentOverdue+"','"+order.depositPaid+"','"+order.paymentMethod+"','"+order.canChargeCredit+"','"+order.termsAgreed+"','"+order.accountOnHold+"','"+order.restrictMailling+"',"
                   + "'"+order.accountOpened+"','"+order.lastCreditReview+"','"+order.nextCreditReview+"','"+order.applicationDate+"','"+order.dateRecieved+"','"+order.tax+"','"+order.subTotal+"','"+order.total+"',"
                   + "'"+order.productCode+"')";     
           PreparedStatement preparedStmt = conn.getConnection().prepareStatement(query); 
           preparedStmt.execute();
            return true;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
}
