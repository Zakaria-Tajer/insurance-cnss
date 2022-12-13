package utils;

import Models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        System.out.println(lists.toString());
        this.lists = lists;
    }

    private List<String> lists = new ArrayList<>();




}
