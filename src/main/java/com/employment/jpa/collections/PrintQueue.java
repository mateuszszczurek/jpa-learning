package com.employment.jpa.collections;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import java.util.List;

@Entity
public class PrintQueue {

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "queue")
    @OrderColumn(name = "PRINT_ORDER")
    private List<PrintJob> printJobs;

}
