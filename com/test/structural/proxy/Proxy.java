package com.test.structural.proxy;

import java.util.Arrays;
import java.util.List;

public class Proxy
{
    private final Network network = new Network();
    private final List<String> urls = Arrays.asList("Google", "fb", "amazon");

    public void getAccess(String url)
    {
        if(urls.contains(url))
        {
            network.access(url);
        }
        else
        {
            System.out.println("Access to "+url+" is restricted");
        }
    }
}
