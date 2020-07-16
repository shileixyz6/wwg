package com.example.wwg.model;

import java.io.Serializable;

public class Form implements Serializable {
    private Long formId;

    private String userName;

    private String sex;

    private String formType;

    private String adDiv;

    private String phone;

    private String email;

    private String address;

    private String formTitle;

    private String formContent;

    private static final long serialVersionUID = 1L;

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType == null ? null : formType.trim();
    }

    public String getAdDiv() {
        return adDiv;
    }

    public void setAdDiv(String adDiv) {
        this.adDiv = adDiv == null ? null : adDiv.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFormTitle() {
        return formTitle;
    }

    public void setFormTitle(String formTitle) {
        this.formTitle = formTitle == null ? null : formTitle.trim();
    }

    public String getFormContent() {
        return formContent;
    }

    public void setFormContent(String formContent) {
        this.formContent = formContent == null ? null : formContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", formId=").append(formId);
        sb.append(", userName=").append(userName);
        sb.append(", sex=").append(sex);
        sb.append(", formType=").append(formType);
        sb.append(", adDiv=").append(adDiv);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", address=").append(address);
        sb.append(", formTitle=").append(formTitle);
        sb.append(", formContent=").append(formContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}