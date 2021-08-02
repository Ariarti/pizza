package com.company.pizza.listeners;

import com.company.pizza.entity.Order;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.app.UniqueNumbersAPI;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Component("order_numberOrderListener")
public class numberOrderListener implements BeforeInsertEntityListener<Order> {


    @Inject
    private UniqueNumbersAPI uniqueNumbersAPI;

    @Override
    public void onBeforeInsert(Order entity, EntityManager entityManager) {
        String timeStamp = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
        long n = uniqueNumbersAPI.getNextNumber("NUMBER_");
        timeStamp = timeStamp + "-" + n;
        entity.setNumber(timeStamp);
    }
}
