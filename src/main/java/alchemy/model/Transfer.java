package alchemy.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mbranca on 10/10/15.
 */
@Entity
public class Transfer {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private float amount;

    @ManyToOne
    // @JoinColumn(name = "id")
    private Account source;

    @ManyToOne
    // @JoinColumn(name = "id")
    private Account destination;

    @Column
    private String description;

    @Column
    private Date validityDate;

    public Transfer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Account getSource() {
        return source;
    }

    public void setSource(Account source) {
        this.source = source;
    }

    public Account getDestination() {
        return destination;
    }

    public void setDestination(Account destination) {
        this.destination = destination;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    }
}
