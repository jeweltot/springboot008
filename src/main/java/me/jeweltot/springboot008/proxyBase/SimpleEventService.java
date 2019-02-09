package me.jeweltot.springboot008.proxyBase;

import me.jeweltot.springboot008.aopBase.PerfLogging;
import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService
{
    @PerfLogging
    @Override
    public void createEvent()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("create event");
    }

    @PerfLogging
    @Override
    public void publishEvent()
    {
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("publish event");
    }

    @Override
    public void deleteEvent()
    {
        System.out.println("delete event");
    }

}
