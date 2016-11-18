package net.frontnode.openapi.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiankuan
 *         29/10/15.
 */
public class Account {
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public String getBrokerUserId() {
        return brokerUserId;
    }

    public void setBrokerUserId(String brokerUserId) {
        this.brokerUserId = brokerUserId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRiskGrade() {
        return riskGrade;
    }

    public void setRiskGrade(String riskGrade) {
        this.riskGrade = riskGrade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String accountName;

    public String identityType;

    public String identityNo;

    public String phone;

    public String paymentType;

    public String paymentNo;

    public String brokerUserId;

    public String password;

    public String riskGrade;

    public String email;

    public Map<String, String> asParamsMap() {
        Map<String, String> result = new HashMap<>();
        result.put("accountName", accountName);
        result.put("identityType", identityType);
        result.put("identityNo", identityNo);
        result.put("phone", phone);
        result.put("paymentType", paymentType);
        result.put("paymentNo", paymentNo);
        result.put("brokerUserId", brokerUserId);
        result.put("password", password);
        result.put("riskGrade", riskGrade);
        result.put("email", email);
        return result;
    }
}
