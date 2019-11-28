package com.DTO;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "UserDetails")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;

    private String lastName;

    private String email;

    private int phoneNo;

    private String address;

    private long accountNumber;

    private double amount;

	@Override
    public String toString() {
        return "UserDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", 
		email=" + email  + ",phoneNo=" + phoneNo + ", address=" + address + ", accountNumber=" + accountNumber + ", 
			amount=" + amount  +  ]";
    }
}

