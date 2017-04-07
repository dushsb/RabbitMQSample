/**
 * 
 */
package com.libertyinsurance.mq.receiver;

import java.util.concurrent.CountDownLatch;

import org.springframework.stereotype.Component;

/**
 * @author Dushyantha Samanbaddha
 *
 */
@Component
public class Receiver {
    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
