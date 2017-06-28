package com.epam.adk.ejb.persistance;

import javax.persistence.*;
import java.io.Serializable;


/**
 * TODO: Comment
 * <p>
 * Created on 6/27/2017.
 *
 * @author Kaikenov Adilkhan
 */
@Entity
@Table(name = "MESSAGE")
public class Message implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "TEXT")
    private String text;

    public Message() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
