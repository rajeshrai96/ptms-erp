package com.ptms.farmer.entity;

import com.ptms.common.entity.BaseEntity;
import com.ptms.common.enums.Status;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "farmers",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_farmer_code", columnNames = "farmer_code"),
                @UniqueConstraint(name = "uk_mobile_number", columnNames = "mobile_number"),
                @UniqueConstraint(name = "uk_aadhaar_number", columnNames = "aadhaar_number")
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Farmer extends BaseEntity {

    @Column(name = "farmer_code", nullable = false, length = 20)
    private String farmerCode;

    @Column(name = "farmer_name", nullable = false, length = 100)
    private String farmerName;

    @Column(name = "father_name", length = 100)
    private String fatherName;

    @Column(name = "mobile_number", nullable = false, length = 10)
    private String mobileNumber;

    @Column(name = "alternate_mobile", length = 10)
    private String alternateMobile;

    @Column(name = "village", nullable = false, length = 100)
    private String village;

    @Column(name = "tehsil", length = 100)
    private String tehsil;

    @Column(name = "district", nullable = false, length = 100)
    private String district;

    @Column(name = "state", nullable = false, length = 100)
    private String state;

    @Column(name = "pincode", length = 6)
    private String pincode;

    @Column(name = "aadhaar_number", length = 12)
    private String aadhaarNumber;

    @Column(name = "pan_number", length = 10)
    private String panNumber;

    @Column(name = "bank_name", length = 100)
    private String bankName;

    @Column(name = "branch_name", length = 100)
    private String branchName;

    @Column(name = "account_number", length = 30)
    private String accountNumber;

    @Column(name = "ifsc_code", length = 11)
    private String ifscCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 20)
    @Builder.Default
    private Status status = Status.ACTIVE;

    @Column(name = "remarks", length = 500)
    private String remarks;
}